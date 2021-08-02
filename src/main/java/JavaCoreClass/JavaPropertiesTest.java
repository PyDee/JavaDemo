package JavaCoreClass;


import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.*;
import java.util.Enumeration;
import java.util.Objects;
import java.util.Properties;
import java.util.ResourceBundle;

public class JavaPropertiesTest {
    private static final String config = "src/main/java/JavaCoreClass/propertiesTest.properties";
    //    private static final String config = "C:\\Users\\Administrator\\qmproject\\qmjava\\src\\main\\java\\propertiesTest.properties";

    public static void main(String[] args) throws Exception {
//        loadConfigByInputStream();
//        loadConfigByClassLoader();
        loadConfigByJavaUtilResourceBundle();
    }

    // 1. 读取配置文件时， 可能会出现空指针异常，解决办法，将 src 文件夹标记为 source dir
    // 2. try with catch 的使用
    // 读取配置文件---》 基于 classLoader 读取去文件
    public static void loadConfigByClassLoader() {
        try (
                InputStream config_obj = JavaPropertiesTest.class.getClassLoader().getResourceAsStream(config);
        ) {
            Properties pros = new Properties();
            pros.load(config_obj);
            String user = pros.getProperty("user");
            System.out.println("[loadConfigByClassLoader]--->" + user);
        } catch (Exception e) {
            System.out.println("[loadConfigByClassLoader]--->" + e.toString());
        }
    }

    // 相对路径时找不到，好像绝对路径才可以，以 src 开始的相对路径可以
    // 读取配置文件---》 基于 InputStream 读取去文件
    public static void loadConfigByInputStream() {
        Properties pros = new Properties();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(config));
            pros.load(bufferedReader);
            String user = pros.getProperty("user");
            System.out.println("[loadConfigByInputStream]--->" + user);
        } catch (Exception err) {
            System.out.println("[loadConfigByInputStream]--->" + err.toString());
        }
    }

    // 读取配置文件---》 基于 java.util.ResourceBundle 读取去文件，不需要加.properties后缀名，默认路径是src下
    public static void loadConfigByJavaUtilResourceBundle() {
        String config = "src/main/java/JavaCoreClass/propertiesTest.properties";
        System.out.println(config.replace(".properties", ""));
        ResourceBundle resource = ResourceBundle.getBundle(config.replace(".properties", ""));
        String user = resource.getString("user");
        System.out.println(user);

    }

    // 查看路径信息
    public static void currentPathInfo() {
        System.out.println(JavaPropertiesTest.class.getResource("").getPath());
        System.out.println(JavaPropertiesTest.class.getResource("/").getPath());
        System.out.println(JavaPropertiesTest.class.getClassLoader().getResource("").getPath());
        System.out.println(Objects.requireNonNull(JavaPropertiesTest.class.getClassLoader().getResource("")).getPath());
    }
}

// todo 网上例子， 也存在文件路径问题

/**
 * @ClassName: TestProperties
 * @Description: 获取配置文件信息
 * @date: 2017年11月25日 上午10:56:00
 * @version: 1.0.0
 */
class Test {


    /**
     * @param props
     * @return void
     * @throws
     * @Title: printAllProperty
     * @Description: 输出所有配置信息
     */
    private static void printAllProperty(Properties props) {
        @SuppressWarnings("rawtypes")
        Enumeration en = props.propertyNames();
        while (en.hasMoreElements()) {
            String key = (String) en.nextElement();
            String value = props.getProperty(key);
            System.out.println(key + " : " + value);
        }
    }

    /**
     * 根据key读取value
     *
     * @param filePath
     * @param keyWord
     * @return String
     * @throws
     * @Title: getProperties_1
     * @Description: 第一种方式：根据文件名使用spring中的工具类进行解析
     * filePath是相对路劲，文件需在classpath目录下
     * 比如：config.properties在包com.test.config下，
     * 路径就是com/test/config/config.properties
     */
    public static String getProperties_1(String filePath, String keyWord) {
        Properties prop = null;
        String value = null;
        try {
            // 通过Spring中的PropertiesLoaderUtils工具类进行获取
            prop = PropertiesLoaderUtils.loadAllProperties(filePath);
            // 根据关键字查询相应的值
            value = prop.getProperty(keyWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     * 读取配置文件所有信息
     *
     * @param filePath
     * @return void
     * @throws
     * @Title: getProperties_1
     * @Description: 第一种方式：根据文件名使用Spring中的工具类进行解析
     * filePath是相对路劲，文件需在classpath目录下
     * 比如：config.properties在包com.test.config下，
     * 路径就是com/test/config/config.properties
     */
    public static void getProperties_1(String filePath) {
        Properties prop = null;
        try {
            // 通过Spring中的PropertiesLoaderUtils工具类进行获取
            prop = PropertiesLoaderUtils.loadAllProperties(filePath);
            printAllProperty(prop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据key读取value
     *
     * @param filePath
     * @param keyWord
     * @return String
     * @throws
     * @Title: getProperties_2
     * @Description: 第二种方式：使用缓冲输入流读取配置文件，然后将其加载，再按需操作
     * 绝对路径或相对路径， 如果是相对路径，则从当前项目下的目录开始计算，
     * 如：当前项目路径/config/config.properties,
     * 相对路径就是config/config.properties
     */
    public static String getProperties_2(String filePath, String keyWord) {
        Properties prop = new Properties();
        String value = null;
        try {
            // 通过输入缓冲流进行读取配置文件
            InputStream InputStream = new BufferedInputStream(new FileInputStream(new File(filePath)));
            // 加载输入流
            prop.load(InputStream);
            // 根据关键字获取value值
            value = prop.getProperty(keyWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     * 读取配置文件所有信息
     *
     * @param filePath
     * @return void
     * @throws
     * @Title: getProperties_2
     * @Description: 第二种方式：使用缓冲输入流读取配置文件，然后将其加载，再按需操作
     * 绝对路径或相对路径， 如果是相对路径，则从当前项目下的目录开始计算，
     * 如：当前项目路径/config/config.properties,
     * 相对路径就是config/config.properties
     */
    public static void getProperties_2(String filePath) {
        Properties prop = new Properties();
        try {
            // 通过输入缓冲流进行读取配置文件
            InputStream InputStream = new BufferedInputStream(new FileInputStream(new File(filePath)));
            // 加载输入流
            prop.load(InputStream);
            printAllProperty(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据key读取value
     *
     * @param filePath
     * @param keyWord
     * @return String
     * @throws
     * @Title: getProperties_3
     * @Description: 第三种方式：
     * 相对路径， properties文件需在classpath目录下，
     * 比如：config.properties在包com.test.config下，
     * 路径就是/com/test/config/config.properties
     */
    public static String getProperties_3(String filePath, String keyWord) {
        Properties prop = new Properties();
        String value = null;
        try {
            InputStream inputStream = Test.class.getResourceAsStream(filePath);
            prop.load(inputStream);
            value = prop.getProperty(keyWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     * 读取配置文件所有信息
     *
     * @param filePath
     * @return
     * @throws
     * @Title: getProperties_3
     * @Description: 第三种方式：
     * 相对路径， properties文件需在classpath目录下，
     * 比如：config.properties在包com.test.config下，
     * 路径就是/com/test/config/config.properties
     */
    public static void getProperties_3(String filePath) {
        Properties prop = new Properties();
        try {
            InputStream inputStream = Test.class.getResourceAsStream(filePath);
            prop.load(inputStream);
            printAllProperty(prop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final String config = "src/main/java/JavaCoreClass/propertiesTest.properties";

    public static void main(String[] args) {
        // 注意路径问题
        String properties_1 = getProperties_1(config, "user");
        System.out.println("wechat_appid = " + properties_1);
        getProperties_1(config);
        System.out.println("*********************************************");
        // 注意路径问题
        String properties_2 = getProperties_2(config, "user");
        System.out.println("jdbc.url = " + properties_2);
        getProperties_2(config);
        System.out.println("*********************************************");
        // 注意路径问题
        String properties_3 = getProperties_3(config, "user");
        System.out.println("wechat_appid = " + properties_3);
        getProperties_3(config);
    }
}
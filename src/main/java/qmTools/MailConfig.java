package qmTools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class MailConfig {
    private static final String PROPERTIES_DEFAULT = "common.properties";
    public static String host;
    public static Integer port;
    public static String userName;
    public static String passWord;
    public static String emailForm;
    public static String timeout;
    public static String personal;
    public static String html;
    public static String subject;
    public static Properties properties;
    public static BufferedReader bf;
    public static InputStream inputStream;

    static {
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 初始化
     */
    private static void init() throws IOException {
        properties = new Properties();
        try {
            inputStream = MailConfig.class.getClassLoader().getResourceAsStream(PROPERTIES_DEFAULT);
//            properties.load(inputStream);
            //解决中文乱码，采取reader把inputStream转换成reader用字符流来读取中文
            assert inputStream != null;
            bf = new BufferedReader(new InputStreamReader(inputStream));
            properties.load(bf);
            host = properties.getProperty("mailHost");
            port = Integer.parseInt(properties.getProperty("mailPort"));
            userName = properties.getProperty("mailUsername");
            passWord = properties.getProperty("mailPassword");
            emailForm = properties.getProperty("mailFrom");
            timeout = properties.getProperty("mailTimeout");
            personal = properties.getProperty("personal");
            html = properties.getProperty("html");
            subject = properties.getProperty("subject");
//            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert inputStream != null;
            inputStream.close();
            bf.close();

        }
    }
}

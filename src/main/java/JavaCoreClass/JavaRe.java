package JavaCoreClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
java.util.regex 包主要包括以下三个类：
    Pattern ：pattern 对象是一个正则表达式的编译表示
    Matcher : Matcher 对象是对输入字符串进行解释和匹配操作的引擎
    PatternSyntaxException : 是一个非强制异常类，它表示一个正则表达式模式中的语法错误

    注意点：
    1. Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。
    该方法接受一个正则表达式作为它的第一个参数

    2. 与Pattern 类一样，Matcher 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。
 */
public class JavaRe {
    public static void main(String[] args) {
//        patternTest();
//        catchGroupTest();
//        indexFunctionTest();
//        findFunctionTest();
//        replaceFunctionTest1();
        replaceFunctionTest2();
    }

    // 测试正则 Pattern 类
    public static void patternTest() {
        String content = "I am Bob," + "from China.";
        String pattern_re_str = ".*ob.*";

        boolean isMatch = Pattern.matches(pattern_re_str, content);
        System.out.println("[字符串中是否包含了 'ob' 子字符串 ]--->" + isMatch);
    }

    // 正则 捕获组 group(): 以开括号进行计算的
    public static void catchGroupTest() {
        String line = "This order was placed for QT3000! OK?";
        String group_pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern pattern_obj = Pattern.compile(group_pattern);

        // 创建 matcher 对象
        Matcher matcher_obj = pattern_obj.matcher(line);

        // 根据 matcher 对象相关属性判断是否匹配到数据
        if (matcher_obj.find()) {
            System.out.println("[Found value]----->" + matcher_obj.group(0));
            System.out.println("[Found value]----->" + matcher_obj.group(1));
            System.out.println("[Found value]----->" + matcher_obj.group(2));
            System.out.println("[Found value]----->" + matcher_obj.group(3));
        } else {
            System.out.println("[NO MATCH!!!]");
        }
    }

    /*
    Matcher 类的相关方法
    索引方法： start(), end()
    查找方法：
        lookingAt(): 需要从第一位开始匹配
        find(): 不会从一开始就匹配
        matches()： 从整个序列匹配

    替换方法： appendReplacement(), appendTail(), replaceAll(), replaceFirst(), quoteReplacement()
     */
    // 1. 测试 matcher 对象的索引方法中的--> start 和 end 方法
    public static void indexFunctionTest() {
        String REGEX = "\\bcat\\b";
        String INPUT = "cat cat cat cattie cat";

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // 获取 matcher 对象
        int count = 0;

        while (m.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("start(): " + m.start());
            System.out.println("end(): " + m.end());
        }
    }

    // 2. 测试 Matcher 对象的查找方法中的--> matches 和 lookingAt 方法
    public static void findFunctionTest() {
        String REGEX = "foo";
        String INPUT = "fooooooooooooooooo";
        String INPUT2 = "ooooofoooooooooooo";

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        Matcher matcher2 = pattern.matcher(INPUT2);

        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT is: " + INPUT);
        System.out.println("Current INPUT2 is: " + INPUT2);


        System.out.println("lookingAt(): " + matcher.lookingAt());
        System.out.println("matches(): " + matcher.matches());
        System.out.println("find(): " + matcher.find());
        System.out.println("find(): " + matcher2.find());
        System.out.println("lookingAt(): " + matcher2.lookingAt());

    }

    // 3.1 测试 Matcher 对象的替换方法中的--> replaceFirst 和 replaceAll 方法
    public static void replaceFunctionTest1() {
        String REGEX = "dog";
        String INPUT = "The dog says meow. " +
                "All dogs say meow.";
        String REPLACE = "cat";

        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);

        // 替换所有
        // INPUT = m.replaceAll(REPLACE);

        // 替换第一个
        INPUT = m.replaceFirst(REPLACE);
        System.out.println(INPUT);
    }

    // 3.2 测试 Matcher 对象的替换方法中的--> appendReplacement  和 appendTail 方法
    public static void replaceFunctionTest2() {

        String REGEX = "a*b";
        String INPUT = "aabfooaabfooabfoobkkk";
        String REPLACE = "-";

        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);

        StringBuffer sb = new StringBuffer();

        // 替换所有
        while (m.find()) {
            m.appendReplacement(sb, REPLACE); // 实现非 end 添加和替换
        }
        m.appendTail(sb); // 实现 end 添加和替换
        System.out.println(sb.toString());
    }
}



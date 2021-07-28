package JavaCoreClass;

/**
 * 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
 * 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
 * <p>
 * StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
 * 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
 *
 * @param <day>
 */
public class javaStringTools<day> {
    public static void main(String[] args) {
        // StringBuilderTest.main(args);
        StringBufferTest.main(args);

    }


}

class StringBuilderTest {
    // todo  由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
    StringBuilder sb = new StringBuilder(10);

    public static void main(String[] args) {
        // todo 如何手动删除变量
        StringBuilderTest sbt = new StringBuilderTest();

        StringBuilder init_sb = init(sbt.sb, "123");
        System.out.println("[init_sb]-----> " + init_sb.toString());
        System.out.println("[init-sbt.sb]----->" + sbt.sb.toString());
        init_sb = null;

        StringBuilder add_sb = add(sbt.sb, "456");
        System.out.println("[add_sb]----->" + add_sb.toString());
        System.out.println("[add-sbt.sb]----->" + sbt.sb.toString());
        add_sb = null;

        StringBuilder insert_sb = insert(sbt.sb, 5, "java");
        System.out.println("[insert_sb]----->" + insert_sb.toString());
        System.out.println("[insert-sbt.sb]----->" + sbt.sb.toString());
        insert_sb = null;

        StringBuilder delete_sb = delete(sbt.sb, 5, 10);
        System.out.println("[delete_sb]----->" + delete_sb.toString());
        System.out.println("[delete-sbt.sb]----->" + sbt.sb.toString());
        delete_sb = null;


    }

    // 初始化一个 StringBuilder 对象
    public static StringBuilder init(StringBuilder sb, String str) {
        return add(sb, str);

    }

    // 向 StringBuilder 对象中添加字符串
    public static StringBuilder add(StringBuilder sb, String str) {
        sb.append(str);
        return sb;
    }

    // 向 StringBuilder 对象中插入元素
    public static StringBuilder insert(StringBuilder sb, int index, String str) {
        sb.insert(index, str);
        return sb;
    }

    // 删除 StringBuilder 对象指定区间的值
    public static StringBuilder delete(StringBuilder sb, int start, int end) {
        sb.delete(start, end);
        return sb;
    }


}

class StringBufferTest {
    // todo 然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
    StringBuffer sb = new StringBuffer("有线程安全要求时使用 StringBuffer");

    public static void main(String[] args) {
        StringBufferTest sbt = new StringBufferTest();
        StringBuffer init_sb = init(sbt.sb);
        System.out.println("[init_sb----->]:" + init_sb);
        System.out.println("[init-sbt.sb ----->]:" + sbt.sb);
        init_sb = null;

        StringBuffer add_sb = add(sbt.sb, " + add");
        System.out.println("[add_sb----->]:" + add_sb);
        System.out.println("[add-sbt.sb ----->]:" + sbt.sb);

        add_sb = null;

        StringBuffer insert_sb = insert(sbt.sb, 5, " + insert + ");
        System.out.println("[insert_sb----->]:" + insert_sb);
        System.out.println("[insert-sbt.sb ----->]:" + sbt.sb);
        insert_sb = null;

        StringBuffer delete_sb = delete(sbt.sb, 5, 17);
        System.out.println("[delete_sb----->]:" + delete_sb);
        System.out.println("[delete-sbt.sb ----->]:" + sbt.sb);
        delete_sb = null;

        StringBuffer replace_sb = replace(sbt.sb, 5, 17, " + 替换内容 + ");
        System.out.println("[replace_sb----->]:" + replace_sb);
        System.out.println("[replace-sbt.sb ----->]:" + sbt.sb);
        replace_sb = null;

        information(sbt.sb);
        sbt.sb = null;
        sbt = null;

    }

    public static void information(StringBuffer sb) {
        System.out.println("[当前容量]-----> " + sb.capacity());
        System.out.println("[指定索引处的 char 值]-----> " + sb.charAt(3));
        System.out.println("[第一次出现的指定子字符串在该字符串中的索引]-----> " + sb.indexOf("a"));
    }

    // 生成一个 StringBuffer 对象
    public static StringBuffer init(StringBuffer sb) {
        return sb;
    }

    // 向字符串尾部追加内容
    public static StringBuffer add(StringBuffer sb, String str) {
        sb.append(str);
        return sb;
    }

    // 向字符串中间插入内容
    public static StringBuffer insert(StringBuffer sb, int index, String str) {
        sb.insert(index, str);
        return sb;
    }

    // 删除自出穿指定位置的子串
    public static StringBuffer delete(StringBuffer sb, int start, int end) {
        sb.delete(start, end);
        return sb;
    }

    // 替换指定内容
    public static StringBuffer replace(StringBuffer sb, int start, int end, String str) {
        sb.replace(start, end, str);
        return sb;
    }

}
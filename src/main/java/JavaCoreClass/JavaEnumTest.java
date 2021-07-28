package JavaCoreClass;

public enum JavaEnumTest {
    Monday("星期一", 1),
    Tuesday("星期二", 2),
    Wednesday("星期三", 3),
    Thursday("星期四", 4),
    Friday("星期五", 5),
    Saturday("星期六", 6),
    SunDay("星期日", 7);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private String name;
    private int index;

    // 空参构造器
    private JavaEnumTest() {
    }

    private JavaEnumTest(String name, int index) {
        this.name = name;
        this.index = index;
    }

}

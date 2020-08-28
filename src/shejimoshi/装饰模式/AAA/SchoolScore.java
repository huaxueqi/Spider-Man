package shejimoshi.装饰模式.AAA;

public abstract class SchoolScore{
    //定义一个成绩单的接口，共每个学生去实现
    //每个学生报告给家长，自己的成绩。
    public abstract void report();
    //要求家长签字。
    public abstract void sign(String name);
}

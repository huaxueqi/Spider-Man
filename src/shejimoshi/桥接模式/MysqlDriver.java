package shejimoshi.桥接模式;

public class MysqlDriver implements Driver {

    @Override
    public void method() {
        System.out.println("use mysql driver to connection db...\n");
    }
}
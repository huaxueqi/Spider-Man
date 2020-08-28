package shejimoshi.桥接模式;

public class Test {
    public static void main(String[] args) {
        /**
         * 第一种组合：winXP使用mysql驱动连接数据库
         */
        Computer winxp = new WinXP();
        winxp.connection(new MysqlDriver());
        /**
         * 第二种组合：win7使用mysql驱动连接数据库
         */
        Computer win7 = new Win7();
        win7.connection(new MysqlDriver());
        /**
         * 第三种组合：winXP使用oracle驱动连接数据库
         */
        Computer cwinxp = new WinXP();
        cwinxp.connection(new OracleDriver());
        /**
         * 第四种组合：winXP使用oracle驱动连接数据库
         */
        Computer cwin7 = new Win7();
        cwin7.connection(new OracleDriver());

    }
}
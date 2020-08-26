package shejimoshi.Factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class mainOper {
    public static void main(String[] args) {
        Properties pro=new Properties();
        try {
            pro.load(new FileInputStream("src\\shejimoshi\\Factory\\oprate.propertie"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String  add=pro.getProperty("add");
        System.out.println(add);
        int a=10;
        int b=20;
        operateFactory operateFactory=easyFactory.creatOperation(add);
        operateFactory.setX(a);
        operateFactory.setY(b);
        System.out.println(operateFactory.getResult());
    }
}

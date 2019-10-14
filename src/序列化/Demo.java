package 序列化;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化
        FileOutputStream fos=new FileOutputStream("D:/object.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        user user=new user();
        user.setPassword("sadgag");
        user.setSex("12");
        user.setUserName("华雪奇");
        oos.writeObject(user);
        oos.flush();
        oos.close();
        //反序列化
        FileInputStream fis=new FileInputStream("D:/object.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object O = ois.readObject();
        JSONObject jsonObject=(JSONObject)JSON.toJSON(O);
        jsonObject.forEach((m,n)->{
            System.out.println(m+"    "+n);
        });



    }
}

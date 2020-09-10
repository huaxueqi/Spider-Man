package 字符串.字符串算法;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
读取一个文件中出现最多的字符串的数量

 */
public class demo2 {
    public static void main(String[] args) {
        BufferedReader br=null;
        try {
            br =new BufferedReader(new FileReader("D:/a.txt"));
            StringBuffer sb=new StringBuffer();
            String str=null;
            while((str=br.readLine())!=null){
               sb.append(str);
            }
           String []strArray=sb.toString().split(" |,");
            Map<String,Integer> m=new HashMap<>();
            for(String s:strArray){
                m.put(s,m.containsKey(s)?m.get(s)+1:1);
            }
            Integer max=0;
            String key=null;
            Integer value=null;
            m.forEach((k,v)->{

            });
            for (Map.Entry<String, Integer> e : m.entrySet()) {
                if (e.getValue() > max) {
                    value = e.getValue();
                    key = e.getKey();
                    max=e.getValue();
                }
            }
            System.out.println(key+value);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

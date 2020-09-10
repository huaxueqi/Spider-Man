package 自动释放;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class demo1 {
    //try with  resource
    public static void main(String[] args) {
           File one =new File("E:\\Spider-Man\\a.txt");
           demo1.filyCopy2(one);
    }
    public static void filyCopy2(File one){
        try (FileInputStream fileInput = new FileInputStream(one);
             FileOutputStream fileOutput = new FileOutputStream("E:\\Spider-Man\\b.txt")
        ){
            byte[] b = new byte[1024];
            int len;
            while((len = fileInput.read(b)) != -1){
                fileOutput.write(b, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package LIST集合;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add("dsagdg");
        list.add("dasgsg");
        list.forEach(l->{
            System.out.println(l);
        });
    }
}

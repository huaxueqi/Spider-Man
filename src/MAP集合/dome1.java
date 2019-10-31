package MAP集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dome1 {
    public static void main(String[] args) {
        /*int a[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};

        Map<Integer, Integer> tmp = new HashMap<Integer,Integer>();
        for (int i = 0; i < a.length; i++) {
            if (!tmp.containsKey(a[i])) {
                tmp.put(a[i], a[i]);
            }
        }

     tmp.forEach((k,v)->{
         System.out.println(k+"   "+v);
     });
*/
        StringBuilder  qwe =new StringBuilder();
        String s="";
        Map<String,String> m=new HashMap();
        m.put("Intentiontotal","8.00%,4.00%,8.00%,4.00%,4.00%,8.00%,32.00%,4.00%,8.00%,8.00%,4.00%,4.00%,8.00%,4.00%,4.00%");
        m.put("reason","优惠政策少,关注/已投其他平台:呃呃呃,起投金额过高,收益低,关注/已投其他平台:其它平台,期限过长,无原因,关注/已投其他平台:你好啊,系统操作复杂,公司负面较多,关注/已投其他平台:单选项,关注/已投其他平台:其它,待观察，暂不考虑,产品种类少,项目回款时间长");
        m.put("channelType","营销渠道");
        List l=new ArrayList();
        String t1 =(String) m.get("Intentiontotal");
        String t2= (String) m.get("reason");
        String t3 =(String) m.get("channelType");

        //System.out.println(t1);
        s+="[";
        String []s1=t1.split(",");
        String []s2=t2.split(",");
            for (int i = 0; i < s1.length; i++) {
                s += "{" + "\"" + "reason" + "\"" + ":" + "\"" + s2[i] + "," + s1[i]+","+t3 + "\"" +"}";
                if (i < s1.length - 1) {
                    s += ",";
                } else {
                    s += "]";
                }
               qwe.append(s);
            }
          System.out.println(s);
            System.out.println(qwe);

    }
        //System.out.println(ss[0]);
        /*for(Map.Entry<String,String> entry : m.entrySet()){
            a = entry.getKey();
            b= entry.getValue();
        }
        System.out.println(a+"   "+b);*/

    }


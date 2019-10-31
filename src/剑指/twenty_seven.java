package 剑指;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class twenty_seven {
    public static void main(String[] args) {
        char c[] = {'a', 'b', 'c'};
        String str = new String(c);
        twenty_seven t = new twenty_seven();
        t.Permutation(str).forEach(l -> {
            System.out.println(l);
        });


        //twenty_seven.peae(c,0);
      /*  List list = new ArrayList<Character>();
        for(int m=1;m<=c.length;m++){
            qweg(c,0,m,list);
        }*/
    }

    public ArrayList<String> Permutation(String str) {
        List<String> resultList = new ArrayList<>();
        if (str.length() == 0)
            return (ArrayList) resultList;
        //递归的初始值为（str数组，空的list，初始下标0）
        //fun(str.toCharArray(), resultList, 0);
          peae(str.toCharArray(), 0, resultList );
        //Collections.sort(resultList);
        Collections.sort(resultList);
        return (ArrayList) resultList;
    }

    private void fun(char[] c, List<String> list, int pos) {
        if (c == null)
            return;
        if (c.length - 1 == pos) {
            if (!list.contains(new String(c))) {
                list.add(new String(c));
                return;
            }
        } else {
            for (int i = pos; i < c.length; i++) {
                swap(c,pos,i);
                fun(c, list, pos + 1);
                swap(c,pos,i);
            }
        }
    }

    private void swap(char[] str, int i, int j) {

            char t = str[i];
            str[i] = str[j];
            str[j] = t;

    }

    private  void peae(char[] c, int pos, List<String> list) {
        if (c == null)
            return;
        if (c.length - 1 == pos) {
             if (!list.contains(new String(c))) {
                // System.out.println(c);
                 list.add(new String(c));
                return;
             }
            }else {
                for (int i = pos; i < c.length; i++) {
                    char tmp = c[pos];
                    c[pos] = c[i];
                    c[i] = tmp;
                    peae(c, pos + 1, list);
                    tmp = c[pos];
                    c[pos] = c[i];
                    c[i] = tmp;
                }
            }
        }


        public static void weitu ( char[] chars){
            if (chars == null)
                return;
            int len = chars.length;
            int n = 1 << len;
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < len; j++) {
                    int tmp = i;
                    if ((tmp != 0) & ((1 << j) != 0)) {
                        System.out.println();
                    }
                }
            }
        }


       public static void qweg ( char c[], int pos, int m, List<Character > list){
            if (c == null) {
                return;
            }
            if (m == 0) {
                System.out.print(list.toString() + "  ");
                return;
            }
            if (pos == c.length)
                return;
            list.add(c[pos]);
            qweg(c, pos + 1, m - 1, list);
            list.remove((Character) c[pos]);
            qweg(c, pos + 1, m, list);

        }



}


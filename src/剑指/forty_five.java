package 剑指;

import java.util.ArrayList;

public class forty_five {
    public static void main(String[] args) {

    }
    // 也可以参考hash处理冲突的做法，java中的char采用unicode作为字符集，16位，所以可以用一个长度256的数组/bitmap来存放，或者布隆过滤器
    // ASCII 码一共规定了128个字符的编码，比如空格SPACE是32（二进制00100000），大写的字母A是65（二进制01000001）。
    // 这128个符号（包括32个不能打印出来的控制符号），只占用了一个字节的后面7位，最前面的一位统一规定为0。
    // 二、非 ASCII 编码
    // 英语用128个符号编码就够了，但是用来表示其他语言，128个符号是不够的。
    // 比如，在法语中，字母上方有注音符号，它就无法用 ASCII 码表示。于是，一些欧洲国家就决定，利用字节中闲置的最高位编入新的符号。
    // 比如，法语中的é的编码为130（二进制10000010）。这样一来，这些欧洲国家使用的编码体系，可以表示最多256个符号。
    // 类似查找新进来的字符是否一定不存在

    // 这一题应该还要考虑是否有中文字符

    int[] chars = new int[256];// 基本类型初始全为0，简单的hash表
    ArrayList<Character> list = new ArrayList<>();// 存放每次进来的字符

    //Insert one char from stringstream
    public void Insert(char ch) {
        list.add(ch);
        chars[ch]++;
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        int size=list.size();
        for(int i=0;i<size;i++)
        {
            // 第一个等于一的
            if(chars[list.get(i)]==1)
                return list.get(i);
        }
        return '#';
    }
}

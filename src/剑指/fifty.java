package 剑指;

public class fifty {
    public static void main(String[] args) {

    }
    public int StrToInt(String str) {
        if(str.equals("")) return 0;
        long res=0;//解决溢出问题关键
        int flag=0;
        char[] s=str.toCharArray();
        if(s[0]=='-') flag=1;
        for(int i=flag;i<s.length;i++){
            if(s[i]=='+') continue;
            if((s[i]>='0'&&s[i]<='9')){
                int count=s[i]-'0';
                res=res*10+count;
            }else return 0;//出现非法字符
        }
        res=flag==1?res*(-1):res;
        return (res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)?0:(int)res;
    }
}

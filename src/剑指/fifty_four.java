package 剑指;

public class fifty_four {
    //正则
    public static void main(String[] args) {

    }
    public boolean isNumeric(char[] str) {
        String s=String.valueOf(str);
        //return s.matches("[+-]?[0-9]*(.[0-9]*)?([eE][+-]?[0-9]+)?");
        return s.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
    }
    public boolean isNumeric1(char[] str) {
        return new String(str).matches("[+-]?\\d*(\\.\\d+)?([Ee][+-]?\\d+)?");
    }
}

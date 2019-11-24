package 剑指;

public class foty_five {
    public static void main(String[] args) {

    }
    public String ReverseSentence(String str) {
        if(str == null){
            return null;
        }
        if(str.trim().equals("")){
            return str;
        }
        String[] strings = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = strings.length-1 ; i>=0;i--) {
            if(i == 0){
                sb.append(strings[i]);
            }else {
                sb.append(strings[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

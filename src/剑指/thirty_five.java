package 剑指;

public class thirty_five {
    public static void main(String[] args) {
        thirty_five t=new thirty_five();
        System.out.println(t.FirstNotRepeatingChar("googgle"));
    }
    public int FirstNotRepeatingChar(String str) {
        if(str == null || str.length()==0) return -1;
       /* List<Character> list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!list.contains(c)){
                list.add(Character.valueOf(c));
            }else{
                list.remove(Character.valueOf(c));
            }
        }
        if(list.size()<=0) return -1;
        return str.indexOf(list.get(0));*/
       int c[]=new int[256];
       for(int i=0;i<str.length();i++){
           c[str.charAt(i)]++;
            }
       for(int i=0;i<str.length();i++){
           if(c[str.charAt(i)]==1) return i;
       }
       return -1;
    }
}

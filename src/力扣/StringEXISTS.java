package 力扣;

 class  StringEXISTS {
    public boolean  isUnique(String astr) {
        int a[]=new int[1000];
        for(char ch:astr.toCharArray()){
            a[ch]++;
            if(a[ch]>1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringEXISTS s=new StringEXISTS();
        System.out.println(s.replaceSpaces("Mr John Smith    ",13));

    }
     public boolean CheckPermutation(String s1, String s2) {
         int l1=s1.length();int l2=s2.length();
         if(l1!=l2){
             return false;
         }
         int [] a=new int [128];
         for(int i=0;i<l1;i++){
             a[s1.charAt(i)]++;
             a[s2.charAt(i)]--;
         }
         for(int index :a){
             if(index !=0)
                 return false;
         }
         return true;
     }
     public String replaceSpaces(String S, int length) {
         if(S==null){
             return null;
         }
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<length;i++){
             if(S.charAt(i)==' '){
                 sb.append("%20");
             }else{
                 sb.append(S.charAt(i));
             }
         }
         return new String(sb);
     }
}
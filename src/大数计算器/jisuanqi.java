package 大数计算器;

import java.util.regex.Pattern;

public class jisuanqi {

    public static void main(String[] args) {

        String var1 = "429825736873";
        String var2 = "92630865109731";
        String result = getResult(var1,var2);
        System.out.println(result);
    }

    public static String getResult(String var1, String var2) {

        int maxLength = Math.max(var1.length(), var2.length()) + 1;
        if (!isNumberStr(var1) || !isNumberStr(var2)) {
//			System.out.println("目标字符串包含非数字,无法计算");
            return "目标字符串包含非数字,无法计算";
        }
        int[] tmp1 = new int[maxLength];

        for (int i = 0; i < var1.length(); i++) {
            tmp1[i] = var1.charAt(var1.length() - 1 - i) - '0'; // - ‘0’ ：将char 转换为int
        }
        int[] tmp2 = new int[maxLength];
        for (int j = 0; j < var2.length(); j++) {
            tmp2[j] = var2.charAt(var2.length() - 1 - j) - '0';
        }
        int[] result = new int[maxLength];
        for (int k = 0; k < result.length; k++) {
            int temp = result[k];
            temp += tmp1[k];
            temp += tmp2[k];
            if (temp >= 10) {
                temp = temp % 10;
                result[k + 1] = 1;
            }
            result[k] = temp;
        }
        StringBuilder sb = new StringBuilder();
        boolean findLast = false;
        for (int p = maxLength - 1; p >= 0; p--) {
            if (!findLast) {
                if (result[p] == 0) {
                    continue;
                }
                findLast = true;
            }
            sb.append(result[p]);
        }
        return sb.toString();
       /* StringBuilder sb = new StringBuilder();
       if(result[0]==0){
           for(int p=1;p<=result.length;p++);
       }
       return null;*/
    }

    private static boolean isNumberStr(String var1) {

        /**
         * //方法一： //使用JAAVA自带的函数 // for(int i = 0 ; i< var1.length();i++) { for(int i =
         * var1.length();--i>0;) { if(!Character.isDigit(var1.charAt(i))) { return
         * false; } } return true;
         *
         */

        // 方法二：
        // 速度最快 正则
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(var1).matches();

        /**
         * //方法三： Pattern pattern = Pattern.compile("[0-9]*"); return
         * pattern.matcher(var1).matches();
         *
         */

        /**
         * //方法四：
         *
         * if(var1 != null && !"".equals(var1.trim())) return var1.matches("^[0-9]*$");
         * else return false;
         *
         */

        /**
         * //方法五： for(int i=var1.length();--i>0;){ int chr = var1.charAt(i); if(chr < 48
         * || chr>57) return false; } return true;
         *
         */
    }
}

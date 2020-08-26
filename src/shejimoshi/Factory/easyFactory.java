package shejimoshi.Factory;

public class easyFactory {
    public static operateFactory creatOperation(String oper) {
        operateFactory operation=null;
       /* switch (oper) {
            case "+":
                operation=new addFactory();
                break;
            case "-":
                operation=new subFactory();
                break;
            case "*":
                operation=new mulFactory();
                break;
            case "/":
                operation=new divFactory();
                break;
        }*/

        try {
            operation=(operateFactory)Class.forName(oper).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return operation;
    }


}

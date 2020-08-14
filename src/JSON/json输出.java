package JSON;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class json输出 {
    public static void main(String[] args) {
        Object O=new Object(); //数据源，Object类型
        JSONObject jsonObject1=(JSONObject) JSON.toJSON(O);
        String  s=jsonObject1.getString(""); //一层一层
        JSONObject jsonObject2=JSON.parseObject(s);

        JSONArray jsonArray=JSONArray.parseArray("");
        System.out.println(jsonArray!=null);
        //System.out.println(!jsonArray.isEmpty());
        System.out.println(jsonArray.size()>0);

       /* HashMap map=new HashMap();
        jsonObject2.forEach((m,n)->{
            map.put(m,n);
        });*/
    }
}

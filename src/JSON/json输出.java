package JSON;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;

public class json输出 {
    public static void main(String[] args) {
        Object O=new Object(); //数据源，Object类型
        JSONObject jsonObject1=(JSONObject) JSON.toJSON(O);
        String  s=jsonObject1.getString(""); //一层一层
        JSONObject jsonObject2=JSON.parseObject(s);
        HashMap map=new HashMap();
        jsonObject2.forEach((m,n)->{
            map.put(m,n);
        });
    }
}

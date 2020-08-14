package JSON;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class json输出 {
    public static void main(String[] args) {

        Object O=new Object(); //数据源，Object类型

        String str = "{\"point_name\":\"恐龙厅\",\n" +
                "\"point_type\":\"normal_position\",\n" +
                "\"map_x\":\"-0.0419\",\n" +
                "\"map_y\":\"0.3480\",\n" +
                "\"theta\":\"0.71\",\n" +
                "\"display_x\":\"94.1611\",\n" +
                "\"display_y\":\"154.0403\",\n" +
                " \"description\":\"\",\n" +
                "\"play_media\":\n" +
                "[{\"media_type\":5,\n" +
                "\"tts\":\"这里就是恐龙厅了，啦啦啦\",\n" +
                "\"image_extra_time\":3,\n" +
                "\"delay_time\":3,\n" +
                "\"file_url\":\"OSS:a855b69491b518ce38f0b5234d0c0053.png\"\n" +
                "}]\n" +
                "}\n";

        //JSONObject jsonObject1=(JSONObject) JSON.toJSON(str);
        //String  s=jsonObject1.getString(""); //一层一层


        JSONObject jsonObject2=JSON.parseObject(str);//写法一
        JSONObject object=JSONObject.parseObject(str);//写法二
        String  s=jsonObject2.getString("play_media"); //一层一层


        JSONArray jsonArray=JSONArray.parseArray(s);

        for(int i=0;i<jsonArray.size();i++){
            JSONObject job = jsonArray.getJSONObject(i);   // 遍历 jsonarray 数组，把每一个对象转成 json 对象
            System.out.println(job.get("tts")) ;// 得到 每个对象中的属性值
            job.forEach((m,n)->{
                System.out.println(m+"   "+n);
            });
        }


        JSONArray jsonArray1=JSONArray.parseArray("");
        System.out.println(jsonArray!=null);
        //System.out.println(!jsonArray.isEmpty());
        System.out.println(jsonArray.size()>0);

       /* HashMap map=new HashMap();
        jsonObject2.forEach((m,n)->{
            map.put(m,n);
        });*/
    }
}

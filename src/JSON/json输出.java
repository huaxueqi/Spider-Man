package JSON;
public class json输出 {
    public static void main(String[] args) {
        Object O = new Object(); //数据源，Object类型

        String jsons = "{\"point_name\":\"恐龙厅\",\n" +
                "\"point_type\":\"normal_position\",\n" +
                "\"map_x\":\"-0.0419\",\n" +
                "\"map_y\":\"0.3480\",\n" +
                "\"theta\":\"0.71\",\n" +
                "\"display_x\":\"94.1611\",\n" +
                "\"display_y\":\"154.0403\",\n" +
                " \"description\":\"\",\n" +
                "\"play_media\":\n" +
                "[{\"media_type\":5,\n" +
                "\"tts\":\"这里就是恐龙厅了，啦啦啦\",\"\n" +
                "image_extra_time\":3,\n" +
                "\"delay_time\":3,\n" +
                "\"file_url\":\"OSS:a855b69491b518ce38f0b5234d0c0053.png\"\n" +
                "}]\n" +
                "}";
       /* JSONObject jsonObject1 = (JSONObject) JSON.toJSON(O);
        String s = jsonObject1.getString(""); //一层一层
        JSONObject jsonObject2 = JSON.parseObject(s);
        HashMap map = new HashMap();
        jsonObject2.forEach((m, n) -> {
            map.put(m, n);
        });
*/
    /*  JSONObject jsonObject =new JSONObject.parseObject();*/

    }
}

package shejimoshi.享元模式;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, FlyWeight> map = new HashMap<String, FlyWeight>();

    /**
     * 获取享元对象
     */
    public FlyWeight getFlyWeight(String key) {
        FlyWeight flyWeight = map.get(key);
        if (flyWeight == null) {
            flyWeight = new SubFlyWeight(key);
            map.put(key, flyWeight);
        }
        return flyWeight;
    }

    /**
     * 获取享元对象数量
     */
    public int getCount() {
        return map.size();
    }
}

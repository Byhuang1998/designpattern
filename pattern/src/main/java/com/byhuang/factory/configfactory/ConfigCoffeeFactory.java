package com.byhuang.factory.configfactory;

import java.io.InputStream;
import java.util.*;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 10:37
 * @description TODO
 */
public class ConfigCoffeeFactory {

    private static Map<String, Coffee> map = new HashMap<>();

    static {
        Properties p = new Properties();
        InputStream is = ConfigCoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put((String) key, coffee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee produceCoffee(String type) {
        return map.get(type);
    }
}

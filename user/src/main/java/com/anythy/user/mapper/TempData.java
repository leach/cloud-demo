package com.anythy.user.mapper;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TempData {
    private static volatile TempData tempData;

    private volatile Map<String, Object> data;
    private TempData() {}

    public static TempData getInstance() {
        if (tempData == null) {
            synchronized (TempData.class) {
                if (tempData == null) {
                    tempData = new TempData();
                }
            }
        }
        return tempData;
    }

    public Object getData(String key){
        if(data == null){
            return null;
        }
        synchronized (data){
            return data.get(key);
        }
    }

    public void putData(String key, Object object){
        synchronized (TempData.class){
            if(data == null){
                data = new HashMap<>();
            }
            data.put(key, object);
        }
    }
}

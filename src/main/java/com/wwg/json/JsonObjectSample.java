package com.wwg.json;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by wwg on 2017/12/14.
 * @author wwg
 */
public class JsonObjectSample {

    public static void main(String[] args) {
        jSONObjectSample();
    }

    private static void jSONObjectSample() {
        JSONObject wangxiaoer = new JSONObject();
        Object nullObj = null;
        try {
            wangxiaoer.put("name", "王小二");
            wangxiaoer.put("age", 23.2);
            wangxiaoer.put("birthday", "1990-01-01");
            wangxiaoer.put("school", "蓝翔");
            wangxiaoer.put("major", new String[]{"理发", "挖掘机"});
            wangxiaoer.put("has_girlfriend", false);
            wangxiaoer.put("car", nullObj);
            wangxiaoer.put("house", nullObj);
            wangxiaoer.put("comment", "这是一个注释");
            System.out.println(wangxiaoer.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}

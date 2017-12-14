package com.wwg.json;

import com.wwg.bean.Diaosi;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwg on 2017/12/14.
 * @author wwg
 */
public class JsonObjectSample {

    public static void main(String[] args) {
        //jSONObjectSample();
        createJsonByMap();
        //createJsonByBean();
    }

    /**
     * 使用JSONObject方法构建JSON对象
     * 注意：value为null的car和house在输出时候没有出现
     */
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

    /**
     * 使用Map方法创建JSON对象
     */
    private static void createJsonByMap(){
        Map<String, Object> wangxiaoer = new HashMap<String, Object>(16);
        Object nullObj = null;
        wangxiaoer.put("name", "王小二");
        wangxiaoer.put("age", 23.2);
        wangxiaoer.put("birthday", "1990-01-01");
        wangxiaoer.put("school", "蓝翔");
        wangxiaoer.put("major", new String[]{"理发", "挖掘机"});
        wangxiaoer.put("has_girlfriend", false);
        wangxiaoer.put("car", nullObj);
        wangxiaoer.put("house", nullObj);
        wangxiaoer.put("comment", "这是一个注释");

        System.out.println(new JSONObject(wangxiaoer).toString());
    }

    /**
     * 通过bean构建JSON对象
     */
    private static void createJsonByBean(){
        Diaosi wangxiaoer = new Diaosi();
        wangxiaoer.setName("王小二");
        wangxiaoer.setAge(25.2);
        wangxiaoer.setBirthday("1995-02-01");
        wangxiaoer.setSchool("蓝翔");
        wangxiaoer.setMajor(new String[] {"理发", "挖掘机"});
        wangxiaoer.setHas_girlfriend(false);
        wangxiaoer.setCar(null);
        wangxiaoer.setHouse(null);
        wangxiaoer.setComment("这是一个注释");
        System.out.println(new JSONObject(wangxiaoer));
    }

}

package com.wwg.json;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

/**
 * Created by wwg on 2017/12/14.
 * @author wwg
 */
public class ReadJsonSample {

    public static void main(String[] args) throws IOException, JSONException {
        //相对路径的写法出现错误，有待改进
        File file = new File("E:/wwgProject/jsonstudy/src/main/java/com/wwg/json/wangxiaoer.json");
        //读取文件内容
        String content = FileUtils.readFileToString(file);
        JSONObject jsonObject = new JSONObject(content);
        //从文件读取JSON， 判断null
        if(!jsonObject.isNull("name")){
            System.out.println("姓名是：" + jsonObject.getString("name"));
        }
        if(!jsonObject.isNull("hello")){
            System.out.println("hello");
        }
        if(jsonObject.isNull("hello")){
            System.out.println("hello is null.");
        }
        System.out.println("年龄：" + jsonObject.getDouble("age"));
        System.out.println("有没有女朋友？" + jsonObject.getBoolean("has_girlfriend"));
        JSONArray majorArray = jsonObject.getJSONArray("major");
        for (int i = 0; i < majorArray.length(); i++){
            String major = (String) majorArray.get(i);
            System.out.println("专业-" + (i+1) + ":" + major);
        }
    }
}

package com.wwg.json;

import org.apache.commons.io.FileUtils;
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
        File file = new File(ReadJsonSample.class.getResource("/wangxiaoer.json").getFile());
        //读取文件内容
        String content = FileUtils.readFileToString(file);
        JSONObject jsonObject = new JSONObject(content);
        System.out.println("姓名是：" + jsonObject.getString("name"));
    }
}

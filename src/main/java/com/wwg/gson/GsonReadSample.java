package com.wwg.gson;

import com.google.gson.Gson;
import com.wwg.bean.Diaosi;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by wwg on 2017/12/14.
 * @author wwg
 */
public class GsonReadSample {

    public static void main(String[] args) throws IOException {
        //相对路径的写法出现错误，有待改进
        File file = new File("E:/wwgProject/jsonstudy/src/main/java/com/wwg/json/wangxiaoer.json");
        //读取文件内容
        String content = FileUtils.readFileToString(file);
        Gson gson = new Gson();
        Diaosi wangxiaoer = gson.fromJson(content, Diaosi.class);
        System.out.println(wangxiaoer);
    }
}

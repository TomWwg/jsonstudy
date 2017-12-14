package com.wwg.gson;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wwg.bean.Diaosi;

import java.lang.reflect.Field;

/**
 * Created by wwg on 2017/12/14.
 * @author wwg
 */
public class GsonCreateSample {

    public static void main(String[] args) {
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

        wangxiaoer.setIgnore("看不见我看不见我");

        //使用GsonBuilder可以更加灵活构建gson对象，可以在生成JSON对象的过程中做一些想要的修改
        GsonBuilder gsonBuilder = new GsonBuilder();
        //将原本一行的结果打出多行的JSON格式，方便阅读
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {

            //不用理会，是阿里的代码规范问题
            public String translateName(Field field) {
                if(field.getName().equals("name")){
                    return "NAME";
                }
                return field.getName();
            }
        });
        //Gson gson = new Gson();
        Gson gson = gsonBuilder.create();
        System.out.println(gson.toJson(wangxiaoer));

    }
}

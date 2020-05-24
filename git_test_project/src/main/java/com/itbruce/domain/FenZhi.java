package com.itbruce.domain;

import com.itbruce.constant.TestConstant;

public class FenZhi {
    public static void main(String[] args) {
        User user=new User();
        System.out.println(user+"@@@@@@@");
        user=new User();
        System.out.println(user+"!!!!!!!");
        System.out.println(TestConstant.TEST.toUpperCase());
        TestConstant.USER.setId(1);
        TestConstant.USER.setAddress("深圳");
        TestConstant.USER.setEducation("本科");
        TestConstant.USER.setFenZhi("分支");
        TestConstant.USER.setName("测试");
        TestConstant.USER.setZhuXian("主线");

        System.out.println(TestConstant.USER+"!");

        TestConstant.USER.setId(2);

        System.out.println(TestConstant.USER+"@");
    }
}

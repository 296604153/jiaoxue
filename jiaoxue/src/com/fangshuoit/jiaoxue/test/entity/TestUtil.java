package com.fangshuoit.jiaoxue.test.entity;

/**
 * Company ：宁夏方硕信息技术有限公司
 *
 * @author Created by yangyang on 16/5/22.
 *         e-mail ：296604153@qq.com ； tel ：18580128658 ；QQ ：296604153
 */
public class TestUtil {

    public static void test(Object entity){
        BaseTest baseTest = (BaseTest) entity;
        System.out.println(baseTest.toJson());
    }

    public static void test(Object entity ,int i ){
        BaseTest baseTest = (BaseTest) entity;
        baseTest.start();
    }

}

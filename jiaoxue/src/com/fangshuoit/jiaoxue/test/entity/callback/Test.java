package com.fangshuoit.jiaoxue.test.entity.callback;

/**
 * Company ：宁夏方硕信息技术有限公司
 *
 * @author Created by yangyang on 16/5/22.
 *         e-mail ：296604153@qq.com ； tel ：18580128658 ；QQ ：296604153
 */
public class Test {
    @org.junit.Test
    public void test(){
        Student student = new Student("小明");
        student.callHelp(24422,27734);
        Seller seller = new Seller("老婆婆");
        seller.callHelp(8,1);
    }
}

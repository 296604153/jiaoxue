package com.fangshuoit.jiaoxue.test.entity;

/**
 * Company ：宁夏方硕信息技术有限公司
 *
 * @author Created by yangyang on 16/5/22.
 *         e-mail ：296604153@qq.com ； tel ：18580128658 ；QQ ：296604153
 */
public class Demo {
    @org.junit.Test
    public void test01(){
        Pay pay = new Alipay();
        Pay pay1 = new Weixin();
        System.out.println(pay1.pay());
    }
}

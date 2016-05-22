package com.fangshuoit.jiaoxue.test.entity.callback;

/**
 * Company ：宁夏方硕信息技术有限公司
 *
 * @author Created by yangyang on 16/5/22.
 *         e-mail ：296604153@qq.com ； tel ：18580128658 ；QQ ：296604153
 */
public class SuperCalculator {
    public void add(int a,int b,doJob customer){
        int result = a+b;
        //回调
        customer.fillBlank(a,b,result);
    }
}

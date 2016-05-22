package com.fangshuoit.jiaoxue.test.entity.callback;

/**
 * Company ：宁夏方硕信息技术有限公司
 *
 * @author Created by yangyang on 16/5/22.
 *         e-mail ：296604153@qq.com ； tel ：18580128658 ；QQ ：296604153
 */
public class Seller {

    private String name = null;

    public Seller(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void callHelp(int a, int b) {
        new SuperCalculator().add(a, b, new doHomeWork());
    }

    public class doHomeWork implements doJob {

        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.println(name + "请在小红算账" + a
                    + "+" + b + "=" + result + " 元");

        }
    }
}

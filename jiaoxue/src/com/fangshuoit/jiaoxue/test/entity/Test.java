package com.fangshuoit.jiaoxue.test.entity;

/**
 * Company ：宁夏方硕信息技术有限公司
 *
 * @author Created by yangyang on 16/5/22.
 *         e-mail ：296604153@qq.com ； tel ：18580128658 ；QQ ：296604153
 */
public class Test extends BaseTest {

    private String name;
    private String phone;
    private int sex;

    public void start() {
        System.out.println("test");
    }

    public String toJson() {
        return "我是教师Json";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}

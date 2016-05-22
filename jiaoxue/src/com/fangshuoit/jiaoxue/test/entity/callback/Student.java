package com.fangshuoit.jiaoxue.test.entity.callback;

/**
 * Company ：宁夏方硕信息技术有限公司
 *
 * @author Created by yangyang on 16/5/22.
 *         e-mail ：296604153@qq.com ； tel ：18580128658 ；QQ ：296604153
 */
public class Student{

    private String name = null;

    public Student(String name) {
        this.name = name;
    }

    private int calcADD(int a, int b) {
        return a + b;
    }

    private int useCalculator(int a, int b) {
        return new Calculator().add(a, b);
    }


    public void callHelp(int a, int b) {
        new SuperCalculator().add(a, b, new doHomeWork());
    }

    public void fillBlank(int a, int b, int result) {
        //int result = useCalculator(a ,b);

        System.out.println(name + "心算" + a + "+" + b + "=" + result);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class doHomeWork implements doJob{

        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.println(name + "心算" + a + "+" + b + "="
                    + result);
        }
    }
}

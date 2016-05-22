package com.fangshuoit.jiaoxue.test.entity.callback;

/**
 * Company ：宁夏方硕信息技术有限公司
 *
 * @author Created by yangyang on 16/5/22.
 *         e-mail ：296604153@qq.com ； tel ：18580128658 ；QQ ：296604153
 */


/**
 *    同步调用  异步调用   回调
 *
 *
 *    回调对象   控制器对象
 */
public class Demo01 {
    public static  void  main(String a[]){
        Boss callBack = new Boss();
        Employee e = new Employee(callBack);
        e.work();
    }
}

//
interface CallBack {
       void doEvent();
}

class Boss implements CallBack{
    @Override
    public void doEvent() {
        System.out.println("你做的很好,可以下班了!");
    }
}
class Employee{
    CallBack callBack;
    public Employee(CallBack callBack){
        this.callBack = callBack;
    }
    void work(){
        System.out.println("我工作完成了!");
        callBack.doEvent();
    }

}

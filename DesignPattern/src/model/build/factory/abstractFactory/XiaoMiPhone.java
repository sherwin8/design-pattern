package model.build.factory.abstractFactory;


/** 小米手机类 */
public class XiaoMiPhone extends Phone {
    @Override
    public void createPhone() {
        System.out.println("生产一部小米手机");
    }
}

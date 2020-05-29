package model.build.factory.abstractFactory;


/**
 * 华为手机系列
 */
public class HuaWeiPhone extends Phone {

    @Override
    public void createPhone() {
            System.out.println("生产一部华为手机");
    }
}

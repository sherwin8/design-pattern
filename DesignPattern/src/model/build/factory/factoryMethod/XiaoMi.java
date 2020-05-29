package model.build.factory.factoryMethod;

/** 小米手机类 */
public class XiaoMi implements Phone {
    @Override
    public void create() {
        System.out.println("生产一部小米手机");
    }
}

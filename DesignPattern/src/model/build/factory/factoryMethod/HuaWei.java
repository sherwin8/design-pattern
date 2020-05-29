package model.build.factory.factoryMethod;

/**
 * 华为手机类
 */
public class HuaWei implements Phone {
    @Override
    public void create() {
        System.out.println("生产一部华为手机");
    }
}

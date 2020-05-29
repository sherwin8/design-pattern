package model.build.factory.abstractFactory;


/** 华为手表类 */
public class HuaWeiWatch extends Watch {
    @Override
    public void createWatch() {
            System.out.println("生产一部华为手表");
    }
}

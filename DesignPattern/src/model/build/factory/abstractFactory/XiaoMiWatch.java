package model.build.factory.abstractFactory;


/** 小米手表类 */
public class XiaoMiWatch extends Watch {
    @Override
    public void createWatch() {
        System.out.println("生产一部小米手表");
    }
}

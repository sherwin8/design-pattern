package model.build.factory.factoryMethod;


/** 小米手机工厂类 */
public class XiaoMiFactory implements  PhoneFactory{
    @Override
    public  Phone createPhone() {
        return new XiaoMi();
    }
}

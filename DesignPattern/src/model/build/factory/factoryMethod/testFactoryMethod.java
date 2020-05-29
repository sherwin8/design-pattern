package model.build.factory.factoryMethod;

public class testFactoryMethod {
    public static void main(String[] args) {
        PhoneFactory huaWeiFactory = new HuaWeiFactory();
        huaWeiFactory.createPhone().create();
        PhoneFactory iPhoneFactory = new IPhoneFactory();
        iPhoneFactory.createPhone().create();
        PhoneFactory xiaomiFactory=new XiaoMiFactory();
        xiaomiFactory.createPhone().create();
    }
}

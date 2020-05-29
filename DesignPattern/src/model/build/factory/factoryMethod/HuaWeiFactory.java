package model.build.factory.factoryMethod;


/** 华为手机工厂类 */
public class HuaWeiFactory implements  PhoneFactory{

    @Override
    public  Phone createPhone() {
        return new HuaWei();
    }
}

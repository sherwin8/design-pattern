package model.build.factory.abstractFactory;

/** 华为工厂类 */
public  class HuaweiFactory extends  AbstractFactory {
    @Override
    public  Phone getPhone(){
        return  new HuaWeiPhone();
    }
    @Override
    public Watch getWatch() {
        return new HuaWeiWatch();
    }
}

package model.build.factory.abstractFactory;

/** 小米工厂类 */
public  class XiaoMiFactory extends  AbstractFactory {
    @Override
    public  Phone getPhone(){
        return  new XiaoMiPhone();
    }
    @Override
    public Watch getWatch() {
        return new XiaoMiWatch();
    }
}

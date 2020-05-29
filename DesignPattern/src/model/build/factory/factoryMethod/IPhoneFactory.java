package model.build.factory.factoryMethod;


/** 苹果手机工厂类 */
public class IPhoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new IPhone();

    }
}

package model.build.factory.simple_factory.MainTest;

import model.build.factory.simple_factory.PhoneFactory;
import model.build.factory.simple_factory.interface_.Phone;

public class testSimpleFactory {
    public static void main(String[] args) {
        Phone iphone= PhoneFactory.getPhone("iphone");
        Phone huawei=PhoneFactory.getPhone("huawei");
        iphone.create();
        huawei.create();
    }
}

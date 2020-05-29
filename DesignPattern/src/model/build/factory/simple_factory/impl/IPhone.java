package model.build.factory.simple_factory.impl;

import model.build.factory.simple_factory.interface_.Phone;


/**苹果手机类*/
public class IPhone implements Phone {
    @Override
    public void create() {
        System.out.println("生产一部苹果手机");
    }
}

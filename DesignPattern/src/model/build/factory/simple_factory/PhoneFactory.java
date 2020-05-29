package model.build.factory.simple_factory;

import model.build.factory.simple_factory.impl.HuaWei;
import model.build.factory.simple_factory.impl.IPhone;
import model.build.factory.simple_factory.interface_.Phone;

/** 手机工厂类 */
public class PhoneFactory {
    public static Phone getPhone(String type){
        if (type.equals("iphone")) {
//            return IPhone.class.newInstance();
            return  new IPhone();

        }
        else if(type.equals("huawei")){
//            return  HuaWeiPhone.class.newInstance();
            return new HuaWei();
        }else{
            return  null;
        }
    }
}

package model.build.factory.abstractFactory;

public class testAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory huawei=new HuaweiFactory();
        huawei.getPhone().createPhone();
       huawei.getWatch().createWatch();

        AbstractFactory xiaomi=new XiaoMiFactory();
        xiaomi.getPhone().createPhone();
        xiaomi.getWatch().createWatch();
    }
}

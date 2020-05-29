package model.build.factory.factoryMethod;



/**苹果手机类*/
public class IPhone implements Phone {
    @Override
    public void create() {
        System.out.println("生产一部苹果手机");
    }
}

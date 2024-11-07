package designPatterns.factory.factory_method;

public abstract class Coffee {
    public abstract String getName();

    public void addsuger() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}

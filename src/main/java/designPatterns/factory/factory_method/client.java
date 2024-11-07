package designPatterns.factory.factory_method;

public class client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();

//        CoffeeFactory factory = new LatteCoffeeFactory();
        CoffeeFactory factory = new AmericanCoffeeFactory();

        store.setFactory(factory);

        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}

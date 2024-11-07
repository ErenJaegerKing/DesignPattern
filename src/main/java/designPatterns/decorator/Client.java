package designPatterns.decorator;

public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + " " + food.getPrice());
        FastFood food1 = new FriedRice();
        food1 = new Egg(food1);
        System.out.println(food1.getDesc() + " " + food1.getPrice());
        FastFood food2 = new FriedNoodles();
        food2 = new Bacon(food2);
        System.out.println(food2.getDesc() + " " + food2.getPrice());
    }
}

package designPatterns.command.jdk;

public class client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        MakeFoodThread makeFoodThread = new MakeFoodThread(receiver);

        Thread thread = new Thread(makeFoodThread);
        thread.start();
    }
}

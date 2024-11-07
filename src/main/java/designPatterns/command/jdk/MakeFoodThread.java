package designPatterns.command.jdk;

public class MakeFoodThread implements Runnable {
    private Receiver receiver;
    public MakeFoodThread(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void run() {
        receiver.makeFood();
    }
}

package designPatterns.facade;

public class Client {
    public static void main(String[] args) {

        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开家店");
        facade.say("关闭家电");

    }
}

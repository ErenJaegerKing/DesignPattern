package designPatterns.observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        WeixinUser user1 = new WeixinUser("1");
        WeixinUser user2 = new WeixinUser("2");
        WeixinUser user3 = new WeixinUser("3");
        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);
        subscriptionSubject.attach(user3);
        subscriptionSubject.notify("年好好好大苏打");
    }
}

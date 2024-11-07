package designPatterns.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyPoint = new ProxyFactory();
        SellTickets proxyObject = proxyPoint.getProxyObject();
        proxyObject.sell();
    }
}

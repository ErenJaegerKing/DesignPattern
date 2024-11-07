package designPatterns.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(trainStation.getClass().getClassLoader(), trainStation.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理点收取一些服务费用");
                Object result = method.invoke(trainStation, args);
                return result;
            }
        });
        return sellTickets;
    }

}

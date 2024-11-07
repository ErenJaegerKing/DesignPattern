package designPatterns.proxy.static_proxy;

public class ProxyPoint implements SellTickets {
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("我是中介，我需要收取一些费用");
        trainStation.sell();
    }
}

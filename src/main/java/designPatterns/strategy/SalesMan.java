package designPatterns.strategy;

public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void SalesManShow() {
        strategy.show();
    }
}

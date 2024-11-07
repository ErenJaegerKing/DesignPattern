package designPatterns.strategy;

import java.util.Arrays;
import java.util.Comparator;

public class Client {

    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyB());
        salesMan.SalesManShow();
        Integer[] data = {1,3,2};
        Arrays.sort(data, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }
}

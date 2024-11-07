package designPatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class jdk {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nihao");
        list.add("asdasf");
        list.add("buhao");
        Iterator<String> iterator = list.iterator(); //list.iterator()方法返回的肯定是Iterator接口的子实现类对象
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

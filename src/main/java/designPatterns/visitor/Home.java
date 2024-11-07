package designPatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Animal> nodeList = new ArrayList<>();
    public void action(Person person) {
        for (Animal node : nodeList) {
            node.accept(person);
        }
    }
    public void add(Animal animal) {
        nodeList.add(animal);
    }
}

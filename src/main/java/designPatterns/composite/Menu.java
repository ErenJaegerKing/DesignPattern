package designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{
    private List<MenuComponent> menuComponentsList;

    public Menu(String name,int level) {
        this.level = level;
        this.name = name;
        menuComponentsList = new ArrayList<MenuComponent>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentsList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentsList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentsList.get(i);
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponentsList) {
            menuComponent.print();
        }
    }
}

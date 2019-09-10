package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponentList = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getDescription());
        System.out.println("-------------------------------------------");
        Iterator<MenuComponent> iterator = menuComponentList.iterator();
        while(iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

}

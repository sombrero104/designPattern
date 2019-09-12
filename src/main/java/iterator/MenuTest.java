package iterator;

import java.util.ArrayList;
import java.util.List;

public class MenuTest {

    public static void main(String[] args) {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new PancakeHouseMenu());
        menuList.add(new DinerMenu());

        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();
    }

}

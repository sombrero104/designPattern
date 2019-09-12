package iterator;

import java.util.ArrayList;
import java.util.List;

public class MenuTest {

    /**
     * 집합체 내에서 어떤 식으로 일이 처리되는지에 대해서 전혀 모르는 상태에서도
     * 그 안에 들어있는 모든 항목들에 대해서 반복작업을 수행할 수 있다.
     */
    public static void main(String[] args) {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new PancakeHouseMenu());
        menuList.add(new DinerMenu());

        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();
    }

}

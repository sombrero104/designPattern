package composite;

public class MenuTest {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "점심 메뉴");
        MenuComponent dinnerMenu = new Menu("객체마을 식당 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨보세요.");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dinnerMenu);

        dinnerMenu.add(new MenuItem("파스타", "마리나라 소스 스파게티", true, 3.89));
        dinnerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라 아이스크림", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }

}

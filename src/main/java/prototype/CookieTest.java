package prototype;

/**
 * Client
 */
public class CookieTest {
    private Cookie cookie;

    public CookieTest(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() {
        return (Cookie)cookie.clone();
    }

    public static void main(String[] args) {
        Cookie coconutCookie = new CoconutCookie();
        CookieTest cookieTest = new CookieTest(coconutCookie);
        /*
        System.out.println("--------------------------------");
        for(int i=0; i<10; i++) {
            Cookie cloneCookie = cookieTest.makeCookie();
            System.out.println(cloneCookie);
        }
        System.out.println("--------------------------------");
        */
        Cookie cloneCookie = cookieTest.makeCookie();
        System.out.println("--------------------------------");
        System.out.println(cookieTest.cookie.cookieName); // Coconut Cookie
        System.out.println(cloneCookie.cookieName); // Coconut Cookie
        System.out.println("--------------------------------");
        System.out.println(cookieTest.cookie == cloneCookie); // false
        System.out.println((cookieTest.cookie).equals(cloneCookie)); // false
        System.out.println("--------------------------------");
        cookieTest.cookie.setCookieName("Butter Cookie");
        System.out.println(cookieTest.cookie.cookieName); // Butter Cookie
        System.out.println(cloneCookie.cookieName); // Coconut Cookie
        System.out.println("--------------------------------");
        cookieTest.cookie.setCookieNum(new Integer(2));
        System.out.println(cookieTest.cookie.cookieNum); // 2
        System.out.println(cloneCookie.cookieNum); // 1
        System.out.println("--------------------------------");
        System.out.println();

        /**
         * 위 처럼 String과 Integer는 원본 쿠키값을 변경하면 복제본에는 영향이 없는데
         * 아래 처럼 Map과 List는 원본 쿠키값에 값을 추가 시 복제본도 추가되는 것을 확인할 수 있다.
         */
        System.out.println("--------------------------------");
        cookieTest.cookie.cookieLocation.put("2", "2");
        System.out.println(cookieTest.cookie.cookieLocation.get("2")); // 2
        System.out.println(cloneCookie.cookieLocation.get("2")); // 2
        System.out.println("--------------------------------");
        cookieTest.cookie.cookieIngredients.add("Butter");
        System.out.println(cookieTest.cookie.cookieIngredients.size()); // 2
        System.out.println(cloneCookie.cookieIngredients.size()); // 2
        System.out.println("--------------------------------");
    }

}

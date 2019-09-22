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
         * String과 Integer는 primitive type이고,
         * (https://en.wikipedia.org/wiki/Primitive_data_type 참조.)
         * Map과 List는 reference type이기 때문인데, 이를 객체의 얕은 복사(Shallow copy)라고 부른다.
         * (https://geunhokim.wordpress.com/2013/06/15/deep-copy-shallow-copy 참조.)
         */
        /**
         * Map과 List도 복사하는 깊은 복사(Deep copy)를 하기 위해서는
         * ArrayList나 HashMap에서 제공하는 clone()을 사용해야 한다.
         * 예) cloneCookie.cookieLocation = (Map)((HashMap)this.cookieLocation).clone();
         *     cloneCookie.cookieIngredients = (List)((ArrayList)this.cookieIngredients).clone();
         */
        System.out.println("--------------------------------");
        cookieTest.cookie.cookieLocation.put("2", "2");
        System.out.println(cookieTest.cookie.cookieLocation.get("2")); // 2
        System.out.println(cloneCookie.cookieLocation.get("2")); // HashMap.clone()을 사용하지 않을 경우 결과는 2,
                                                                 // HashMap.clone()을 사용할 경우에는 null이 나온다.
        System.out.println("--------------------------------");
        cookieTest.cookie.cookieIngredients.add("Butter");
        System.out.println(cookieTest.cookie.cookieIngredients.size()); // 2
        System.out.println(cloneCookie.cookieIngredients.size()); // ArrayList.clone()을 사용하지 않을 경우 결과는 2,
                                                                  // ArrayList.clone()을 사용할 경우에는 1이 나온다.
        System.out.println("--------------------------------");
    }

}

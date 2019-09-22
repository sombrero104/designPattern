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
        System.out.println("--------------------------------");
        for(int i=0; i<10; i++) {
            System.out.println(cookieTest.makeCookie());
        }
        System.out.println("--------------------------------");
    }

}

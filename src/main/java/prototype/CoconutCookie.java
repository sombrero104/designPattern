package prototype;

/**
 * Concrete prototype
 */
public class CoconutCookie extends Cookie {

    public CoconutCookie() {
        this.cookieName = "Coconut Cookie";
        this.cookieNum = new Integer(1);
        this.cookieLocation.put("1", "1");
        this.cookieIngredients.add("Coconut");
    }

}

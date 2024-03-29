package prototype;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Prototype
 */
public class Cookie implements Cloneable {
    protected String cookieName;
    protected Integer cookieNum;
    protected Map<String, String> cookieLocation = new HashMap<>();
    protected List<String> cookieIngredients = new ArrayList<>();

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public void setCookieNum(Integer cookieNum) {
        this.cookieNum = cookieNum;
    }

    public Object clone() {
        try {
            Cookie cloneCookie = (Cookie)super.clone();
            cloneCookie.cookieLocation = (Map)((HashMap)this.cookieLocation).clone();
            cloneCookie.cookieIngredients = (List)((ArrayList)this.cookieIngredients).clone();
            return cloneCookie;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}

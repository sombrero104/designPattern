package flyweight.flyweight2;

import java.util.WeakHashMap;

/**
 * Flyweight
 * (static 부분은 Flyweight Factory 역할.)
 */
public class CoffeeFlavour {
    private final String name;
    /**
     * WeakHashMap 참고.
     *
     * https://www.baeldung.com/java-weakhashmap
     */
    private static final WeakHashMap<String, CoffeeFlavour> CACHE = new WeakHashMap<>();

    public CoffeeFlavour(String name) {
        this.name = name;
    }

    public static CoffeeFlavour intern(String name) {
        synchronized (CACHE) {
            /**
             * computeIfAbsent()
             * 맵에서 key에 해당하는 value가 있으면 반환하고
             * 없으면 새로 만든다.
             *
             * http://tech.javacafe.io/2018/12/03/HashMap
             * https://namocom.tistory.com/486
             */
            return CACHE.computeIfAbsent(name, CoffeeFlavour::new);
        }
    }

    /**
     * 맵 사이즈 반환
     * (저장된 CoffeeFlavour 수)
     */
    public static int falvoursInCache() {
        synchronized (CACHE) {
            return CACHE.size();
        }
    }

    @Override
    public String toString() {
        return "CoffeeFlavour{" +
                "name='" + name + '\'' +
                '}';
    }

}

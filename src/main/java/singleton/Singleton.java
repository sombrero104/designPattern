package singleton;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    /**
     * singleton에 하나밖에 없는 인스턴스가 저장된다.
     * singleton이 null이어서 아직 인스턴스가 만들어지지 않았다면,
     * private로 선언된 생성자를 이용해서 Singleton 객체를 만든 다음 singleton 변수에 객체를 대입한다.
     * 이렇게 하면 인스턴스가 필요한 상황이 닥치기 전에는 아예 인스턴스를 생성하지 않게 되고
     * 이런 방법을 게으른 인스턴스 생성(Lazy Instantiation)이라고 부른다.
     */
    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


}

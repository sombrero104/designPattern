package singleton;

/**
 * 멀티스레드 상황에서 JVM이 되어보자.
 * 두 개의 스레드에서 getInstance() 메소드를 실행시킨다고 가정해보자.
 *
 * (1) 1번 스레드
 *     'public static SingletonError getInstance() {'
 *     부분 도달. singletonError = null인 상태.
 * (2) 2번 스레드로 제어권이 넘어감.
 *     2번 스레드
 *     'public static SingletonError getInstance() {'
 *     부분 도달. singletonError = null인 상태.
 * (3) 1번 스레드로 제어권이 넘어감.
 *     1번 스레드
 *     'if(singletonError == null) {'
 *     부분 도달. 조건 만족.
 * (4) 2번 스레드로 제어권이 넘어감.
 *     2번 스레드
 *     'if(singletonError == null) {'
 *     부분 도달. 조건 만족.
 * (5) 1번 스레드로 제어권이 넘어감.
 *     1번 스레드
 *     'singletonError = new SingletonError();'
 *     부분 진행. singletonError = [Object1], 새로운 인스턴스 생성.
 * (6) 2번 스레드로 제어권이 넘어감.
 *     2번 스레드
 *     'singletonError = new SingletonError();'
 *     부분 진행. singletonError = [Object2], 새로운 인스턴스 생성.
 * (7) 결과적으로 서로 다른 두 객체가 리턴됨.
 *     SingletonError 인스턴스가 두 개 만들어짐.
 *
 *
 * => getInstance()를 동기화시키면 멀티스레드 문제가 해결된다.
 *
 *    public static synchronized SingletonError getInstance() {
 *        ...
 *    }
 *
 *    하지만 동기화를 하면 속도도 느려지고
 *    동기화가 꼭 필요한 시점은 이 메소드가 시작되는 때 뿐이다.
 *    singletonError 변수에 인스턴스를 대입하고 나면
 *    굳이 이 메소드를 동기화된 상태로 유지시킬 필요가 없어진다.
 *    인스턴스를 생성하는 첫번째 과정을 제외하면 동기화는 불필요한 오버헤드만 증가시킬 뿐이다.
 *    (메소드를 동기화하면 성능이 많이 저하된다.)
 *
 *
 * => 해결방법
 *
 *      1. 인스턴스를 처음부터 만들어 버린다.
 *      애플리케이션에서 반드시 SingletonError 인스턴스를 생성하고,
 *      그 인스턴스를 항상 사용한다면, 처음부터 만들어버리는 것도 괜찮은 방법이다.
 *      이렇게 하면 클래스가 로딩될 때 JVM에서 SingletonError의 유일한 인스턴스를 생성해준다.
 *
 *      private static SingletonError singletonError = new SingletonError();
 *      public static synchronized SingletonError getInstance() {
 *          return singletonError;
 *      }
 *
 *
 *      2. DCL(Double-Checking Locking)을 써서
 *         getInstance()에서 동기화되는 부분을 줄인다.
 *
 *      private volatile static SingletonError singletonError;
 *      public static SingletonError getInstance() {
 *          if(singletonError == null) {
 *              synchronized(SingletonError.class) {
 *                  if(singletonError == null) {
 *                      singletonError = new SingletonError();
 *                  }
 *              }
 *          }
 *          return singletonError;
 *      }
 *
 *
 */
public class SingletonError {
    private static SingletonError singletonError;

    private SingletonError() {
    }

    public static SingletonError getInstance() {
        if(singletonError == null) {
            singletonError = new SingletonError();
        }
        return singletonError;
    }

}

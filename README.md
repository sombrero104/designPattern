# designPattern
<br/>

## 템플릿 메소드 패턴
메소드에서 알고리즘의 골격을 정의한다.<br/>
알고리즘의 여러 단계 중 일부는 서브클래스에서 구현할 수 있다.<br/>
템플릿 메소드를 이용하면 알고리즘의 구조는 그대로 유지하면서 서브 클래스에서 특정 단계를 재정의 할 수 있다.<br/>
알고리즘의 틀을 만들기 위한 패턴이다.<br/>
이 패턴에서 틀(템플릿)이란 일련의 단계들로 알고리즘을 정의한 메소드다.<br/>
여러 단계 가운데 하나 이상이 추상 메소드로 정의되며, 그 추상 메소드는 서브클래스에서 구현된다.<br/>
이렇게 하면 서브클래스에서 일부분의 단계를 구현할 수 있도록 하면서도 알고리즘의 구조는 바꾸지 않도록 할 수 있다.<br/>
어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화해 <br/>
전체 일을 수행하는 구조는 바꾸지 않으면서 특정 단계에서 수행하는 내용을 바꾸는 패턴.<br/>
즉, 전체적으로는 동일하면서 부분적으로 다른 구문으로 구성된 메소드의 코드 중복을 최소화할 때 유용하다.<br/>
다른 관점에서 보면 동일한 기능을 상위 클래스에서 정의하면서 확장/변화가 필요한 부분만 서브 클래스에서 구현할 수 있도록 한다.<br/>
=> templateMethod 패키지 참조.<br/>
https://jusungpark.tistory.com/24 <br/>
<br/>

## 프록시 패턴
클라이언트에서 프록시 클래스를 통해 간접적으로 주체 클래스를 사용하는 방식.<br/>
프록시가 대리자로써 일을 처리하고 완료되면 결과를 알려주는 패턴.<br/>
프록시의 의미는 "대리자"라는 의미이다.<br/>
무언가를 대신해서 일을 해주는 사람을 말하는데 프록시패턴(Proxy Pattern)은<br/>
대리자로써 일을 맡기면 그 일을 처리하고 완료되면 결과를 알려주는 패턴이다.<br/>
#### * 프록시 종류
(1) 원격 프록시(원격에서 모니터링 하는 경우.)<br/>
(2) 가상 프록시(이미지를 불러오는 동안 무언가 다른것을 보여주고 싶을 때.)<br/>
(3) 동적 프록시(자바 리플렉션 사용. 프록시 클래스가 실행중에 생성됨. 사용자 권한에 따라 다른 페이지 보여줄 때.)<br/>
(4) 방화벽 프록시(네트워크 자원에 대한 접근을 제어함으로써 객체를 공격자로부터 보호.)<br/>
(5) 스마트 패턴 프록시(주 객체가 참조될 때마다 추가 행동을 제공. 래퍼런스 개수 세기 등.)<br/>
(6) 캐싱 프록시(비용이 많이 드는 작업의 결과를 임시로 저장. 웹 서버 프록시, 컨텐츠 관리 및 퍼블리싱 시스템.)<br/>
(7) 동기화 프록시(여러 스레드에서 주 객체에 접근하는 경우 안전하게 작업을 처리하게 해준다.)<br/>
(8) 복잡도 숨김 프록시(퍼사드 패턴이 단순히 인터페이스만 제공하는 것에 비해 복잡도 숨김 프록시는 접근을 제어한다.)<br/>
(9) 지연 복사 프록시(객체 복사를 제어한다.)<br/>
<br/>
=> proxy 패키지 참조.<br/>
https://plposer.tistory.com/31 <br/>
https://meylady.tistory.com/58 <br/>
<br/>

## 퍼사드 패턴
인터페이스를 간단하게 바꿈 (for 간편함)<br/>
어떤 서브시스템에 대한 간단한 인터페이스를 제공하기 위한 용도.<br/>
<br/>

## 싱글톤 패턴
인스턴스를 한번만 생성해서 사용하턴 패턴.<br/>
<br/>

## 전략 패턴
실행 중에 알고리즘을 선택할 수 있게 하는 패턴.<br/>
<br/>

## 팩토리 메소드 패턴
객체를 만들어내는 공장을 만드는 패턴.<br/>
<br/>

## 어댑터 패턴
한 인터페이스를 다른 인터페이스로 변환 (for 호환성)<br/>
인터페이스를 변경해서 클라이언트에서 필요로 하는 인터페이스로 적응시키기 위한 용도.<br/>
<br/>

## 데코레이터 패턴
인터페이스를 바꾸지 않고 책임(기능)만 추가함. (For 기능 추가)<br/>
<br/><br/>
    
--

#### * 결합도, 응집도
결합도는 낮고, 응집도는 높을수록 좋다.
<br/><br/>
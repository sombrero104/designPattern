# designPattern

### 템플릿 메소드 패턴
어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화해 <br/>
전체 일을 수행하는 구조는 바꾸지 않으면서 특정 단계에서 수행하는 내용을 바꾸는 패턴.<br/>
즉, 전체적으로는 동일하면서 부분적으로 다른 구문으로 구성된 메소드의 코드 중복을 최소화할 때 유용하다.<br/>
다른 관점에서 보면 동일한 기능을 상위 클래스에서 정의하면서 확장/변화가 필요한 부분만 서브 클래스에서 구현할 수 있도록 한다.<br/>
<br/>

### 프록시 패턴
클라이언트에서 프록시 클래스를 통해 간접적으로 주체 클래스를 사용하는 방식.<br/>
프록시가 대리자로써 일을 처리하고 완료되면 결과를 알려주는 패턴.<br/>
<br/>

### 퍼사드 패턴
인터페이스를 간단하게 바꿈 (for 간편함)<br/>
어떤 서브시스템에 대한 간단한 인터페이스를 제공하기 위한 용도.<br/>
<br/>

### 싱글톤 패턴
인스턴스를 한번만 생성해서 사용하턴 패턴.<br/>
<br/>

### 전략 패턴
실행 중에 알고리즘을 선택할 수 있게 하는 패턴.<br/>
<br/>

### 팩토리 메소드 패턴
객체를 만들어내는 공장을 만드는 패턴.<br/>
<br/>

### 어댑터 패턴
한 인터페이스를 다른 인터페이스로 변환 (for 호환성)<br/>
인터페이스를 변경해서 클라이언트에서 필요로 하는 인터페이스로 적응시키기 위한 용도.<br/>
<br/>

### 데코레이터 패턴
인터페이스를 바꾸지 않고 책임(기능)만 추가함. (For 기능 추가)<br/>
<br/><br/>
    
--

#### * 결합도, 응집도
결합도는 낮고, 응집도는 높을수록 좋다.
<br/><br/>
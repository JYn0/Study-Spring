# Spring

=> 빠른 구현, 강한 재사용성, 유지보수 비용 절감

#### 아키텍처 / 프레임워크

container component 모델 : container위에서 servlet / 안드로이드가 작동 됨(혼자 작동 불가) / 단점 : 규칙대로 만들어야함

전자정보프레임워크



p.33

## POJO(Plain Old Java Object)

: 기존에 쓰던 java class를 container에서 실행할 수 있음

옛날 자바 class

* 경량

* **IoC** 제어의 역행(Inversion of Control) 

  -> 클래스간의 관계가 없어야함, 관계를 끊어줌, new를 안해도 쓸 수 있음

* **AOP** 관점지향 프로그래밍(Aspect Oriented Programming) 

  -> 공통 로직을 분리, 공통 소스를 각각넣지 않아도 되서 유지보수가 좋음




### 1. Spring Project Setting(개발환경)

1. Make Project

2. Spring Nature

3. Maven(Add Spring Library)

   - pom.xml(list up Library) -> 필요한 라이브러리 써두기

   - Download Library -> 알아서 다운로드 받아와서 컴퓨터에 저장시켜줌

     => C:\Users\student\.m2\repository 여기에 저장

   - Maven - Update



day011 - properties - Java build path - libraries - add external JAR - 추가

Maven : 외부 라이브러리 관리

Help - Eclipse Marketplace - sts -  3.x install

project - Spring - add

project - configure - covert Maven => finish후 필요한 JAR  기입

maven-update

javaresouces - new - configure - name:myspring default finish





### 2. Spring IoC

1. XML

의존성 주입 : XML로 한다.
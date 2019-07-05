# Spring

### Mybatis(p.467)



프레임 - 단순한 골격

프레임워크 - IoC, AOP



### day03

##### DB와 연동하기

```xml
<tx:annotation-driven transaction-manager="txManager"/>
txManager라는 이름으로 어노테이션으로 사용하겠다

parameterType="user" -> user 객체가 들어옴

<resultMap></resultMap>
테이벌의 column과 mapping에 사용될 자바 객체의 변수 이름이 다를 때

<![CDATA[
xml에서 특수기호 사용방법
]]>
```



자바의 오브젝트를 db같은곳에 넣는게 프레임워크

mapper  sql문 넣는 곳, Dao에서 Mybatis 호출하는데, 통로역할을 하는 것이 mapper

userDao에서 mybatis(xml)로 들어가는 통로 : mapper

UserDao에서 isert를 호출하면 UserMapper를 통해서 id를 가지고감




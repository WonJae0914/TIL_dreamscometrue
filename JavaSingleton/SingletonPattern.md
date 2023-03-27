#  싱글톤(Singleton Pattern)

### 싱글톤이란?
객체의 인스턴스가 오직 1개만 생성되는 패턴

### 싱글톤을 사용하는 이유 
공유하고자 하는 클래스가 한번의 메모리만 할당하고 그 할당한 메모리에 대해 객체로 관리하기 위해서
여러 클래스에서 각자 해당 클래스의 생성자를 호출해도 처음 생성된 인스턴스를 리턴하기 때문에 동기화에 용이하다. 

### 싱글톤 코드 예제
```java
/**
 * SinggletonPattern
 */
public class SingletonPattern {

    private static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern() {

    }

    private static SingletonPattern getInstance(){
        return instance;
    }

    public void what(){
        System.out.println("Singleton Pattern");
    }

    public static void main(String[] args) {
        SingletonPattern single = SingletonPattern.getInstance();
    }
}
```

### 싱글톤 패턴의 문제점 
1. 코드 자체가 너무 길어짐 
무조건 Syncronized 키워드가 필요

2. 테스트하기가 매우 어려움
자원을 공유하고 있기 때문에 테스트하려면 인스턴스의 초기화가 항상 필요.
(전역변수화)

3. 자식 클래스를 만들 수 없음. 
상속이 불가능하다

※ 이론상으로는 완벽해 보이지만 문제점이 많은 패턴
※ 프레임워크의 컨테이너안에서 문제점을 보완할 수 있어 사용하기도 함. 
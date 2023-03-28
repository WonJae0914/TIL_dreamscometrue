# 자바 복습

### 자바 환경설정 
환경변수 설정하는 이유 : 컴파일 시 설치한 자바 버전이 우선적으로 실행될 수 있도록 하기 위해 

### 객체지향 프로그래밍
객체란 ? 
현실세계에서 존재하는 모든 것 
현실세계에 존재하는 것을 프로그래밍화 한 것
속성, 행동을 가지고 있음.
ex) 
사람의 속성 : 이름, 나이, 직업 등
사람의 행동 : 밥 먹기, 운동하기

객체지향 프로그래밍이 나온 이유는 무엇인가? 
절차지향 프로그래밍의 단점인 유지보수성이 떨어진다는 점을 보완하기 위해 

#### 예제코드

```java
public class JavaReview {
    //필드
    String i40; // 인스턴스 변수 
    static int a = 10; // 정적변수 = 클래스 변수

    //메소드(기능,행동)
    public void methodName(){
        System.out.println("method1");
    }

    public static void main(String[] args) {
        //클래스명 변수명 = new 생성자();
        JavaReview jr = new JavaReview(); 
        System.out.println(jr.a);
        jr.methodName();
    }
}
```

생성자
```java
public class JavaReview {

    //필드
    String i40; // 인스턴스 변수 
    static int a = 10; // 정적변수 = 클래스 변수
    
     // 생성자
     public JavaReview(String i40){ // 매개변수 
        this.i40 = i40;
    }

    //메소드(기능,행동)
    public void methodName(){
        System.out.println("method1");
    }
   
    public static void main(String[] args) {
        //클래스명 변수명 = new 생성자();
        JavaReview jr = new JavaReview(); 
        System.out.println(jr.a);
        jr.methodName();
    }
}
```
---
### 함수와 메소드의 차이 

class 내부에서 사용되는 것 : 메소드 
그 외 함수 

---
### 접근 제어자 
(객체지향의 캡슐화와 관련)
클래스, 변수, 메소드의 접근을 가능 또는 불가능 하도록 설저하는 키워드 

캡슐화를 사용하는 이유 
데이터 은닉을 위해!

---
### 상속
부모 클래스가 자식 클래스에게 메소드를 물려주는 것.
자식은 메소드를 재정의 할 수 있다.(오버라이딩-메소드명의 통일화:유지보수성↑) 

기본적으로 생성자는 상속불가하지만 가능한 방법이 몇가지 있다.

생성자를 상속할 수 있는 방법 
1) super()라는 메소드를 통해 부모의 생성자를 호출할 수 있다.
2) 부모클래스 생성자가 선언되어 있지 않을 경우
3) 기본만 명시되어 있을 경우 (파라미터가 없는 경우)

---
### 다형성
하나의 객체 인스턴스가 여러가지 자료형을 가질 수 있는 것
is-a 관계 
```java
public class Dog{
    
    String color;

    public void sound(){
        System.out.println("멍멍");
    }

    public void bite(){
        System.out.println("물어뜯기");
    }

}

class Huskey extends Dog{

}

class NuclearTeeth extends Dog{
    public void bite(){
        System.out.println("핵물어뜯기");
    }
}

class Welsicogi extends Dog{
    public void bite(){
        System.out.println("웰시코기 물어뜯기");
    }
}
```

---
### 추상화
내용에 중점을 두는 것 보다 핵심적인 개념을 추려내는 것 or 공통적인 것을 추려내는 것 
다형성의 성질을 이용하여 부수적인 행동은 각 관련 세부 클래스의 행동으로 넘긴다.

추상클래스(abstract)
```java
public abstract class Shape {
    // 추상 메서드
    public abstract double getArea();
}

// ******************************************* //

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // 면적을 계산하는 메서드
    @Override
    public double getArea() {
        return base * height * 0.5;
    }
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 면적을 계산하는 메서드
    @Override
    public double getArea() {
        return width * height;
    }
}
```

#### 추상 클래스 vs 인터페이스 
- 구현 방식: 추상 클래스는 구현된 메서드와 추상 메서드를 모두 가질 수 있다. 하지만 인터페이스는 모든 메서드가 구현되어 있지 않아 구현되지 않은 메서드만을 가지며, 모든 메서드는 기본적으로 public abstract으로 선언 된다.
- 다중 상속: 추상 클래스는 단일 상속만 지원하지만, 인터페이스는 다중 상속이 가능하다. 따라서, 인터페이스를 사용하면 다양한 기능을 가진 여러 개의 인터페이스를 조합하여 하나의 클래스에서 사용할 수 있다.
- 상속과 구현: 추상 클래스는 extends 키워드를 사용하여 상속하며, 인터페이스는 implements 키워드를 사용하여 구현
- 목적: 추상 클래스는 상속 관계에서 공통된 속성과 동작을 추출하는 것이 목적이며, 인터페이스는 다양한 객체들 간의 통신을 위한 규약이나 계약을 정의하는 것이 목적

자유도는 추상클래스가 높고 확장의 의미가 더 크다. 
인터페이스는 규정, 규약에 가깝다.

---
### 메모리 구조

RAM : 휘발성 메모리임.
HARD,SSD,CD-ROM : 비휘발성.

자바에서는 실행 중인 프로그램이 사용하는 메모리를 명확하게 구분하여 관리한다. 
이를 위해 JVM은 다음과 같은 메모리 구조를 가지고 있다. 

1) 메모리 영역(Method Area) : 클래스 파일의 바이트코드를 로드하여 클래스별로 관리하는 메모리 영역. 클래스 변수(static variable)와 상수(constant)도 이 영역에 저장. 

2) 힙(Heap) : 객체를 저장하는 영역입니다. 객체는 new 연산자로 생성되며, 생성된 객체는 힙 영역에 할당된다. 힙 영역은 크기가 크고, 데이터 접근 속도가 느리지만, 다양한 크기의 객체를 저장할 수 있다. 객체가 더 이상 사용되지 않으면 GC에 의해 제거된다.

3) 스택(Stack) : 지역 변수, 매개 변수가 저장되는 영역(메소드 반환 주소도 포함). 메소드가 호출될 때마다 스택에 새로운 프레임이 생성되며, 메소드 실행이 끝나면 해당 프레임이 스택에서 제거된다. 스택은 크기가 작고 빠른 접근이 가능하므로, 메모리 사용량이 적은 데이터를 저장하는데 적합하다.


---

### JAR, WAR

#### JAR(Java ARchive)
Java 프로그램을 배포하기 위한 파일 형식
JAR 파일은 Java 클래스, 리소스 파일, 라이브러리 파일 등을 포함할 수 있다. 이러한 파일들을 하나로 묶어서 JAR 파일로 만들면, Java 프로그램을 실행할 때 필요한 모든 파일을 한 번에 다운로드 받거나 전송할 수 있다.

JAR 파일은 압축된 형식으로 만들어진다. 이렇게 하면 파일 크기가 작아지고, 다운로드 시간이 단축되는 장점이 있다. 또한, JAR 파일은 클래스 경로(classpath)에 추가하면, Java 프로그램에서 사용할 수 있는 라이브러리와 리소스를 쉽게 관리할 수 있다.

JAR 파일을 생성하는 방법은 여러 가지가 있다. 대표적인 방법은 JDK(Java Development Kit)에서 제공하는 jar 명령어를 사용하는 것이다. 또한, 대부분의 IDE(Integrated Development Environment)에서는 JAR 파일을 쉽게 생성할 수 있는 기능을 제공한다.

JAR 파일은 Java 프로그램을 배포할 때 매우 유용한 파일 형식이다. JAR 파일을 사용하면 Java 프로그램을 배포하기 쉽고, 실행하기도 간편해진다.


#### WAR(Web ARchive)
Java 웹 애플리케이션을 배포하기 위한 파일 형식이다. WAR 파일은 Java Servlet, JavaServer Pages(JSP), HTML, JavaScript, 이미지 등을 포함할 수 있다. 이러한 파일들을 하나로 묶어서 WAR 파일로 만들면, Java 웹 애플리케이션을 실행할 때 필요한 모든 파일을 한 번에 다운로드 받거나 전송할 수 있다.

WAR 파일은 JAR 파일과 비슷한 형식으로 만들어진다. 하지만, JAR 파일이 단순히 자바 애플리케이션을 위한 패키지 형식이라면, WAR 파일은 웹 애플리케이션을 위한 패키지 형식이다.

WAR 파일을 생성하는 방법은 대부분의 웹 애플리케이션 서버가 제공하는 기능을 사용한다. 대표적인 웹 애플리케이션 서버로는 Tomcat, JBoss, WebSphere 등이 있다. 이들 웹 애플리케이션 서버에서는 웹 애플리케이션을 빌드하고, WAR 파일을 생성하고, 배포할 수 있는 기능을 제공한다.

WAR 파일은 Java 웹 애플리케이션을 배포할 때 매우 유용한 파일 형식. 
WAR 파일을 사용하면 Java 웹 애플리케이션을 배포하기 쉽고, 실행하기도 간편해진다.

---

#JSP/Servlet 
자바로 웹 어플리케이션을 만들기 위한 도구 
웹을 조금 더 쉽게 다룰 수 있도록 해주는 확장 기능

---

### JSP(Java Server Page)
HTML 문서 안에 자바 언어를 삽입하여 사용하는 라이브러리 

---

### Servlet 
웹을 다룰 수 있도록 해주는 HttpServlet 클래스를 상속받은 클래스 
자바로 웹개발을 하기 위해 사용하는 클래스 
웹 서버 성능을 향상시키기 위해 사용되는 자바 클래스의 일종 
Spring에서 Bean 객체로 등록하고 사용한다.
웹페이지에 다양한 기능들이 요구되면서 정적, 동적페이지를 만들 필요가 생겼다.  
그것을 처리하기 위해 나온 클래스이다. 
Serlvet은 클라이언트의 요청에 맞춰 동적인 결과를 마늘어주는 자바 웹 프로그래밍 skill or class
Serlvet은 WAS의 서블릿 컨테이너 내부에서 동작

socket, 인터셉트, aop에 대해 이해할 수 있게 된다. 

#### Servlet의 특징 
클라이언트의 요청에 동적으로 응답한다. 
HTML을 사용하여 응답
JAVA쓰레드를 활용
MVC 패턴의 컨트롤러를 제어
HttpServlet 클래스를 상속 -> HTTP 프로토콜 서비스를 지원

<img src="/JSP와Servlet/JSP/img/MVC.jpg" alt="">

---
### 웹서버/WAS

#### 웹 서버(Web Server)

웹서버의 단일 구성 방식은 사용자가 요청시 해당페이지를 넘겨주는 정적 방식
**단점 : 복잡한 로직을 통해 모든 페이지를 미리 준비해야한다.**

복잡한 것들을 쾌적하려면 처리하려면? 
효율적으로 서비스를 구성해야한다. 
웹 서버로부터 효율적인 웹 서비스를 구성하기 위해 등장한 개념이 WAS이다. 

#### 웹 서버와 WAS의 차이
- 웹서버는 정적인 방식,
- WAS는 사용자의 요청 내용을 받아 짜여진 로직대로 처리한 뒤 웹페이지를 구성하여 사용자에게 응답하는 형식
(웹 서버는 즉석 떡볶이, WAS는 완성된 떢볶이를 응답해주는 것)
- WEB서버와 WAS는 한 서버안에 기능적으로 나눠둘수도 있지만 물리적으로 분리도 가능(수행하는 기능은 다르다)
웹서버 : 정적페이지를 처리, 연산이 필요하면 WAS가 처리 
(아파치 : 웹서버, 톰캣 : 와스)
- 웹서버와 WAS는 서로 적절히 분담하여 리소스를 효율적으로 사용해야한다. 

#### Apache Tomcat
- Apache : 웹서버 
- Apache Tomcat : WAS
(경량 아파치와 톰캣의 합성어)

writer.prinln("<html>")
writer.prinln("<head>")
writer.prinln("</head>")
writer.prinln("<body>")
writer.prinln("</body>")
-> 이와 같은 식으로 HTML을 구성하기는 너무 어렵기 때문에 등장한 것이 JSP

#### 서블릿의 라이프 사이클

<img src="/JSP와Servlet/JSP/img/servlet.jpg" alt="">

1. 서블릿 객체의 생성
- 최초 호출시 톰켓에서 서블릿 파일을 불러와 컴파일한 후에 메모리에 로드
- 톰캣은 서블릿 파일이 변경되는게 아니라면 서버 종료전까지 계속해서 해당객체를 재활용
- JSP 파일이나 서블릿 파일이 서중된다면 서블릿 자원을 해제시킨뒤 새로운 객체를 생성해서 메모에 로드하는 형식

2. 선처리 작업수행(객체 생성시 최초1회 수행)
- 서블릿에서 메소드를 임의로 작성하고 @PostConstruct 어느테이션을 부여하여 가장 먼저 해당 메소드를 실행
- 서블릿 객체가 생성될 때 먼저 처리하고 싶은 로직이 있다면 만들어줌
- init()메소드로 수행해도 큰 문제는 없음. But 성격이 다른 로직이라면 별도로 분리해서 작성 가능

3. init()메소드 실행
- web.xml 에서 서블릿 컨텍스트, 루트 컨텍스트 찾아줌
- 서블릿 객체 생성시 초기화 작업을 수행해주는 역할 
- 톰캣 서버 호나경설정 파일인 web.xml의 내용을 불러와 ServletConfig 객체로 생성해준다.
- 오버로딩의 구조로 되어있고 톰캣에서 ServletConfig 객체를 파라미터로 넣어 실행
  init()메소드를 오버라딩 하지 않으면 아무것도 실행시키지 않음 
  
4. Service(자원 해제 전까지 요청이 올때마다 반복 실행)

#### 서블릿 내장객체 목록
request : 요청 객체(doGet(), doPost() 메소드의 첫번째 파라미터)
response : 요청 객체(doGEt(), doPost() 메소드의 두번째 파라미터)
out : 웹 브라우저로 HTML 코드 출력
application : JSP 페이지가 속한 웹 어플리케이션에 관련된 기능
config : JSP 페이지의 구성 정보를 가져오는 기능
pageContext : JSP 페이지 범위 내에서 사용할 수 있는 데이터 저장 기능
session : 세션 관련 기능
page : JSP 페이지에서 생성된 서블릿
exception : 예외처리 


#### Session 
웹 사이트의 여러 페이지에 걸쳐서 사용되는 사용자 정보를 저장하는 방법 
-> 여러개의 컴포넌트들이 협력 작업을 시작해 끝날 때까지의 기간

**세션 만들기 예시**
HttpSession session = request.getSession();
session.setAttribute("name", "존준모")

**세션 사용하기**
HttpSession session = request.getSession();
String name = (String) session.getAttribute("name");

**세션 함수**
세션 내용 삭제
removeAttribute("키값"); 

**세션 종료**
invaildate();

**세션 타임아웃 기간 설정**
setMaxInactiveInertval(ms단위);
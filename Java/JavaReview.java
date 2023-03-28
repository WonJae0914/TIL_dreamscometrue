public class JavaReview {
    //필드
    String i40; // 인스턴스 변수 
    static int a = 10; // 정적변수 = 클래스 변수

     // 생성자
     public JavaReview(String i40){
        this.i40 = i40;
    }

    //메소드(기능,행동)
    public void methodName(){
        System.out.println("method1");
    }
   
    public static void main(String[] args) {
        //클래스명 변수명 = new 생성자();
        JavaReview jr = new JavaReview("car"); 
        System.out.println(jr.a);
        jr.methodName();
    }
}



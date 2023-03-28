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
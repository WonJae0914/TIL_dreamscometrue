package JavaSingleton;

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
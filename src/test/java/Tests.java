enum MySingleton {
    INSTANCE;

    MySingleton() {
        System.out.println("Singleton created!");
    }
}
public class Tests {
    public static void main(String[] args) {
        System.out.println(MySingleton.INSTANCE);
    }
}

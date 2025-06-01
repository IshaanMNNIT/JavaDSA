package singleton;

public class Singleton { // Class with only one instance
    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}

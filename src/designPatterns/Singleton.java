package designPatterns;

public class Singleton {

    static private Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

//Singleton - only one instance, and provides a global point of access to that instance.

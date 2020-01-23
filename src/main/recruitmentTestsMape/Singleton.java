package main.recruitmentTestsMape;

//singleton pattern - only one instance
public class Singleton {

    private static Singleton INSTANCE = null;

    //double-check-locking pattern (2 ifs)
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    //lazy loading - new (only one) instance after start method getInstance
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    private Singleton() {
    }
}

package homework_nr_10;

public interface Animals {
    String CLASS_TYPE = "mammal";

    void eating();
    void makingSound();
    void moving();

    default void showInfo(){
        System.out.println("This is an animal of type " + CLASS_TYPE);
    }

    static void killer(){
        System.out.println("Be careful, it can kill you...");
    }


}

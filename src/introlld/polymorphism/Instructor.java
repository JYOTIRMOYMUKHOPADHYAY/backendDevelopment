package introlld.polymorphism;

public class Instructor extends User {
    String batchName;
    double averageRating;

    void scheduleClass(){
        System.out.println("Instructor is scheduling the class............");
    }
}

package introlld.accessmodifiers;

public class Student {
    private String name;
    int batchId;
    protected double psp;
    public String universityName;

    void doSomething() {
        this.name = "Jyotirmoy";
        this.batchId = 123;
        this.universityName = "Hello";
        this.psp = 10.02;
    }
}

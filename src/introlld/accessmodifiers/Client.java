package introlld.accessmodifiers;

public class Client {
    public void doSomething(){
        Student student = new Student();
        student.psp = 10.012;
        student.universityName = "Secoend University";
        student.batchId = 2;
        //NAME IS A PRIVATE PROPERTY SO ONLY ACCESSIBLE INSIDE SAME CLASS
//        student.name = "New Name"; ERROR NAME PROPERTY
    }
}

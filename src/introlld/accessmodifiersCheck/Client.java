package introlld.accessmodifiersCheck;

import introlld.accessmodifiers.Student;

public class Client extends Student {
    public void doSomething(){
//        Student student = new Student();
//        // PSP IS A PROTECTED PROPERTY SO IT WON'T BE ACCESSIBLE OUTSIDE SAME PACKAGE
////        student.psp = 10.012; ERROR
//        student.universityName = "Second University";
////        BATCH ID IS A DEFAULT PROPERTY SO IT WON'T BE ACCESSIBLE OUTSIDE SAME PACKAGE
//        student.batchId = 2;

        this.psp = 10.021;
        // AS A DEFAULT SCOPE IT'S NOT ACCESSIBLE
//        this.batchId = 2;
        this.universityName = "some name";

    }
}

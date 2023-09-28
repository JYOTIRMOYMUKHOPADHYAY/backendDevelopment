package introlld.polymorphism;

import java.util.Random;

public class Client {

    public static User getUser(){
        Random random = new Random();
        int value = random.nextInt();

        return value%2 == 0 ? new Instructor() : new Mentor();
    }
    public static void main(String[] args) {
        Instructor ins = new Instructor();
        ins.login();

        Mentor mentor = new Mentor();
        mentor.login();

        for(int i =0; i<5; i++){
            getUser().login();
        }
    }
}

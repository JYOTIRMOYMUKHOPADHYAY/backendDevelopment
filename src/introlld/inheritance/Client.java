package introlld.inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor ins = new Instructor();
        ins.login();
        ins.scheduleClass();

        User user = new User();
        user.login();
    }
}

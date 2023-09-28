package introlld.overloading;

public class Client {
    public static void main(String[] args) {
        A a =  new A();
        a.doSomething("jyotirmoy");

        B b =  new B();
        b.doSomething("test_user");

        A ab =  new B();
        ab.doSomething("sharmistha");
    }
}

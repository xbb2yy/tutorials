package UnderstandingtheJvm.c8;

public class StaticDispatch {

    static abstract class Human{}
    static  class Man extends Human{}
    static  class Women extends Human{}

    public void sayHello(Human human) {
        System.out.println("human hello");
    }

    public void sayHello(Man man) {
        System.out.println("man hello");
    }

    public void sayHello(Women women) {
        System.out.println("Women hello");
    }

    public static void main(String[] args) {
        StaticDispatch sr = new StaticDispatch();
        Human man = new Man();
        Human woman = new Women();
        sr.sayHello(man);
        sr.sayHello(woman);
    }
}

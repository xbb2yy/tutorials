package UnderstandingtheJvm.c7;

public class ConstClass {

    static {
        System.out.println("Const Class init");
    }

    public static final String HELLO_WORLD = "hello world !";
}

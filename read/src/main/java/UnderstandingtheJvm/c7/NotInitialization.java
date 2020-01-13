package UnderstandingtheJvm.c7;

public class NotInitialization {

    static {
        System.out.println("NotInitialization class init");
    }

    public static void main(String[] args) {
        // 不会触发ConstClass 的初始化
        // System.out.println(ConstClass.HELLO_WORLD);
        // System.out.println(SubClass.value); -XX:+TraceClassLoading
        SuperClass[] superClasses = new SuperClass[10];
    }
}

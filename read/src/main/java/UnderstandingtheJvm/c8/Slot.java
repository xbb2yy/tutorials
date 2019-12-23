package UnderstandingtheJvm.c8;

public class Slot {
    // -verbose:gc
    public static void main(String[] args) {
        {
            byte[] bytes = new byte[64 * 1024 * 1024];
        }
        int a = 0;
        System.gc();
    }
}

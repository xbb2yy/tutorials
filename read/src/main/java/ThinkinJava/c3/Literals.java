package ThinkinJava.c3;

public class Literals {

    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1: " + Integer.toBinaryString(i1) + ":" + i1);
        int i2 = 07;
        System.out.println("i2: " + Integer.toBinaryString(i2) + ":" + i2);
        long i3 = 0x2fDL;
        System.out.println("i3: " + Long.toBinaryString(i3) + ":" + i3);
    }
}

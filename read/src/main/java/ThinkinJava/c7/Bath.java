package ThinkinJava.c7;

import java.util.Random;

public class Bath {

    private String s1 = "happy", s2 = "Happy", s3, s4;
    private Random random;
    private int i;
    private float toy;
    public Bath() {
        System.out.println("Inside Bath");
        s3 = "toy";
        toy = 3.14f;
        random = new Random();
    }
    {i = 27;}
    @Override
    public String toString() {
        if (s4 == null) s4 = "toy";
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", random=" + random +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        System.out.println(bath);
    }
}

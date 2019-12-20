package ThinkinJava.c7;

import java.util.Random;

public class FinalData {

    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    private static final int VALUE_THREE = 39;
    private final int i4 = rand.nextInt();
    static final int INT_5 = rand.nextInt();
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value v3 = new Value(33);
    private final int[] a = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

    }

}

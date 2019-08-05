package algorithm.c1;

import edu.princeton.cs.algs4.StdRandom;



public class StopWatch {

    private final  Long start ;

    public StopWatch() {
        start = System.currentTimeMillis() ;
    }

    public  double elapseTime() {
        return (System.currentTimeMillis() - start) / 1000.0;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-10000000, 10000000);
        }

        StopWatch timer = new StopWatch();
        int cnt = ThreeSum.count(a);
        System.out.println(cnt + "triples" + timer.elapseTime() + "seconds");
    }
}

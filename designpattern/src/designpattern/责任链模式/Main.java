package designpattern.责任链模式;

public class Main {
    public static void main(String[] args) {
        SpecialSupport alice = new SpecialSupport("alice", 2);
        OddSupport bing = new OddSupport("bing");
        LimitSupport yuan = new LimitSupport("yuan", 23);
        NoSupport yun = new NoSupport("yun");

        alice.setNext(bing).setNext(yuan).setNext(yun);
        Trouble trouble = new Trouble(23);

        alice.support(trouble);
    }
}

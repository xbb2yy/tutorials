package com.xubing.designpattern;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/9/20 16:40
 */
public class BridgePattern {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Bing"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(10);
    }
}

abstract class DisplayImpl {
    public abstract void rawOpen();

    public abstract void rawPrint();

    public abstract void rawClose();
}

class StringDisplayImpl extends DisplayImpl{

    private String string;
    private Integer width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }
    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width ; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}



class Display {

    private DisplayImpl display;

    public Display(DisplayImpl display) {
        this.display = display;
    }

    public void open() {
        display.rawOpen();
        System.out.println();
    }

    public void print() {
        display.rawPrint();
    }

    public void close() {
        display.rawClose();
    }

    public void display() {
        open();
        print();
        close();
    }
}

class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();

        for (int i = 0; i < times; i++) {
            print();
        }

        close();
    }

}



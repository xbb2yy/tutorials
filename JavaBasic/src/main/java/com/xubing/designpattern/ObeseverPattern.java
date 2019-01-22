package com.xubing.designpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/9/6 9:28
 */
public class ObeseverPattern {

    public static void main(String[] args) {
        Obesever obesever = new DigitObserver();
        Obesever graphOberver = new GraphObserver();
        NumberGenerator generator = new RandomNumberGenerator();
        generator.addObesever(obesever);
        generator.addObesever(graphOberver);
        generator.execute();

        System.out.println("###############################");
        generator.deleteObsever(graphOberver);
        generator.execute();
    }
}


interface  Obesever {

    /**
     * @param numberGenerator
     */
    void update(NumberGenerator numberGenerator);

}


abstract class NumberGenerator {
    private ArrayList<Obesever> obsevers = new ArrayList<>(10);
    public void addObesever(Obesever obesever) {
        obsevers.add(obesever);
    }
    public void deleteObsever(Obesever obesever) {
        obsevers.remove(obesever);
    }
    public void notifyObsevers() {
        Iterator<Obesever> iterator = obsevers.iterator();

        while (iterator.hasNext()) {
            iterator.next().update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}

class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObsevers();
        }
    }
}

class DigitObserver implements Obesever {
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("DigitObserver:" + numberGenerator.getNumber());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {

        }
    }
}

class GraphObserver implements Obesever{
    @Override
    public void update(NumberGenerator numberGenerator) {
        int number = numberGenerator.getNumber();
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

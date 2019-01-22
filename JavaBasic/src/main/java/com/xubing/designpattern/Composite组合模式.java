package com.xubing.designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/24 14:44
 */
public class Composite组合模式 {

    public static void main(String[] args) {
        try {
            System.out.println("making root entries...");
            Directory root = new Directory("root");
            Directory bin = new Directory("bin");
            Directory usr = new Directory("tmp");
            Directory tmp = new Directory("tmp");
            root.add(bin);
            root.add(usr);
            root.add(tmp);
            bin.add(new File("vi", 10000));
            bin.add(new File("latex", 20000));
            root.printList();

            System.out.println("");
            System.out.println("making user entries...");
            Directory xubing = new Directory("xubingbing");
            usr.add(xubing);
            xubing.add(new File("index.html", 100));
            root.printList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {}
    public FileTreatmentException(String msg) {super(msg);}
}

abstract class Entry {

    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public void printList() {printList("");}
    protected abstract void printList(String str);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}

class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}

class Directory extends Entry {
    private String name;

    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }
}

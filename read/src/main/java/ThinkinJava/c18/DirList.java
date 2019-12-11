package ThinkinJava.c18;

import java.io.File;

public class DirList {

    public static void main(String[] args) {
        File file = new File(".");
        String[] list;
        list = file.list();
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("=========================");
        for (String item : file.list((d, f) -> f.startsWith("java"))) {
            System.out.println(item);
        }
    }
}

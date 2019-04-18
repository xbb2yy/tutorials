package com.xubing.generics;

import java.util.EnumSet;

public class WatercolorSets {
    public static void main(String[] args) {
        EnumSet<Watercolors> set1 = EnumSet.range(Watercolors.YELLOW, Watercolors.BLACK);
        System.out.println("set1:" + set1);

        EnumSet<Watercolors> set2 = EnumSet.range(Watercolors.BLACK, Watercolors.DARK_BLUE);
        System.out.println("set2:" + set2);

    }
}

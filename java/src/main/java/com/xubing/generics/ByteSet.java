package com.xubing.generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ByteSet {

    public static void main(String[] args) {
        Byte[] bytes = {1, 2, 3, 127};
        Set<Byte>  set = new HashSet<>(Arrays.asList(bytes));

        /**
         * error
         * Set<Byte> set2 = new HashSet<Byte>(Arrays.asList(1, 2, 3));
         * */
    }
}

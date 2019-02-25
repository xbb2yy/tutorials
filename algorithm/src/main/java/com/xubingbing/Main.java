package com.xubingbing;

import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        System.out.println(list1.getClass() == list2.getClass());

        Map<String, Integer> map = new HashMap();
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        TypeVariable<? extends Class<? extends Map>>[] typeParameters = map.getClass().getTypeParameters();
        TypeVariable<? extends Class<? extends Map>> typeParameter = typeParameters[0];
        System.out.println(Arrays.toString(list1.getClass().getTypeParameters()));
    }

}

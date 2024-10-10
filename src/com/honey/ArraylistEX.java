package com.honey;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(12);
        // list.add(2);
        // list.add(32);
        // list.add(42);
        // list.add(52);
        // list.add(26);
        // System.out.println(list);
        for (int i = 0; i < 5 ; i++) {
            list.add(in.nextInt());
        }
        // get
        for (int i = 0; i < 5 ; i++) {
            System.out.println(list.get(i)); 
        }
        in.close();
    }
}

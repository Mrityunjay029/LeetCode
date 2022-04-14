package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class OTP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word = "";
        String k="";
        char charr[] = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < charr.length; i++) {
            if (i % 2 != 0)
                list.add(charr[i]);
        }
        int array[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = Character.getNumericValue(list.get(i)) * Character.getNumericValue(list.get(i));
            word+=Integer.toString(array[i]);
        }
        System.out.println(word);
        char words[] = word.toCharArray();
        for(int i=0;i<4;i++){
            k+=words[i];
        }
        System.out.println(k);
    }
}

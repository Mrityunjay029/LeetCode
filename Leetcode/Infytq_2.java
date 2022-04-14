package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Infytq_2 {
    public static void main(String[] args){
        String s = "GOOGLE";
        String word="";
        char charr[] = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<charr.length;i++)
            list.add(charr[i]);
        for(int i=0;i<list.size();i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j))
                    list.remove(j);
            }
        }
        char charr1[] = new char[list.size()];
        for(int i=0;i< list.size();i++)
            charr1[i] = list.get(i);
        for(int i=0;i<charr1.length/2;i++){
            char temp = charr1[i];
            charr1[i] = charr1[charr1.length-i-1];
            charr1[charr1.length-i-1] = temp;
        }
        for(int i=0;i<charr1.length;i++)
            word+=charr1[i];
        System.out.println(word);
    }
}
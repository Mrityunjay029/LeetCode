package com.company;
import java.util.Scanner;
public class Infytq_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = "abcd";
        char name1[] = name.toCharArray();
        String code = "1234";
        int sum = 0;
        char charr[] = code.toCharArray();
        String word="";
        String word1 ="";
        for(int i=0;i<code.length();i++){
            sum = sum + Character.getNumericValue(charr[i]) * Character.getNumericValue(charr[i]);}
        if(sum % 2 == 0){
            char temp = name1[0];
            name1[0] = name1[name1.length-2];
            name1[name1.length-2] = temp;
            char temp1 = name1[1];
            name1[1] = name1[name1.length - 1];
            name1[name1.length - 1] = temp1;
            for(int i=0;i<name1.length;i++){
                word1+=name1[i];}
            System.out.println(word1);}
        else{
            for(int i=1;i<name1.length;i++){
                word+=name1[i];}
            word = word + name1[0];
            System.out.println(word);
        }}}
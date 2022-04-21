package com.company;

public class Add_spaces_between_words {
    public static void main(String[] args){
        String s = "thisisanewsentence";
        int arr[] = {4,2,1,3,8};
        String word="";
        int length=0;
        int sum = arr[0];
        for(int i=0;i<s.length();i++){
            if(i==sum){
                word = word + " ";
                length++;
                sum = sum + arr[length];
                i--;
            }
            else{
                word = word + s.charAt(i);
            }
        }
        System.out.println(word);
    }
}

package com.company;

public class Ifytq_1 {
    public static void main(String[] args){
        String s = "1,2,3,4,5,6,7,8";
        char charr[] = s.toCharArray();
        int num1 = 0;
        int num2 = 0;
        int count =  -1;
        String word ="";
        for(int i=0;i<charr.length;i=i+2){
            if(Character.getNumericValue(charr[i]) != 5 && count == -1){
                num1 = num1 + Character.getNumericValue(charr[i]);
            }
            else if(Character.getNumericValue(charr[i]) == 5)
                count = -2;
            else if(Character.getNumericValue(charr[i]) == 8)
                count = -1;
        }
        for(int i=0;i<charr.length;i++){
            if(Character.getNumericValue(charr[i]) == 5){
                while(i < charr.length){
                    word = word + charr[i];
                    if(Character.getNumericValue(charr[i]) == 8)
                        break;
                    i=i+2;
                }
                if(Character.getNumericValue(charr[i-1]) == 0)
                    break;
            }
        }
        System.out.println(num1 + Integer.parseInt(word));
    }
}

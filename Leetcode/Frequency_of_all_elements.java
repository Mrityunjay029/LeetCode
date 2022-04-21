package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class freq {
    public static void main(String[] args){
        int arr[] = {1,7,3,1,6,7,3,3,8,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if(arr[i] == arr[j]) {
                    count++;
                    if(i==arr.length-1)
                        list.add(count);
                }
                else{
                    list.add(count);
                    count = 0;
                    i=j-1;
                    break;
                }
            }
        }
        System.out.println(list);
    }
}

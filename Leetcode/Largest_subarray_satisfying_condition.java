package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Largest_subarray_satisfying_condition {
    public static void main(String[] args){
        int arr[] = {3,5,10,20,21};
        int output[] = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i] % arr[j] == 0 || arr[j] % arr[i] == 0)
                    list.add(arr[j]);
            }
            if(output.length < list.size())
                output = getlistinoutput(list);
            list.clear();
        }
            System.out.print(Arrays.toString(output));
    }
    public static int[] getlistinoutput(ArrayList<Integer> list){
        int arr[] = new int[list.size()];
        for(int i=0;i< list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}

package com.company;

public class first_unique_element {
    public static void main(String[] args){
        int arr[] = {1,7,3,4,1,7,4,6,9,10};
        int count = 1;
        int unique = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count == 1){
                unique = arr[i];
                break;
            }
            count=1;
        }
        System.out.println(unique);
    }
}

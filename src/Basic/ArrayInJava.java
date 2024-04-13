package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInJava{
    public static void main(String[] args){
      // Array -> In simple word array is free of container,we can store the values with same datatype in continue manner.
      // but Array size is fixed we cant chang the length after declare.
      // Array also part of DSA we can perform some operation by help of array.
        // Array i non-primitive data type in java..

        int arr[]={1,2,3,4,5};
        //we can get the sam of every element so easyly by array.
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];  // arr[i] its element i its the index,but in array index i start from value->0
        }
        System.out.println(sum);


        // take the array by user like this---
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5]; // 5 ith length of the array..
        System.out.println("Put the Array Value");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        // we can sort the Array by help of Array.sort->
        Arrays.sort(ar);  // this the pre-define method help to sort the array
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" "); // we get the value in the sorted order
        }
        System.out.println();
        int ans=Arrays.binarySearch(arr,3);  // we can get some pre-define method by array..
        System.out.println(ans);
    }
}

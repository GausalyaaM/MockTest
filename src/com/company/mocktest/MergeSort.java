package com.company.mocktest;
import java.util.Scanner;
public class MergeSort {
    public static void sort(int[] arr,int first,int last)
    {
        if(first<last){
            int middle=(first+last)/2;
            sort(arr,first,middle);
            sort(arr,middle+1,last);
            merge(arr,first,middle,last);
        }
    }
    public static void merge(int[] arr,int first,int middle,int last){
        int m=middle-first+1;
        int n=last-middle;
        int arr1[]=new int[m];
        int arr2[]=new int[n];
        for(int i=0;i<m;i++){
            arr1[i]=arr[first+i];
        }
        for(int j=0;j<n;j++){
            arr2[j]=arr[middle+1+j];
        }
        int i=0,j=0,k=first;
        while(i<m&&j<n) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        //int size= sc.nextInt();
        int[] arr;
        arr = new int[]{4,7,2,3,5};
        //System.out.println("Enter the array elements:");
        //for(int i=0;i<size;i++){
           // arr[i]=sc.nextInt();
        //}
        int size=arr.length;
        sort(arr,0,size-1);
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
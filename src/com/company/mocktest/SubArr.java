package com.company.mocktest;
import java.util.Scanner;
public class SubArr {
        public static int[] subArr() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the size of an array:");
            int size = scan.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println("Enter the sum:");
            int sum = scan.nextInt();
            int k = 0;
            int arr1[] = new int[2];
            for (int i = 0; i < size; i++) {
                int subSum = 0;
                for (int j = i; j < size; j++) {
                    subSum = subSum + arr[j];
                    if (subSum == sum) {
                        arr1[k++] = i + 1;
                        arr1[k++] = j + 1;
                        return arr1;
                    }
                }
            }return arr1;
        }
        public static void main(String[] args){
            int[] arr2=subArr();
            for(int i=0;i< arr2.length;i++) {
                System.out.print(arr2[i]+" ");
            }
        }
    }



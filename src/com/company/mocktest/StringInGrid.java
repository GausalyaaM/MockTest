package com.company.mocktest;
import java.util.Scanner;
public class StringInGrid {
    //static int R,C;
    static int[] x={-1,-1,-1,0,0,1,1,1};
    static int[] y={-1,0,1,-1,1,-1,0,1};
    static boolean search(char[][] arr,int row,int col,String str,int m,int n){
        if(arr[row][col]!=str.charAt(0)){
            return false;
        }
        int len=str.length();
        for (int i=0;i<8;i++){
            int k;
            int rowDir=row+x[i];
            int colDir=col+y[i];
            for(k=1;k<len;k++) {
                if (rowDir >= m || rowDir < 0 || colDir >= n || colDir < 0) {
                    break;
                }
                if(arr[rowDir][colDir]!=str.charAt(k)){
                    break;
                }
                rowDir+=x[i];
                colDir+=y[i];
            }
            if(k==len)
                return true;
        }
        return false;
    }
    static void patternSearch(char[][] arr,String str,int rows,int col){
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(search(arr,i,j,str,rows,col)) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
        public static void main (String[]args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of rows:");
            int rows = scan.nextInt();
            System.out.println("Enter the number of columns:");
            int col = scan.nextInt();
            char[][] mat = new char[rows][col];
            System.out.println("Enter the values of matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = scan.next().charAt(0);
                }
            }
            System.out.println("Enter the word to search in a matrix:");
            String input = scan.next();
            patternSearch(mat, input,rows,col);
        }
    }


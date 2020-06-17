package com.basic;

public class Pattern34 {
    public static void main(String[] args) {
        int n= 4;
        int x = 1;
        for (int i=1; i<=5; i++) {
            for (int j =n;j>0;j--){
                System.out.print(" ");
            }
            for (int k =1;k<=x;k++){
                System.out.print("*");
            }
            System.out.println();
            n--;
            x +=2;
        }
    }
}

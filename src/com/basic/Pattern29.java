package com.basic;

public class Pattern29 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i<=5;i++){
            for(int j = 0; j<=i-1;j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=n;k++){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
}

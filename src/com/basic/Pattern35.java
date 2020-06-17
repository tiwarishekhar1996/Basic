package com.basic;

public class Pattern35 {
    public static void main(String[] args) {
        int n = 4;
        int x = 1;
        for (int i = 1; i<=5;i++){
            for (int j=1;j<=n;j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=x;k++){
                System.out.print(i);
            }
            n--;
            x +=2;
            System.out.println();
        }
    }
}

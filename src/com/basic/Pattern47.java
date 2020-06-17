package com.basic;

public class Pattern47 {
    public static void main(String[] args) {
        int n=1;
        int x=9;
        for (int i=5;i>=1;i--){
            for (int j = 1; j<=n;j++){
                System.out.print(" ");
            }
            for (int k = 1; k<= x; k++){
                System.out.print("*");
            }
            n++;
            x-=2;
            System.out.println();
        }
    }
}

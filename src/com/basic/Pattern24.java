package com.basic;

public class Pattern24 {
    public static void main(String[] args) {
        int n=5;
        for(int i =5; i>=1;i--){
            for (int j = 1; j<=i-1;j++){
                System.out.print(" ");
            }
            for (int k =i; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
            //n--;
        }
    }
}

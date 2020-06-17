package com.basic;

public class Pattern54 {
    public static void main(String[] args) {
        int n = 3;

            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        for (int h =1;h<=3;h++) {

            for (int k = n; k >= 1; k--) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
}

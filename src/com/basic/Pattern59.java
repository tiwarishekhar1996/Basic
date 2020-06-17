package com.basic;

public class Pattern59 {
    public static void main(String[] args) {
        int n=3;
        int n1 = 1;
        int x = 4;
        for (int i=1;i<=4;i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
            n--;
        }
            for (int l=3;l>=1;l--){
                for (int m=1;m<=n1;m++){
                    System.out.print(" ");
                }
                for (int o = l; o>=1;o--){
                    System.out.print("*");
                }
                n1++;
                System.out.println();
            }
    }
}

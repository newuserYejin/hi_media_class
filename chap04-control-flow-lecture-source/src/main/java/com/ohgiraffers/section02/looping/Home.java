package com.ohgiraffers.section02.looping;

public class Home {

    public static void main(String[] args) {
        for(int i=1; i<=8; i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        Home2 ho = new Home2();

        ho.Rent();
    }
}

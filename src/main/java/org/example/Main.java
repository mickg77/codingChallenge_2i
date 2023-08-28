package org.example;

public class Main {
    public static void main(String[] args) {
        int[] testArray1 = {3,4,5,6};
        int[] testArray2 = {0,15,32,2000,15000};
        int[] testArray3 = {1,1,10,32,41};

        SumFinder myExample = new SumFinder();
        System.out.println(myExample.pairs(3,testArray1));
        System.out.println(myExample.pairs(15,testArray2));
        System.out.println(myExample.pairs(42,testArray3));
    }
}
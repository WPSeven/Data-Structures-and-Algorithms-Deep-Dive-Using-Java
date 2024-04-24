package com.waiphyothu;

public class TestArea {

    public static void main(String[] args) {

        int[] intArray = {20, 5, -15, 7, 55, 1, -22};

        int gap = 7;



        System.out.println( gap/=2 );


        System.out.println( gap);


        System.out.println(getDigit(0, 1024, 10));
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}

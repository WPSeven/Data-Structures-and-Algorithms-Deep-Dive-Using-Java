package com.waiphyothu;

public class Recursion {


    public static void main(String[] args) {

        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(3));

    }

    public static int iterativeFactorial(int num){

        if ( num == 0){
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }

        return factorial;

    }

    /* Formula */

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!

    // n! = n *(n - 1)!

    public static int recursiveFactorial(int num){

        //base case or breaking condition.
        if (num == 0){
            return 1;
        }

        return num * recursiveFactorial(num -1);

    }

    /* Call Stack */
    //recursiveFactorial(0)
    //recursiveFactorial(1)
    //recursiveFactorial(2)
    //recursiveFactorial(3)
    //At that point, when num == 0,the recursion starts to unwind,
    //Resume all stacks

}

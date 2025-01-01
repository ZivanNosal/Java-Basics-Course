package com.tieto.trainings.java.lesson1;

public class Loops {
    public static void main(String[] args) {
        //podminkaNaZacatku(0);
        //podminkaNaKonci(0);
        //cyklusFor(15);
        //System.out.println(factorial(3));
        System.out.println(factorialLoop(3));
    }

    private static int factorial(int n){
        if (n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return n * factorial(n-1);
    }

    private static int factorialLoop(int n){
        int result = 1;
        for(int i=1; i<=n;i++){
            result = i*result;
        }
        return result;
    }

    private static void podminkaNaZacatku(int max){
        int i = 0;
        while(i<max){
            System.out.println(i++);
            //i = i + 1;
            //i += 1;
            //i++;
            //++i;
        }
    }
    private static void podminkaNaKonci(int max){
        int i = 0;
        do {
            System.out.println(i++);
        } while (i<max);
    }

    private static void cyklusFor(int max){
        for (int i=0; i < max;i++){
            if (i==20){
                break;
            }
            if (i==13){
                continue;
            }
            System.out.println(i);
        }
    }
}

package com.tieto.trainings.java.lesson1;


public class Conditions {
    public static void main(String[] args) {
        int number = 0;
       checkNumberChain(12);
        // checkNumber(1);
        // checkNumber(2);
    }

    private static void checkNumberChain(int number) {
        System.out.println("cislo " + number);
        if (number < 1) {
            System.out.println("mensi nez jedna");
        } else if (number == 1) {
            System.out.println("Je to jedna");
        } else {
            System.out.println("vetsi nez jedna");
        }
    }

    private static void checkNumberNest(int number) {
        System.out.println("cislo " + number);
        if (number < 1) {
            System.out.println("mensi nez jedna");
        } else {
            if (number == 1) {
                System.out.println("Je to jedna");
            } else {
                System.out.println("vetsi nez jedna");
            }
        }
    }

    private static void checkNumberSimple(int number) {
        System.out.println("cislo " + number);
        if (number < 1) {
            System.out.println("mensi nez jedna");
        }
        if (number == 1) {
            System.out.println("Je to jedna");
        }
        if (number > 1) {
            System.out.println("vetsi nez jedna");
        }
    }

    /**
     * Metoda vypise na obrazovku jestli je pred vyplatou, vyplata prijde dnes, nebo uz je po vyplate.
     * Predpokladame, ze vyplata prichazi 15 den v mesici
     * @param datum dnesni datum
     */
    private static void kdyBudeVyplata(int datum){

    }

}

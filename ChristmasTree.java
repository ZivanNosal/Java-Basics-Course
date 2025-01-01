package com.tieto.trainings.java.lesson1;

public class ChristmasTree {
    private static String tree;
    public static void main(String[] args) {
        tree = "   *   \n" +
                "  ***  \n" +
                " ***** \n" +
                "*******\n" +
                "   *    ";
        printTree(tree);
    }

    private static void printTree(String tree) {
        System.out.println(ChristmasTree.tree);

    }
}



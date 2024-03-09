package com.prog2.labs;

/**
 * @author adinashby
 *
 */
public class LabTwelve {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {
        CatAndMouse game1 = new CatAndMouse(0, 1, 0);
        CatAndMouse game2 = new CatAndMouse(7, 4, 5);
        CatAndMouse game3 = new CatAndMouse(2, 0, 1);

        System.out.println(game1.winner() + " " + game2.winner() + " " + game3.winner());

        Palindrome test = new Palindrome();
        test.setValue("Malayalam");
        System.out.println(test.isPalindrome());

        test.setValue("English");
        System.out.println(test.isPalindrome());
    }

}

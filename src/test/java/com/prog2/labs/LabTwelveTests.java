package com.prog2.labs;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Write your JUnit test here.
 */
class LabTwelveTests {

    private static CatAndMouse game;
    private static Palindrome palindrome;

    @BeforeAll
    static void setup() {
        game = new CatAndMouse(0, 0, 0);
        palindrome = new Palindrome();
    }

    @Test
    void CatAndMouseTest1() {
        assertEquals(game.winner(), "Mouse");
    }

    @Test
    void CatAndMouseTest2() {
        game.setPos(0, 1, 0);
        assertEquals(game.winner(), "Cat A");
    }

    @Test
    void CatAndMouseTest3() {
        game.setPos(7, 4, 5);
        assertEquals(game.winner(), "Cat B");
    }

    @Test
    void PalindromeTest1() {
        palindrome.setValue("Malayalam");
        assertEquals(true, palindrome.isPalindrome());
    }

    @Test
    void PalindromeTest2() {
        palindrome.setValue("English");
        assertEquals(false, palindrome.isPalindrome());
    }
}

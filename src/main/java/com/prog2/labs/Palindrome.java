/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

/**
 *
 * @author Dell
 */
public class Palindrome {

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isPalindrome() {
        int startIndex = 0;
        int endIndex = value.length() - 1;
        
        value = value.toLowerCase();
        
        while (startIndex < endIndex) {
            if (value.charAt(startIndex) != value.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}

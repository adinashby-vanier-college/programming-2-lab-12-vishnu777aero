/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

/**
 *
 * @author Dell
 */
public class CatAndMouse {

    int posCatA;
    int posCatB;
    int posMouse;

    CatAndMouse(int posCatA, int posCatB, int posMouse) {
        this.posCatA = posCatA;
        this.posCatB = posCatB;
        this.posMouse = posMouse;
    }

    public String winner() {
        int distanceCatA = Math.abs(posCatA - posMouse);
        int distanceCatB = Math.abs(posCatB - posMouse);

        if (distanceCatA < distanceCatB) {
            return "Cat A";
        } else if (distanceCatB < distanceCatA) {
            return "Cat B";
        } else {
            return "Mouse";
        }
    }
}

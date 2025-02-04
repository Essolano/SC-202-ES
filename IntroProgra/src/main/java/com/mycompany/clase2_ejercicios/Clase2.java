/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase2_ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */

public class Clase2 {

    public static void main(String[] args) {
        int edadActual = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad actual:"));
        int edadFutura = edadActual + 5;
        System.out.println("Dentro de 5 años, tendrá: " + edadFutura);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase2_ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class ejerc3 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad:"));
        if (edad >= 18){
            System.out.println("Es mayor de edad, si puede votar.");
        }
        System.out.println("Es menor de edad, no puede votar.");
    }
}

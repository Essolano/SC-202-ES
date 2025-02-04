/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase2_ejercicios;


/**
 *
 * @author Esteban
 */
public class ejerc1Clase3 {
    public static void main(String[] args) {
    String linea = ""; 
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                linea = linea + "@";
            }
            System.out.println(linea);

            linea = "";
        } 
    }
}

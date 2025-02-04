/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3_ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class ejerc3 {
    public static void main(String[] args) {
    String linea = ""; 
    int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas que desea que tenga el triangulo."));
        for (int i = 0; i < valor; i++){
            linea = linea + "@";
            System.out.println(linea);
        }
    }
}

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
public class ejerc2 {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de que desea mostrar la tabla de multiplicacion."));
        for (int i = 1; i < 11; i++){
            int multiplica = valor * i;
            System.out.println(valor + "*" + i + "=" + multiplica);
        } 
    }
}

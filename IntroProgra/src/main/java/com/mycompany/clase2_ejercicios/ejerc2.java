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
public class ejerc2 {
    public static void main(String[] args) {
        double ingresoMensual = Double.parseDouble(JOptionPane.showInputDialog("Digite su ingreso mensual:"));
        double gastoMensual = Double.parseDouble(JOptionPane.showInputDialog("Digite su gasto mensual:"));
        double porcGasto = (gastoMensual * 100) / ingresoMensual;
        double porcResidual = 100 - porcGasto;
        JOptionPane.showMessageDialog(null, "El porcentaje de gasto es: " + porcGasto + "%. Y quedarian un " + porcResidual + "%.");
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercExtra;

import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class ejercExtra {
    public static void main(String[] args) {
        String nombreEmpleado = JOptionPane.showInputDialog("Digite su nombre:");
        double salarioSem = Double.parseDouble(JOptionPane.showInputDialog("Digite su salario semanal:"));
        double salarioMensual = salarioSem * 4;
        double deducciones = salarioMensual * 0.0934;
        double salarioNeto = salarioMensual - deducciones;
        
        JOptionPane.showMessageDialog(null, "Estimado"+ nombreEmpleado + ", el salario de este mes se desglosa de la siguiente manera.\nSalario bruto: " + salarioMensual + "\nDeducciones: " + deducciones+ "\nSalario Neto: " + salarioNeto);
    }
}

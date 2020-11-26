/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import javax.swing.JOptionPane;

public class Programa {
    
     public static void main(String[] args) {
        convertirMoneda obj01 = new convertirMoneda();
        int m;
        int cant;
        do{
            m = Integer.parseInt(JOptionPane.showInputDialog("Convertidor de Monedas UTH\n"
                    + "1: Convertir Dolares a Lempiras\n"
                    + "2: Convertir Lempiras a Dolares\n"
                    + "3: Salir\n"
                    + "Elige un opción"));

            switch(m){
                case 1:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Lempiras a Dolares\n"
                            + "Ingresa la cantidad a convertir"));
                    obj01.dolaresA_lempiras(cant);
                    break;
                case 2:
                    cant = Integer.parseInt(JOptionPane.showInputDialog("Convertir Dolares a Lempiras\n"
                            + "Ingresa la cantidad a convertir"));
                    obj01.pesos_lempiras(cant);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Salio del programa", "Salida",m);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida", "Error",m);
                    break;
            }
        }while(m!=3);
        
    }
    
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import javax.swing.JOptionPane;

public class convertirMoneda {
    
    public int cantidad;
    public double valorL = 24.41;
    public double valorD = 0.041;
    public double res;
    
    public void dolaresA_lempiras(int cant){
        String.valueOf(valorL);
        res = cant * valorL;
        JOptionPane.showMessageDialog(null,cant+" USD = "+res+" LPS");
    }
    
    public double pesos_lempiras(int cant){
        res = cant * valorD;
        JOptionPane.showMessageDialog(null,cant+" LPS = "+res+" USD");
        return res;
    }
}


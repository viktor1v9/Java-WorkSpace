package com.mycompany.exemploselecaoencadeada;

import javax.swing.JOptionPane;

public class ExemploSelecaoEncadeada {

    public static void main(String[] args) {

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite um número: "));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "É múltiplo de 10!");

        } else {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "É múltiplo de 2!");
            } else {
                if (numero % 5 == 0) {
                    JOptionPane.showMessageDialog(null, "É múltiplo de 5:");
                } else {
                    JOptionPane.showMessageDialog(null, "Não é múltiplo destes!");
                }
            }
        }
    }
}

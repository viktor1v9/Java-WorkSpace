package com.mycompany.exemploifselecaosimples;

import javax.swing.JOptionPane;

public class ExemploIfSelecaoSimples {

    public static void main(String[] args) {

        int numero;
        int dobro;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite um número: "));

        if (numero > 10) {
            dobro = numero * 2;
            JOptionPane.showMessageDialog(null, "número é:" + dobro);
        }
    }
}

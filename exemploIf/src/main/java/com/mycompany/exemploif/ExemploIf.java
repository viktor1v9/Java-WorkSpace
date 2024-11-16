package com.mycompany.exemploif;

import javax.swing.JOptionPane;

public class ExemploIf {

    public static void main(String[] args) {

        double numero;
        double metade;
        double dobro;

        numero = Double.parseDouble(JOptionPane.showInputDialog("digite um número: "));

        if (numero > 10) {
            metade = numero / 2;
            JOptionPane.showMessageDialog(null, "a metade do número é: " + metade);

        } else {
            dobro = numero * 2;
            JOptionPane.showMessageDialog(null, "o dobro do número é: " + dobro);
        }
    }
}

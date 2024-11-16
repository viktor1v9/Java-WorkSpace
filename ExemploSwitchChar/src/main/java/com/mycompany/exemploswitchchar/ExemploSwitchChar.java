package com.mycompany.exemploswitchchar;

import javax.swing.JOptionPane;

public class ExemploSwitchChar {

    public static void main(String[] args) {
        String controle;
        controle = JOptionPane.showInputDialog("você concorda com os termos apresentados? (s/n)");
        char controleCHAR = controle.charAt(0);

        switch (controleCHAR) {
            case 's':
                JOptionPane.showMessageDialog(null, "você concordou com os termos");

                break;

            case 'n':
                JOptionPane.showMessageDialog(null, "você não concordou com os termos");

                break;

            default:
                JOptionPane.showMessageDialog(null, "opção inválida");

                break;

        }

    }
}

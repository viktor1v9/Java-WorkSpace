package com.mycompany.exemploswitch;

import javax.swing.JOptionPane;

public class ExemploSwitch {

    public static void main(String[] args) {

        int controle;
        int resultado;
        int numero1 = 10;
        int numero2 = 5;
        controle = Integer.parseInt(JOptionPane.showInputDialog("qual operaçã você quer executar?"
                                                                 + "\n 1-adição \n 2-subtração"));

        switch (controle) {
            case 1:
                resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null,"o resultado é: " + resultado);
                break;

            default:
                JOptionPane.showMessageDialog(null, "opção inválida.");
        }
    }
}

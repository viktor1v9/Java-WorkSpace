package Principal;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        int i = 0;
        do {
            JOptionPane.showMessageDialog(null, "valor de i é igual a: " + i);
            i++;

        } while (i < 5);
    }

}

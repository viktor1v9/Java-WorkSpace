package Principal;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        int i;
        String nomes[] = new String[20];
        
        for (i = 0; i < 20; i++) {
            nomes[i] = JOptionPane.showInputDialog("digite seu nome: ");
           
        }
        for (i = 0; i < 20; i++) {
            JOptionPane.showMessageDialog(null, nomes[i]);
            
        }
        
    }
    
}

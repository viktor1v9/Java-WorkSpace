package Principal;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int A = Integer.parseInt(JOptionPane.showInputDialog("digite o número de nomes: "));
        String nomes[] = new String[A];
        int i,flag;

        for (i = 0; i < A; i++) {
            nomes[i] = JOptionPane.showInputDialog(null, "digite um nome: ");

        }
        String nomeProcurado = JOptionPane.showInputDialog(null, "digite o nome que gostaria de procurar ");;
        flag = 0;
        for (i = 0; i < A; i++) {
           if(nomeProcurado.equalsIgnoreCase(nomes[i])){
            JOptionPane.showMessageDialog(null, "o nome está na posição " + i);
            flag = 1;
            break;
           }  
        }
        if(flag <=0){
            JOptionPane.showMessageDialog(null, "nome não encontrado");
        } 
    }

}

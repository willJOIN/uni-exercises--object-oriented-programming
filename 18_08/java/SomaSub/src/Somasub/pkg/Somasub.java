package Somasub.pkg;

import javax.swing.JOptionPane;

public class Somasub {

    public static void main(String[] args) {
        int n1;
        int n2;
        int soma;
        int sub;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro número:")); //Integer.parseInt só pra showInput
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo número: "));  
        soma = n1 + n2;
        JOptionPane.showMessageDialog(null, "A soma dos dois números é: " + soma);
        sub = n1 - n2;
        JOptionPane.showMessageDialog(null, "A subtração dos dois números é: " + sub);
        System.out.println("A soma dos dois números é: " + soma);
        System.out.println("A subtração dos dois números é: " + sub);
    }
}

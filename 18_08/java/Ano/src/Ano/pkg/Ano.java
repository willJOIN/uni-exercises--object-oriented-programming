package Ano.pkg;

import javax.swing.JOptionPane;

public class Ano {

    public static void main(String[] args) {
        int ano = 2021;
        int anoSeguinte;
        int soma;
        int sub;

        anoSeguinte = ano + 1;

        JOptionPane.showMessageDialog(null, "O ano atual é: "+ ano); //2021
        JOptionPane.showMessageDialog(null, "O ano seguinte é: "+ anoSeguinte); //2022
        soma = ano + anoSeguinte;
        JOptionPane.showMessageDialog(null, "A soma dos anos é: "+ soma); //4043
        sub = anoSeguinte - ano;
        JOptionPane.showMessageDialog(null, "A subtração dos anos é: "+ sub); //1
    }
}

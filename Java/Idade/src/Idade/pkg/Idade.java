package Idade.pkg; //Programa

import javax.swing.JOptionPane; //Importação de "biblioteca"

public class Idade { //Abre classe

    public static void main(String[] args) { //psvm TAB
        int idadeAtual = 1; //Declaração de variáveis
        int idadeSeguinte = idadeAtual + 1; //Operação da variável idadeSeguinte
        int soma = idadeAtual + idadeSeguinte; //Operação da int soma
        int sub = idadeSeguinte - idadeAtual; //Operação da int sub

        JOptionPane.showMessageDialog(null, "A idade atual será: " + idadeAtual); //Print no JOptionPane com mensagem da int idadeAtual 
        JOptionPane.showMessageDialog(null, "A idade seguinte será: " + idadeSeguinte); //Print da int IdadeSeguinte
        JOptionPane.showMessageDialog(null, "A soma da idade atual e da idade seguinte será: " + soma); //Print da int soma
        JOptionPane.showMessageDialog(null, "A subtração da idade seguinte pela idade atual será: " + sub); //Print da int sub

    }
} //Fecha classe

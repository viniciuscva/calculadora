/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius_2
 */
public class CalculadoraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String expressao = JOptionPane.showInputDialog("Digite uma expressão "
                + "matemática com dois operandos: ");
        
        String[] array = expressao.split("[+]");
        char operacao = '+';
        if (array.length != 2) {
            array = expressao.split("[-]");
            operacao = '-';
        }
        if (array.length != 2) {
            array = expressao.split("[*]");
            operacao = '*';
        }
        if (array.length != 2) {
            array = expressao.split("[/]");
            operacao = '/';
        }
        if (array.length != 2) {
            JOptionPane.showMessageDialog(null, "Expressão inválida :(");
            System.exit(0);
        }
        try {
            Double valor1 = Double.parseDouble(array[0]);
            Double valor2 = Double.parseDouble(array[1]);
            Double resultado = 0.0;
            switch (operacao) {
                case '+':
                    resultado = valor1 + valor2;
                    break;
                case '-':
                    resultado = valor1 - valor2;
                    break;
                case '*':
                    resultado = valor1 * valor2;
                    break;
                case '/':
                    resultado = valor1 / valor2;
                    break;
            }
            JOptionPane.showMessageDialog(null, "Resultado da expressão: "+resultado);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ocorrido :(");
            System.exit(0);
        }
    }

}

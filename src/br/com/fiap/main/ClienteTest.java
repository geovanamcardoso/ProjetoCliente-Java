package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import javax.swing.*;

public class ClienteTest {

    static String texto(String j){
        return  JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return  Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return  Double.parseDouble(JOptionPane.showInputDialog(j));
    }


    public static void main(String[] args){
       Cliente objCliente = new Cliente();
       objCliente.setNome(texto("Informe o nome do cliente: "));
       objCliente.setCpf(texto("Informe o CPF do cliente: "));
       objCliente.setIdade(inteiro("Informe a idade do cliente: "));
       objCliente.setAltura(real("Informe a altura do cliente: "));

        System.out.println(objCliente);
    }
}

package br.com.fiap.main;

import br.com.fiap.entities.Cliente;

import javax.swing.*;

public class ClienteTest {
    public static void main(String[] args){
       Cliente objCliente = new Cliente();
       objCliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));
       objCliente.setCpf(JOptionPane.showInputDialog("Informe o CPF do cliente: "));
       objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cliente: ")));
       objCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do cliente: ")));

        JOptionPane.showMessageDialog(
                null, " -- Cliente --" + "\nNome: " + objCliente.getNome() + "\nCPF: " + objCliente.getCpf() +
                        "\nIdade: " +  objCliente.getIdade() + "\nAltura: " +  objCliente.getAltura()
        );
    }
}

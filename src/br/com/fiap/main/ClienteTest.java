package br.com.fiap.main;

import br.com.fiap.entities.Cliente;

public class ClienteTest {
    public static void main(String[] args){
       Cliente objCliente = new Cliente();
       objCliente.setNome("Geovana Maria");
       objCliente.setCpf("222.222.222-22");
       objCliente.setIdade(20);
       objCliente.setAltura(1.65);

        System.out.println(
                " -- Cliente --" + "\nNome: " + objCliente.getNome() + "\nCPF: " + objCliente.getCpf() +
                        "\nIdade: " +  objCliente.getIdade() + "\nAltura: " +  objCliente.getAltura()
        );
    }
}

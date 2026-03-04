package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteSistema {

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
       Endereco objEndereco = new Endereco();
       Produto objProduto = new Produto();

       //Entradas do Cliente
       objCliente.setNome(texto("Informe o nome do cliente: "));
       objCliente.setCpf(texto("Informe o CPF do cliente: "));
       objCliente.setIdade(inteiro("Informe a idade do cliente: "));
       objCliente.setAltura(real("Informe a altura do cliente: "));

       //Entradas do endereço do cliente
        objEndereco.setLogradouro(texto("ENDEREÇO\n Informe o logradouro do cliente: "));
        objEndereco.setBairro(texto("ENDEREÇO\n Informe o bairro do cliente: "));
        objEndereco.setCep(texto("ENDEREÇO\n Informe o CEP do cliente: "));
        objEndereco.setCidade(texto("ENDEREÇO\n Informe a cidade do cliente: "));
        objEndereco.setEstado(texto("ENDEREÇO\n Informe o estado do cliente: "));
        objEndereco.setNumero(inteiro("ENDEREÇO\n Informe o número da residência do cliente: "));
        objCliente.setEndereco(objEndereco);

       //Entradas do produto
       objProduto.setCodigo(inteiro("CADASTRO DE PRODUTO\n Informe o código do produto: "));
       objProduto.setMarca(texto("Informe a marca do produto: "));
       objProduto.setTipo(texto("Informe o tipo do produto: "));
       objProduto.setPreco(real("Informe o preço do produto: "));

       //Saídas
        System.out.println(objCliente + "\n " + objProduto);
    }
}

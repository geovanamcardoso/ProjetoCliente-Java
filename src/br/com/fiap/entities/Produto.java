package br.com.fiap.entities;

public class Produto {

    private int codigo;
    private String tipo, marca;
    private double preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nProduto: " +
                "\nCódigo=" + codigo +
                "\nTipo=" + tipo  +
                "\nMarca=" + marca  +
                "\nPreço=" + preco;
    }
}

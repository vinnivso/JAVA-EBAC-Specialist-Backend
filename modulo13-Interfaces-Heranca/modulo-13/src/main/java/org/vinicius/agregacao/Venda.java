package org.vinicius.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Comprador comprador;
    private Vendedor vendedor;
    private List<Produto> produtos;

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void add (Produto produto) {
        this.produtos.add(produto);
    }

    public Venda() {
        this.produtos = new ArrayList<>();
    }

    public void concretizarVenda() {
        System.out.println("Comprador " + this.comprador.getNome());
        System.out.println("Comprou os itens: ");
        for (Produto element : this.produtos) {
            System.out.println("Nome do produto " + element.getNome() + " Valor produto " + element.getPreco());
        }
        System.out.println("Vendedor: " + this.vendedor.getNome());
    }

    public void cancelarVenda() {
        System.out.println("Venda cancelada");
    }

    @Override
    public String toString() {
        return "Venda{" +
                "comprador=" + comprador.getNome() +
                ", vendedor=" + vendedor.getNome() +
                ", produtos=" + produtos +
                '}';
    }
}

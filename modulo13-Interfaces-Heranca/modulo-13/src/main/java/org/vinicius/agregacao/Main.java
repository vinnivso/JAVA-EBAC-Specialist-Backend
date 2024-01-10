package org.vinicius.agregacao;

public class Main {
    public static void main(String[] args) {
        Produto produtoTV = criarProduto(1L, "TV", 10d);
        Produto produtoCel = criarProduto(12L, "Celular", 1000d);

        Vendedor vendedor = criarVendedor("Vinícius", 10d);

        Comprador comprador = criarComprador("Cliente 1", 2000d );

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCel);

        venda.concretizarVenda();

        //AGREGAÇÃO - EXCLUIR O OBJETO PRINCIPAL, PORÉM OS OBJETOS SECUNDÁRIOS CONTINUAM EXISTINDO.
        System.out.println(venda);
        venda.cancelarVenda();
        venda = null;
        System.out.println(venda);
        System.out.println(produtoTV.getNome());
    }
    private static Produto criarProduto(Long codigo, String nome, Double valor) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setNome(nome);
        produto.setPreco(valor);
        return produto;
    }
    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(comissao);
        vendedor.setNome(nome);
        return vendedor;
    }
    //Forma abaixo foi utilizando um contructor para deixar o código ainda mais enxuto.
    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);
    }

}


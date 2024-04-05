package org.vinicius.agregacaoPlus;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pedido {
    private Set<Produto> produtos;

    public Pedido() {
        this.produtos = new HashSet<>();
    }

    public void add(Produto produto) {
        if (this.produtos.contains(produto)) {
            Iterator<Produto> it = this.produtos.iterator();
            while (it.hasNext()) {
                Produto prod = it.next();
                if (produto.equals(prod)) {
                    prod.addQuantidade();
                    break;
                }
            }
            return;
        }
        this.produtos.add(produto);
    }

    public void concluirVenda() {
        this.produtos.forEach(prod -> {
            System.out.println("Quantidade vendida: " + prod.getQuantidade() + " do produto: " + prod.getNome());
        });
    }
}

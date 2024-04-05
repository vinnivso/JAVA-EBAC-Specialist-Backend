package org.vinicius.composicao;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private Long codigo;
    private String nome;
    private Set<ContaCorrente> contasCorrentes;
    private Set<ContaPoupanca> contasPoupancas;

    public Banco() {
        this.contasCorrentes = new HashSet<>();
        this.contasPoupancas = new HashSet<>();
    }

    public void add(ContaCorrente cc) {
        this.contasCorrentes.add(cc);
    }

    public void add(ContaPoupanca cp) {
        this.contasPoupancas.add(cp);
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

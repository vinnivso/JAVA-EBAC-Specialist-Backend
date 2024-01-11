package org.vinicius.composicao;

public class ContaCorrente {
    private Banco banco;
    private Double saldo;
    private Double chequeEspecial;

    public Banco getBanco() {
        return banco;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }


}

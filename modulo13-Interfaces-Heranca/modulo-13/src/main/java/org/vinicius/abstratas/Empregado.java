package org.vinicius.abstratas;

//Por ser uma classe pai é necessário definir como ABSTRACT
public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract Double vencimento();

    public void imprimirSobrenome() {
        System.out.println("Sobrenome é " + this.sobrenome);
    }

    public void imprimirValores() {
        Double valor = vencimento();
        System.out.println("Valores: " + valor);
    }
}

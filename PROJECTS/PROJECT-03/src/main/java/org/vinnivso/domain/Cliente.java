package org.vinnivso.domain;

import java.util.UUID;

public class Cliente {
    private Long id;
    private String codigo;
    private String nome;

    //#region Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //#endregion Getters and setters
}

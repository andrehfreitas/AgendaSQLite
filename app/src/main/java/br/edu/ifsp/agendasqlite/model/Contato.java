package br.edu.ifsp.agendasqlite.model;

import java.io.Serializable;

public class Contato implements Serializable {

    private int id;
    private String nome;
    private String fone;
    private String fone2;
    private String dtaniversario;
    private String email;
    private int favorito = 0;

    public Contato() {
    }

    public Contato(String nome, String fone, String fone2, String dtaniversario, String email) {
        this.nome = nome;
        this.fone = fone;
        this.fone2 = fone2;
        this.dtaniversario = dtaniversario;
        this.email = email;
    }


    public boolean equals(Object obj) {
        Contato c2= (Contato) obj;
        if (this.id ==c2.getId())
            return true;
        else
            return false;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {return fone;}

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getDtaniversario() {
        return dtaniversario;
    }

    public void setDtaniversario(String dtaniversario) {
        this.dtaniversario = dtaniversario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFavorito() {
        return favorito;
    }

    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }
}

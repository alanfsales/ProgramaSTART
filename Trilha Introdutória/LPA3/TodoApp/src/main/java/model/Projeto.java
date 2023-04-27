package model;

import java.util.Date;

public class Projeto {
    
    private int id;
    private String nome;
    private String descricao;
    private Date dataCriacao;
    private Date dataatualizacao;

    public Projeto(int id, String nome, String descricao, Date dataCriacao, 
            Date dataatualizacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataatualizacao = dataatualizacao;
    }

    public Projeto() {
        this.dataCriacao = new Date();
        this.dataatualizacao = new Date();
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataatualizacao() {
        return dataatualizacao;
    }

    public void setDataatualizacao(Date dataatualizacao) {
        this.dataatualizacao = dataatualizacao;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
}

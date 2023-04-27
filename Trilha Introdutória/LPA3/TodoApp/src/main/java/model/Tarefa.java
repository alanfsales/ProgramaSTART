package model;

import java.util.Date;

public class Tarefa {
    
    private int id;
    private int idProjeto;
    private String nome;
    private String descricao;
    private boolean concluida;
    private String observacoes;
    private Date prazo;
    private Date dataCriacao;
    private Date dataAtualizacao;

    public Tarefa(int id, int idProjeto, String nome, String descricao, 
            boolean concluida, String observacoes, Date prazo, Date dataCriacao, 
            Date dataatualizacao) {
        this.id = id;
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.descricao = descricao;
        this.concluida = concluida;
        this.observacoes = observacoes;
        this.prazo = prazo;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataatualizacao;
    }

    public Tarefa() {
        this.dataCriacao = new Date();
        this.dataAtualizacao = new Date();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
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

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataatualizacao) {
        this.dataAtualizacao = dataatualizacao;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", idProjeto=" + idProjeto + ", nome=" 
                + nome + ", descricao=" + descricao + ", concluida=" + concluida 
                + ", observacoes=" + observacoes + ", prazo=" + prazo 
                + ", dataCriacao=" + dataCriacao + ", dataatualizacao=" 
                + dataAtualizacao + '}';
    }
  
}

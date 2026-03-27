package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected final double XP_PADRAO = 10d;

    protected String nome;
    protected String descricao;

    public abstract double calcularXp();

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
}

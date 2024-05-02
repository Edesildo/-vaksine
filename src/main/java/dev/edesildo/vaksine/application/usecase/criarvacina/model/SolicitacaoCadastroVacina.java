package dev.edesildo.vaksine.application.usecase.criarvacina.model;

public class SolicitacaoCadastroVacina {
    public SolicitacaoCadastroVacina(String nome, String nomeFabricante, String descricao) {
        this.nome = nome;
        this.nomeFabricante = nomeFabricante;
        this.descricao = descricao;
    }

    private final String nome;

    private final String nomeFabricante;
    final String descricao;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }
}

package dev.edesildo.vaksine.domain;

public class Vacina {
    private final Integer id;
    private final String nome;
    private final String nomeFabricante;
    private final String descricao;

    public Vacina(Integer id, String nome, String nomeFabricante, String descricao) {
        this.id = id;
        this.nome = nome;
        this.nomeFabricante = nomeFabricante;
        this.descricao = descricao;
    }
}

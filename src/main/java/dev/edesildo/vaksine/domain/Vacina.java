package dev.edesildo.vaksine.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vacina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private final String nome;
    private final String nomeFabricante;
    private final String descricao;

    public String getNome() {
        return nome;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public Vacina(String nome, String nomeFabricante, String descricao) {
        this.nome = nome;
        this.nomeFabricante = nomeFabricante;
        this.descricao = descricao;
    }

}

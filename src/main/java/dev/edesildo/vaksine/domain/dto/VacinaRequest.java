package dev.edesildo.vaksine.domain.dto;

public class VacinaRequest {

    private String nome;
    private String nomeFabricante;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public String getDescricao() {
        return descricao;
    }
}

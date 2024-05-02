package dev.edesildo.vaksine.application;

import dev.edesildo.vaksine.application.usecase.criarvacina.model.SolicitacaoCadastroVacina;
import dev.edesildo.vaksine.domain.Vacina;

public interface RepositorioVacinas {

    boolean existe(String nome, String nomeFabricante);

    /**
     * @param solicitacaoCadastroVacina
     * @return Vacina
     */
    Vacina criar(SolicitacaoCadastroVacina solicitacaoCadastroVacina);

}
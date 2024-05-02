package dev.edesildo.vaksine.adapters.datasource.db;

import dev.edesildo.vaksine.application.RepositorioVacinas;
import dev.edesildo.vaksine.application.usecase.criarvacina.model.SolicitacaoCadastroVacina;
import dev.edesildo.vaksine.domain.Vacina;
import org.springframework.stereotype.Service;

@Service
public class RepositorioVacinasInMemory implements RepositorioVacinas {
    @Override
    public boolean existe(String nome, String nomeFabricante) {
        return false;
    }

    @Override
    public Vacina criar(SolicitacaoCadastroVacina solicitacaoCadastroVacina) {
        return null;
    }
}
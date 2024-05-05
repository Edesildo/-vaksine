package dev.edesildo.vaksine.adapters.datasource.db;

import dev.edesildo.vaksine.application.RepositorioVacinas;
import dev.edesildo.vaksine.application.usecase.criarvacina.model.SolicitacaoCadastroVacina;
import dev.edesildo.vaksine.domain.Vacina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepositorioVacinasInMemory {
    private final RepositorioVacinas repositorioVacinas;
    @Autowired
    public RepositorioVacinasInMemory(RepositorioVacinas repositorioVacinas) {
        this.repositorioVacinas = repositorioVacinas;
    }


}
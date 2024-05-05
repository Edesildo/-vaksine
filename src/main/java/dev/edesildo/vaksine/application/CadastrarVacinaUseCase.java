package dev.edesildo.vaksine.application;

import dev.edesildo.vaksine.application.usecase.criarvacina.VacinaExistenteException;
import dev.edesildo.vaksine.application.usecase.criarvacina.model.SolicitacaoCadastroVacina;
import dev.edesildo.vaksine.domain.Vacina;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastrarVacinaUseCase {

    private final RepositorioVacinas repositorioVacinas;
    @Autowired
    public CadastrarVacinaUseCase(RepositorioVacinas repositorioVacinas) {
        this.repositorioVacinas = repositorioVacinas;
    }
    @Transactional
    public Vacina processar(Vacina vacina) {
        if (repositorioVacinas.existe(vacina.getNome(), vacina.getNomeFabricante())) {
            throw new VacinaExistenteException();
        }

        return repositorioVacinas.criar(vacina);
    }

}
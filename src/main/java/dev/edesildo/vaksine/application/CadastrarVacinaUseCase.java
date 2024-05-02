package dev.edesildo.vaksine.application;

import dev.edesildo.vaksine.application.usecase.criarvacina.VacinaExistenteException;
import dev.edesildo.vaksine.application.usecase.criarvacina.model.SolicitacaoCadastroVacina;
import dev.edesildo.vaksine.domain.Vacina;
import org.springframework.stereotype.Service;

@Service
public class CadastrarVacinaUseCase {

    private final RepositorioVacinas repositorioVacinas;

    public CadastrarVacinaUseCase(RepositorioVacinas repositorioVacinas) {
        this.repositorioVacinas = repositorioVacinas;
    }

    public Vacina processar(SolicitacaoCadastroVacina solicitacaoCadastroVacina) {
        if (repositorioVacinas.existe(solicitacaoCadastroVacina.getNome(), solicitacaoCadastroVacina.getNomeFabricante())) {
            throw new VacinaExistenteException();
        }

        return repositorioVacinas.criar(solicitacaoCadastroVacina);
    }

}
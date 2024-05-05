package dev.edesildo.vaksine.application;

import dev.edesildo.vaksine.application.usecase.criarvacina.VacinaExistenteException;
import dev.edesildo.vaksine.application.usecase.criarvacina.model.SolicitacaoCadastroVacina;
import dev.edesildo.vaksine.domain.Vacina;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class CadastrarVacinaUseCaseTest {

    private final RepositorioVacinas repositorioVacinas = mock(RepositorioVacinas.class);
    private final CadastrarVacinaUseCase subject = new CadastrarVacinaUseCase(repositorioVacinas);

    @Test
    public void deveImpedirCadastroCasoExistaVacinaNaBase() {
        when(repositorioVacinas.existe("nomeA", "fabricanteA"))
                .thenReturn(true);

        final Vacina solicitacaoCadastroVacina =
                new Vacina("nomeA", "fabricanteA", "desc");

        assertThrows(VacinaExistenteException.class, () -> subject.processar(solicitacaoCadastroVacina));
    }

    @Test
    public void deveCadastrarVacinaNaBaseDadosQuandoNaoExistirAnteriormente() {
        when(repositorioVacinas.existe("nomeA", "fabricanteA"))
                .thenReturn(false);

        final Vacina solicitacaoCadastroVacina =
                new Vacina("nomeA", "fabricanteA", "desc");

        assertDoesNotThrow(() -> subject.processar(solicitacaoCadastroVacina));

        verify(repositorioVacinas).criar(solicitacaoCadastroVacina);
    }

}
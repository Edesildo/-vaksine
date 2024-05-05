package dev.edesildo.vaksine.adapters.controllers;

import dev.edesildo.vaksine.application.CadastrarVacinaUseCase;
import dev.edesildo.vaksine.domain.Vacina;
import dev.edesildo.vaksine.domain.dto.VacinaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vacina")
public class VacinaController {
    private final CadastrarVacinaUseCase cadastrarVacinaUseCase;
    @Autowired
    public VacinaController(CadastrarVacinaUseCase cadastrarVacinaUseCase){
        this.cadastrarVacinaUseCase = cadastrarVacinaUseCase;
    }
    @PostMapping()
    public ResponseEntity<String> cadastrarVacina(@RequestBody VacinaRequest vacinaRequest) {
        if (vacinaRequest.getNome() == null || vacinaRequest.getNome().isBlank()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Campo nome é obrigatorio");
        }
        if (vacinaRequest.getNomeFabricante() == null || vacinaRequest.getNomeFabricante().isBlank()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Campo Nome Fabricante é obrigatorio");
        }
        Vacina vacina = new Vacina(vacinaRequest.getNome(),vacinaRequest.getNomeFabricante(),vacinaRequest.getDescricao());
        cadastrarVacinaUseCase.processar(vacina);
        return ResponseEntity.ok("Cadastro Realizado com Sucesso");

    }
}

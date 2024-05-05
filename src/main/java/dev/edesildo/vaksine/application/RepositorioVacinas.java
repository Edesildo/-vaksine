package dev.edesildo.vaksine.application;

import dev.edesildo.vaksine.domain.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioVacinas extends JpaRepository<Vacina,Long> {

    boolean existe(String nome, String nomeFabricante);

    /**
     * @param Vacina
     * @return Vacina
     */
    Vacina criar(Vacina vacina);

}
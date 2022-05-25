package br.com.ambiente.testejava.repositories;

import br.com.ambiente.testejava.model.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServidorRepository extends JpaRepository<Servidor, Long> {

    Servidor findByMatricula(String matricula);
    //.
}

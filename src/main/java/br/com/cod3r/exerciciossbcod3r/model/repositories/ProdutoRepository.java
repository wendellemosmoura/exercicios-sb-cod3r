package br.com.cod3r.exerciciossbcod3r.model.repositories;

import br.com.cod3r.exerciciossbcod3r.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}

package br.com.cod3r.exerciciossbcod3r.model.repositories;

import br.com.cod3r.exerciciossbcod3r.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}

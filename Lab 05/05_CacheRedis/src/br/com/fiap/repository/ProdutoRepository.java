package br.com.fiap.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.fiap.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

	List<Produto> findByTipo(Integer tipo);
}
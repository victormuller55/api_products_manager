package com.milli.products.repository;

import com.milli.products.model.TipoProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoProdutoRepository  extends JpaRepository<TipoProduto, Integer> { }

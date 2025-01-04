package com.milli.products.service;

import com.milli.products.dto.ProdutoGetDTO;
import com.milli.products.dto.ProdutoPostDTO;
import com.milli.products.model.Produto;
import com.milli.products.model.TipoProduto;
import com.milli.products.repository.ProdutoRepository;
import com.milli.products.repository.TipoProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    TipoProdutoRepository tipoprodutoRepository;

    public Produto createProduto(ProdutoPostDTO dto) {

        double frete = (dto.getTipoProduto() == 1) ? dto.getPesoProduto() * 10.0 : 0.0;

        Produto produto = new Produto();
        Optional<TipoProduto> tipoProduto = tipoprodutoRepository.findById(dto.getTipoProduto());

        produto.setIdProduto(dto.getIdProduto());
        produto.setDescricaoProduto(dto.getDescricaoProduto());
        produto.setPesoProduto(dto.getPesoProduto());
        tipoProduto.ifPresent(produto::setTipoProduto);
        produto.setPrecoProduto(dto.getPrecoProduto());
        produto.setFreteValorProduto(frete);
        if(dto.getDesconto()) {
            produto.setPorcentagemDescontoProduto(10);
        }
        produto.setDataCriacaoProduto(LocalDateTime.now());

        return produto;

    }

    public ProdutoGetDTO createDTOGet(Integer id) {

        Produto produto = produtoRepository.getReferenceById(id);

        // Calcula os valores
        double precoOriginal = produto.getPrecoProduto();
        double frete = produto.getFreteValorProduto();
        double desconto = produto.getPorcentagemDescontoProduto() / 100.0;
        double precoPromocao = precoOriginal * (1 - desconto);
        double precoTotal = precoPromocao + frete;

        ProdutoGetDTO produtoDTO = new ProdutoGetDTO();

        produtoDTO.setIdProduto(produto.getIdProduto());
        produtoDTO.setDescricaoProduto(produto.getDescricaoProduto());
        produtoDTO.setDescricaoTipoProduto(produto.getTipoProduto().getDescricaoTipoProduto());
        produtoDTO.setPesoProduto(produto.getPesoProduto());
        produtoDTO.setDesconto(produto.getPorcentagemDescontoProduto() == 10);
        produtoDTO.setPrecoProduto(precoOriginal);
        produtoDTO.setFreteValorProduto(frete);
        produtoDTO.setPrecoPromocaoProduto(precoPromocao);
        produtoDTO.setPrecoTotalProduto(precoTotal);

        return produtoDTO;
    }

    public List<ProdutoGetDTO> getAll() {

        List<ProdutoGetDTO> produtosDTO = new ArrayList<>();
        List<Produto> produtos = produtoRepository.findAll();

        produtos.forEach(produto -> produtosDTO.add(createDTOGet(produto.getIdProduto())));

        return produtosDTO;
    }

    public ProdutoGetDTO get(Integer id) {
        Produto produto = produtoRepository.getReferenceById(id);
        return createDTOGet(produto.getIdProduto());
    }

    public void post(ProdutoPostDTO produto) {
        produtoRepository.save(createProduto(produto));
    }

    public void delete(Integer id) {
        produtoRepository.deleteById(id);
    }

    public void update(ProdutoPostDTO produto) {
        produtoRepository.save(createProduto(produto));
    }

    public double calcularMediaPrecos() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos.stream()
                .mapToDouble(Produto::getPrecoProduto)
                .average()
                .orElse(0.0);
    }

    public Optional<Produto> obterProdutoMaisCaro() {
        return produtoRepository.findAll().stream()
                .max(Comparator.comparingDouble(Produto::getPrecoProduto));
    }
}

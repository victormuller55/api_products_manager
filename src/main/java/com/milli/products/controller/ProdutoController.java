package com.milli.products.controller;

import com.milli.products.dto.ProdutoPostDTO;
import com.milli.products.model.Produto;
import com.milli.products.responses.ErrorResponse;
import com.milli.products.responses.SuccessResponse;
import com.milli.products.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/v1/mili/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Object> postProduto(@RequestBody ProdutoPostDTO produto) {
        try {
            produtoService.post(produto);
            return SuccessResponse.success200(produto);
        } catch (Exception e) {
            return ErrorResponse.error500(e);
        }
    }

    @GetMapping("/todos")
    public ResponseEntity<Object> getAllProdutos() {
        try {
            return SuccessResponse.success200(produtoService.getAll());
        } catch (Exception e) {
            return ErrorResponse.error500(e);
        }
    }

    @GetMapping()
    public ResponseEntity<Object> getProduto(@RequestParam("id_produto") Integer idProduto) {
        try {
            return SuccessResponse.success200(produtoService.get(idProduto));
        } catch (Exception e) {
            return ErrorResponse.error500(e);
        }
    }

    @DeleteMapping()
    public ResponseEntity<Object> deleteProduto(@RequestParam("id_produto") Integer idProduto) {
        try {
            produtoService.delete(idProduto);
            return SuccessResponse.success200("ok");
        } catch (Exception e) {
            return ErrorResponse.error500(e);
        }
    }

    @GetMapping("/media-precos")
    public ResponseEntity<Object> calcularMediaPrecos() {
        try {
            double media = produtoService.calcularMediaPrecos();
            return SuccessResponse.success200(media);
        } catch (Exception e) {
            return ErrorResponse.error500(e);
        }
    }

    @GetMapping("/maior-valor")
    public ResponseEntity<Object> maiorPrecos() {
        try {

            Optional<Produto> produto = produtoService.obterProdutoMaisCaro();

            if(produto.isPresent()) {
                return SuccessResponse.success200(produto.get());
            }

            return ErrorResponse.error400("Nenhum pruduto encontrado.");
        } catch (Exception e) {
            return ErrorResponse.error500(e);
        }
    }
}

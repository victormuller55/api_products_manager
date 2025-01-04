package com.milli.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProdutoPostDTO {

    @JsonProperty("id_produto")
    private Integer idProduto;

    @JsonProperty("descricao_produto")
    private String descricaoProduto;

    @JsonProperty("id_tipo_produto")
    private Integer tipoProduto;

    @JsonProperty("peso_produto")
    private double pesoProduto;

    @JsonProperty("preco_produto")
    private double precoProduto;

    @JsonProperty("desconto")
    private boolean desconto;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(Integer tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public double getPesoProduto() {
        return pesoProduto;
    }

    public void setPesoProduto(double pesoProduto) {
        this.pesoProduto = pesoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public boolean getDesconto() {
        return desconto;
    }

    public void setDasconto(boolean desconto) {
        this.desconto = desconto;
    }
}

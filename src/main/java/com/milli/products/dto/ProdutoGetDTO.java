package com.milli.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProdutoGetDTO {

    @JsonProperty("id_produto")
    private Integer idProduto;

    @JsonProperty("descricao_produto")
    private String descricaoProduto;

    @JsonProperty("descricao_tipo_produto")
    private String descricaoTipoProduto;

    @JsonProperty("peso_produto")
    private double pesoProduto;

    @JsonProperty("preco_produto")
    private double precoProduto;

    @JsonProperty("frete_valor_produto")
    private double freteValorProduto;

    @JsonProperty("desconto")
    private boolean desconto;

    @JsonProperty("preco_promocao_produto")
    private double precoPromocaoProduto;

    @JsonProperty("preco_total_produto")
    private double precoTotalProduto;

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

    public String getDescricaoTipoProduto() {
        return descricaoTipoProduto;
    }

    public void setDescricaoTipoProduto(String descricaoTipoProduto) {
        this.descricaoTipoProduto = descricaoTipoProduto;
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

    public double getFreteValorProduto() {
        return freteValorProduto;
    }

    public void setFreteValorProduto(double freteValorProduto) {
        this.freteValorProduto = freteValorProduto;
    }

    public boolean getDesconto() {
        return desconto;
    }

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }

    public double getPrecoPromocaoProduto() {
        return precoPromocaoProduto;
    }

    public void setPrecoPromocaoProduto(double precoPromocaoProduto) {
        this.precoPromocaoProduto = precoPromocaoProduto;
    }

    public double getPrecoTotalProduto() {
        return precoTotalProduto;
    }

    public void setPrecoTotalProduto(double precoTotalProduto) {
        this.precoTotalProduto = precoTotalProduto;
    }
}

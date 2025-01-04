package com.milli.products.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id_produto")
    private Integer idProduto;

    @JsonProperty("descricao_produto")
    private String descricaoProduto;

    @JsonProperty("preco_produto")
    private double precoProduto;

    @JsonProperty("peso_produto")
    private double pesoProduto;

    @ManyToOne
    @JoinColumn(name = "id_tipo_produto", nullable = false)
    @JsonProperty("tipo_produto")
    private TipoProduto tipoProduto;

    @JsonProperty("frete_valor_produto")
    private double freteValorProduto;

    @JsonProperty("porcentagem_desconto_produto")
    private double porcentagemDescontoProduto;

    @JsonProperty("data_criacao_produto")
    private LocalDateTime dataCriacaoProduto;

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

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public double getPesoProduto() {
        return pesoProduto;
    }

    public void setPesoProduto(double pesoProduto) {
        this.pesoProduto = pesoProduto;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public double getFreteValorProduto() {
        return freteValorProduto;
    }

    public void setFreteValorProduto(double freteValorProduto) {
        this.freteValorProduto = freteValorProduto;
    }

    public double getPorcentagemDescontoProduto() {
        return porcentagemDescontoProduto;
    }

    public void setPorcentagemDescontoProduto(double porcentagemDescontoProduto) {
        this.porcentagemDescontoProduto = porcentagemDescontoProduto;
    }

    public LocalDateTime getDataCriacaoProduto() {
        return dataCriacaoProduto;
    }

    public void setDataCriacaoProduto(LocalDateTime dataCriacaoProduto) {
        this.dataCriacaoProduto = dataCriacaoProduto;
    }
}

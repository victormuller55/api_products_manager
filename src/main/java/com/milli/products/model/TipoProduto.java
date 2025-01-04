package com.milli.products.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_tipo_produto")
public class TipoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id_tipo_produto")
    private Integer idTipoProduto;

    @JsonProperty("descricao_tipo_produto")
    private String descricaoTipoProduto;

    public Integer getIdTipoProduto() {
        return idTipoProduto;
    }

    public void setIdTipoProduto(Integer idTipoProduto) {
        this.idTipoProduto = idTipoProduto;
    }

    public String getDescricaoTipoProduto() {
        return descricaoTipoProduto;
    }

    public void setDescricaoTipoProduto(String descricaoTipoProduto) {
        this.descricaoTipoProduto = descricaoTipoProduto;
    }
}

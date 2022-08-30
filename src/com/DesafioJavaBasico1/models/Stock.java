package com.DesafioJavaBasico1.models;

public class Stock {

    private Integer codProduto;
    private Integer qtdStock;

    public Stock(Integer codProduto, Integer qtdStock) {
        this.codProduto = codProduto;
        this.qtdStock = qtdStock;
    }
    public Stock(){

    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public Integer getQtdStock() {
        return qtdStock;
    }

    public void setQtdStock(Integer qtdStock) {
        this.qtdStock = qtdStock;
    }
}

package com.DesafioJavaBasico1.models;

import java.io.Serializable;

public class OrderRequest implements Serializable {

    private String nome;
    private String email;
    private Integer codigoProduto;
    private Integer qtdVendida;
    private Stock stock;

    public OrderRequest(){}

    public OrderRequest(String nome, String email,Integer codigoProduto, Integer qtdVendida, Stock stock) {
       super();
        this.nome = nome;
        this.email = email;
        this.codigoProduto= codigoProduto;
        this.qtdVendida = qtdVendida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Integer getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(Integer qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    public Stock getStock() {
        return stock;
    }
    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "Nome='" + nome + '\'' +
                ", Email='" + email + '\'' +
                ", CodigoProduto=" + codigoProduto +
                ", QtdPedida=" + qtdVendida +
                '}';
    }
}

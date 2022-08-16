package com.DesafioJavaBasico1.entities;

import java.io.Serializable;

public class OrderRequest implements Serializable {

    private String Nome;
    private String Email;
    private Integer CodigoProduto;
    private Integer QtdVendida;


    public OrderRequest(String nome, String email, Integer codigoProduto, Integer qtdVendida) {
       super();
        Nome = nome;
        Email = email;
        CodigoProduto = codigoProduto;
        QtdVendida = qtdVendida;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getCodigoProduto() {
        return CodigoProduto;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        CodigoProduto = codigoProduto;
    }

    public Integer getQtdVendida() {
        return QtdVendida;
    }

    public void setQtdVendida(Integer qtdVendida) {
        QtdVendida = qtdVendida;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "Nome='" + Nome + '\'' +
                ", Email='" + Email + '\'' +
                ", CodigoProduto=" + CodigoProduto +
                ", QtdPedida=" + QtdVendida +
                '}';
    }
}

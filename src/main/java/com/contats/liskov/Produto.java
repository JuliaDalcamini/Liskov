/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.liskov;

/**
 *
 * @author Julia Dalcamini
 */
public class Produto {
    private String nomeProduto;
    private int codProduto;
    private double precoProduto;

    public Produto(String nomeProduto, int codProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.codProduto = codProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    
    
}

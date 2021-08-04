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
public class Promo {
    private double novoValor;

    public Promo(double novoValor) {
        this.novoValor = novoValor;
    }

    public double getNovoValor() {
        return novoValor;
    }

    public void setNovoValor(double novoValor) {
        this.novoValor = novoValor;
    }
    
    public double novoValor(Produto produto, Hora horacompra) {
        if(horacompra.getHour()>=20){
            this.novoValor = (produto.getPrecoProduto()*0.9);
        }
        return this.novoValor;
    }
}

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
public class Compra {
    public static void main(String[] args) {

        Produto p = new Produto("Biscoito", 0001, 5.00);
        Hora hora = new Hora(20, 15, 0);
        Promo promo = new Promo(0.00);
        
        System.out.println("Valor Final: "+ promo.novoValor(p, hora));
        
    }
}

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
public class Hora {
    private int hours, minutes, seconds;
    
    public Hora (int hours, int minutes, int seconds){
        if(hours>=0 && hours <24 )
            this.hours = hours;
        else
            throw new IllegalArgumentException("Hora inválida");
        
        if(minutes >=0 && minutes < 60)
            this.minutes = minutes;
        else
            throw new IllegalArgumentException("Minutos inválidos");
        
        if( seconds >=0 && seconds < 60)
            this.seconds = seconds;
        else
            throw new IllegalArgumentException("Segundos inválidos");
            
                
    }
    
    @Override
    public String toString(){
     return String.format("%d:%d:%d", getHour(), getMinute(), getSecond());
    }
    
    public int getHour(){
        return this.hours;
    }
    
    public int getMinute(){
        return this.minutes;
    }
    
    public int getSecond(){
        return this.seconds;
    }
    
}

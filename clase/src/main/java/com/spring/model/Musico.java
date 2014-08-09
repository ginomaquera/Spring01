package com.spring.model;

import java.util.List;



public class Musico extends Persona {
    
    private int numeroCanciones;
    
    private Instrumento instrumento;   
    
    private Instrumento instrumento10;     
    
    private List<Instrumento> instrumentos;

    public Musico() {
    }    
    
    public Musico(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }   

    public Musico(int numeroCanciones, Instrumento instrumento) {
        this.numeroCanciones = numeroCanciones;
        this.instrumento = instrumento;
    }  
    
    public Musico(Instrumento instrumento) {        
        this.instrumento = instrumento;
    }
    
    public Instrumento getInstrumento10() {
        return instrumento10;
    }

    public void setInstrumento10(Instrumento instrumento10) {
        this.instrumento10 = instrumento10;
    }

    
    

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(List<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }   

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }    

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }  
    
    

}

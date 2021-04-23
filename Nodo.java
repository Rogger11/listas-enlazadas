package com.mycompany.listasenlazadassimples;

public class Nodo {
    private Integer dato;
    private Nodo siguiente;
    
    public Nodo() {
        this.dato = null;
        this.siguiente = null;
    }
    
    public Nodo(Integer dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    public Nodo(Integer dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    public Integer getDato() {
        return dato;
    }
    
    public void setDato(Integer dato) {
        this.dato = dato;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
     }
}

/*
    Elaborado por:
    Juan Diego López Botero
    Hamilton Andrés Echeverri Guzmán
*/
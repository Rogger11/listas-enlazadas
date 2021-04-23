package com.mycompany.listasenlazadassimples;

import javax.swing.JOptionPane;

public class ListaEnlazadaSimple {
    private Nodo cabeza;
    
    public ListaEnlazadaSimple() {
        this.cabeza = null;
    }
    public ListaEnlazadaSimple(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    public Nodo getCabeza() {
        return cabeza;
    }
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public boolean isVacia() {
        return this.cabeza==null;
    }

    public void anular() {
        this.cabeza = null;
    }
    
    public void enlistar(){
        Nodo a;
        String respuesta = "Resultado:\n"+this.cabeza.getDato();
        if(this.cabeza != null){
            a = this.cabeza;
            do{
                a = a.getSiguiente();
                respuesta += "\n" + a.getDato();
            }while(a.getSiguiente() != null);
        }
        JOptionPane.showMessageDialog(null, respuesta);
    }
    
    public Nodo encontrar(int a){
        Nodo e = this.cabeza;
        do{
            if(e.getDato().equals(a)){
                return e;
            }else{
                e = e.getSiguiente();
            }
        }while(e != null);
        return null;
    }    
    
    public void anadirCabeza(int a){
        Nodo e = new Nodo(a);
        e.setSiguiente(this.cabeza);
        this.cabeza = e;
    }
    
    
    
    
    public Nodo ultimo() {
        boolean check = true;
        Nodo a = null;
        if(this.cabeza != null){
            a = this.cabeza;
            while(check){
                if(a.getSiguiente() != null){
                    a.setSiguiente(this.cabeza);
                }else{
                    check = false;
                }
            }
        }
        return a;
    }
    
    public void addUltimo(int a){
        if(!this.isVacia()){
            this.cabeza.setSiguiente(new Nodo(a));
        }
    }
    
    public void agregarPosicion(int a, int e) {
        Nodo f = this.cabeza;
        for (int i = 1; i < a; i++) {
            if (f.getSiguiente() == null)
                break;
            f = f.getSiguiente();
        }
        Nodo g = new Nodo(e, f.getSiguiente());
        f.setSiguiente(g);
    }
    
    public void borrarCabeza(){
        if(this.cabeza != null){
            Nodo a = this.cabeza;
            this.cabeza = this.cabeza.getSiguiente();
            a.setSiguiente(null);
        }
    }
    
    public void borrarCola(){
        if(this.cabeza != null){
            if(this.cabeza.getSiguiente() == null){
                this.cabeza = null;
            }else{
                Nodo a = this.cabeza;
                do{
                    a = a.getSiguiente();
                }while(a.getSiguiente().getSiguiente() != null);
                a.setSiguiente(null);
            }
        }
    }
    
    public void delPosicion(int a){
        if(this.cabeza != null){
            if(a == 0){
                Nodo e = this.cabeza;
                this.cabeza = e.getSiguiente();
                e.setSiguiente(null);
            }
            Nodo f = this.cabeza;
            Nodo sig = f.getSiguiente();
            f.setSiguiente(sig.getSiguiente());
            sig.setSiguiente(null);
        }
    }
}

/*
    Elaborado por:
    Juan Diego López Botero
    Hamilton Andrés Echeverri Guzmán
*/
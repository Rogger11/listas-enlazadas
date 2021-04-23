package com.mycompany.listasenlazadassimples;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple a = new ListaEnlazadaSimple();
        //¿A está vacía?
        JOptionPane.showMessageDialog(null, a.isVacia());
        //Creamos nodos
        Nodo nodo1 = new Nodo(25);
        Nodo nodo2 = new Nodo(-65);
        Nodo nodo3 = new Nodo(-80);
        Nodo nodo4 = new Nodo(-69);
        //Definimos nodos
        a.setCabeza(nodo1);
        nodo1.setSiguiente(nodo2);
        nodo2.setSiguiente(nodo3);
        nodo3.setSiguiente(nodo4);
        //¿A está vacía?
        JOptionPane.showMessageDialog(null, a.isVacia());
        //Obtener lista
        a.enlistar();
        //Buscar nodos
        JOptionPane.showMessageDialog(null, a.encontrar(25));
        JOptionPane.showMessageDialog(null, a.encontrar(-65));
        JOptionPane.showMessageDialog(null, a.encontrar(-80));
        JOptionPane.showMessageDialog(null, a.encontrar(-69));
        //Agregar cabeza
        a.anadirCabeza(-548);
        //Obtener lista
        a.enlistar();
        //Obtener el último nodo
        JOptionPane.showMessageDialog(null, nodo4.getSiguiente());
        //Add última
        nodo4.setSiguiente(new Nodo(-12348));
        //Obtener lista
        a.enlistar();
        //Set en posición
        a.agregarPosicion(3, -987);
        //Obtener lista
        a.enlistar();
        //Borrar cabeza
        a.borrarCabeza();
        //Borrar cola
        a.borrarCola();
        //Obtener lista
        a.enlistar();
        //Borrar Posición
        a.delPosicion(3);
        //Obtener lista
        a.enlistar();
        JOptionPane.showMessageDialog(null, "Muchas gracias por su paciencia.");
    }
}

/*
    Elaborado por:
    Juan Diego López Botero
    Hamilton Andrés Echeverri Guzmán
*/
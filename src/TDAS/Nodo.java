/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAS;

/**
 * TDA Nodo genérico
 * @author link
 * @param <T> Tipo de dato a almacenar
 */
public final class Nodo <T> {
    protected T dato; // Dato a alamcenar
    protected Nodo siguiente; // Puntero a siguiente
    protected Nodo anterior; // Para listas doble enlazadas
    
    /**
     * Costructor por defecto
     */
    public Nodo() {
        this.dato=null;
        this.siguiente=null;
        this.anterior=null;
    }
    /**
     * Costructor parametrizado
     * @param dato Tipo de dato a almacenar
     */
    public Nodo (T dato){
        this.dato = dato;
        this.siguiente=null;
        this.anterior=null;
    }
    
    
}

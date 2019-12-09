/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAS;

/**
 *
 * @author link
 * @param <T>
 */
public class NodoArbol<T> {
    protected T dato; // Dato a alamcenar
    protected NodoArbol izquierdo; // Puntero a siguiente
    protected NodoArbol derecho; // Para listas doble enlazadas
    
    /**
     * Costructor por defecto
     */
    public NodoArbol() {
        this.dato=null;
        this.izquierdo=null;
        this.derecho=null;
    }
    /**
     * Costructor parametrizado
     * @param dato Tipo de dato a almacenar
     */
    public NodoArbol (T dato){
        this.dato = dato;
        this.izquierdo=null;
        this.derecho=null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAS;

/**
 *
 * @author link
 */
public interface EsArbolBinario<T> {
    public boolean vacio(NodoArbol r);
    public boolean esHoja(NodoArbol r);
    public int destruir();
    public void insertar(T dato);
    public void inOrden(NodoArbol nodo, boolean r);
    public void preOrden(NodoArbol nodo, boolean r);
    public void postOrden(NodoArbol nodo, boolean r);
    public int numeroNodos();
    public void borrar(T dato);
    public boolean buscar(T dato);
    public int altura();
    public int alturaNodo(T dato);
    public T getRaiz();

    
}

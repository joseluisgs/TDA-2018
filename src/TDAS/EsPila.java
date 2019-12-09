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
public interface EsPila<T> extends EsLista<T> {
    public int apilar(T dato);
    public T desapilar();
    public T tope();
    
}

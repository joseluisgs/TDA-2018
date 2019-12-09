/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAS;

/**
 *
 * @author link
 * @param <T> Tipo de dato de la lista
 */
public interface EsLista<T> {
    public int getTamaño();
    public void imprimir();
    public boolean vacia();
    public int vaciar();
    
}

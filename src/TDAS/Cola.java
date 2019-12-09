/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAS;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author link
 */
public class Cola<T> extends ListaDobleEnlazada<T> implements EsCola<T> {

    @Override
    public int encolar(T dato) {
        return this.insertarEnListaFinal(dato);
    }

    @Override
    public T desencolar() {
        try {
            T dato= this.getItem(0);
            this.borrarEnListaInicio();
            return dato;
        } catch (Exception ex) {
            Logger.getLogger(Cola.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public T primero() {
        try {
            return this.getItem(0);
        } catch (Exception ex) {
            Logger.getLogger(Cola.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public T ultimo() {
        try {
            return this.getItem(tam-1);
        } catch (Exception ex) {
            Logger.getLogger(Cola.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

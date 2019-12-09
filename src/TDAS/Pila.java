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
public class Pila<T> extends ListaEnlazada<T> implements EsPila<T>{
    
    /**
     * Costructor por defecto
     */
    public Pila(){
        super(); // no es obligatorio
    }

    @Override
    public int apilar(T dato) {
        return this.insertarEnListaInicio(dato);
    }

    @Override
    public T desapilar() {
        if(!vacia()){
            try {
                T dato = this.getItem(0);
                this.borrarEnListaInicio();
                return dato;
            } catch (Exception ex) {
                Logger.getLogger(Pila.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return null;
    }

    @Override
    public T tope() {
         if(!vacia()){
            try {
                T dato = this.getItem(0);
                return dato;
            } catch (Exception ex) {
                Logger.getLogger(Pila.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
         }
        return null;
    }   
}

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
public interface EsCola<T> {
    public int encolar(T dato);
    public T desencolar();
    public T primero();
    public T ultimo();
}

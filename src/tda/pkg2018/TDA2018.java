/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda.pkg2018;

import TDAS.ArbolBinario;
import TDAS.Cola;
import TDAS.ListaDobleEnlazada;
import TDAS.ListaEnlazada;
import TDAS.NodoArbol;
import TDAS.Pila;

/**
 *
 * @author link
 */
public class TDA2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //TestListaEnlazada();
        //TestListaDobleEnlazada();
        //TestPila();
        //TestCola();
        TestArbolBinario();
        
        
        
    }

    private static void TestListaEnlazada() throws Exception {
        // TODO code application logic here
        
        // Probando lista enlazada
        ListaEnlazada<String> le = new ListaEnlazada();
        
        // insetramos tres datos al comienzo, el ultimo será el primero al imprimir
        System.out.println("Insertar al principio");
        for(int i=1; i<=3; i++){
            le.insertarEnListaInicio("Dato "+i);
        }
        le.imprimir();
        System.out.println();
        
        // insetramos tres datos al final, el ultimo será el último
        System.out.println("Insertar al Final");
        for(int i=7; i<=9; i++){
            le.insertarEnListaFinal("Dato "+i);
        }
        le.imprimir();
        System.out.println();
        
        
        // insertamos en varias posiciones, dos de ellas erroneas
        System.out.println("Insertar en una posición");
        //le.insertarEnListaEnIndice("Dato -1", -1);
        //le.insertarEnListaEnIndice("Dato 99", 99);
        le.insertarEnListaEnIndice("Dato 55", 5);
        le.imprimir();
        System.out.println();
        
        // Borramos al comienzo
        System.out.println("Borrar al inicio");
        le.borrarEnListaInicio();
        le.imprimir();
        System.out.println();
        
        // Borramos al final
        System.out.println("Borrar al final");
        le.borrarEnListaFinal();
        le.imprimir();
        System.out.println();
        
        // Borramos en medio
        System.out.println("Borrar en medio");
        le.borrarEnListaIndice(2);
        le.imprimir();
        System.out.println();
        
        //obtenemos distintos elementos 
        System.out.println(le.getItem(0));
        System.out.println(le.getItem(2));
        System.out.println(le.getItem(le.getTamaño()-1));
        //System.out.println(le.getItem(34).toString());
    }
    
    private static void TestListaDobleEnlazada() throws Exception {
        // TODO code application logic here
        
        // Probando lista enlazada
        ListaDobleEnlazada<String> ld = new ListaDobleEnlazada();
        
        // insetramos tres datos al comienzo, el ultimo será el primero al imprimir
        System.out.println("Insertar al principio");
        for(int i=1; i<=3; i++){
            ld.insertarEnListaInicio("Dato "+i);
        }
        ld.imprimir();
        System.out.println();
        
        // insetramos tres datos al final, el ultimo será el último
        System.out.println("Insertar al Final");
        for(int i=7; i<=9; i++){
            ld.insertarEnListaFinal("Dato "+i);
        }
        ld.imprimir();
        System.out.println();
        

        

        // insertamos en varias posiciones, dos de ellas erroneas
        System.out.println("Insertar en una posición");
        //le.insertarEnListaEnIndice("Dato -1", -1);
        //le.insertarEnListaEnIndice("Dato 99", 99);
        ld.insertarEnListaEnIndice("Dato 55", 5);
        ld.imprimir();
        System.out.println();
        
        
        // Borramos al comienzo
        System.out.println("Borrar al inicio");
        ld.borrarEnListaInicio();
        ld.imprimir();
        System.out.println();
        
        
        
        // Borramos al final
        System.out.println("Borrar al final");
        ld.borrarEnListaFinal();
        ld.imprimir();
        System.out.println();
        
        
        // Borramos en medio
        System.out.println("Borrar en medio");
        ld.borrarEnListaIndice(2);
        ld.imprimir();
        System.out.println();
        
        
        
        //obtenemos distintos elementos 
        System.out.println(ld.getItem(0).toString());
        System.out.println(ld.getItem(2).toString());
        System.out.println(ld.getItem(ld.getTamaño()-1).toString());
        //System.out.println(le.getItem(34).toString());
        System.out.println();
        
        //imprimimos
        System.out.println("Imprimimos del principio al final");
        ld.imprimir();
        System.out.println();
        System.out.println("Imprimimos del final al principio");
        ld.impirmirReverso();
        System.out.println();

    }
    
    private static void TestPila() {
        Pila<String> p = new Pila();
        
        // insetramos tres datos al comienzo, el ultimo será el primero al imprimir
        System.out.println("Apilar");
        for(int i=1; i<=3; i++){
            p.apilar("Dato "+i);
        }
        p.imprimir();
        System.out.println();
        
        System.out.println("Tope");
        System.out.println(p.tope().toString());
        
        System.out.println("Desapilamos");
        System.out.println(p.desapilar().toString());
        
        System.out.println("Imprimimos");
        p.imprimir();
        System.out.println();
        
        System.out.println("Desapilamos todo");
        while(!p.vacia()){
            System.out.println("Sale -> "+ p.desapilar().toString());
        }
    }
    
    private static void TestCola() {
        Cola<String> c = new Cola();
        
        // insetramos al final en una cola, el ultimo será el último
        System.out.println("Encolar");
        for(int i=1; i<=3; i++){
            c.encolar("Dato "+i);
        }
        c.imprimir();
        System.out.println();
        
        System.out.println("Primero");
        System.out.println(c.primero());
        System.out.println("Ultimo");
        System.out.println(c.ultimo());
        
        System.out.println("Desencolamos");
        System.out.println(c.desencolar().toString());
        
        System.out.println("Imprimimos");
        c.imprimir();
        System.out.println();
        
        System.out.println("Desencolamos todo");
        while(!c.vacia()){
            System.out.println("Sale -> "+ c.desencolar().toString());
        }
        
        
    }
    
    private static void TestArbolBinario(){
        ArbolBinario a = new ArbolBinario();
        // Inserción de nodos en árbol:
        a.insertar(19);
        a.insertar(5);
        a.insertar(12);
        a.insertar(4);
        a.insertar(7);
        a.insertar(3);
        a.insertar(6);
        a.insertar(9);
        a.insertar(8);
        a.insertar(11);
        a.insertar(14);
        a.insertar(13);
        a.insertar(2);
        a.insertar(1);
        a.insertar(15);
        a.insertar(10);  
        a.insertar(17);
        a.insertar(18);
        a.insertar(16);
        
        System.out.println("Probando Recorridos");
        System.out.println("Recorrido en inOrden");
        a.inOrden(null, true);
        System.out.println();
        System.out.println("Recorrido en preOrden");
        a.preOrden(null, true);
        System.out.println();
        System.out.println("Recorrido en postOrden");
        a.postOrden(null, true);
        System.out.println();
        
        // Buscamos algúnos nodos
        System.out.println();
        if(a.buscar(12))
            System.out.println("El 12 SI está en el arbol");
        else
            System.out.println("El 12 NO está en el arbol");
        
        if(a.buscar(99))
            System.out.println("El 99 SI está en el arbol");
        else
            System.out.println("El 99 NO está en el arbol");
        
        // Borraremos algunos elementos:
        System.out.println();
        System.out.println("Nº Nodos: "+a.numeroNodos());
        System.out.println("Borramos el 5");
        a.borrar(5);
        System.out.println("Nº Nodos: "+a.numeroNodos());
        a.inOrden(null, true);
        System.out.println();
        System.out.println("Borramos el 8");
        a.borrar(8);
        System.out.println("Nº Nodos: "+a.numeroNodos());
        a.inOrden(null, true);
        System.out.println();
        System.out.println("Borramos el 245"); // No está
        a.borrar(245);
        System.out.println("Nº Nodos: "+a.numeroNodos());
        a.inOrden(null, true);
        System.out.println();
        
        System.out.println("Borramos el 10"); // Es la raiz
        a.borrar(10);
        System.out.println("Nº Nodos: "+a.numeroNodos());
        a.inOrden(null, true);
        System.out.println();
        
        
        // Otras funciones
        System.out.println();
        System.out.println("Nº Nodos: "+a.numeroNodos());
        System.out.println("Raiz del Arbol: "+a.getRaiz().toString());
        System.out.println("Altura del arbol: "+a.altura());
        System.out.println("altura de 1: "+a.alturaNodo(1));
        System.out.println("altura de 10: "+a.alturaNodo(10)); // No está
        System.out.println("altura de 18: "+a.alturaNodo(18));

        
        //Equilibramos o balanceamos
        System.out.println();
        System.out.println("Equilibramos el arbol");
        a.equilibrar();
        System.out.println("Nº Nodos: "+a.numeroNodos());
        System.out.println("Raiz del Arbol: "+a.getRaiz().toString());
        System.out.println("arbol en pre-orden");
        a.preOrden(null, true);
        System.out.println();
        System.out.println("arbol en in-orden");
        a.inOrden(null, true);
        System.out.println();
        System.out.println();
        
        


   
    }
}

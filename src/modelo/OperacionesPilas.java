/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.dados;

/**
 *
 * @author betsy.moreno
 */
public class OperacionesPilas {

    public static <T extends Base> Pila<T> duplicarPila(Pila<T> pilaOriginal){
        Pila<T> piladuplicada=new Pila<>();
        Pila<T> pilaAux=new Pila<>();
        
        while (!pilaOriginal.estaVacia()) {            
            pilaAux.apilar(pilaOriginal.desapilar());
        }
        
        while (!pilaAux.estaVacia()) {
            T elemento=pilaAux.desapilar();
            T elemtcopy= (T) elemento.copy();
            pilaOriginal.apilar(elemento);
            piladuplicada.apilar(elemtcopy);
        }
        
        
        return piladuplicada;
    }
    
}

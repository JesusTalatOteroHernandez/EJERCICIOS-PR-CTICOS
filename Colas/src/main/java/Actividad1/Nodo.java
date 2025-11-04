/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1;

/**
 *
 * @author Jesus Talat Otero Hernandez otero
 * 1224100702.jtoh@gmail.com
 * Clase para crear lo nodos en este caso es un nodo generico
 */
public class Nodo<T> {
    /**
     * Dato generico
     */
    private T dato;
    /**
     * Enlace
     */ 
    private Nodo siguiente;

    /**
     * Constructor vacio
     */
    public Nodo() {
    }

    /**
     * Constructor
     * @param dato 
     */
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    /**
     * Getters and setters
    */
    public T getDato() {
        return dato;
    }

    /**
     * Setter para el dato
     * @param dato 
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * Getter para el enlace
     * @return 
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Setter Para el siguiente enlace
     * @param siguiente 
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Metodo para convertir de lenguaje de computadora a humano
     * @return 
     */
    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_6_DecimalABinario;

/**
 *
 * @author Jesus Talat Otero Hernandez
 */
//Implements es una herencia multiple
public class Stack<T> implements IStack<T> {
    private T[] elements;   //Estructura de datos interna (Array)
    private int top;   //Índice de la cima
    
    //Constructores para crear una pila, uno ya indicada con 30 elementos y el otro uno indica el tamaño
    public Stack() {
        elements = (T[])new Object[30];
    }

    public Stack(int size) {
        elements = (T[])new Object[size];
    }
    
    /**
     * 
     * Metodo para ingresar elementos a la pila 
     */ 
    @Override
    public void push(T element) {
        /**
         * Valida que el inidice de hasta arriba sea menor al tamaño de la pila
         */
        if(top < elements.length -1){
            top++;
            elements[top] = element;
        }else{
            /**
             * Lanza un mensaje indicando de que la pila esta llena
             */
            System.out.println("La Pila se encuentra llena");
        }
    }
    
    /**
    * Método para eliminar un elemento de la pila
    */
    @Override
    public T pop() {
        /**
         * Verifica si la pila esta vacía
         */
        if(isEmpty()){
            System.out.println("La pila está vacía");
        }
        /**
         * Elimina el elemento superior de la pila
         */
        T temp = elements[top];
        elements[top]=null;
        top--;
        return temp;
    }

    /**
     * Método para mostrar el elemento superior de la pila sin eliminarlo
     */
    @Override
    public T peek() {
        /**
         * Verifica si la pila está vacía
         */
        if(isEmpty()){
            System.out.println("La pila está vacía");
        } 
        
        //Imprimir último elemento
        System.out.println("Conociendo el último de la pila");
        return (T)elements[top-1];
    }

    /**
     * Metodo para verificar si la pila esta vacia
     * @return 
     */
    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public String toString() {
        return "elements=" + elements;
    }
    
}
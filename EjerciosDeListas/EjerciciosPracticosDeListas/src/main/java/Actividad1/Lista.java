/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1;

/**
 *
 * @author otero
 */

import java.util.Random;

public class Lista {
    private Nodo cabeza;
    
    public Lista() {
        cabeza = null;
    }
    
   
    //Genera números enteros positivos al azar e inserta al final de la lista
    public void generarNumerosAzar(int cantidad, int limiteMax) {
        Random random = new Random();
        
        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(limiteMax) + 1; // Números de 1 a limiteMax
            insertarAlFinal(numero);
        }
    }
    
    //Inserta un número al final de la lista
    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }
    
    
    //Recorre y muestra todos los elementos de la lista
    public void recorrerLista() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        
        System.out.println("\n=== Elementos de la Lista ===");
        Nodo actual = cabeza;
        int posicion = 1;
        
        while (actual != null) {
            System.out.println("Nodo " + posicion + ": " + actual.getDato());
            actual = actual.getSiguiente();
            posicion++;
        }
        System.out.println("=============================\n");
    }
    
    
    //Muestra la lista en formato horizontal
    public void mostrarListaHorizontal() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        
        System.out.print("Lista: ");
        Nodo actual = cabeza;
        
        while (actual != null) {
            System.out.print(actual.getDato());
            if (actual.getSiguiente() != null) {
                System.out.print(" -> ");
            }
            actual = actual.getSiguiente();
        }
        System.out.println(" -> null");
    }
    
    /**
     * Elimina todos los nodos cuyo dato sea mayor al valor dado
     * Ajusta los enlaces para mantener la integridad de la lista
     */
    public void eliminarMayoresA(int valor) {
        if (cabeza == null) {
            return;
        }
        
        int eliminados = 0;
        
        //Eliminar nodos al inicio si son mayores al valor
        while (cabeza != null && cabeza.getDato() > valor) {
            cabeza = cabeza.getSiguiente();
            eliminados++;
        }
        
        //Eliminar nodos en el resto de la lista
        if (cabeza != null) {
            Nodo actual = cabeza;
            
            while (actual.getSiguiente() != null) {
                if (actual.getSiguiente().getDato() > valor) {
                    actual.setSiguiente(actual.getSiguiente().getSiguiente());
                    eliminados++;
                } else {
                    actual = actual.getSiguiente();
                }
            }
        }
        
        System.out.println("\n✓ Se eliminaron " + eliminados + " nodos mayores a " + valor);
    }
    
   
    //Verifica si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }
    
    
    //Obtiene la cabeza de la lista
    public Nodo getCabeza() {
        return cabeza;
    }
}

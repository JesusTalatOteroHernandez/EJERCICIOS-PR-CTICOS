/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

/**
 *
 * @author otero
 */
public class Lista {
    private Nodo ultimo;  // Referencia al último nodo (no al primero)
    
    public Lista() {
        ultimo = null;
    }
    
    /**
     * Inserta un término al final del polinomio
     * Mantiene la estructura circular
     */
    public void insertar(int coeficiente, int exponente) {
        Nodo nuevoNodo = new Nodo(coeficiente, exponente);
        
        if (ultimo == null) {
            // Primer nodo: se apunta a sí mismo (circular)
            ultimo = nuevoNodo;
            ultimo.setSiguiente(ultimo);
        } else {
            // Insertar al final y mantener estructura circular
            nuevoNodo.setSiguiente(ultimo.getSiguiente()); // Apunta al primero
            ultimo.setSiguiente(nuevoNodo);                // El anterior apunta al nuevo
            ultimo = nuevoNodo;                            // Actualizar último
        }
    }
    
    /**
     * Muestra el polinomio en formato matemático
     */
    public void mostrarPolinomio() {
        if (ultimo == null) {
            System.out.println("Polinomio vacío");
            return;
        }
        
        System.out.print("\nPolinomio: ");
        
        Nodo actual = ultimo.getSiguiente(); // Empezar desde el primero
        boolean primero = true;
        
        do {
            // Mostrar signo
            if (!primero) {
                if (actual.getCoeficiente() >= 0) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Mostrar coeficiente
            if (actual.getCoeficiente() != 1 || actual.getExponente() == 0) {
                System.out.print(actual.getCoeficiente());
            } else if (actual.getCoeficiente() == -1 && actual.getExponente() != 0) {
                System.out.print("-");
            }
            
            // Mostrar variable y exponente
            if (actual.getExponente() > 0) {
                System.out.print("x");
                if (actual.getExponente() > 1) {
                    System.out.print("^" + actual.getExponente());
                }
            }
            
            primero = false;
            actual = actual.getSiguiente();
            
        } while (actual != ultimo.getSiguiente()); // Volver al inicio
        
        System.out.println();
    }
    
    
    // Recorre el polinomio de forma circular
    // Muestra la estructura circular empezando desde el nodo siguiente al último
    public void recorridoCircular() {
        if (ultimo == null) {
            System.out.println("Polinomio vacío");
            return;
        }
        
        Nodo actual = ultimo.getSiguiente(); // Empezar desde el primero
        int posicion = 1;
        
        do {
            System.out.println("Nodo " + posicion + ": " + 
                             actual.getCoeficiente() + "x^" + 
                             actual.getExponente());
            actual = actual.getSiguiente();
            posicion++;
        } while (actual != ultimo.getSiguiente());
    }
}

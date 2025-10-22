/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3;

/**
 *
 * @author otero
 */
public class Lista {
    private Nodo cabeza;
    
    public Lista() {
        cabeza = null;
    }
    
    /**
     * Inserta un término al final del polinomio
     */
    public void insertar(int coeficiente, int exponente) {
        Nodo nuevoNodo = new Nodo(coeficiente, exponente);
        
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
    
    /**
     * Evalúa el polinomio para un valor de x
     * P(x) = coef1*x^exp1 + coef2*x^exp2 + ...
     */
    public double evaluar(double x) {
        double resultado = 0.0;
        Nodo actual = cabeza;
        
        while (actual != null) {
            // Calcular término: coeficiente * x^exponente
            double termino = actual.getCoeficiente() * Math.pow(x, actual.getExponente());
            resultado += termino;
            actual = actual.getSiguiente();
        }
        
        return resultado;
    }
    
    /**
     * Muestra el polinomio en formato matemático
     */
    public void mostrarPolinomio() {
        if (cabeza == null) {
            System.out.println("Polinomio vacío");
            return;
        }
        
        System.out.print("P(x) = ");
        Nodo actual = cabeza;
        boolean primero = true;
        
        while (actual != null) {
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
        }
        
        System.out.println();
    }
    
    /**
     * Evalúa el polinomio desde 0.0 hasta 5.0 en incrementos de 0.5
     * y muestra los resultados en forma de tabla
     */
    public void evaluarRango() {
        System.out.println("\n|-------------------------------------|");
        System.out.println("|      TABLA DE VALORES P(x)            |");
        System.out.println("|---------------------------------------|");
        System.out.println("|    x    │         P(x)                |");
        System.out.println("|---------------------------------------|");
        
        double x = 0.0;
        while (x <= 5.0) {
            double resultado = evaluar(x);
            System.out.printf("|  %.1f    │  %10.2f              |%n", x, resultado);
            x += 0.5;
        }
        
        System.out.println("|_____________________________________|");
    }
}

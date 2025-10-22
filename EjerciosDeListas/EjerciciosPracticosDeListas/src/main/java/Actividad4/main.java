/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.Scanner;

/**
 *
 * @author otero
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista polinomio = new Lista();
        
        // Solicitar número de términos
        System.out.print("Cuantos terminos tiene el polinomio? ");
        int numTerminos = scanner.nextInt();
        
        if (numTerminos <= 0) {
            System.out.println("Error: Debe ingresar al menos un termino.");
            scanner.close();
            return;
        }
        
        // Entrada del polinomio
        System.out.println("\nIngrese los terminos del polinomio:");
        System.out.println("(Formato: coeficiente exponente)");
        System.out.println("Ejemplo para 3x^4: ingrese 3 4\n");
        
        for (int i = 1; i <= numTerminos; i++) {
            System.out.print("Termino " + i + " - Coeficiente: ");
            int coeficiente = scanner.nextInt();
            
            System.out.print("Termino " + i + " - Exponente: ");
            int exponente = scanner.nextInt();
            
            polinomio.insertar(coeficiente, exponente);
            System.out.println();
        }
        
        // Mostrar información del polinomio      
        System.out.println("RESULTADO");
        
        // Mostrar polinomio en formato matemático
        polinomio.mostrarPolinomio();
        
        // Mostrar recorrido circular
        polinomio.recorridoCircular();
        
        scanner.close();
    }
        
 }
    
    
    
    


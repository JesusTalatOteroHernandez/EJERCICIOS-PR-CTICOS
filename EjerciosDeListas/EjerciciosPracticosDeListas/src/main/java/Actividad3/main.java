/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3;

import java.util.Scanner;

/**
 *
 * @author otero
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista polinomio = new Lista();
        
        // 1. Entrada del polinomio
        System.out.println("ENTRADA DEL POLINOMIO");
        System.out.println("-".repeat(55));
        System.out.print("Cuantos terminos tiene el polinomio? ");
        int numTerminos = scanner.nextInt();
        
        if (numTerminos <= 0) {
            System.out.println("Error: Debe ingresar al menos un termino.");
            scanner.close();
            return;
        }
        
        System.out.println("\nIngrese los terminos (coeficiente y exponente):");
        System.out.println("Ejemplo: Para 3x^4 ingrese -> Coeficiente: 3, Exponente: 4\n");
        
        for (int i = 1; i <= numTerminos; i++) {
            System.out.println("Termino " + i + ":");
            System.out.print("  Coeficiente: ");
            int coeficiente = scanner.nextInt();
            
            System.out.print("  Exponente: ");
            int exponente = scanner.nextInt();
            
            polinomio.insertar(coeficiente, exponente);
            System.out.println();
        }
        
        // 2. Mostrar el polinomio
        System.out.println("\n" + "=".repeat(55));
        System.out.println("POLINOMIO INGRESADO");
        System.out.println("=".repeat(55));
        polinomio.mostrarPolinomio();
        
        // 3. Evaluación del polinomio
        System.out.println("\n" + "=".repeat(55));
        System.out.println("EVALUACION DEL POLINOMIO");
        System.out.println("=".repeat(55));
        System.out.println("Evaluando desde x = 0.0 hasta x = 5.0");
        System.out.println("Incremento: 0.5");
        
        polinomio.evaluarRango();
        
        // Opción para evaluar valores específicos
        System.out.println("\n Desea evaluar valores específicos de x? (s/n): ");
        String respuesta = scanner.next();
        
        while (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Ingrese el valor de x: ");
            double x = scanner.nextDouble();
            double resultado = polinomio.evaluar(x);
            System.out.printf("P(%.2f) = %.2f%n", x, resultado);
            
            System.out.print("\n¿Evaluar otro valor? (s/n): ");
            respuesta = scanner.next();
        }
    }
}

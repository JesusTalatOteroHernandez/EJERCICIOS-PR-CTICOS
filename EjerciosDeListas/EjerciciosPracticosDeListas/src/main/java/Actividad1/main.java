/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1;

/**
 *
 * @author otero
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        
        // 1. Crear la lista enlazada
        System.out.println("PASO 1: CREAR LA LISTA ENLAZADA");
        System.out.println("-".repeat(55));
        System.out.print("Cuantos numeros desea generar? ");
        int cantidad = scanner.nextInt();
        
        System.out.print("Cual es el valor maximo para los numeros? ");
        int limiteMax = scanner.nextInt();
        
        lista.generarNumerosAzar(cantidad, limiteMax);
        System.out.println("Lista generada con " + cantidad + " numeros al azar");
        
        // 2. Recorrer la lista
        System.out.println("PASO 2: RECORRER LA LISTA");
        lista.recorrerLista();
        lista.mostrarListaHorizontal();
        
        // 3. Eliminar nodos mayores a un valor
        System.out.println("PASO 3: ELIMINAR NODOS MAYORES A UN VALOR");
        System.out.print("Ingrese el valor limite: ");
        int valorLimite = scanner.nextInt();
        
        System.out.println("\nLista antes de eliminar:");
        lista.mostrarListaHorizontal();
        
        lista.eliminarMayoresA(valorLimite);
        
        System.out.println("\nLista despues de eliminar:");
        lista.mostrarListaHorizontal();
        
        // Mostrar resultado final
        System.out.println("RESULTADO FINAL");
        lista.recorrerLista();
        
        
        scanner.close();
    }
}

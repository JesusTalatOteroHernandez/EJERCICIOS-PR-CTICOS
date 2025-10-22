/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad5;

import java.util.Scanner;

/**
 *
 * @author otero
 */
public class main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        
        // Solicitar cadena al usuario
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        
        if (cadena.isEmpty()) {
            System.out.println("Error: La cadena está vacía.");
            scanner.close();
            return;
        }
        
        // Construir lista con cada carácter
        for (int i = 0; i < cadena.length(); i++) {
            String caracter = String.valueOf(cadena.charAt(i));
            lista.insertar(caracter);
        }
        
        // Ordenar alfabéticamente
        lista.ordenarAlfabeticamente();
        
        // Mostrar lista ordenada
        lista.mostrarLista();
        
        scanner.close();
    }
}

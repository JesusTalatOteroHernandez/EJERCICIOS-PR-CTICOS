/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_2_PilaDeNombres;

import java.util.Scanner;

/**
 *
 * @author otero
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pila = new Stack<>();
        String nombre;
        while (true) {
            System.out.print("Ingrese un nombre (FIN para salir): ");
            nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("FIN")) break;
            pila.push(nombre);
        }
        System.out.println("Nombres en orden inverso:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
    
}

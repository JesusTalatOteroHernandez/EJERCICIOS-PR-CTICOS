/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_4_InvertirUnaPalabra;

import java.util.Scanner;

/**
 *
 * @author otero
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        Stack<Character> pila = new Stack<>();
        for (char c : palabra.toCharArray()) pila.push(c);
        System.out.print("Invertida: ");
        while (!pila.isEmpty()) System.out.print(pila.pop());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_6_DecimalABinario;

import java.util.Scanner;

/**
 *
 * @author otero
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        int num = sc.nextInt();
        Stack<Integer> pila = new Stack<>();
        while (num > 0) {
            pila.push(num % 2);
            num /= 2;
        }
        System.out.print("Binario: ");
        while (!pila.isEmpty()) System.out.print(pila.pop());
    }
}

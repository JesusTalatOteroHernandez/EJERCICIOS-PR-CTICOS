/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_3_VerificarSiLaPilaEstaVacia;

/**
 *
 * @author otero
 */
public class main {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        System.out.println("¿Está vacía la pila? " + pila.isEmpty());
        pila.push(1);
        System.out.println("¿Está vacía la pila? " + pila.isEmpty());
    }
}

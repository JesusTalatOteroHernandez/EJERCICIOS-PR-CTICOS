/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_5_BalanceoDeParentesis;

/**
 *
 * @author otero
 */
public class main {
    public static boolean estaBalanceada(String expr) {
        Stack<Character> pila = new Stack<>();
            for (char c : expr.toCharArray()) {
            if (c == '(') pila.push(c);
                else if (c == ')') {
                if (pila.isEmpty()) return false;
                pila.pop();
            }
        }
    return pila.isEmpty();
    }
    
    public static void main(String[] args) {
        System.out.println(estaBalanceada("((2+3)*5)")); // true
        System.out.println(estaBalanceada("((2+3)*5")); // false
    }
}

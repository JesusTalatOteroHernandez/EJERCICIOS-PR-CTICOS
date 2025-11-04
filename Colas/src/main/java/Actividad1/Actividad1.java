/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1;

/**
 *
 * @author Jesus Talat Otero Hernandez otero
 * 1224100702.jtoh@gmail.com
 */
public class Actividad1 {
    public static void main(String[] args) {
     /** Crear primera cola
      * 
      */
        Cola<Integer> cola1 = new Cola<>();
        cola1.encolar(10);
        cola1.encolar(20);
        cola1.encolar(30);
        
        /** Crear segunda cola (idéntica)
         * 
         */
        Cola<Integer> cola2 = new Cola<>();
        cola2.encolar(10);
        cola2.encolar(20);
        cola2.encolar(30);
        
        /** Crear tercera cola (diferente)
         * 
         */
        Cola<Integer> cola3 = new Cola<>();
        cola3.encolar(10);
        cola3.encolar(25);
        cola3.encolar(30);
        
        /** Comparar colas
         * 
         */
        System.out.println("\nCola1 y Cola2 son identicas? " + cola1.sonIdenticas(cola2)); // true
        System.out.println("Cola1 y Cola3 son identicas? " + cola1.sonIdenticas(cola3)); // false
        
        /** Mostrar las colas (verificar que no se modificaron)
         * 
         */
        System.out.print("\nCola 1: ");
        cola1.listaComp();
        System.out.print("\nCola 2: ");
        cola2.listaComp();
        System.out.print("\nCola 3: ");
        cola3.listaComp();
    }   
    
}

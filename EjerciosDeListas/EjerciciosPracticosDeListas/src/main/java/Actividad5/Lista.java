/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad5;

/**
 *
 * @author otero
 */
public class Lista {
    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }
    
    public void insertar(String texto){
        Nodo nuevoNodo = new Nodo(texto);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        }else{
            Nodo temp = cabeza;
            while(temp.getPosterior() != null){
                temp = temp.getPosterior();
            }
            temp.setPosterior(nuevoNodo);  
            nuevoNodo.setAnterior(temp);
        }   
    }
    
    public void ordenarAlfabeticamente(){
        if (cabeza == null || cabeza.getPosterior() == null) {
            return;
        }
        boolean intercambio;
        do {
            intercambio = false;
            Nodo temp = cabeza;
            
            while(temp.getPosterior() != null){
                char c1 = temp.getTexto().charAt(0);
                char c2 = temp.getPosterior().getTexto().charAt(0);
                
                if (c1 >= 'A' && c1 <= 'Z') {
                    c1 = (char)(c1 + 32);
                }
                if (c2 >= 'A' && c2 <= 'Z') {
                    c2 = (char)(c2 + 32);
                }
                if (c1 > c2) {
                    String actual = temp.getTexto();
                    temp.setTexto(temp.getPosterior().getTexto());
                    temp.getPosterior().setTexto(actual);
                    intercambio = true;
                }
                temp = temp.getPosterior();
                
            }
        } while (intercambio);
        
        
    }
    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }
        
        System.out.println("\n=== Lista de caracteres ordenada alfabéticamente ===");
        Nodo actual = cabeza;
        int posicion = 1;
        
        while (actual != null) {
            System.out.println(posicion + ". " + actual.getTexto());
            actual = actual.getPosterior();
            posicion++;
        }
        System.out.println("================================================\n");
    }
    
    
}
    

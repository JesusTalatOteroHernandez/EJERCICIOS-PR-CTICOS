/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 *
 * @author otero
 */
import java.io.*;
import java.util.Scanner;

public class Lista {
     private Nodo cabeza;
    
    public Lista() {
        this.cabeza = null;
    }
    
    // Getter y Setter para cabeza
    public Nodo getCabeza() {
        return cabeza;
    }
    
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    // Método para agregar palabra al final de la lista
    public void agregarPalabra(String palabra) {
        Nodo nuevoNodo = new Nodo(palabra);
        
        if (getCabeza() == null) {
            setCabeza(nuevoNodo);
        } else {
            Nodo actual = getCabeza();
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }
    
    // Método para leer archivo y cargar palabras
    public void leerArchivoYCargar(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            Scanner scanner = new Scanner(archivo);
            
            while (scanner.hasNext()) {
                String palabra = scanner.next();
                agregarPalabra(palabra);
            }
            scanner.close();
            System.out.println("Archivo cargado exitosamente");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado - " + nombreArchivo);
        }
    }
    
    // Método para eliminar una palabra específica
    public boolean eliminarPalabra(String palabra) {
        if (getCabeza() == null) {
            return false;
        }
        
        // Si la palabra está en la cabeza
        if (getCabeza().getPalabra().equals(palabra)) {
            setCabeza(getCabeza().getSiguiente());
            return true;
        }
        
        // Buscar en el resto de la lista
        Nodo actual = getCabeza();
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getPalabra().equals(palabra)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
    
    // Método para mostrar todas las palabras
    public void mostrarLista() {
        if (getCabeza() == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        
        System.out.println("\n--- Palabras en la lista ---");
        Nodo actual = getCabeza();
        int contador = 1;
        while (actual != null) {
            System.out.println(contador + ". " + actual.getPalabra());
            actual = actual.getSiguiente();
            contador++;
        }
        System.out.println("----------------------------");
    }
    
    // Método para contar palabras
    public int contarPalabras() {
        int contador = 0;
        Nodo actual = getCabeza();
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }
    
    // Método para escribir la lista en un archivo
    public void escribirEnArchivo(String nombreArchivo) {
        try {
            FileWriter writer = new FileWriter(nombreArchivo);
            Nodo actual = getCabeza();
            
            while (actual != null) {
                writer.write(actual.getPalabra());
                if (actual.getSiguiente() != null) {
                    writer.write("\n");
                }
                actual = actual.getSiguiente();
            }
            writer.close();
            System.out.println("Lista guardada en: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }
    
    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return getCabeza() == null;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 *
 * @author otero
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);
        String nombreArchivoEntrada = "";
        
        System.out.println("  LISTA ENLAZADA DE PALABRAS DESDE ARCHIVO");
        
        // Menú principal
        int opcion;
        do {
            System.out.println("\nMENU");
            System.out.println("| 1. Cargar palabras desde archivo   |");
            System.out.println("| 2. Agregar nueva palabra            |");
            System.out.println("| 3. Eliminar palabra                 |");
            System.out.println("| 4. Mostrar lista                    |");
            System.out.println("| 5. Guardar lista en archivo         |");
            System.out.println("| 6. Mostrar estadisticas             |");
            System.out.println("| 0. Salir                            |");
            System.out.print("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el nombre del archivo: ");
                    nombreArchivoEntrada = scanner.nextLine();
                    lista.leerArchivoYCargar(nombreArchivoEntrada);
                    break;
                    
                case 2:
                    System.out.print("\nIngrese la palabra a agregar: ");
                    String nuevaPalabra = scanner.nextLine();
                    lista.agregarPalabra(nuevaPalabra);
                    System.out.println("Palabra agregada exitosamente");
                    break;
                    
                case 3:
                    System.out.print("\nIngrese la palabra a eliminar: ");
                    String palabraEliminar = scanner.nextLine();
                    if (lista.eliminarPalabra(palabraEliminar)) {
                        System.out.println("Palabra eliminada exitosamente");
                    } else {
                        System.out.println("Palabra no encontrada");
                    }
                    break;
                    
                case 4:
                    lista.mostrarLista();
                    break;
                    
                case 5:
                    System.out.print("\nIngrese el nombre del archivo de salida: ");
                    String nombreArchivoSalida = scanner.nextLine();
                    lista.escribirEnArchivo(nombreArchivoSalida);
                    break;
                    
                case 6:
                    System.out.println("\n--- ESTADISTICAS ---");
                    System.out.println("Total de palabras: " + lista.contarPalabras());
                    System.out.println("Lista vacia: " + (lista.estaVacia() ? "Si" : "No"));
                    break;
                    
                case 0:
                    System.out.println("\n¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("\nOpcion inválida");
            }
        } while (opcion != 0);
        
        scanner.close();

    }
}

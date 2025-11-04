/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 *
 * @author Jesus Talat Otero Hernandez otero
 * 1224100702.jtoh@gmail.com
 */
public class actividad2 {
    public static void main(String[] args) {
        /** Crear cola de carritos disponibles (25 carritos)
         * 
         */
        Cola<Integer> carritosDisponibles = new Cola<>();
        System.out.println("=== Inicializando 25 carritos ===");
        for (int i = 1; i <= 25; i++) {
            carritosDisponibles.encolar(i);
        }
        
        /** Crear 3 colas para las cajas de pago
         * 
         */
        Cola<Integer> caja1 = new Cola<>();
        Cola<Integer> caja2 = new Cola<>();
        Cola<Integer> caja3 = new Cola<>();
        
        System.out.println("\n=== ESTADO INICIAL ===");
        System.out.println("Carritos disponibles: " + carritosDisponibles.tamano());
        System.out.print("Carritos: ");
        carritosDisponibles.listaComp();
        System.out.println("\n");
        
        
        /** Cliente 1 llega
         * 
         */
        System.out.println("--- Cliente 1 llega ---");
        if (!carritosDisponibles.isEmpty()) {
            int carrito1 = carritosDisponibles.desencolar();
            System.out.println("Cliente 1 toma carrito, hace compras");
            // Cliente va a caja con menos gente
            caja1.encolar(1);
            System.out.println("Cliente 1 se forma en Caja 1");
        }
        
        /** Cliente 2 llega
         * 
         */
        System.out.println("\n--- Cliente 2 llega ---");
        if (!carritosDisponibles.isEmpty()) {
            int carrito2 = carritosDisponibles.desencolar();
            System.out.println("Cliente 2 toma carrito, hace compras");
            caja2.encolar(2);
            System.out.println("Cliente 2 se forma en Caja 2");
        }
        
        /** Cliente 3 llega
         * 
         */
        System.out.println("\n--- Cliente 3 llega ---");
        if (!carritosDisponibles.isEmpty()) {
            int carrito3 = carritosDisponibles.desencolar();
            System.out.println("Cliente 3 toma carrito, hace compras");
            caja3.encolar(3);
            System.out.println("Cliente 3 se forma en Caja 3");
        }
        
        /** Cliente 4 llega
         * 
         */
        System.out.println("\n--- Cliente 4 llega ---");
        if (!carritosDisponibles.isEmpty()) {
            int carrito4 = carritosDisponibles.desencolar();
            System.out.println("Cliente 4 toma carrito, hace compras");
            // Va a la caja con menos gente (cualquiera tiene 1)
            caja1.encolar(4);
            System.out.println("Cliente 4 se forma en Caja 1");
        }
        
        /** Cliente 5 llega
         * 
         */
        System.out.println("\n--- Cliente 5 llega ---");
        if (!carritosDisponibles.isEmpty()) {
            int carrito5 = carritosDisponibles.desencolar();
            System.out.println("Cliente 5 toma carrito, hace compras");
            caja2.encolar(5);
            System.out.println("Cliente 5 se forma en Caja 2");
        }
        
        /** Mostrar estado
         * 
         */
        System.out.println("\n=== ESTADO DESPUÉS DE 5 CLIENTES ===");
        System.out.println("Carritos disponibles: " + carritosDisponibles.tamano());
        System.out.println("Caja 1 tiene " + caja1.tamano() + " clientes");
        System.out.print("  ");
        caja1.listaComp();
        System.out.println("\nCaja 2 tiene " + caja2.tamano() + " clientes");
        System.out.print("  ");
        caja2.listaComp();
        System.out.println("\nCaja 3 tiene " + caja3.tamano() + " clientes");
        System.out.print("  ");
        caja3.listaComp();
        System.out.println("\n");
        
        /** Procesar pagos en Caja 1
         * 
         */
        System.out.println("--- Caja 1 atiende ---");
        if (!caja1.isEmpty()) {
            int clienteAtendido = caja1.desencolar();
            System.out.println("Cliente " + clienteAtendido + " paga y libera carrito");
            carritosDisponibles.encolar(clienteAtendido);
        }
        
        /** Procesar pagos en Caja 2
         * 
         */
        System.out.println("\n--- Caja 2 atiende ---");
        if (!caja2.isEmpty()) {
            int clienteAtendido = caja2.desencolar();
            System.out.println("Cliente " + clienteAtendido + " paga y libera carrito");
            carritosDisponibles.encolar(clienteAtendido);
        }
        
        /** Procesar pagos en Caja 3
         * 
         */
        System.out.println("\n--- Caja 3 atiende ---");
        if (!caja3.isEmpty()) {
            int clienteAtendido = caja3.desencolar();
            System.out.println("Cliente " + clienteAtendido + " paga y libera carrito");
            carritosDisponibles.encolar(clienteAtendido);
        }
        
        /** Estado final
         * 
         */
        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Carritos disponibles: " + carritosDisponibles.tamano());
        System.out.print("Carritos: ");
        carritosDisponibles.listaComp();
        System.out.println("\n");
        System.out.println("Caja 1: " + caja1.tamano() + " clientes");
        System.out.print("  ");
        caja1.listaComp();
        System.out.println("\nCaja 2: " + caja2.tamano() + " clientes");
        System.out.print("  ");
        caja2.listaComp();
        System.out.println("\nCaja 3: " + caja3.tamano() + " clientes");
        System.out.print("  ");
        caja3.listaComp();
        System.out.println();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3;

/**
 *
 * @author Jesus Talat Otero Hernandez otero
 * 1224100702.jtoh@gmail.com
 */
public class actividad3 {
    public static void main(String[] args) {
        /**Configuración de la simulación
         * 
         */
        int HORAS_SIMULACION = 7;
        int MINUTOS_TOTALES = HORAS_SIMULACION * 60; // 420 minutos
        int TIEMPO_ATENCION_POR_CAJA = 3; // minutos por cliente
        
        /**Fila única de clientes
         * 
         */
        Cola<String> filaClientes = new Cola<>();
        
        /** 3 cajas activas tiempo restante de atención
         * 
         */
        int[] cajas = new int[4]; // índices 0-3 para 4 cajas posibles
        boolean cuartaCajaAbierta = false;
        int minutoCuartaCaja = 0;
        
        /**  Acumuladores
         *  
         */
        int totalClientesAtendidos = 0;
        int clientesGenerados = 0;
        int tamanoMaximoFila = 0;
        int tiempoMaximoEspera = 0;
        int sumaTiemposEspera = 0;
        int sumaTamanosFila = 0;
        int contadorMediciones = 0;
        
        System.out.println("Duracion: " + HORAS_SIMULACION + " horas (" + MINUTOS_TOTALES + " minutos)");
        System.out.println("Cajas activas: 3");
        System.out.println("Tiempo de atencion: " + TIEMPO_ATENCION_POR_CAJA + " min/cliente");
        
        
        for (int minuto = 1; minuto <= MINUTOS_TOTALES; minuto++) {
            /** 1. LLEGADA DE CLIENTES (80% probabilidad cada minuto)
             * 
             */
            if (Math.random() < 0.8) {
                clientesGenerados++;
                filaClientes.encolar(clientesGenerados + "-" + minuto);
                
                if (minuto <= 30 || minuto % 60 == 0) {
                    System.out.println("Min " + minuto + ": Cliente " + clientesGenerados + " llega");
                }
            }
            
            /** 2. VERIFICAR SI SE NECESITA CUARTA CAJA
             * 
             */
            if (!cuartaCajaAbierta && filaClientes.tamano() > 20) {
                cuartaCajaAbierta = true;
                minutoCuartaCaja = minuto;
                System.out.println("\n*** Min " + minuto + " - CUARTA CAJA ABIERTA (Fila: " + 
                                 filaClientes.tamano() + ") ***\n");
            }
            
            /** 3. ATENDER EN LAS CAJAS
             * 
             */
            int cajasActivas = cuartaCajaAbierta ? 4 : 3;
            
            for (int i = 0; i < cajasActivas; i++) {
                if (cajas[i] > 0) {
                    cajas[i]--; // Decrementar tiempo
                } else if (!filaClientes.isEmpty()) {
                    /** Atender nuevo cliente
                     * 
                     */
                    String clienteInfo = filaClientes.desencolar();
                    String[] partes = clienteInfo.split("-");
                    int idCliente = Integer.parseInt(partes[0]);
                    int minutoLlegada = Integer.parseInt(partes[1]);
                    
                    cajas[i] = TIEMPO_ATENCION_POR_CAJA;
                    
                    /** Calcular tiempo de espera
                     * 
                     */
                    int tiempoEspera = minuto - minutoLlegada;
                    sumaTiemposEspera += tiempoEspera;
                    
                    if (tiempoEspera > tiempoMaximoEspera) {
                        tiempoMaximoEspera = tiempoEspera;
                    }
                    
                    totalClientesAtendidos++;
                    
                    if (minuto <= 30 || totalClientesAtendidos % 50 == 0) {
                        System.out.println("Min " + minuto + ": Caja " + (i+1) + 
                                         " atiende Cliente " + idCliente + 
                                         " (Espero: " + tiempoEspera + " min)");
                    }
                }
            }
            
            /** 4. REGISTRAR ESTADÍSTICAS
             * 
             */
            int tamanoActual = filaClientes.tamano();
            if (tamanoActual > tamanoMaximoFila) {
                tamanoMaximoFila = tamanoActual;
            }
            sumaTamanosFila += tamanoActual;
            contadorMediciones++;
            
            /** Mostrar estado cada hora
             * 
             */
            if (minuto % 60 == 0) {
                System.out.println("\n--- ESTADO Hora " + (minuto/60) + " ---");
                System.out.println("Clientes en fila: " + tamanoActual);
                System.out.println("Atendidos: " + totalClientesAtendidos);
                System.out.println("Cajas activas: " + cajasActivas);
                System.out.println();
            }
        }
        
        /** CALCULAR ESTADÍSTICAS FINALES
         * 
         */
        double tamanoPromedioFila = (double) sumaTamanosFila / contadorMediciones;
        double tiempoPromedioEspera = totalClientesAtendidos > 0 ? 
                                      (double) sumaTiemposEspera / totalClientesAtendidos : 0;
        
        /** MOSTRAR RESULTADOS
         * 
         */
        System.out.println("\n========================================");
        System.out.println("       ESTADISTICAS FINALES");
        System.out.println("========================================");
        System.out.println("Total de clientes atendidos: " + totalClientesAtendidos);
        System.out.println("Clientes que llegaron: " + clientesGenerados);
        System.out.println("Clientes aun en fila: " + filaClientes.tamano());
        System.out.println();
        System.out.println("Tamano maximo de fila: " + tamanoMaximoFila + " clientes");
        System.out.println("Tamano promedio de fila: " + String.format("%.2f", tamanoPromedioFila) + " clientes");
        System.out.println();
        System.out.println("Tiempo maximo de espera: " + tiempoMaximoEspera + " minutos");
        System.out.println("Tiempo promedio de espera: " + String.format("%.2f", tiempoPromedioEspera) + " minutos");
        System.out.println();
        
        if (cuartaCajaAbierta) {
            System.out.println("Cuarta caja abierta en minuto: " + minutoCuartaCaja + 
                             " (" + (MINUTOS_TOTALES - minutoCuartaCaja) + " min activa)");
        } else {
            System.out.println("Cuarta caja: NO fue necesaria");
        }
        
        System.out.println("========================================");
        
        /** Mostrar primeros clientes restantes
         * 
         */
        if (!filaClientes.isEmpty()) {
            System.out.println("\nClientes aun esperando:");
            System.out.print("  ");
            filaClientes.listaComp();
            System.out.println();
        }
    }
}

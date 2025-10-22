/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad5;

/**
 *
 * @author otero
 */
public class Nodo {
    private String texto;
    private Nodo anterior;
    private Nodo posterior;

    public Nodo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getPosterior() {
        return posterior;
    }

    public void setPosterior(Nodo posterior) {
        this.posterior = posterior;
    }
    
    
}

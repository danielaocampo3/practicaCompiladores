/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

/**
 *
 * @author Daniela Ocampo
 */
public class Nodo {
     /* Declaraciones de variables */
    
    private  char simbolo;
    private boolean anulable;
    private Nodo hijoIzquierdo;
    private Nodo hijoDerecho;
    private String posicion;
    private String primeraPos, ultimaPos;

    public Nodo() {
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public boolean isAnulable() {
        return anulable;
    }

    public void setAnulable(boolean anulable) {
        this.anulable = anulable;
    }

    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPrimeraPos() {
        return primeraPos;
    }

    public void setPrimeraPos(String primeraPos) {
        this.primeraPos = primeraPos;
    }

    public String getUltimaPos() {
        return ultimaPos;
    }

    public void setUltimaPos(String ultimaPos) {
        this.ultimaPos = ultimaPos;
    }
    
    
    
    
    
    
    

 
    

  
}

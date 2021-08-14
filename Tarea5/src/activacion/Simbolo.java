/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activacion;

/**
 *
 * @author LENOVO-PC
 */
public class Simbolo {
    
    private Nodo raiz;
    private String nombre;

    public Simbolo() {
    }

    public Simbolo(Nodo raiz, String nombre) {
        this.raiz = raiz;
        this.nombre = nombre;
    }
    
    

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}

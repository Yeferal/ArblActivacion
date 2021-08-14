/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activacion;

import java.util.ArrayList;

/**
 *
 * @author LENOVO-PC
 */
public class Tabla {

    ArrayList<Simbolo> tablaSimbolos;
    public Nodo nodoPadre;
    
    public Tabla() {
        tablaSimbolos = new ArrayList<>();
    }
    
    public void agregarSimbolo(Simbolo simbolo){
        tablaSimbolos.add(simbolo);
    }
    
    public Nodo getNodoRaiz(String nombre){
        for (int i = 0; i < tablaSimbolos.size(); i++) {
            if (tablaSimbolos.get(i).getNombre().equals(nombre)) {
                return tablaSimbolos.get(i).getRaiz();
            }
        }
        return null;
    }
    
    public void pintar(){
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < tablaSimbolos.size(); i++) {
            System.out.println((i+1)+"."+tablaSimbolos.get(i).getNombre()+"");
            System.out.println("\tHijos: ("+tablaSimbolos.get(i).getRaiz().getNodosHijo()+")");
        }
    }
    
    public void setNodoPadre(String texto){
        nodoPadre = new Nodo(texto, texto);
    }
    public void setTxtNodoPadre(String texto){
        nodoPadre.setTexto(texto);
        nodoPadre.setNombre(texto);
    }
    
    
}

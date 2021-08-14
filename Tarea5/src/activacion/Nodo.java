
package activacion;

import java.util.ArrayList;

public class Nodo {
    
    String texto,nombre,nodoName;
    int idNodo,id;
    ArrayList<Nodo> nodosHijo = new ArrayList<>();

    public Nodo(String texto) {
        this.texto = texto;
    }
    public Nodo() {
        
    }

    public Nodo(String texto, String nombre) {
        this.texto = texto;
        this.nombre = nombre;
    }
    

    public Nodo(String texto, String nombre, String nodoName) {
        this.texto = texto;
        this.nombre = nombre;
        this.nodoName = nodoName;
    }
    
    public void agregarHijo(Nodo nodoHijo){
        nodosHijo.add(nodoHijo);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNodoName() {
        return nodoName;
    }

    public void setNodoName(String nodoName) {
        this.nodoName = nodoName;
    }

    public int getIdNodo() {
        return idNodo;
    }

    public void setIdNodo(int idNodo) {
        this.idNodo = idNodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Nodo> getNodosHijo() {
        return nodosHijo;
    }

    public void setNodosHijo(ArrayList<Nodo> nodosHijo) {
        this.nodosHijo = nodosHijo;
    }
    
    public String toString(){
        return nombre;
    }    
    
    
}

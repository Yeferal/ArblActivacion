/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activacion;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author LENOVO-PC
 */
public class Arbol {
    
    private Tabla tabla;
    Nodo raizArb;
    String listaNodos, listaRamas;
    int x;
    String salida ="";

    public Arbol(Tabla tabla) {
        this.tabla = tabla;
    }
    
    public void generarArbol(){
        System.out.println("Padre: "+tabla.nodoPadre.nombre+", Hijo:"+tabla.nodoPadre.getNodosHijo().toString());
        raizArb = tabla.nodoPadre;
        listaNodos = "";
        listaRamas = "";
        x=1;
        for (int i = 0; i < tabla.nodoPadre.getNodosHijo().size(); i++) {
            recorrerSimbolos(tabla.nodoPadre.getNodosHijo().get(i));
        }
        //recorrerSimbolos(raizArb);
        recorerArbol(raizArb);
        salida = "digraph dot\n{\n";
        salida += listaNodos;
        salida += listaRamas;
        salida += "}";
    }
    
    private void recorrerSimbolos(Nodo hijo){
        if (hijo!=null) {
            if(hijo.nodosHijo.size()>0){
                for (int i = 0; i < hijo.nodosHijo.size(); i++) {
                   recorrerSimbolos(hijo.nodosHijo.get(i));
                }
            }else{
                System.out.println("");
                for (int j = 0; j < tabla.tablaSimbolos.size(); j++) {
                    //System.out.println(hijo.getNombre()+" vs "+tabla.tablaSimbolos.get(j).getNombre());
                    if(tabla.tablaSimbolos.get(j).getNombre().equals(hijo.getNombre())){
                        
                        //System.out.println("Tamanio: ");
                        for (int i = 0; i < tabla.tablaSimbolos.get(j).getRaiz().getNodosHijo().size(); i++) {
                            String txt = tabla.tablaSimbolos.get(j).getRaiz().getNodosHijo().get(i).getTexto();
                            String nm = tabla.tablaSimbolos.get(j).getRaiz().getNodosHijo().get(i).getNombre();
                            //System.out.println(hijo.getNombre()+" -> "+nm);
                            hijo.agregarHijo(new Nodo(txt, nm));
                            
                        }
                        if(hijo.nodosHijo.size()>0){
                            recorrerSimbolos(hijo);
                        }
                    }
                }
                
            }
            
        }
    }
    public void recorerArbol(Nodo raiz){
        if (raiz!=null) {
            listaNodos += "\tnode"+x+"[label=\""+raiz.texto+"\"];\n";
            raiz.setNodoName("node"+x+"[label=\""+raiz.texto+"\"];");
            raiz.setId(x);
            x++;
            if(raiz.getNodosHijo().size()>0){
                for (int i = 0; i < raiz.getNodosHijo().size(); i++) {
                    
                    recorerArbol(raiz.getNodosHijo().get(i));
                    listaRamas += "\tnode"+raiz.getId()+"-> node"+raiz.getNodosHijo().get(i).getId()+"\n";
                    //System.out.println(raiz.nombre+"->"+raiz.getNodosHijo().get(i).nombre);
                }
            }else{
                
            }
        }
    }
    
    public void genearGrafico(){
        crearArchivo(salida,"./arbol.dot");
        try {
            String dotPath = "dot";
          
            String fileInputPath = "./arbol.dot";
            String fileOutputPath = "./arbol.jpg";
             
            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
                          
            Runtime rt = Runtime.getRuntime();
              
            rt.exec( cmd );
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }

    public void crearArchivo(String contenido,String ruta){
        try {
            
            
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mostrar(){

            try {
            Desktop.getDesktop().open(new File("./arbol.jpg"));
        } catch (IOException ex) {
            
        }
    }
    
    
    
}

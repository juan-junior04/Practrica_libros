package practica;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class Libros{
    List<Libros> libro1 = new ArrayList<Libros>();
    private int anio ;
    private String nombre;
    private String autor;
   
    public Libros(int anio, String nombre ,String autor){
        this.anio= anio;
        this.nombre =  nombre;
        this.autor =  autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public String toString() {
        return nombre + " ; " + autor + " ; " + anio; 
    }


    public void Agregar(){
        Libros librodos = new Libros(anio, nombre, autor);
        
        libro1.add(librodos);
    }
    public void Mostrar(){
        for(int i=0; i<libro1.size();i++){
            System.out.println(libro1.get(i).toString());
        }
    }
    
}
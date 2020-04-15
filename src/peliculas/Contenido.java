
package peliculas;

public class Contenido {
    String nombre, director, reseña;
    String año;

    public Contenido(String s, String d, String r, String a) { 
    nombre = s; 
    director = d;
    reseña = r;
    año = a;
                                 } 
//método de la clase object
public String toString(){ 
return ("Nombre: "+nombre+"\nDirector: "+director+"\nReseña: "+reseña+"\nAño: "+año); 
} 
public String getNombre() { 
return this.nombre;
}
}

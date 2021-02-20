
package Clases;


public class Pelicula { //Clase Pelicula.
    
    //Atributos.
    private String Nombre;
    private String Genero;
    private int Duracion;
    private int ValorExposicion;
    private int Indice;
    
    //Constructor.
    public Pelicula(int Indice,String Nombre, String Genero, int Duracion, int ValorExposicion){
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.Duracion = Duracion;
        this.ValorExposicion = ValorExposicion;
        this.Indice = Indice;
        
    }

    //Métodos Getter y Setter para los atributos.
    public int getIndice() {
        return Indice;
    }

    public void setIndice(int Indice) {
        this.Indice = Indice;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public int getValorExposicion() {
        return ValorExposicion;
    }

    public void setValorExposicion(int ValorExposicion) {
        this.ValorExposicion = ValorExposicion;
    }
    
    
    //Método para retornar los datos de UNA sola película y mostrarlos en una ventana emergente (Con saltos de línea).
    public String MostrarDatos(){
        return "\nNombre: "+Nombre+"\nGénero:"+Genero+"\nDuración:"+Duracion+"\nValorExposición:"+ValorExposicion; //Retorna los datos.
    }
    
    //Método para retornar los datos de TODAS las películas con índice y mostrarlos en el txtArea de la GUI (Sin saltos de línea).
    public String MostrarPeliculas(){
        return "[Indice "+Indice+"] -->   Nombre: "+Nombre+"  -->  Género: "+Genero+"  -->  Duración: "+Duracion+"  -->   ValorExposición: "+ValorExposicion+"\n"; //Retorna los datos.
    }
 
 
    
}

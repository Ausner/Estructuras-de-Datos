
package Ventana;

public class Numero { //Clase Numero.
     //Atributos
    int info; //Crea info de tipo entera.
    Numero Siguiente; //Crea Siguiente de tipo Numero.

    
  
    public Numero(int valor) { //Constructor, recibe un valor entero.
        this.info = valor; //Asigna a info lo que contiene la variable valor.
        this.Siguiente = null; //Asigna a Siguiente un valor null.
    }
    
    
    
}

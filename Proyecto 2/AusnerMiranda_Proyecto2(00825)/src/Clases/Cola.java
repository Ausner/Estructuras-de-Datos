package Clases;

import javax.swing.JOptionPane;

public class Cola { //Clase Cola.

    //Atributos.
    private Nodo primerocola, finalcola;
    private String Cola;
    private int tamano;
    private int IngresoTotal;

    //Constructor.
    public Cola() { 
        primerocola = null;
        finalcola = null;
        tamano = 0;
        IngresoTotal = 0;
    }

    //Método para retornar el tamaño de la cola.
    public int cola_size() {
        return tamano; //Retorna el tamaño.
    }

    //Método para saber si la cola está vacía.
    public boolean colavacia() {
        if (primerocola == null) { //Si el primer elemento es nulo.
            return true; //Retorna verdadero.
        } else { //Sino.
            return false; //Retorns falso.
        }
    }

    //Método para vaciar la cola.
    public void vaciarCola() {

        if (!colavacia()) { //Si la cola no está vacía.
            primerocola = null; //Asigna null al primer elemento.
            JOptionPane.showMessageDialog(null, "La cola se ha vaciado"); //Muestra mensaje.
            tamano = 0; //Asigna 0 a tamano.
            IngresoTotal = 0; //Asigna 0 a IngresoTotal.
        } else { //Sino.
            JOptionPane.showMessageDialog(null, "La cola ya esta vacía, no la puede vaciar"); //Muestra mensaje.
        }
    }

    //Método para insertar una película en la cola.
    public void insertar(Pelicula info) {
        Nodo nuevo_nodo = new Nodo(); //Crea objeto nodo.
        nuevo_nodo.informacon = info; //Obtiene la información.
        nuevo_nodo.Siguiente = null; //Asigna el nodo siguiente a null.

        if (colavacia() == true) { //Si la cola está vacía.
            primerocola = nuevo_nodo; //El primer elemento de la cola va a ser el nuevo nodo.
            finalcola = nuevo_nodo; //El último elemento de la cola va a ser el nuevo nodo.
        } else { //Sino.
            finalcola.Siguiente = nuevo_nodo; //El elemento que sigue de la cola va a ser el nuevo nodo.
            finalcola = nuevo_nodo; //El final de la cola va a ser el nuevo nodo.
        }
        tamano++; //Aumenta el tamaño en 1.
    }

    //Método para extraer una película de la cola.
    public Object Extraer() {
        if (!colavacia()) { //Si la cola no está vacía.
            Pelicula informacion = primerocola.informacon; //Crea objeto película.

            if (primerocola == finalcola) { //Si el primer elemento de la cola es igual al último.
                primerocola = null; //El primer elemento será nulo.
                finalcola = null; //El final de la cola será nulo.
                IngresoTotal = 0; //Asigna 0 al IngresoTotal.
            } else { //Sino.
                primerocola = primerocola.Siguiente; //El primero de la cola va a ser el siguiente.
                AcomodarIndices(); //Llama al método AcomodarIndices.
            }
            tamano--; //Disminuye el tamaño en 1.
            return "\tPelicula Extraida:\n" + informacion.MostrarDatos(); //Retorna mensaje.
        } else {//Sino.
            return "LA COLA ESTA VACIA"; //Retorna mensaje.
        }
    }

    //Método para mostrar todas las películas de la cola.
    public Object MostrarPeliculasEnCola() {
        Cola = ""; //Inicializa Cola.
        IngresoTotal=0; //Asigna 0 a IngresoToTal.
        Nodo recorrido = primerocola; //Crea objeto nodo y le asigna el primer elemento de la cola.

        while (recorrido != null) { //Mientras no sea el final de la cola.
            Cola += recorrido.informacon.MostrarPeliculas(); //Asigna las películas a Cola.
            IngresoTotal += recorrido.informacon.getValorExposicion(); //Obtiene el ingreso total.
            recorrido = recorrido.Siguiente; //Pasa al siguiente nodo de la cola.
        }

        return Cola; //Retorna Cola.

    }
    
    //Método para retornar el ingreso.
    public int Ingresos(){
        return IngresoTotal; //Retorna el ingreso.
    }

    //Método para retornar la última película.
    public Object ultima_pelicula() {

        if (!colavacia()) { //Si la cola no está vacía.
            return "Última película en la cola:\n" + finalcola.informacon.MostrarDatos(); //Retorna la última película.
        } else { //Sino.
            return "LA COLA ESTA VACÍA"; //Retorna mensaje.
        }
    }

    //Método para retornar la primer película de la cola.
    public Object primera_pelicula() {
        if (!colavacia()) { //Si la cola no está vacía.
            return "Primera película en la cola:\n" + primerocola.informacon.MostrarDatos(); //Retorna la primera película.
        } else {//Sino.
            return "LA COLA ESTA VACÍA"; //Retorna mensaje.
        }
    }
    


    //Método para obtener una película, por medio de la posición que digite el usuario.
    public Object Obtener_Pelicula(int pos) {

        Nodo Peli = primerocola; //Crea objeto tipo nodo y le asigna el primer elemento de la cola. 
        boolean Encontrado=false; //Variable boolean para buscar el nodo.
        
        while(Peli != null && Encontrado==false){ //Mientras no sea el final de la cola y Encontrado sea igual a falso.
            if(Peli.informacon.getIndice() == pos){ //Si el índice de la película es igual a la posición.
                Encontrado=true; //Encontrado es igual a verdero.
            }else{ //Sino.
                Encontrado=false; //Encontrado es igual a falso.
                Peli = Peli.Siguiente; //Pasa al nodo siguiente.
            }
        }
         
        if(Encontrado==true){ //Si Encontrado es igual a verdadero.
            return Peli.informacon.MostrarDatos(); //Retorna los datos de la película.
        }else{ //Sino.
            return "La pelicula no existe en la cola"; //Retorna mensaje.
        }
        
    }
    
    //Método para acomodar los índices cuando se extrae una película de la cola.
    public void AcomodarIndices(){
        Nodo PeliculaIndice = primerocola; //Crea objeto nodo y le asigna el primer elemento de la cola.
        while(PeliculaIndice != null){ //Mientras no sea el final de la cola.
          int indice =  PeliculaIndice.informacon.getIndice(); //Asigna el índice de la película a la variable indice.
          PeliculaIndice.informacon.setIndice(indice-1); //Modifica el índice de la pelicula restandole uno.
          PeliculaIndice = PeliculaIndice.Siguiente; //Pasa al siguiente nodo.
        }
        
    }
     
    
  

}

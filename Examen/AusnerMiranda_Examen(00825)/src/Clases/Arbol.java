package Clases;

//Librería utilizada.
import javax.swing.JPanel;

public class Arbol { //Clase Arbol.

    //Atributos.
    Nodo Raiz; //Raiz de tipo nodo.
    public String Recorrido = ""; //Recorrido tipo String para guardar los recorridos (InOrden, PreOrden y PostOrden).

    //Constructor.
    public Arbol() {
        Raiz = null; //Inicia con la raíz apuntando a nulo.
    }

    //Método get de la raíz
    public Nodo getRaiz() {
        return Raiz;
    }


    //Método para insertar un nodo en el árbol
    public void InsertarNodo(int Numero) {
        LimpiarCadena(); //Llama al método LimpiarCadena.
        Nodo NuevoNodo = new Nodo(Numero); //Crea objeto Nodo y le asigna el número recivido por el método.
        if (Raiz == null) { //Si la raíz es nula.
            Raiz = NuevoNodo; //La raíz es el NuevoNodo.
        } else { //Sino.
            Nodo Aux = Raiz; //Crea Nodo auxiliar y le asigna el mismo valor de la raíz.
            Nodo Padre; //Crea Nodo Padre.
            
            while (true) { //Bucle para insertar el nodo en el lugar correcto.
                Padre = Aux; //Asigna el valor de Aux a Padre.
                if (Numero < Aux.Numero) { //Si el número es menor al auxiliar.
                    Aux = Aux.HijoIzq; //Se va por el lado izquierdo.
                    if (Aux == null) { //Si Aux es nulo.
                        Padre.HijoIzq = NuevoNodo; //Inserta el nodo en el hijo izquierdo.
                        return; //Sale.
                    }
                } else { //Sino.
                    Aux = Aux.HijoDer; //Aux es igual al hijo derecho.
                    if (Aux == null) { //Si Auxiliar es nulo.
                        Padre.HijoDer = NuevoNodo; //Inserta el nodo en el hijo derecho.
                        return; //Sale.
                    }
                }
            }

        }
    }

    //Método para saber si el árbol está vacío.
    public boolean ArbolVacio() {
        return Raiz == null; //Retorna verdadero o falso si la raiz es igual a nulo.
    }

    //Método para limpiar la cadena Recorrido que guarda los recorridos (InOrden, PreOrden, PostOrden).
    public void LimpiarCadena() { 
        Recorrido = ""; //Limpia la cadena Recorrido.
    }

    //Método para hacer el ordenamiento InOrden y retornarlo.
    public String Recorrido_InOrden(Nodo raizArbol) {
        if (raizArbol != null) { //Si la raíz del árbol es diferente de nula.
            Recorrido_InOrden(raizArbol.HijoIzq); //Se invoca a si mismo pero con el argumento raizArbol.HijoIzq.
            Recorrido += raizArbol.Numero + "   "; //Guarda el nodo actual en la cadena Recorrido.
            Recorrido_InOrden(raizArbol.HijoDer); //Se invoca a si mismo pero con el argumento raizArbol.HijoDer.
        }
        return Recorrido; //Retorna la cadena Recorrido.
    }

    //Método para hacer el ordenamiento PreOrden y retornarlo.
    public String Recorrido_PreOrden(Nodo raizArbol) {
        if (raizArbol != null) { //Si la raíz del árbol es diferente de nula.
            Recorrido += raizArbol.Numero + "   ";  //Guarda el nodo actual en la cadena Recorrido.
            Recorrido_PreOrden(raizArbol.HijoIzq); //Se invoca a si mismo pero con el argumento raizArbol.HijoIzq.
            Recorrido_PreOrden(raizArbol.HijoDer); //Se invoca a si mismo pero con el argumento raizArbol.HijoDer.
        }
        return Recorrido; //Retorna la cadena Recorrido.
    }

    //Método para hacer el ordenamiento PostOrden y retornarlo.
    public String Recorrido_PostOrden(Nodo raizArbol) {
        if (raizArbol != null) {  //Si la raíz del árbol es diferente de nula.
            Recorrido_PostOrden(raizArbol.HijoIzq);  //Se invoca a si mismo pero con el argumento raizArbol.HijoIzq.
            Recorrido_PostOrden(raizArbol.HijoDer); //Se invoca a si mismo pero con el argumento raizArbol.HijoDer.
            Recorrido += raizArbol.Numero + "   "; //Guarda el nodo actual en la cadena Recorrido.
        }
        return Recorrido; //Retorna la cadena Recorrido.
    }

    //Método para limpiar el árbol.
    public void limpiar_arbol() { 
        LimpiarCadena(); //Llama al método LimpiarCadena.
        Raiz = null; //Apunta la raíz a nulo.
    }

    //Método para obtener el gráfico del arbol.
    public JPanel ArbolGrafico() {
        return new CrearGraficoDelArbol(this); //Retorna un objeto de la clase CrearGraficoDelArbol.
    }

}

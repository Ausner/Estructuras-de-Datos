
package Ventana; 

public class Pila { //Clase Pila
  //Atributos. 
  private Numero UltimoValorIngresado; //Crea UltimoValorIngresado de tipo Numero.
  int tamano = 0; //Crea tamano para luego retornar el tamaño de la pila.
  String Lista = ""; //Crea un String para luego retornarlo con los valores de la pila.
  
  
  public Pila(){ //Constructor de la clase Pila.
      UltimoValorIngresado = null;
      tamano = 0;
  }
  
  public boolean PilaVacia(){ //Método para saber si la pila está vacía.
      return UltimoValorIngresado == null;
  }
  
  public void Push(int Numero){ //Método para insertar un número en la pila.
      Numero nuevo_numero = new Numero(Numero);
      nuevo_numero.Siguiente = UltimoValorIngresado;
      UltimoValorIngresado = nuevo_numero;
      tamano++;
  }
  
  public int Pop(){ //Método para extraer un número de la pila.
      int aux = UltimoValorIngresado.info;
      UltimoValorIngresado = UltimoValorIngresado.Siguiente;
      tamano--;
      
      return aux;
  }
  
  public int Peek(){ //Método para obtener el último número ingresado en la pila.
      return UltimoValorIngresado.info;
  }
  
  public int Pila_Size(){ //Método para obtener el tamaño de la pila.
      return tamano;
  }
  
  public void Pila_Clear(){ //Método para limpiar(vaciar) la pila.
      while (!PilaVacia()){
          Pop();
      }
  }
  public String Show_Pila(){ //Método para mostrar la pila.
      Lista = "";
      Numero recorrido = UltimoValorIngresado;
      
      
      while(recorrido != null){
          Lista += "\t"+recorrido.info + "\n";
          recorrido = recorrido.Siguiente;
      }
      return Lista;
  }
}

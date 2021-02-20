
package Paquete1;

public class Pila {
    
   //Atributos
    private int nDiscos = 0; 
    private Disco Primero;

    
    //Métodos Getter para los dos Atributos
    public int getnDiscos() {
        return nDiscos;
    }

    public Disco getPrimero() {
        return Primero;
    }
    
    //Método Push para agregar un disco a la pila
    public void Push(Disco N){
        nDiscos++; //Suma 1 al número de discos
        if(Primero == null){ //Si hay un disco cabeza en la pila
            Primero = N; 
        }else{ //Conecta el nuevo disco al ya existente
            N.setAbajo(Primero); 
            Primero.setArriba(N);
            
            Primero = N;
        }
    }
    
    // Método Pop para eliminar un disco de la pila
    public void Pop(){ 
        if(nDiscos > 0){ //Si hay discos
            nDiscos--; //Disminuye la cantidad de discos de la pila
            
            Primero = Primero.getAbajo();
        }
    }
    
    //Método Peek para retornar el primer disco de la pila
    public String Peek(){ 
        return Primero.getDato();
    }
}

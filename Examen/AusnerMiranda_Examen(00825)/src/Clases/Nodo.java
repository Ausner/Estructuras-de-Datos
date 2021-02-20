package Clases;

public class Nodo { //Clase Nodo.

    //Atributos.
    int Numero;
    Nodo HijoIzq, HijoDer;

    //Constructor.
    public Nodo(int Numero) {
        this.Numero = Numero;
        this.HijoIzq = null;
        this.HijoDer = null;
    }

    //Métodos Getter y Setter de los atributos.
    public String getNumero() {
        String Num = "";
        Num += Numero;
        return Num;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Nodo getHijoIzq() {
        return HijoIzq;
    }

    public void setHijoIzq(Nodo HijoIzq) {
        this.HijoIzq = HijoIzq;
    }

    public Nodo getHijoDer() {
        return HijoDer;
    }

    public void setHijoDer(Nodo HijoDer) {
        this.HijoDer = HijoDer;
    }

}

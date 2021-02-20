package Clases;

//Librerías usadas.
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class CrearGraficoDelArbol extends JPanel { //Clase CrearGraficoDelArbol hereda de Jpanel.

    //Atributos.
    private Arbol Arbol_Binario;
    private HashMap UbicacionDeLosNodos = null;
    private HashMap TamSubarbol = null;
    private FontMetrics MedidasFuente = null;
    private boolean ArbolDesordenado = true;
    private int NodoPadre_NodoHijo = 20, NodoHijo_NodoHijo = 30;
    private Dimension DimVacia = new Dimension(0, 0);

    //Constructor.

    public CrearGraficoDelArbol(Arbol Arbol_Binario) {
        this.Arbol_Binario = Arbol_Binario; //Iguala el atributo Arbol_Binario con el parámetro recibido.
        this.setBackground(Color.BLACK); //Coloca el fondo negro.
        this.setForeground(Color.GREEN); //Coloca el color de letra verde.
        UbicacionDeLosNodos = new HashMap(); //Instancia el objeto UbicacionDeLosNodos de HashMap.
        TamSubarbol = new HashMap(); //Instancia el objeto TamañoDelSubarbol de HashMap.
        ArbolDesordenado = true; //Asigna true a dirty.
        repaint(); //Llama al método repaint para pintar el árbol.
    }

    //Método para calcular las posiciones de los nodos en cada subarbol.
    private void UbicarNodos() {
        UbicacionDeLosNodos.clear(); //Limpia a UbicacionDeLosNodos.
        TamSubarbol.clear(); //Limpia a TamañoDelSubarbol.
        Nodo Raiz = this.Arbol_Binario.getRaiz(); //Crea Nodo Raiz y le asigna la raíz del árbol.
        if (Raiz != null) {//Si la raíz es diferente de nulo.
            TamañoDelSubarbol(Raiz); //Llama al método TamañoDelSubarbol y le envía a Raiz.
            CalculoDeLaPosicion(Raiz, Integer.MAX_VALUE, Integer.MAX_VALUE, 0); //Llama al método CalculoDeLaPosicion.
        }
    }

    //Método para calcular donde se van a ubicar los nodos dentro de un rectangulo.
    private void CalculoDeLaPosicion(Nodo nodo, int Izq, int Der, int Arr) {
        if (nodo == null) { //Si nodo es igual a nulo.
            return; //Sale.
        }

        Dimension Izquierda = (Dimension) TamSubarbol.get(nodo.getHijoIzq()); //Crea dimensión Izquierda y asigna el tamaño del subarbol izquierdo.
        if (Izquierda == null) { //Si Izquierda es igual a nulo.
            Izquierda = DimVacia; //Asigna DimVacia a Izquierda.
        }

        Dimension Derecha = (Dimension) TamSubarbol.get(nodo.getHijoDer()); //Crea dimensión Derecha y asigna el tamaño del subarbol Derecho.
        if (Derecha == null) { //Si Derecha es igual a nulo.
            Derecha = DimVacia; //Asigna DimVacia a Derecha.
        }

        int mitad = 0;  //Crea variable mitad de tipo entero y la inicializa en 0.

        if (Der != Integer.MAX_VALUE) { //Si Derecha es diferente del valor máximo.
            mitad = Der - Derecha.width - NodoHijo_NodoHijo / 2; //Se calcula la ublicación y se almacena en Mitad.
        } else if (Izq != Integer.MAX_VALUE) { //Si Izquierda es diferente del valor máximo.
            mitad = Izq + Izquierda.width + NodoHijo_NodoHijo / 2; //Se calcula la ublicación y se almacena en Mitad.
        }
        int Ancho = MedidasFuente.stringWidth(nodo.getNumero() + ""); //Obtiene el ancho de la fuente del nodo.

        UbicacionDeLosNodos.put(nodo, new Rectangle(mitad - Ancho / 2 - 3, Arr, Ancho + 6, MedidasFuente.getHeight())); //Agrega el nodo y un Rectangulo con la información y ubicación dónde será ubicado al ser dibujado al objeto UbicaciónDeLosNodos.

        CalculoDeLaPosicion(nodo.getHijoIzq(), Integer.MAX_VALUE, mitad - NodoHijo_NodoHijo / 2, Arr + MedidasFuente.getHeight() + NodoPadre_NodoHijo); //El método se llama a si mismo para hallar la posición del nodo Izquierdo.
        CalculoDeLaPosicion(nodo.getHijoDer(), mitad + NodoHijo_NodoHijo / 2, Integer.MAX_VALUE, Arr + MedidasFuente.getHeight() + NodoPadre_NodoHijo); //El método se llama a si mismo para hallar la posición del nodo Derecho.
    }

    //Método para medir el tamaño de los subarboles.
    private Dimension TamañoDelSubarbol(Nodo nodo) {
        if (nodo == null) { //Si el nodo es igual a nulo.
            return new Dimension(0, 0); //Retorna una nueva dimension.
        }

        Dimension Izquierda = TamañoDelSubarbol(nodo.getHijoIzq()); //Obtiene el tamaño del subarbol izquierdo.
        Dimension Derecha = TamañoDelSubarbol(nodo.getHijoDer()); //Obtiene el tamaño del subarbol derecho.

        int Altura = MedidasFuente.getHeight() + NodoPadre_NodoHijo + Math.max(Izquierda.height, Derecha.height); //Obtiene la altura.
        int Ancho = Izquierda.width + NodoHijo_NodoHijo + Derecha.width; //Obtiene el ancho.

        Dimension dim = new Dimension(Altura, Ancho); //Crea una nueva dimensión con la altura y el ancho obtenidos.
        TamSubarbol.put(nodo, dim); //Agrega el nodo y la dimensión al objeto TamSubarbol de la clase HashMap.

        return dim; //Retorna la dimensión.
    }

    //Método sobreescrito que pinta el arbol binario.
    @Override
    public void paint(Graphics g) {
        super.paint(g); //Hereda g.
        MedidasFuente = g.getFontMetrics(); //Obtiene las medidas de la fuente.

        if (ArbolDesordenado) { //Si el árbol está desordenado.
            UbicarNodos(); //Llama al método Ubicar Nodos.
            ArbolDesordenado = false; //Asigna falso a ArbolDesordenado.
        }

        Graphics2D g2d = (Graphics2D) g; //Asigna a el objeto g2d el valor del objeto g.
        g2d.translate(getWidth() / 2, NodoPadre_NodoHijo); //Obtiene la mitad del ancho y la medida entre el Nodo padre y el Nodo hijo.
        Dibujar(g2d, this.Arbol_Binario.getRaiz(), Integer.MAX_VALUE, Integer.MAX_VALUE, //Llama al método dibujar árbol.
                MedidasFuente.getLeading() + MedidasFuente.getAscent()); //Suma las medidas de la fuente.
        MedidasFuente = null; //Asigna nulo a la medida de la fuente.
    }

    //Método encargado de dibujar el árbol con las ubicaciones de los nodos halladas.
    private void Dibujar(Graphics2D g, Nodo nodo, int X, int Y, int Alt) {
        if (nodo == null) { //Si el nodo es igual a nulo.
            return; //Sale.
        }

        Rectangle r = (Rectangle) UbicacionDeLosNodos.get(nodo); //Crea objeto Rectangulo, donde obtiene el nodo y su ubicacion.
        g.draw(r); //Dibuja al objeto r.

        g.drawString(nodo.getNumero() + "", r.x + 3, r.y + Alt); //Obtiene el número del nodo y lo dibuja.
        g.setColor(Color.yellow); //Coloca el color amarillo para dibujar.
        if (X != Integer.MAX_VALUE) { //Si la posición en X es diferente de el valor máximo.
            g.drawLine(X, Y, (int) (r.x + r.width / 2), r.y); //Dibuja una línea para unir los nodos hijos con los nodos padre.
        }
        g.setColor(Color.RED); //Coloca el color verde para dibujar.
        Dibujar(g, nodo.getHijoIzq(), (int) (r.x + r.width / 2), r.y + r.height, Alt); //El método se llama a si mismo para dibujar el nodo izquierdo.
        g.setColor(Color.BLUE); //Coloca el color Azul para dibujar.
        Dibujar(g, nodo.getHijoDer(), (int) (r.x + r.width / 2), r.y + r.height, Alt); //El método se llama a si mismo para dibujar el nodo derecho.
    }

}

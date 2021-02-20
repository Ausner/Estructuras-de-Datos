/*
 Universidad Estatal a Distancia de Costa Rica

 Proyecto 1 de Estructuras de Datos Código(00825)
 Tema: Métodos de ordenamiento

 Estudiante: Ausner David Miranda Sibaja
 Cédula: 0604630638
 Grupo: 01

 Primer Cuatrimestre 2020
 */
package Ventana;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    float[] numeros = new float[999]; //Se crea el vector numeros como global.
    float[] Burbuja = new float[999]; //Se crea el vector Burbuja como global. 
    float[] Quicksort = new float[999]; //Se crea el vector Quicksort como global.
    float[] Shellsort = new float[999]; //Se crea el vector Shellsort como global.
    DefaultListModel lista = new DefaultListModel();
    DefaultListModel lBurbuja = new DefaultListModel();
    DefaultListModel lShellsort = new DefaultListModel();
    DefaultListModel lQuicksort = new DefaultListModel();

    public VentanaPrincipal() {

        initComponents();
        this.setTitle("Tiempos de los Métodos de Ordenamiento"); //Asigna el titulo a la ventana.
        this.setLocationRelativeTo(null); //Coloca la ventana en el centro de la pantalla.

    }

    public void copiarnumeros() { //Método copiarnumeros.

        for (int i = 0; i < numeros.length; i++) {
            Burbuja[i] = numeros[i]; //Copia los valores del arreglo numeros al arreglo Burbuja.
            Quicksort[i] = numeros[i]; //Copia los valores del arreglo numeros al arreglo Quicksort.
            Shellsort[i] = numeros[i]; //Copia los valores del arreglo numeros al arreglo Shellsort.
        }
    } //Fin método copiarnumeros

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBurbuja = new javax.swing.JButton();
        btnShellsort = new javax.swing.JButton();
        btnQuicksort = new javax.swing.JButton();
        txtBurbuja = new javax.swing.JTextField();
        txtShellsort = new javax.swing.JTextField();
        txtQuicksort = new javax.swing.JTextField();
        btnGenerarNumeros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnumeros = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstaQuicksort = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstaBurbuja = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lsta1 = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstaShellsort = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        btnBurbuja.setBackground(new java.awt.Color(153, 51, 0));
        btnBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        btnBurbuja.setText("Método Burbuja");
        btnBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBurbujaActionPerformed(evt);
            }
        });

        btnShellsort.setBackground(new java.awt.Color(153, 0, 153));
        btnShellsort.setForeground(new java.awt.Color(255, 255, 255));
        btnShellsort.setText("Método Shellsort");
        btnShellsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShellsortActionPerformed(evt);
            }
        });

        btnQuicksort.setBackground(new java.awt.Color(0, 102, 153));
        btnQuicksort.setForeground(new java.awt.Color(255, 255, 255));
        btnQuicksort.setText("Método Quicksort");
        btnQuicksort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuicksortActionPerformed(evt);
            }
        });

        txtBurbuja.setEditable(false);
        txtBurbuja.setBackground(new java.awt.Color(153, 51, 0));
        txtBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        txtBurbuja.setFocusable(false);

        txtShellsort.setEditable(false);
        txtShellsort.setBackground(new java.awt.Color(153, 0, 153));
        txtShellsort.setForeground(new java.awt.Color(255, 255, 255));
        txtShellsort.setFocusable(false);

        txtQuicksort.setEditable(false);
        txtQuicksort.setBackground(new java.awt.Color(0, 102, 153));
        txtQuicksort.setForeground(new java.awt.Color(255, 255, 255));
        txtQuicksort.setFocusable(false);

        btnGenerarNumeros.setBackground(new java.awt.Color(153, 153, 0));
        btnGenerarNumeros.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerarNumeros.setText("Generar 999 números");
        btnGenerarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNumerosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tiempos de ejecución de los métodos de  ordenamiento");

        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Tiempo de ejecución:");

        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Tiempo de ejecución:");

        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("Tiempo de ejecución:");

        txtnumeros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtnumeros.setForeground(new java.awt.Color(255, 255, 255));
        txtnumeros.setText("Números generados:");

        lstaQuicksort.setBackground(new java.awt.Color(0, 102, 153));
        lstaQuicksort.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(lstaQuicksort);

        lstaBurbuja.setBackground(new java.awt.Color(153, 51, 0));
        lstaBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(lstaBurbuja);

        lsta1.setBackground(new java.awt.Color(153, 153, 0));
        lsta1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(lsta1);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Burbuja:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Shellsort:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quicksort:");

        lstaShellsort.setBackground(new java.awt.Color(153, 0, 153));
        lstaShellsort.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(lstaShellsort);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnShellsort, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuicksort))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtQuicksort, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtShellsort, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnGenerarNumeros)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnumeros)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumeros)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGenerarNumeros)
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBurbuja)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShellsort)
                            .addComponent(txtShellsort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuicksort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuicksort)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBurbujaActionPerformed

        if (lista.isEmpty()) { //Valida si no hay números generados.
            JOptionPane.showMessageDialog(null, "No hay números generados"); //Muestra una ventana emergente.
        } else {

            
            long inicio = (System.nanoTime());
            Oburbuja();//Llama al método burbuja
            long fin =(System.nanoTime());
            double TBurbuja = (fin - inicio)*1.0e-6; //Asigna el tiempo total transcurrido en la ejecución del algoritmo en milisegundos.
            String time = Double.toString(TBurbuja); //Convierte el tiempo en String y lo asigna a la variable time.
            txtBurbuja.setText(time + " ms"); //Muestra el tiempo en la interfaz gráfica.

            lBurbuja.removeAllElements(); //Limpia la lista.
            lstaBurbuja.setModel(lBurbuja); //Asigna el modelo.

            for (int i = 0; i < Burbuja.length; i++) { //Recorre el arreglo Burbuja.
                lBurbuja.addElement((i + 1) + ")   " + Burbuja[i]); //Agrega los números a la lista.
                lstaBurbuja.setModel(lBurbuja); //Asigna el modelo.
            }
        }


    }//GEN-LAST:event_btnBurbujaActionPerformed

    public void Oburbuja() { //Método para ordenar por burbuja
        float aux; //Variable auxiliar para el método burbuja.
        for (int i = 0; i < (Burbuja.length) - 1; i++) { //Bucle para las veces que debe entrar.
            for (int j = 0; j < (Burbuja.length) - 1; j++) { //Bucle para recorrer el arreglo.
                if (Burbuja[j] > Burbuja[j + 1]) { //Si el número actual es mayor que el número siguiente.
                    aux = Burbuja[j]; //Asigna el número actual a la variable Aux.
                    Burbuja[j] = Burbuja[j + 1]; //Asigna el número siguiente al número actual.
                    Burbuja[j + 1] = aux; //Asigna al número siguiente el valor de la variable Aux.
                }
            }

        }
    }


    private void btnShellsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShellsortActionPerformed

        if (lista.isEmpty()) { //Valida si no hay números generados.
            JOptionPane.showMessageDialog(null, "No hay números generados"); //Muestra una ventana emergente.
        } else {
            long inicio = System.nanoTime(); //Crea la variable inicio y asigna el tiempo de ejecución.
            Oshellsort(); //Llama al método Oshellsort
            long fin = (System.nanoTime());
            double TShellsort = (fin - inicio)*1.0e-6; //Asigna el tiempo total transcurrido en la ejecución del algoritmo en milisegundos.
            String time = Double.toString(TShellsort); //Convierte el tiempo en String y lo asigna a la variable time.
            txtShellsort.setText(time + " ms"); //Muestra el tiempo en la interfaz gráfica.

            lShellsort.removeAllElements(); //Limpia la lista.
            lstaShellsort.setModel(lShellsort); //Asigna el modelo.

            for (int j = 0; j < Shellsort.length; j++) { //Recorrel el arreglo Shellsort.
                lShellsort.addElement((j + 1) + ")   " + Shellsort[j]); //Agrega los números a la lista.
                lstaShellsort.setModel(lShellsort); //Asigna el modelo.
            }
        }

    }//GEN-LAST:event_btnShellsortActionPerformed

    public void Oshellsort() { //Método para ordenar por shellsort.
        int incremento = 0, i = 0;  //Crea las variables incremento y la varibale i como enteros.
        float aux = 0; //Crea la variable auxiliar para el método de ordenación Shellsort.
        boolean cambio; //Crea la variable cambio de tipo boolean.
        for (incremento = Shellsort.length / 2; incremento != 0; incremento /= 2) { //Recorre el arreglo y divide en 2 cada arreglo.

            cambio = true; //Asigna el valor de verdadero a la variable cambio

            while (cambio) { //Mienntras cambio sea verdadero
                cambio = false; //Asigna el valor de falso a la variable cambio
                for (i = incremento; i < Shellsort.length; i++) { //Recorre el arreglo

                    if (Shellsort[i - incremento] > Shellsort[i]) { //Si el número - el incremento es mayor al número actual.
                        aux = Shellsort[i]; //Asigna el numero actual a la variable aux
                        Shellsort[i] = Shellsort[i - incremento]; //Asigna el número anterior
                        Shellsort[i - incremento] = aux; //Asigna el valor de la variable aux al número - incremento
                        cambio = true; //Asigna el valor de verdadero a la variable cambio
                    }
                }

            }
        }
    }


    private void btnQuicksortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuicksortActionPerformed

        if (lista.isEmpty()) { //Valida si no hay números generados.
            JOptionPane.showMessageDialog(null, "No hay números generados"); //Muestra una ventana emergente.
        } else {
            long inicio = System.nanoTime(); //Crea la variable inicio y asigna el tiempo de ejecución.
            Quicksort = OrdenamientoQuickSort(Quicksort, 0, Quicksort.length - 1); //Llama al método OrdenamientoQuicksort y el valor retornado lo asigna a numeros
            long fin = (System.nanoTime());
            double TQuicksort = (fin - inicio)*1.0e-6; //Asigna el tiempo total transcurrido en la ejecución del algoritmo en milisegundos.
            String time = Double.toString(TQuicksort); //Convierte el tiempo en String y lo asigna a la variable time.
            txtQuicksort.setText(time + " ms"); //Muestra el tiempo en la interfaz gráfica.

            lQuicksort.removeAllElements(); //Remueve todos los elementos de la lista.
            lstaQuicksort.setModel(lQuicksort); //Asigna el modelo.

            for (int i = 0; i < Quicksort.length; i++) { //Recorre el arreglo Quicksort.
                lQuicksort.addElement((i + 1) + ")   " + Quicksort[i]); //Agrega los numeros del arreglo al JList.
                lstaQuicksort.setModel(lQuicksort); //Asigna el modelo.
            }
        }
    }//GEN-LAST:event_btnQuicksortActionPerformed

    private void btnGenerarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNumerosActionPerformed

        generarnumeros(); //Llama al método generarnumeros

    }//GEN-LAST:event_btnGenerarNumerosActionPerformed

    public void generarnumeros() { //Método generarnumeros.
        lBurbuja.removeAllElements(); //Remueve todos los números de la lista.
        lShellsort.removeAllElements(); //Remueve todos los números de la lista.
        lQuicksort.removeAllElements(); //Remueve todos los números de la lista.
        txtBurbuja.setText(null);//Limpia el espacio.
        txtShellsort.setText(null);//Limpia el espacio.
        txtQuicksort.setText(null);//Limpia el espacio.

        for (int i = 0; i < numeros.length; i++) { //Recorre el arreglo numeros.
            double azar = Math.random() * (2001); //Asigna un número al azar entre 0 y 2000 a la variable azar.
            numeros[i] = (float) azar; //Asigna el valor de Azar a la posición i del vector.
        }

        lista.removeAllElements(); //Remueve todos los números de la lista.
        lsta1.setModel(lista); //Asigna el modelo

        for (int i = 0; i < numeros.length; i++) { //Recorre el vector numeros.
            lista.addElement((i + 1) + ")   " + numeros[i]); //Agrega los números a la lista.
            lsta1.setModel(lista); //Asigna el modelo.
        }

        copiarnumeros(); //LLama al método copiarnumeros.
    }

    public static float[] OrdenamientoQuickSort(float Quicksort[], int izquierda, int derecha) { //Método OrdenamientoQuicksort.

        if (izquierda >= derecha) { //Si la primer posición del arreglo numeros es mayor a la ultima.
            return Quicksort; //Retorna el arreglo Quicsort.
        }

        int i = izquierda; //Asigna a la variable i el valor de izquierda.
        int d = derecha; //Asigna a la variable d el valor de derecha.

        if (izquierda != derecha) { //Si izquierda es diferente de derecha.
            int pivote; //Crea la variable pivote como entero.
            float aux; //Crea la variable aux como flotante, para el ordenamiento por Quicksort.
            pivote = izquierda; //Asigna a la variable pivote el valor de la variable izquierda.
            while (izquierda != derecha) { //Mientras izquierda sea diferente de derecha.
                while (Quicksort[derecha] >= Quicksort[pivote] && izquierda < derecha) { //Mientras los números de la derecha del pivote sean mayores o iguales al pivote y que izquierda sea menor que derecha. 
                    derecha--; //Disminuye a derecha.
                }
                while (Quicksort[izquierda] < Quicksort[pivote] && izquierda < derecha) { //Mientras los números de la izquierda del pivote sean menores al pivote y que izquierda sea menor que derecha.
                    izquierda++; //Aumenta a izquierda.
                }

                if (derecha != izquierda) { //Si derecha es diferente de izquierda.
                    aux = Quicksort[derecha]; //Asigna a la variable aux el número de la derecha.
                    Quicksort[derecha] = Quicksort[izquierda]; //Asigna a la posición del número de la derecha el de la izquierda.
                    Quicksort[izquierda] = aux; //Asigna a la posición del número de la izquierda el valor almacenado en la varibale aux.
                }

                if (izquierda == derecha) { //Si izquierda es igual a derecha
                    OrdenamientoQuickSort(Quicksort, i, izquierda - 1); //Utiliza la recursión y se invoca a si mismo cambiando sus parámetros.
                    OrdenamientoQuickSort(Quicksort, izquierda + 1, d); //Utiliza la recursión y se invoca a si mismo cambiando sus parámetros.
                }

            }//Fin primer while    

        }//Fin if   
        else { //Sino

            return Quicksort; //Retorna el arreglo Quicksort.
        }

        return Quicksort; //Retorna el arreglo Quicksort.
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true); //Hace visible la ventana.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBurbuja;
    private javax.swing.JButton btnGenerarNumeros;
    private javax.swing.JButton btnQuicksort;
    private javax.swing.JButton btnShellsort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList lsta1;
    private javax.swing.JList lstaBurbuja;
    private javax.swing.JList lstaQuicksort;
    private javax.swing.JList lstaShellsort;
    private javax.swing.JTextField txtBurbuja;
    private javax.swing.JTextField txtQuicksort;
    private javax.swing.JTextField txtShellsort;
    private javax.swing.JLabel txtnumeros;
    // End of variables declaration//GEN-END:variables
}

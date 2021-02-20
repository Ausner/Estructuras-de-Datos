/*
 Universidad Estatal a Distancia de Costa Rica

 Proyecto 2 de Estructuras de Datos Código(00825)
 Tema: Colas en Java.

 Estudiante: Ausner David Miranda Sibaja
 Cédula: 0604630638
 Grupo: 01

 Primer Cuatrimestre 2020
 */
package Clases;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame { //Clase Ventana.

    private String Nombre; //Variable para guardar el nombre de la película.
    private String Genero; //Variable para guardar el género de la película.
    private int Duracion = 0; //Variable para guardar la duración de la película.
    private int ValorExposicion = 0; //Variable para guardar el valor de Exposición de la película.

    Cola cola = new Cola(); //Crea objeto de la clase Cola.

    //Constructor.
    public Ventana() {
        initComponents(); //Inicializa los componentes.
        this.setTitle("Ausner Miranda - Proyecto 2"); //Asigna un título a la ventana.
        txtIngresos.setText("$  " + Integer.toString(cola.Ingresos())); //Coloca el valor de ingresos en la GUI.
        txtArea.setText("\t\t\tCARTELERA\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtValorExposicion = new javax.swing.JTextField();
        btnExtraer = new javax.swing.JButton();
        btnPrimerPelicula = new javax.swing.JButton();
        btnUltimaPelicula = new javax.swing.JButton();
        btnObtenerPelicula = new javax.swing.JButton();
        btnEstaVacia = new javax.swing.JButton();
        btnTamano = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnVaciarCola = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtIngresos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBorrarCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Género:");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Comedia", "Drama", "Terror", "Infantiles", "Acción" }));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Duración:");

        txtDuracion.setEditable(false);
        txtDuracion.setBackground(new java.awt.Color(51, 51, 51));
        txtDuracion.setForeground(new java.awt.Color(255, 255, 255));

        btnInsertar.setBackground(new java.awt.Color(153, 0, 0));
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setText("Insertar Película");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor de Exposición:");

        txtValorExposicion.setEditable(false);
        txtValorExposicion.setBackground(new java.awt.Color(51, 51, 51));
        txtValorExposicion.setForeground(new java.awt.Color(255, 255, 255));

        btnExtraer.setBackground(new java.awt.Color(153, 0, 51));
        btnExtraer.setForeground(new java.awt.Color(255, 255, 255));
        btnExtraer.setText("Extraer Película");
        btnExtraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtraerActionPerformed(evt);
            }
        });

        btnPrimerPelicula.setBackground(new java.awt.Color(153, 0, 51));
        btnPrimerPelicula.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimerPelicula.setText("Primer Película");
        btnPrimerPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimerPeliculaActionPerformed(evt);
            }
        });

        btnUltimaPelicula.setBackground(new java.awt.Color(153, 0, 51));
        btnUltimaPelicula.setForeground(new java.awt.Color(255, 255, 255));
        btnUltimaPelicula.setText("Última Película");
        btnUltimaPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimaPeliculaActionPerformed(evt);
            }
        });

        btnObtenerPelicula.setBackground(new java.awt.Color(153, 0, 51));
        btnObtenerPelicula.setForeground(new java.awt.Color(255, 255, 255));
        btnObtenerPelicula.setText("Obtener Película");
        btnObtenerPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerPeliculaActionPerformed(evt);
            }
        });

        btnEstaVacia.setBackground(new java.awt.Color(102, 0, 51));
        btnEstaVacia.setForeground(new java.awt.Color(255, 255, 255));
        btnEstaVacia.setText("¿La cola está vacía?");
        btnEstaVacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstaVaciaActionPerformed(evt);
            }
        });

        btnTamano.setBackground(new java.awt.Color(102, 0, 51));
        btnTamano.setForeground(new java.awt.Color(255, 255, 255));
        btnTamano.setText("Tamaño de la cola");
        btnTamano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamanoActionPerformed(evt);
            }
        });

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(51, 51, 51));
        txtArea.setColumns(20);
        txtArea.setForeground(new java.awt.Color(255, 255, 255));
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnVaciarCola.setBackground(new java.awt.Color(102, 0, 51));
        btnVaciarCola.setForeground(new java.awt.Color(255, 255, 255));
        btnVaciarCola.setText("Vaciar Cola");
        btnVaciarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarColaActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inversión Total:");

        txtIngresos.setEditable(false);
        txtIngresos.setBackground(new java.awt.Color(255, 255, 255));
        txtIngresos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtIngresos.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Control De Películas");

        btnBorrarCampos.setBackground(new java.awt.Color(51, 51, 51));
        btnBorrarCampos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBorrarCampos.setForeground(new java.awt.Color(255, 0, 0));
        btnBorrarCampos.setText("X");
        btnBorrarCampos.setToolTipText("Borrar Contenido");
        btnBorrarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBorrarCampos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnExtraer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPrimerPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(btnUltimaPelicula))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtValorExposicion, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(txtDuracion))
                            .addComponent(btnObtenerPelicula)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnEstaVacia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTamano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVaciarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarCampos))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtValorExposicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(btnInsertar)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExtraer)
                    .addComponent(btnPrimerPelicula)
                    .addComponent(btnUltimaPelicula)
                    .addComponent(btnObtenerPelicula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstaVacia)
                    .addComponent(btnTamano)
                    .addComponent(btnVaciarCola))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método del botón para insertar una película.
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        Nombre = txtNombre.getText(); //Obtiene el nombre.

        if (Nombre.equals("")) { //Si el nombre es igual a vacío.
            JOptionPane.showMessageDialog(null, "Debe digitar un nombre..."); //Muestra mensaje.
            btnBorrarCampos.doClick(); //El botón btnBorrarCampos hace click.
        } else { //Sino.
            Genero = (String) cbGenero.getSelectedItem(); //Obtiene el género.
            Duracion = (int) (Math.random() * (60 - 300 + 1) + 300); //Genera aleatoriamente la duración.

            if (Duracion >= 60 && Duracion <= 75) { // Si la duración es mayor o igual a 60 y menor o igual a 75.
                ValorExposicion = 2000; //Asigna el valor de 2000.
            } else if (Duracion >= 76 && Duracion <= 90) { // Si la duración es mayor o igual a 76 y menor o igual a 90.
                ValorExposicion = 2500; //Asigna el valor de 2500.
            } else if (Duracion >= 91 && Duracion <= 180) {// Si la duración es mayor o igual a 91 y menor o igual a 180.
                ValorExposicion = 3000; //Asigna el valor de 3000.
            } else if (Duracion >= 181 && Duracion <= 240) {// Si la duración es mayor o igual a 181 y menor o igual a 240.
                ValorExposicion = 3500; //Asigna el valor de 3500.
            } else if (Duracion >= 241 && Duracion <= 300) {// Si la duración es mayor o igual a 241 y menor o igual a 300.
                ValorExposicion = 4000; //Asigna el valor de 4000.
            }

            Pelicula nuevaPelicula = new Pelicula(cola.cola_size(), Nombre, Genero, Duracion, ValorExposicion); //Crea objeto de la clase Pelicula.
            cola.insertar(nuevaPelicula); //Agrega el objeto a la cola.

            txtArea.setText("\t\t\tCARTELERA\n" + cola.MostrarPeliculasEnCola() + "\n"); //Muestra las peliculas en el txtArea.
            String Stringduracion = Integer.toString(Duracion); //Convierte a String la duración.
            txtDuracion.setText(Stringduracion); //Muestra la duración en la GUI.
            String StringValorExposicion = Integer.toString(ValorExposicion); //Convierte a String el valor de exposición.
            txtValorExposicion.setText(StringValorExposicion); //Muestra el valor de exposición en la GUI.
            txtIngresos.setText("$  " + Integer.toString(cola.Ingresos())); //Muestra los ingresos totales en la GUI.

        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    //Método del botón para extraer una película de la cola.
    private void btnExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtraerActionPerformed
        btnBorrarCampos.doClick(); //Se presiona el botón btnBorrarCampos.
        JOptionPane.showMessageDialog(null, cola.Extraer()); //Muestra la película extraida.
        txtArea.setText("\t\t\tCARTELERA\n" + cola.MostrarPeliculasEnCola() + "\n"); //Muestra las películas que estan en la cola.
        txtIngresos.setText("$  " + Integer.toString(cola.Ingresos())); //Muestra el ingreso total.

    }//GEN-LAST:event_btnExtraerActionPerformed

    //Método del botón para saber si la cola está vacía.
    private void btnEstaVaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstaVaciaActionPerformed
        if (cola.colavacia() == true) { //Si la cola vacia es verdadero.
            JOptionPane.showMessageDialog(null, "La cola si está vacía"); //Muestra mensaje.
        } else { //Sino.
            JOptionPane.showMessageDialog(null, "La cola no está vacía"); //Muestra mensaje.
        }
    }//GEN-LAST:event_btnEstaVaciaActionPerformed

    //Método del botón para saber el tamaño de la cola.
    private void btnTamanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamanoActionPerformed
        JOptionPane.showMessageDialog(null, "El tamaño de la cola es de: " + cola.cola_size()); //Muestra el tamaño de la cola.
    }//GEN-LAST:event_btnTamanoActionPerformed

    //Método del botón para ver la última película de la cola.
    private void btnUltimaPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimaPeliculaActionPerformed
        JOptionPane.showMessageDialog(null, cola.ultima_pelicula()); //Muestra la última película.
    }//GEN-LAST:event_btnUltimaPeliculaActionPerformed

    //Método del botón para ver la primer película de la cola.
    private void btnPrimerPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimerPeliculaActionPerformed
        JOptionPane.showMessageDialog(null, cola.primera_pelicula()); //Muestra la primer película.
    }//GEN-LAST:event_btnPrimerPeliculaActionPerformed

    //Método del botón para obtener una película de la cola, por medio de la posición.
    private void btnObtenerPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerPeliculaActionPerformed
        if (!cola.colavacia()) { //Si la cola no está vacía.

            try { //Inicia try.
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite un índice entre [0 - " + (cola.cola_size() - 1) + "] :"));
                JOptionPane.showMessageDialog(null, "Pelicula Obtenida:\n" + cola.Obtener_Pelicula(pos)); //Pide al usuario una posición.
            } catch (Exception e) { //Termina try  e inicia catch
                JOptionPane.showMessageDialog(null, "Se esperaba un número entero, vuelva a intentar..."); //Muestra mensaje en caso de error.
            } //Termina catch

        } else { //Sino.
            JOptionPane.showMessageDialog(null, "LA COLA ESTA VACÍA"); //Muestra mensaje.
        }


    }//GEN-LAST:event_btnObtenerPeliculaActionPerformed

    //Método del botón para vaciar la cola.
    private void btnVaciarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarColaActionPerformed
        btnBorrarCampos.doClick(); //Se preciona el botón btnBorrarCampos.
        txtArea.setText("\t\t\tCARTELERA\n"); //Limpia el contenido del txtArea.
        cola.vaciarCola(); //Llama al método vaciarCola de la clase Cola.
        txtIngresos.setText(Integer.toString(cola.Ingresos())); //Muestra los ingresos.
    }//GEN-LAST:event_btnVaciarColaActionPerformed

    //Método del botón para borrar el contenido de los campos (Botón  "X").
    private void btnBorrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCamposActionPerformed
        txtNombre.setText(null); //Vacía el txtNombre.
        cbGenero.setSelectedIndex(0); //Selecciona el primer elemento del cbGenero.
        txtDuracion.setText(null); //Vacía el txtDuración.
        txtValorExposicion.setText(null); //Vacía el txtValorExposición.
    }//GEN-LAST:event_btnBorrarCamposActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCampos;
    private javax.swing.JButton btnEstaVacia;
    private javax.swing.JButton btnExtraer;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnObtenerPelicula;
    private javax.swing.JButton btnPrimerPelicula;
    private javax.swing.JButton btnTamano;
    private javax.swing.JButton btnUltimaPelicula;
    private javax.swing.JButton btnVaciarCola;
    private javax.swing.JComboBox cbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtIngresos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValorExposicion;
    // End of variables declaration//GEN-END:variables
}

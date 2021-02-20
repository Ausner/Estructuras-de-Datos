/*
 Universidad Estatal a Distancia de Costa Rica

 Examen de Estructuras de Datos Código(00825)
 Tema: Árboles Binarios.

 Estudiante: Ausner David Miranda Sibaja
 Cédula: 0604630638
 Grupo: 01

 Primer Cuatrimestre 2020
 */

package Clases;

//Librerías usadas.
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Ventana extends javax.swing.JFrame { //Clase Ventana.

    Arbol arbolbinario = new Arbol(); //Crea objeto de la clase Arbol.
    int cantNodos = 0; //Variable cantNodos para controlar la cantidad de nodos a ingresar.
    int numerosIngresados = 0; //Variable numerosIngresados para contar cuantos números se han ingresado.
    int arreglonumeros[]; //Arreglo arreglonumeros para almacenar los números ya insertados y que no se repitan.
    int i = 0; //Contador del arreglonumeros.

    //Constructor.
    public Ventana() {
        initComponents(); //Inicializa los componentes.
        this.setTitle("Arbol Binario por Ausner Miranda"); //Coloca un título a la ventana.
        btnNuevoArbol.setEnabled(false); //Deshabilita el botón btnNuevoArbol.
        btnInfoColores.setVisible(false); //Hace invisible el botón btnInfoColores.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInOrden = new javax.swing.JButton();
        btnPreOrden = new javax.swing.JButton();
        btnPostOrden = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantNodo = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNodo = new javax.swing.JTextField();
        btnInsertarNodo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevoArbol = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        btnInfoColores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        btnInOrden.setBackground(new java.awt.Color(153, 0, 51));
        btnInOrden.setForeground(new java.awt.Color(255, 255, 255));
        btnInOrden.setText("InOrden");
        btnInOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrdenActionPerformed(evt);
            }
        });

        btnPreOrden.setBackground(new java.awt.Color(153, 0, 51));
        btnPreOrden.setForeground(new java.awt.Color(255, 255, 255));
        btnPreOrden.setText("PreOrden");
        btnPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrdenActionPerformed(evt);
            }
        });

        btnPostOrden.setBackground(new java.awt.Color(153, 0, 51));
        btnPostOrden.setForeground(new java.awt.Color(255, 255, 255));
        btnPostOrden.setText("PostOrden");
        btnPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostOrdenActionPerformed(evt);
            }
        });

        txtarea.setEditable(false);
        txtarea.setBackground(new java.awt.Color(0, 102, 102));
        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtarea.setForeground(new java.awt.Color(255, 255, 255));
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recorrido:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N° de Nodos:");

        btnOK.setBackground(new java.awt.Color(153, 0, 51));
        btnOK.setForeground(new java.awt.Color(255, 255, 255));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Insertar Nodo:");

        btnInsertarNodo.setBackground(new java.awt.Color(153, 0, 51));
        btnInsertarNodo.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarNodo.setText("Insertar");
        btnInsertarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarNodoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 0, 51));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevoArbol.setBackground(new java.awt.Color(153, 0, 0));
        btnNuevoArbol.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoArbol.setText("Nuevo Árbol");
        btnNuevoArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoArbolActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setEnabled(false);

        jInternalFrame1.setBackground(new java.awt.Color(0, 0, 0));
        jInternalFrame1.setForeground(new java.awt.Color(0, 0, 0));
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Gráfico del Árbol");
        jInternalFrame1.setEnabled(false);
        jInternalFrame1.setFocusable(false);
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnInfoColores.setBackground(new java.awt.Color(102, 0, 102));
        btnInfoColores.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoColores.setText("Info Colores Nodos");
        btnInfoColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoColoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDesktopPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOK)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInsertarNodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInfoColores)
                                .addGap(41, 41, 41)
                                .addComponent(btnNuevoArbol)))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnPostOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPreOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalir))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantNodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK)
                    .addComponent(jLabel3)
                    .addComponent(txtNodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertarNodo)
                    .addComponent(btnNuevoArbol)
                    .addComponent(btnInfoColores))
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInOrden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPreOrden)
                        .addGap(9, 9, 9)
                        .addComponent(btnPostOrden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    //Método del botón para ordenar y mostrar el recorrido en InOrden.
    private void btnInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOrdenActionPerformed
        txtarea.setText(null); //Limpia el txtArea.
        if (!arbolbinario.ArbolVacio()) { //Si el árbol no está vacío.
            arbolbinario.LimpiarCadena(); //Llama al método LimpiarCadena de la clase Arbol.
            txtarea.setText("Recorrido en InOrden:\n" + arbolbinario.Recorrido_InOrden(arbolbinario.Raiz)); //Obtiene el recorrido en InOrden y lo muestra.
        } else { //Sino.
            JOptionPane.showMessageDialog(null, "El árbol está vacío"); //Muestra mensaje.
        }
    }//GEN-LAST:event_btnInOrdenActionPerformed

    //Método del botón para ordenar y mostrar el recorrido en PreOrden.
    private void btnPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreOrdenActionPerformed
        txtarea.setText(null); //Limpia el txtArea.
        if (!arbolbinario.ArbolVacio()) { //Si el árbol no está vacío.
            arbolbinario.LimpiarCadena(); //Llama al método LimpiarCadena de la clase Arbol.
            txtarea.setText("Recorrido en PreOrden:\n" + arbolbinario.Recorrido_PreOrden(arbolbinario.Raiz)); //Obtiene el recorrido en PreOrden y lo muestra.
        } else { //Sino.
            JOptionPane.showMessageDialog(null, "El árbol está vacío"); //Muestra mensaje.
        }
    }//GEN-LAST:event_btnPreOrdenActionPerformed
    //Método del botón para ordenar y mostrar el recorrido en PreOrden.
    private void btnPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostOrdenActionPerformed
        txtarea.setText(null); //Limpia el txtArea.
        if (!arbolbinario.ArbolVacio()) { //Si el árbol no está vacío.
            arbolbinario.LimpiarCadena(); //Llama al método LimpiarCadena de la clase Arbol.
            txtarea.setText("Recorrido en PostOrden:\n" + arbolbinario.Recorrido_PostOrden(arbolbinario.Raiz)); //Obtiene el recorrido en PostOrden y lo muestra.
        } else { //Sino.
            JOptionPane.showMessageDialog(null, "El árbol está vacío"); //Muestra mensaje.
        }
    }//GEN-LAST:event_btnPostOrdenActionPerformed

    //Método del botón para salir del programa.
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        exit(1); //Sale del programa.
    }//GEN-LAST:event_btnSalirActionPerformed

    //Método del botón para insertar un número al árbol.
    private void btnInsertarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarNodoActionPerformed

        try { //Inicia try.
            if (cantNodos >= 1) { //Si la cantidad de nodos es mayor o igual a uno.
                if (numerosIngresados < cantNodos) { //Si la cantidad de números ingresados es menor que la cantidad permitida. 
                    int Nodo; //Crea una variable entera para guardar el número.
                    Nodo = Integer.parseInt(txtNodo.getText()); //Obtiene el número.
                    if (NumeroRepetido(Nodo, i) == true) { //Si el número es repetido.
                        txtNodo.setText(null); //Limpia el txtNodo.
                        txtarea.setText(null); //Limpia el txtarea.
                        JOptionPane.showMessageDialog(null, "El número " + Nodo + " ya se encuentra en el árbol, no se pueden repetir"); //Muestra mensaje.
                    } else { //Sino
                        arbolbinario.InsertarNodo(Nodo); //Inserta el nodo.
                        arreglonumeros[i] = Nodo; //Agrega el número al arreglo en la posición i.
                        i++; //Aumenta i en uno.
                        txtNodo.setText(null); //Limpia el txtNodo.
                        txtarea.setText(null); //Limpia el txtarea.
                        numerosIngresados++; //Aumenta numerosIngresados en uno.
                        Repintar(); //Llama al método Repintar.
                        btnInfoColores.setVisible(true); //Hace visible el botón btnInfoColores.
                    }
                } else { //Sino.
                    JOptionPane.showMessageDialog(null, "\tDato no ingresado :\nNo puede exceder la cantidad de nodos establecida"); //Muestra mensaje.
                    txtNodo.setText(null); //Limpia el txtNodo.
                }
            } else { //Sino.
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de nodos primero"); //Muestra mensaje.
                txtNodo.setText(null);
            }
        } catch (NumberFormatException i) { //Termina try e inicia catch.
            JOptionPane.showMessageDialog(null, "Solo se aceptan números enteros"); //Muestra mensaje.
            txtNodo.setText(null);
        }


    }//GEN-LAST:event_btnInsertarNodoActionPerformed
    //Método para repintar el árbol binario cada vez que se inserte un nodo.
    public void Repintar() { 
        this.jDesktopPane1.removeAll(); // Remueve todo del jDesktopPane1.
        Rectangle tamaño = this.jInternalFrame1.getBounds(); //Obtiene el tamaño del jInternalFrame1.
        this.jInternalFrame1 = null; //Asigna null a jInternalFrame1.
        this.jInternalFrame1 = new JInternalFrame("Gráfico del Árbol:", true);//Crea jInternalFrame y muestra el título "Gráfico del Árbol" en la GUI.
        this.jDesktopPane1.add(this.jInternalFrame1, JLayeredPane.DEFAULT_LAYER); //Agrega el jInternalFrame1 al jDesktopPane1
        this.jInternalFrame1.setVisible(true); //Hace visible al jInternalFrame1.
        this.jInternalFrame1.setBounds(tamaño); //Asigna el tamaño al jInternalFrame1.
        this.jInternalFrame1.setEnabled(false); //Desabilita el jInternalFrame.
        this.jInternalFrame1.add(this.ObtenerArbolGráfico(), BorderLayout.CENTER); //Agrega el retorno del método ObtenerArbolGrafico.
    }

    //Método para obtener el dibujo.
    public JPanel ObtenerArbolGráfico() {
        return this.arbolbinario.ArbolGrafico(); //Retorna el método ArbolGrafico de la clase Arbol.
    }

    //Método para saber si un número está repetido.
    public boolean NumeroRepetido(int Nodo, int posicion) {
        for (int x = 0; x < posicion; x++) { //Recorre el arreglonumeros.
            if (Nodo == arreglonumeros[x]) { //Si el número ya está en el arreglo.
                return true; //Retorna verdadero.
            }
        }
        return false; //Por defecto, retorna falso.
    }

    //Método del botón para establecer la cantidad de nodos que va a tener el árbol.
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

        try { //Inicia try.

            cantNodos = Integer.parseInt(txtCantNodo.getText()); //Obtiene la cantidad de nodos.

            if (cantNodos >= 1) { //Si la cantidad de nodos es mayor o igual a uno.
                btnOK.setEnabled(false); //Desabilita el botón btnOK.
                txtCantNodo.setEnabled(false); //Desabilita el txtCantNodo.
                btnNuevoArbol.setEnabled(true); //Habilita el botón btnNuevoArbol.
                JOptionPane.showMessageDialog(null, "El árbol tendrá " + cantNodos + " nodos"); //Muestra mensaje.
                arreglonumeros = new int[cantNodos]; //Asigna el tamaño al arreglonumeros.
                i = 0; //Asigna el valor de 0 a la variable i.
            } else { //Sino.
                JOptionPane.showMessageDialog(null, "¡¡¡Atención!!!\nLa cantidad de nodos debe ser mayor o igual que 1"); //Muestra mensaje.
                txtCantNodo.setText(null); //Limpia el txtCantNodo.
            }

        } catch (NumberFormatException e) { //Termina try e inicia catch.
            JOptionPane.showMessageDialog(null, "Solo se aceptan números enteros positivos"); //Muestra mensaje.
        }


    }//GEN-LAST:event_btnOKActionPerformed


    private void btnNuevoArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoArbolActionPerformed
        btnOK.setEnabled(true); //El botón btnOk hace click.
        txtarea.setText(null); //Limpia el txtarea.
        txtCantNodo.setText(null); //Limpia el txtCantNodo.
        txtNodo.setText(null); //Limpia el txtNodo.
        txtCantNodo.setEnabled(true); //Habilita el txtCantNodo.
        arbolbinario.limpiar_arbol(); //Llama al método limpiar_arbol.
        numerosIngresados = 0; //Asigna 0 a numerosIngresados.
        cantNodos = 0; //Asigna 0 a cantNodos.
        i = 0; //Asigna 0 a la variable i.
        Repintar(); //Llama al método repintar.
        JOptionPane.showMessageDialog(null, "Arbol nuevo creado correctamente"); //Muestra mensaje.
        btnNuevoArbol.setEnabled(false); //Desabilita el botón btnNuevoArbol.
        btnInfoColores.setVisible(false); //Hace invisible el botón btnInfoColores.
    }//GEN-LAST:event_btnNuevoArbolActionPerformed

    //Método del botón para ver la información de los colores de cada nodo del árbol.
    private void btnInfoColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoColoresActionPerformed
       JOptionPane.showMessageDialog(null, "Colores:\n1) VERDE -->  RAÍZ.\n2) ROJO --> HIJO IZQUIERDO.\n3) AZUL --> HIJO DERECHO."); //Muestra Mensaje.
    }//GEN-LAST:event_btnInfoColoresActionPerformed

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
    private javax.swing.JButton btnInOrden;
    private javax.swing.JButton btnInfoColores;
    private javax.swing.JButton btnInsertarNodo;
    private javax.swing.JButton btnNuevoArbol;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPostOrden;
    private javax.swing.JButton btnPreOrden;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantNodo;
    private javax.swing.JTextField txtNodo;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}

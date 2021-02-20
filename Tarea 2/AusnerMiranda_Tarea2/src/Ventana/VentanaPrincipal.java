/*
Universidad Estatal a Distancia de Costa Rica

Tarea 2 de Estructuras de Datos Código(00825)
Tema: Pilas en Java.

Estudiante: Ausner David Miranda Sibaja
Cédula: 0604630638
Grupo: 01

Primer Cuatrimestre 2020
*/

package Ventana;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    Pila pila = new Pila(); //Crea la pila.

    public VentanaPrincipal() { //Constructor.
        initComponents();
        paneltamano.setVisible(false); //Hace al panel no visible.

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btningresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtnumeroextraido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtinsertar = new javax.swing.JTextField();
        paneltamano = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txttamano = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpila = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(697, 690));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        btningresar.setBackground(new java.awt.Color(153, 0, 52));
        btningresar.setForeground(new java.awt.Color(255, 255, 255));
        btningresar.setText("Insertar número a la pila");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        txtarea.setEditable(false);
        txtarea.setBackground(new java.awt.Color(255, 255, 255));
        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtarea.setRows(5);
        jScrollPane2.setViewportView(txtarea);

        jButton1.setBackground(new java.awt.Color(153, 0, 53));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Extraer número de pila");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 0, 53));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Mostrar Tamaño de pila");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 0, 53));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Vaciar pila");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtnumeroextraido.setForeground(new java.awt.Color(255, 255, 255));
        txtnumeroextraido.setText("Número extraido:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Número entero:");

        txtinsertar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtinsertarKeyTyped(evt);
            }
        });

        paneltamano.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tamaño de pila:");

        txttamano.setEditable(false);

        javax.swing.GroupLayout paneltamanoLayout = new javax.swing.GroupLayout(paneltamano);
        paneltamano.setLayout(paneltamanoLayout);
        paneltamanoLayout.setHorizontalGroup(
            paneltamanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltamanoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltamanoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txttamano, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        paneltamanoLayout.setVerticalGroup(
            paneltamanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltamanoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txttamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        txtpila.setEditable(false);
        txtpila.setColumns(20);
        txtpila.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        txtpila.setRows(5);
        jScrollPane1.setViewportView(txtpila);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pila:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btningresar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(paneltamano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(199, 199, 199)
                .addComponent(txtnumeroextraido)
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(txtnumeroextraido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paneltamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btningresar)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))))
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

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed

        if (txtinsertar.getText().isEmpty()) { //Si el txtinsertar esta vacio.
            JOptionPane.showMessageDialog(null, "El campo está vacío, ingrese un número entero"); //Ventana emergente.
        } else { //Sino.
            if (pila.Pila_Size() < 50) { //Si el tamaño de la pila es igual a 50.
                try { //Intentar.
                    String num = txtinsertar.getText(); //Obtiene el número ingresado por el usuario.
                    int numero = Integer.parseInt(num); //Convierte el número en entero.
                    txtarea.setBackground(Color.WHITE); //Asigna fondo blanco al txtarea.
                    txtarea.setText(null); //Limpia el txtarea.
                    pila.Push(numero); //Agrega el número a la pila.
                    txtinsertar.setText(null); //Limpia el txtinsertar.
                    txtpila.setText(null); //Limpia el txtpila.
                    txtpila.setText(pila.Show_Pila()); //Muestra la pila en la GUI.
                    int tam = (pila.Pila_Size()); //Obtiene el tamaño de la pila.
                    String tm = Integer.toString(tam); //Convierte el tamaño en String.
                    txttamano.setText(tm); //Muestra el tamaño en la GUI.
                } catch (Exception e) { //Atrapar excepción
                    JOptionPane.showMessageDialog(null, "El número no es válido"); //Ventana emergente.
                    txtinsertar.setText(null); //Limpia el txtinsertar.
                }
            } else { //Sino.
                JOptionPane.showMessageDialog(null, "La pila está llena, tiene 50 números"); //Ventana emergente.
                txtinsertar.setText(null); //Limpia el txtinsertar.
            }
        }


    }//GEN-LAST:event_btningresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (pila.PilaVacia() == true) { //Si la pila está vacía.
            txtarea.setBackground(Color.WHITE); //Asigna el fondo blanco al txtarea.
            txtarea.setText("\n" + "           LA PILA ESTÁ VACÍA" + " \n"); //Muestra mensaje en GUI.
            txtpila.setText("\n" + "           LA PILA ESTÁ VACÍA" + " \n"); //Muestra mensaje en GUI.
            JOptionPane.showMessageDialog(null, "La pila está vacia"); //Ventana emergente.

        } else { //Sino.
            while (pila.PilaVacia() == false) { //Mientras la pila no este vacía.

                boolean primo = false; //Variable boolean para validar si el número es primo.

                int n = (int) pila.Peek(); //Obtiene el ultimo número ingresado en la pila y lo almacena en n.
                if(n==1 || n==-1){ //Si n es igual a 1 ó -1.
                    primo=false; //primo toma el valor de falso.
                }else if (n > 0) { //Si n es mayor a 0.
                    int n2 = n - 1; //n2 es igual a n -1.
                    while (n % n2 != 0) { //Mientras el módulo de n entre n2 sea igual a 0.
                        n2--; //n2 disminuye en 1.
                    }
                    if (n2 == 1) { //Si n2 es igual a 1.
                        primo = true; //primo toma el valor de verdadero.
                    } else { //Sino.
                        primo = false; //primo toma el valor de falso.
                    }
                } else { //Sino.
                    int n2 = n + 1; //n2 es igual a n + 1.
                    while (n % n2 != 0) { //Mientras el módulo de n entre n2 sea igual a 0.
                        n2++; //n2 aumenta en 1.
                    }
                    if (n2 == -1) { //Si n2 es igual a -1.
                        primo = true; //primo toma el valor de verdadero.
                    } else { //Sino.
                        primo = false; //primo toma el valor de falso.
                    }
                }

                if (primo == true) { //Si primo es igual a verdadero.
                    txtarea.setBackground(Color.RED); //Asigna fondo rojo al txtarea.
                    txtarea.setText("\n\n" + "\t" + pila.Pop() + " \n"); //Muestra el número extraido.
                    txtpila.setText(null); //Limpia el txtpila.
                    txtpila.setText(pila.Show_Pila()); //Muestra la pila en la GUI.
                    int tam = (pila.Pila_Size()); //Obtiene el tamaño de la pila.
                    String tm = Integer.toString(tam); //Convierte el tamaño en String.
                    txttamano.setText(tm); //Muestra el tamaño en la GUI.
                } else if (n % 2 == 0) { //Si el número es par.
                    txtarea.setBackground(Color.GREEN); //Asigna fondo verde al txtarea.
                    txtarea.setText("\n\n" + "\t" + pila.Pop() + " \n"); //Muestra el número extraido.
                    txtpila.setText(null); //Limpia el txtpila.
                    txtpila.setText(pila.Show_Pila()); //Muestra la pila en la GUI.
                    int tam = (pila.Pila_Size()); //Obtiene el tamaño de la pila.
                    String tm = Integer.toString(tam); //Convierte el tamaño en String.
                    txttamano.setText(tm); //Muestra el tamaño en la GUI.
                } else if ((n % 2 != 0) && (primo == false) || (n==1) || (n==-1)) { //Si el número es impar y no primo o si es igual a 1 ó -1. 
                    txtarea.setBackground(Color.decode("#2271B3")); //Asigna fondo celeste al txtarea. 
                    txtarea.setText("\n\n" + "\t" + pila.Pop() + " \n"); //Muestra el número extraido.
                    txtpila.setText(null); //Limpia el txtpila.
                    txtpila.setText(pila.Show_Pila()); //Muestra la pila en la GUI.
                    int tam = (pila.Pila_Size()); //Obtiene el tamaño de la pila.
                    String tm = Integer.toString(tam); //Convierte el tamaño en String.
                    txttamano.setText(tm); //Muestra el tamaño en la GUI.
                }
               break; //Sale del While.
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!pila.PilaVacia()) { //Si la pila no esta vacia.
            pila.Pila_Clear(); //Vacia la pila.
            txtpila.setText(null); //Limpia el txtpila.
            txtpila.setText(pila.Show_Pila()); //Muestra la pila en la GUI.
            int tam = (pila.Pila_Size()); //Obtiene el tamaño de la pila.
            String tm = Integer.toString(tam); //Convierte el tamaño en String.
            txttamano.setText(tm); //Muestra el tamaño en la GUI.
            JOptionPane.showMessageDialog(null, "La pila se ha vaciado"); //Ventana emergente.
        } else { //Sino.
            JOptionPane.showMessageDialog(null, "La pila está vacía"); //Ventana emergente.
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (paneltamano.isVisible() == false) { //Si el panel no está visible.
            paneltamano.setVisible(true); //Hace el panel visible.
            int tam = (pila.Pila_Size()); //Obtiene el tamaño de la pila.
            String tm = Integer.toString(tam); //Convierte el tamaño en String.
            txttamano.setText( tm); //Muestra el tamaño en la GUI.
        } else { //Si el panel está visible.
            paneltamano.setVisible(false); //Hace el panel no visible.
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtinsertarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinsertarKeyTyped
        char tecla = evt.getKeyChar(); //Obtiene la tecla presionada.

        if (tecla == KeyEvent.VK_ENTER) { //Si la tecla presionada es igual a "ENTER".
            btningresar.doClick(); //Se presiona el botón ingresar número a la pila.
        }
        
        if(tecla == KeyEvent.VK_SPACE){ //Si se presiona la tecla "ESPACIO".
            evt.consume(); //La ignora.
        }
        
        if ((tecla < '0' || tecla > '9') && (tecla > '-')) { //Ignora todo caracter que no este entre 0 y 9, además permite el "-" para los números negativos.
            evt.consume(); 
        }


    }//GEN-LAST:event_txtinsertarKeyTyped

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btningresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel paneltamano;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtinsertar;
    private javax.swing.JLabel txtnumeroextraido;
    private javax.swing.JTextArea txtpila;
    private javax.swing.JTextField txttamano;
    // End of variables declaration//GEN-END:variables
}

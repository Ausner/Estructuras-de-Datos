/*
Universidad Estatal a Distancia de Costa Rica

Tarea 1 de Estructuras de Datos Código(00825)
Tema: Torres de Hanói por medio de recursividad

Estudiante: Ausner David Miranda Sibaja
Cédula: 0604630638
Grupo: 01

Primer Cuatrimestre 2020
*/

package Paquete1;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class Ventana extends javax.swing.JFrame {

    int ndiscos;
    double nMovimientos = 0;
    int movimientosEjecutados = 0;

    //Variables tipo Pila
    Pila Varilla_A;
    Pila Varilla_B;
    Pila Varilla_C;

    DefaultTableModel TModelA, TModelB, TModelC;

    boolean Finalizar = false;

    public Ventana() {
        this.setTitle("Torres de Hanói"); //Agrega el titulo de la ventana
        initComponents();

        //Castea las tablas 
        TModelA = (DefaultTableModel) VarillaA.getModel();
        TModelA.setRowCount(10);
        TModelB = (DefaultTableModel) VarillaB.getModel();
        TModelB.setRowCount(10);
        TModelC = (DefaultTableModel) VarillaC.getModel();
        TModelC.setRowCount(10);

        //Coloca los discos de las tablas en el centro de estas
        DefaultTableCellRenderer A = new DefaultTableCellRenderer();
        A.setHorizontalAlignment(SwingConstants.CENTER);
        VarillaA.getColumnModel().getColumn(0).setCellRenderer(A);

        DefaultTableCellRenderer B = new DefaultTableCellRenderer();
        B.setHorizontalAlignment(SwingConstants.CENTER);
        VarillaB.getColumnModel().getColumn(0).setCellRenderer(B);

        DefaultTableCellRenderer C = new DefaultTableCellRenderer();
        C.setHorizontalAlignment(SwingConstants.CENTER);
        VarillaC.getColumnModel().getColumn(0).setCellRenderer(C);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VarillaA = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        VarillaB = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        VarillaC = new javax.swing.JTable();
        Btn_iniciar = new javax.swing.JButton();
        cb_Discos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_movimientos = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txt_mov = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        VarillaA.setBackground(new java.awt.Color(255, 255, 255));
        VarillaA.setForeground(new java.awt.Color(255, 0, 51));
        VarillaA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Varilla A"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VarillaA.setAutoscrolls(false);
        VarillaA.setEnabled(false);
        VarillaA.setFocusable(false);
        VarillaA.setRowSelectionAllowed(false);
        VarillaA.setShowHorizontalLines(false);
        VarillaA.setShowVerticalLines(false);
        jScrollPane1.setViewportView(VarillaA);
        if (VarillaA.getColumnModel().getColumnCount() > 0) {
            VarillaA.getColumnModel().getColumn(0).setResizable(false);
        }

        VarillaB.setBackground(new java.awt.Color(255, 255, 255));
        VarillaB.setForeground(new java.awt.Color(255, 0, 51));
        VarillaB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Varilla B"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VarillaB.setAutoscrolls(false);
        VarillaB.setFocusable(false);
        VarillaB.setRowSelectionAllowed(false);
        VarillaB.setShowHorizontalLines(false);
        VarillaB.setShowVerticalLines(false);
        jScrollPane2.setViewportView(VarillaB);
        if (VarillaB.getColumnModel().getColumnCount() > 0) {
            VarillaB.getColumnModel().getColumn(0).setResizable(false);
        }

        VarillaC.setBackground(new java.awt.Color(255, 255, 255));
        VarillaC.setForeground(new java.awt.Color(255, 0, 51));
        VarillaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Varilla C"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VarillaC.setAutoscrolls(false);
        VarillaC.setFocusable(false);
        VarillaC.setRowSelectionAllowed(false);
        VarillaC.setShowHorizontalLines(false);
        VarillaC.setShowVerticalLines(false);
        jScrollPane3.setViewportView(VarillaC);
        if (VarillaC.getColumnModel().getColumnCount() > 0) {
            VarillaC.getColumnModel().getColumn(0).setResizable(false);
        }

        Btn_iniciar.setBackground(new java.awt.Color(255, 51, 51));
        Btn_iniciar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btn_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_iniciar.setText("Colocar discos");
        Btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_iniciarActionPerformed(evt);
            }
        });

        cb_Discos.setBackground(new java.awt.Color(0, 102, 102));
        cb_Discos.setForeground(new java.awt.Color(255, 255, 255));
        cb_Discos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        cb_Discos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_DiscosActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Número de discos:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad de movimientos mínimos:");

        txt_movimientos.setEditable(false);
        txt_movimientos.setBackground(new java.awt.Color(0, 102, 102));
        txt_movimientos.setForeground(new java.awt.Color(255, 255, 255));
        txt_movimientos.setFocusable(false);
        txt_movimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_movimientosActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_mov.setEditable(false);
        txt_mov.setBackground(new java.awt.Color(0, 102, 102));
        txt_mov.setForeground(new java.awt.Color(255, 255, 255));
        txt_mov.setFocusable(false);
        txt_mov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_movActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de movimientos ejecutados:");

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_movimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_mov, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_Discos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(Btn_iniciar)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cb_Discos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_movimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Btn_iniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
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

    private void iniciar() { //Método iniciar
        try {
            movimientosEjecutados = 0;
            Finalizar = false;
            txt_mov.setText(String.valueOf(movimientosEjecutados)); //Muestra la cantidad de movimientos ejecutados
            Varilla_A = new Pila();
            Varilla_B = new Pila();
            Varilla_C = new Pila();

            ndiscos = Integer.parseInt(cb_Discos.getSelectedItem().toString()); //Asigna la cantidad de discos a ndiscos 

            nMovimientos = Math.pow(2, ndiscos) - 1; //Calcula la cantidad de movimientos minima
            txt_movimientos.setText(String.valueOf(String.format("%.0f", nMovimientos))); //Muestra la cantidad como entero

            for (int i = ndiscos; i >= 1; i--) {
                Disco Plataforma = new Disco();

                String disco = ""; //Crea el Disco como un String vacio

                for (int j = i; j > 0; j--) {
                    disco = disco + "[][][]"; //Agrega "[][][]" segun el numero de disco que sea 

                }
                disco += "  " + i; //Agrega el numero al disco para identificarlo mejor en la parte gráfica
                Plataforma.setDato(disco);
                Varilla_A.Push(Plataforma);

            }
            MostrarA();
            MostrarB();
            MostrarC();

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error. " + e);
        }

    }

    private void MostrarA() {
        ((DefaultTableModel) VarillaA.getModel()).setRowCount(0); //Coloca el numero de filas en 0
        TModelA.setRowCount(10); //Coloca el numero de filas en 10

        Disco K;

        int Fila = (10 - Varilla_A.getnDiscos()); // Almacena la fila en la que debe iniciar a mostrar los discos

        if (Varilla_A.getnDiscos() > 0) { //Si la Varilla A tiene discos

            for (K = Varilla_A.getPrimero(); K.getAbajo() != null; K = K.getAbajo()) { //Recorre la pila
                String[] Array = {K.getDato()}; //Almacena el disco en el Array
                TModelA.insertRow(Fila, Array); //Inserta el disco en la fila almacenada en Fila
                Fila++; //Suma 1 a ls filas;
            }

            if (K.getAbajo() == null) { //En caso de no haber discos
                String[] Array = {K.getDato()}; //Almacena el disco en Array
                TModelA.insertRow(Fila, Array); //Inserta el disco en la fila almacenada en Fila
            }

        }

        VarillaA.setModel(TModelA);
        TModelA.setRowCount(10);
    }

    private void MostrarB() {
        ((DefaultTableModel) VarillaB.getModel()).setRowCount(0); //Coloca el numero de filas en 0
        TModelB.setRowCount(10); //Coloca el numero de filas en 10

        Disco K;

        int Fila = (10 - Varilla_B.getnDiscos()); // Almacena la fila en la que debe iniciar a mostrar los discos

        if (Varilla_B.getnDiscos() > 0) { //Si la Varilla B tiene discos

            for (K = Varilla_B.getPrimero(); K.getAbajo() != null; K = K.getAbajo()) { //Recorre la pila
                String[] Array = {K.getDato()}; //Almacena el disco en el Array
                TModelB.insertRow(Fila, Array); //Inserta el disco en la fila almacenada en Fila
                Fila++; //Aumenta en 1 a Fila
            }

            if (K.getAbajo() == null) { //En caso de no haber discos
                String[] Array = {K.getDato()};  //Almacena el disco en el Array
                TModelB.insertRow(Fila, Array); //Inserta el disco en la fila almacenada en Fila
            }

        }

        VarillaB.setModel(TModelB);
        TModelB.setRowCount(10);
    }

    private void MostrarC() {
        ((DefaultTableModel) VarillaC.getModel()).setRowCount(0); //Coloca el numero de filas en 0
        TModelC.setRowCount(10); //Coloca el numero de filas en 10

        Disco K;

        int Fila = (10 - Varilla_C.getnDiscos()); // Almacena la fila en la que debe iniciar a mostrar los discos

        if (Varilla_C.getnDiscos() > 0) { //Si la Varilla C tiene discos

            for (K = Varilla_C.getPrimero(); K.getAbajo() != null; K = K.getAbajo()) { //Recorre la pila
                String[] Array = {K.getDato()}; //Almacena el disco en el Array
                TModelC.insertRow(Fila, Array); //Inserta el disco en la fila almacenada en Fila
                Fila++;
            }

            if (K.getAbajo() == null) { //En caso de no haber discos
                String[] Array = {K.getDato()}; //Almacena el disco en el Array
                TModelC.insertRow(Fila, Array); //Inserta el disco en la fila almacenada en Fila
            }

        }

        VarillaC.setModel(TModelC);
        TModelC.setRowCount(10);
    }

    private void MostrarMov() { //Método MostarMOv

        movimientosEjecutados++; //Suma 1 al contador de los movimientos ejecutados

        txt_mov.setText(String.valueOf(movimientosEjecutados)); //Asigna el valor del contador al txt_mov

    }

    private void MoverPlataforma(Pila Origen, Pila Destino) {

        if (Finalizar == false) {

            Disco Plataforma = new Disco(); //Crea objrto de la clase Disco

            Plataforma.setDato(Origen.Peek()); //Llama al método peek

            Origen.Pop(); //Llama al método poop

            Destino.Push(Plataforma);  //Llama al metodo push

            //Llama y muestra los metodos actualizados 
            MostrarA();
            MostrarB();
            MostrarC();
            MostrarMov();

            //Ventana emergente con el numero de movimiento ejecutado
            JOptionPane Movimientos = new JOptionPane("Movimiento: " + txt_mov.getText() + " de " + txt_movimientos.getText() + "\n\n¿Desea continuar?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);

            JDialog dialog = Movimientos.createDialog("Número de Movimientos:");

            dialog.setVisible(true);
            int opcion = (int) Movimientos.getValue();

            if (opcion == JOptionPane.NO_OPTION) {
                Finalizar = true;
            }
        }

    }

    private void hanoi(int n, Pila Origen, Pila Auxiliar, Pila Destino) { //Método hanoi (Trabaja con recursividad)

        if (n == 1) { //Si la cantidad de discos es 1

            MoverPlataforma(Origen, Destino); //Llama al método MoverPlataforma

        } else {   //Sino

            hanoi(n - 1, Origen, Destino, Auxiliar); //El método se invoca a si mismo, cambiando el valor de discos y el orden de los parámetros
            MoverPlataforma(Origen, Destino); //Llama al método MoverPlataforma
            hanoi(n - 1, Auxiliar, Origen, Destino); //El método se invoca a si mismo, cambiando el valor de discos y el orden de los parámetros

        }

    }


    private void Btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_iniciarActionPerformed

        iniciar(); //Invoca al método iniciar
    }//GEN-LAST:event_Btn_iniciarActionPerformed

    private void txt_movimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_movimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_movimientosActionPerformed

    private void cb_DiscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_DiscosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_DiscosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        hanoi(ndiscos, Varilla_A, Varilla_B, Varilla_C); //Llama al método recursivo hanoi


    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_movActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_movActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_movActionPerformed

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
    private javax.swing.JButton Btn_iniciar;
    private javax.swing.JTable VarillaA;
    private javax.swing.JTable VarillaB;
    private javax.swing.JTable VarillaC;
    private javax.swing.JComboBox cb_Discos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txt_mov;
    private javax.swing.JTextField txt_movimientos;
    // End of variables declaration//GEN-END:variables
}

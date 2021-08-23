package com.ex.prestamo.cliente.view;

import com.ex.prestamo.cliente.controller.Controller;
import javax.swing.JOptionPane;

public class MainForm extends javax.swing.JFrame {
    private Controller controller;
    public MainForm() {
        this.controller = new Controller();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelFields = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblSueldo = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        lblValorPrestamo = new javax.swing.JLabel();
        txtValorPrestamo = new javax.swing.JTextField();
        lblNumeroCuotas = new javax.swing.JLabel();
        txtNumeroCuotas = new javax.swing.JTextField();
        lblInteresAnual = new javax.swing.JLabel();
        txtInteresAnual = new javax.swing.JTextField();
        separator = new javax.swing.JSeparator();
        panelButtons = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de prestamo v1.0");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cliente Prestamos v1.0");

        panelFields.setMinimumSize(new java.awt.Dimension(300, 145));
        panelFields.setLayout(new java.awt.GridLayout(5, 2, 0, 10));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombre.setText("Nombre");
        panelFields.add(lblNombre);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelFields.add(txtNombre);

        lblSueldo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSueldo.setText("Sueldo");
        panelFields.add(lblSueldo);

        txtSueldo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelFields.add(txtSueldo);

        lblValorPrestamo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblValorPrestamo.setText("Valor del préstamo");
        panelFields.add(lblValorPrestamo);

        txtValorPrestamo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelFields.add(txtValorPrestamo);

        lblNumeroCuotas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumeroCuotas.setText("Número de cuotas (Meses)");
        panelFields.add(lblNumeroCuotas);

        txtNumeroCuotas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelFields.add(txtNumeroCuotas);

        lblInteresAnual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInteresAnual.setText("Interes anual");
        panelFields.add(lblInteresAnual);

        txtInteresAnual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelFields.add(txtInteresAnual);

        separator.setToolTipText("");

        panelButtons.setLayout(new javax.swing.BoxLayout(panelButtons, javax.swing.BoxLayout.LINE_AXIS));

        btnCalcular.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 153, 0));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        panelButtons.add(btnCalcular);

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(153, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panelButtons.add(btnLimpiar);

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(174, 174, 174))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(separator)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(panelFields, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try{
            if(validateFields()){
                this.controller.calcularPrestamo(
                    this.txtNombre.getText(),
                    Double.parseDouble(this.txtSueldo.getText()),
                    Double.parseDouble(this.txtValorPrestamo.getText()),
                    Integer.parseInt(this.txtNumeroCuotas.getText()),
                    Float.parseFloat(this.txtInteresAnual.getText())
                );
            }else{
                throw new NoSuchFieldException("Rellene todos los campos");
            }
        }catch(NumberFormatException | NoSuchFieldException ex){
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtNombre.setText(null);
        this.txtSueldo.setText(null);
        this.txtValorPrestamo.setText(null);
        this.txtNumeroCuotas.setText(null);
        this.txtInteresAnual.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public boolean validateFields(){
        String[] texts = {this.txtNombre.getText(),
        this.txtSueldo.getText(),
        this.txtValorPrestamo.getText(),
        this.txtNumeroCuotas.getText(),
        this.txtInteresAnual.getText()};
        boolean valid = true;
        for(String text : texts){
            if(text.isEmpty()){
                valid = false;
                break;
            }
        }
        return valid;
    }
    
    public static void open() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblInteresAnual;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroCuotas;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValorPrestamo;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelFields;
    private javax.swing.JPanel panelMain;
    private javax.swing.JSeparator separator;
    private javax.swing.JTextField txtInteresAnual;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCuotas;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtValorPrestamo;
    // End of variables declaration//GEN-END:variables
}
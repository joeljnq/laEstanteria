/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laestanteria;

/**
 *
 * @author a22davidma
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form NMain
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JLabel();
        campoContraseña = new javax.swing.JTextField();
        botonLogin = new javax.swing.JButton();
        crearCuentaPanel = new javax.swing.JPanel();
        correoUsu = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        nombreUsu = new javax.swing.JLabel();
        confirmarContraseña = new javax.swing.JLabel();
        contraseñaUsu = new javax.swing.JLabel();
        campoConfirmarContraseña = new javax.swing.JPasswordField();
        campoConteraseñaUsu = new javax.swing.JPasswordField();
        botonCrearCuenta = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JPanel();
        catalogoButton = new javax.swing.JToggleButton();
        pagosButton = new javax.swing.JToggleButton();
        historialButton = new javax.swing.JToggleButton();
        cuentaButton = new javax.swing.JToggleButton();
        cuentaPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JLabel();
        nombreUsuPanel = new javax.swing.JLabel();
        saldoPanel = new javax.swing.JLabel();
        dniPanel = new javax.swing.JLabel();
        gmailPanel = new javax.swing.JLabel();
        nombreResPanel = new javax.swing.JLabel();
        gmailResPanel = new javax.swing.JLabel();
        dniResPanel = new javax.swing.JLabel();
        saldoResPanel = new javax.swing.JLabel();
        historialPagosButton = new javax.swing.JToggleButton();
        volverButton01 = new javax.swing.JToggleButton();
        historialPagosPanel = new javax.swing.JPanel();
        volverButton02 = new javax.swing.JToggleButton();
        pagosTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        catalogoPanel = new javax.swing.JPanel();
        catalogoLabel = new javax.swing.JLabel();
        celularesButton = new javax.swing.JToggleButton();
        accesoriosButton = new javax.swing.JToggleButton();
        almacenamientoButton = new javax.swing.JToggleButton();
        pcButton = new javax.swing.JToggleButton();
        componentesPcButton = new javax.swing.JButton();
        volverButton03 = new javax.swing.JButton();
        celularesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        accesoPrograma = new javax.swing.JMenu();
        login = new javax.swing.JMenuItem();
        crearCuenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        usuario.setText("Usuario");

        contraseña.setText("Contraseña");

        botonLogin.setText("Enviar");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contraseña)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(botonLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseña)
                    .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(botonLogin)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(loginPanel, "card2");

        correoUsu.setText("Correo");

        nombreUsu.setText("Nombre de Usuario");

        confirmarContraseña.setText("Confirmar Contraseña");

        contraseñaUsu.setText("Contraseña");

        botonCrearCuenta.setText("Crear Cuenta");

        javax.swing.GroupLayout crearCuentaPanelLayout = new javax.swing.GroupLayout(crearCuentaPanel);
        crearCuentaPanel.setLayout(crearCuentaPanelLayout);
        crearCuentaPanelLayout.setHorizontalGroup(
            crearCuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearCuentaPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(crearCuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreUsu)
                    .addComponent(correoUsu)
                    .addComponent(confirmarContraseña)
                    .addComponent(contraseñaUsu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crearCuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCrearCuenta)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConteraseñaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        crearCuentaPanelLayout.setVerticalGroup(
            crearCuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearCuentaPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(crearCuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearCuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearCuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseñaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConteraseñaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearCuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonCrearCuenta)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(crearCuentaPanel, "card3");

        catalogoButton.setText("Catálogo");

        pagosButton.setText("Pagos");

        historialButton.setText("Historial");

        cuentaButton.setText("Cuenta");

        javax.swing.GroupLayout menuPrincipalLayout = new javax.swing.GroupLayout(menuPrincipal);
        menuPrincipal.setLayout(menuPrincipalLayout);
        menuPrincipalLayout.setHorizontalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(catalogoButton)
                    .addComponent(historialButton))
                .addGap(138, 138, 138)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cuentaButton)
                    .addComponent(pagosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        menuPrincipalLayout.setVerticalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catalogoButton)
                    .addComponent(pagosButton))
                .addGap(31, 31, 31)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historialButton)
                    .addComponent(cuentaButton))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        getContentPane().add(menuPrincipal, "card4");

        infoPanel.setText("Información de la cuenta");

        nombreUsuPanel.setText("Nombre de usuario");

        saldoPanel.setText("Saldo");

        dniPanel.setText("Dni");

        gmailPanel.setText("Gmail");

        historialPagosButton.setText("Historial de Pagos");

        volverButton01.setText("Volver");

        javax.swing.GroupLayout cuentaPanelLayout = new javax.swing.GroupLayout(cuentaPanel);
        cuentaPanel.setLayout(cuentaPanelLayout);
        cuentaPanelLayout.setHorizontalGroup(
            cuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentaPanelLayout.createSequentialGroup()
                .addGroup(cuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuentaPanelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(infoPanel))
                    .addGroup(cuentaPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(cuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreUsuPanel)
                            .addComponent(gmailPanel)
                            .addComponent(dniPanel)
                            .addComponent(saldoPanel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addGroup(cuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreResPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gmailResPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dniResPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saldoResPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))))
                .addGap(83, 83, 83))
            .addGroup(cuentaPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(historialPagosButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volverButton01)
                .addGap(47, 47, 47))
        );
        cuentaPanelLayout.setVerticalGroup(
            cuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoPanel)
                .addGap(36, 36, 36)
                .addGroup(cuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuPanel)
                    .addComponent(nombreResPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gmailPanel)
                    .addComponent(gmailResPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniPanel)
                    .addComponent(dniResPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldoPanel)
                    .addComponent(saldoResPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(cuentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historialPagosButton)
                    .addComponent(volverButton01))
                .addGap(34, 34, 34))
        );

        getContentPane().add(cuentaPanel, "card5");

        historialPagosPanel.setPreferredSize(new java.awt.Dimension(400, 277));

        volverButton02.setText("Volver");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pago", "Fecha", "Datos"
            }
        ));
        pagosTable.setViewportView(jTable1);

        javax.swing.GroupLayout historialPagosPanelLayout = new javax.swing.GroupLayout(historialPagosPanel);
        historialPagosPanel.setLayout(historialPagosPanelLayout);
        historialPagosPanelLayout.setHorizontalGroup(
            historialPagosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historialPagosPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volverButton02)
                .addGap(163, 163, 163))
            .addGroup(historialPagosPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pagosTable, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        historialPagosPanelLayout.setVerticalGroup(
            historialPagosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historialPagosPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(pagosTable, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(volverButton02, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        getContentPane().add(historialPagosPanel, "card6");

        catalogoLabel.setText("Catálogo");

        celularesButton.setText("Celulares");

        accesoriosButton.setText("Accesorios");

        almacenamientoButton.setText("Almacenamiento");

        pcButton.setText("Pc");

        componentesPcButton.setText("Componentes Pc");

        volverButton03.setText("Volver");

        javax.swing.GroupLayout catalogoPanelLayout = new javax.swing.GroupLayout(catalogoPanel);
        catalogoPanel.setLayout(catalogoPanelLayout);
        catalogoPanelLayout.setHorizontalGroup(
            catalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catalogoPanelLayout.createSequentialGroup()
                .addGroup(catalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catalogoPanelLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(catalogoLabel))
                    .addGroup(catalogoPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(catalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celularesButton)
                            .addComponent(pcButton))
                        .addGap(26, 26, 26)
                        .addGroup(catalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(catalogoPanelLayout.createSequentialGroup()
                                .addComponent(accesoriosButton)
                                .addGap(26, 26, 26)
                                .addComponent(almacenamientoButton))
                            .addComponent(componentesPcButton)))
                    .addGroup(catalogoPanelLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(volverButton03)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        catalogoPanelLayout.setVerticalGroup(
            catalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catalogoPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(catalogoLabel)
                .addGap(67, 67, 67)
                .addGroup(catalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularesButton)
                    .addComponent(accesoriosButton)
                    .addComponent(almacenamientoButton))
                .addGap(32, 32, 32)
                .addGroup(catalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pcButton)
                    .addComponent(componentesPcButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(volverButton03)
                .addContainerGap())
        );

        getContentPane().add(catalogoPanel, "card7");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Celular", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jButton1.setText("I");

        javax.swing.GroupLayout celularesPanelLayout = new javax.swing.GroupLayout(celularesPanel);
        celularesPanel.setLayout(celularesPanelLayout);
        celularesPanelLayout.setHorizontalGroup(
            celularesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(celularesPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        celularesPanelLayout.setVerticalGroup(
            celularesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, celularesPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(celularesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        getContentPane().add(celularesPanel, "card8");

        accesoPrograma.setText("Acceso");

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        accesoPrograma.add(login);

        crearCuenta.setText("Crear cuenta");
        accesoPrograma.add(crearCuenta);

        jMenuBar1.add(accesoPrograma);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu accesoPrograma;
    private javax.swing.JToggleButton accesoriosButton;
    private javax.swing.JToggleButton almacenamientoButton;
    private javax.swing.JButton botonCrearCuenta;
    private javax.swing.JButton botonLogin;
    private javax.swing.JPasswordField campoConfirmarContraseña;
    private javax.swing.JPasswordField campoConteraseñaUsu;
    private javax.swing.JTextField campoContraseña;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JToggleButton catalogoButton;
    private javax.swing.JLabel catalogoLabel;
    private javax.swing.JPanel catalogoPanel;
    private javax.swing.JToggleButton celularesButton;
    private javax.swing.JPanel celularesPanel;
    private javax.swing.JButton componentesPcButton;
    private javax.swing.JLabel confirmarContraseña;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel contraseñaUsu;
    private javax.swing.JLabel correoUsu;
    private javax.swing.JMenuItem crearCuenta;
    private javax.swing.JPanel crearCuentaPanel;
    private javax.swing.JToggleButton cuentaButton;
    private javax.swing.JPanel cuentaPanel;
    private javax.swing.JLabel dniPanel;
    private javax.swing.JLabel dniResPanel;
    private javax.swing.JLabel gmailPanel;
    private javax.swing.JLabel gmailResPanel;
    private javax.swing.JToggleButton historialButton;
    private javax.swing.JToggleButton historialPagosButton;
    private javax.swing.JPanel historialPagosPanel;
    private javax.swing.JLabel infoPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuItem login;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel menuPrincipal;
    private javax.swing.JLabel nombreResPanel;
    private javax.swing.JLabel nombreUsu;
    private javax.swing.JLabel nombreUsuPanel;
    private javax.swing.JToggleButton pagosButton;
    private javax.swing.JScrollPane pagosTable;
    private javax.swing.JToggleButton pcButton;
    private javax.swing.JLabel saldoPanel;
    private javax.swing.JLabel saldoResPanel;
    private javax.swing.JLabel usuario;
    private javax.swing.JToggleButton volverButton01;
    private javax.swing.JToggleButton volverButton02;
    private javax.swing.JButton volverButton03;
    // End of variables declaration//GEN-END:variables
}

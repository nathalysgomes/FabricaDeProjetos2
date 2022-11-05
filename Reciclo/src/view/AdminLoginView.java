
package view;

/** Tela de login para administrador
 *
 * @author Alessandro Lemos Jr
 * @since Release 2
 */

public class AdminLoginView extends javax.swing.JFrame {

    /**
     * Creates new form AdminLoginView
     */
    public AdminLoginView() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfAdminLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnReturn = new view.projectButton();
        btnLogin = new view.projectButton();
        jLabel4 = new javax.swing.JLabel();
        tfAdminPassword = new javax.swing.JPasswordField();
        testConnectionFail = new javax.swing.JLabel();
        testConnection = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(480, 800));
        setMinimumSize(new java.awt.Dimension(480, 800));
        setName("AdminLoginView"); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(160, 205, 96));
        jLabel1.setText("Usuário");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 205, 96));
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        tfAdminLogin.setBackground(new java.awt.Color(60, 60, 60));
        tfAdminLogin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfAdminLogin.setForeground(new java.awt.Color(160, 205, 96));
        tfAdminLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfAdminLogin.setBorder(null);
        tfAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAdminLoginActionPerformed(evt);
            }
        });
        jPanel1.add(tfAdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 240, 50));

        jSeparator1.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator1.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 280, 20));

        jSeparator2.setBackground(new java.awt.Color(160, 205, 96));
        jSeparator2.setForeground(new java.awt.Color(160, 205, 96));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 280, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-chave-2-28.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-usuário-28.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        btnReturn.setBackground(new java.awt.Color(60, 60, 60));
        btnReturn.setBorder(null);
        btnReturn.setForeground(new java.awt.Color(206, 240, 157));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-retornar-45.png"))); // NOI18N
        btnReturn.setColor(new java.awt.Color(60, 60, 60));
        btnReturn.setColorClick(new java.awt.Color(206, 240, 157));
        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReturn.setRadius(30);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, 50));

        btnLogin.setBackground(new java.awt.Color(60, 60, 60));
        btnLogin.setBorder(null);
        btnLogin.setForeground(new java.awt.Color(206, 240, 157));
        btnLogin.setText("Log in");
        btnLogin.setColor(new java.awt.Color(60, 60, 60));
        btnLogin.setColorClick(new java.awt.Color(206, 240, 157));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogin.setRadius(30);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 200, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RecicloLogo_Admin.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        tfAdminPassword.setBackground(new java.awt.Color(60, 60, 60));
        tfAdminPassword.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfAdminPassword.setForeground(new java.awt.Color(160, 205, 96));
        tfAdminPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfAdminPassword.setBorder(null);
        jPanel1.add(tfAdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 240, 50));

        testConnectionFail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        testConnectionFail.setForeground(new java.awt.Color(255, 51, 51));
        testConnectionFail.setToolTipText("");
        testConnectionFail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(testConnectionFail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, 280, 40));

        testConnection.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        testConnection.setForeground(new java.awt.Color(160, 205, 96));
        testConnection.setToolTipText("");
        testConnection.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(testConnection, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, 280, 40));

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

        setSize(new java.awt.Dimension(480, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAdminLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAdminLoginActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        
        // Teste de tela, botão exit
        AlunoLoginView alunolog = new AlunoLoginView();
        this.setVisible(false);              
        alunolog.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        // Teste de login
        String user = "admin";
        String pass = "admin";
        TelaLoading loading = new TelaLoading();
        
        try {   
            // Fazer abrir conexao com bd aqui e processos
            
            String username = tfAdminLogin.getText();
            String password = tfAdminPassword.getText();
            
            if(username.equals(user) && password.equals(pass)) {
                testConnectionFail.setText("");
                testConnection.setText("CONNECT");
                this.setVisible(false);
                loading.setVisible(true);
                
            } else {
                testConnection.setText("");
                testConnectionFail.setText("Invalid login or password!");
            }    
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.projectButton btnLogin;
    private view.projectButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel testConnection;
    private javax.swing.JLabel testConnectionFail;
    private javax.swing.JTextField tfAdminLogin;
    private javax.swing.JPasswordField tfAdminPassword;
    // End of variables declaration//GEN-END:variables
}

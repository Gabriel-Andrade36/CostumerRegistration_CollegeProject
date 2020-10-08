
package cadastroclientes;


public class LoginUI extends javax.swing.JFrame {
    CadastroUI cadastro = new CadastroUI();
    
    private String user;
    private String password;
    private String[] args;
    
    public LoginUI() {
        initComponents();
        PasswordUserError.setVisible(false);
        PasswordField.setBackground(new java.awt.Color(0,0,0,1));
        UserField.setBackground(new java.awt.Color(0,0,0,1));
        PasswordViewField.setBackground(new java.awt.Color(0,0,0,1));
        PasswordViewField.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PasswordViewField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        TitleField = new javax.swing.JPanel();
        Titletxt = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        CheckBox = new javax.swing.JCheckBox();
        PasswordUserError = new javax.swing.JLabel();
        userbackgroundboxField = new javax.swing.JLabel();
        BackgroundField = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 61, 71));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(null);

        UserField.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        UserField.setForeground(new java.awt.Color(255, 255, 255));
        UserField.setBorder(null);
        UserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFieldActionPerformed(evt);
            }
        });
        jPanel1.add(UserField);
        UserField.setBounds(30, 190, 330, 30);

        jPanel3.setBackground(new java.awt.Color(51, 61, 71));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 190, 350, 30);

        jLabel4.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 250, 100, 14);

        jLabel3.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 170, 70, 14);

        PasswordViewField.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        PasswordViewField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordViewField.setBorder(null);
        jPanel1.add(PasswordViewField);
        PasswordViewField.setBounds(30, 270, 330, 30);

        PasswordField.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordField.setBorder(null);
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordField);
        PasswordField.setBounds(30, 270, 330, 30);

        jPanel4.setBackground(new java.awt.Color(51, 61, 71));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 270, 350, 30);

        TitleField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TitleField.setOpaque(false);

        Titletxt.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Titletxt.setForeground(new java.awt.Color(255, 255, 255));
        Titletxt.setText("Profissional Acess");

        javax.swing.GroupLayout TitleFieldLayout = new javax.swing.GroupLayout(TitleField);
        TitleField.setLayout(TitleFieldLayout);
        TitleFieldLayout.setHorizontalGroup(
            TitleFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitleFieldLayout.setVerticalGroup(
            TitleFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleFieldLayout.createSequentialGroup()
                .addComponent(Titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(TitleField);
        TitleField.setBounds(20, 80, 220, 30);

        LoginButton.setBackground(new java.awt.Color(51, 61, 71));
        LoginButton.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoginButton);
        LoginButton.setBounds(20, 370, 100, 30);

        CheckBox.setBackground(new java.awt.Color(255, 255, 255));
        CheckBox.setFont(new java.awt.Font("Unispace", 0, 10)); // NOI18N
        CheckBox.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox.setText("Show Password");
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox);
        CheckBox.setBounds(20, 320, 130, 30);

        PasswordUserError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PasswordUserError.setForeground(new java.awt.Color(153, 0, 0));
        PasswordUserError.setText("* wrong user or password");
        jPanel1.add(PasswordUserError);
        PasswordUserError.setBounds(20, 300, 290, 15);

        userbackgroundboxField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroclientes/fundark.png"))); // NOI18N
        userbackgroundboxField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(userbackgroundboxField);
        userbackgroundboxField.setBounds(10, 50, 380, 390);

        BackgroundField.setBackground(new java.awt.Color(51, 61, 71));
        BackgroundField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout BackgroundFieldLayout = new javax.swing.GroupLayout(BackgroundField);
        BackgroundField.setLayout(BackgroundFieldLayout);
        BackgroundFieldLayout.setHorizontalGroup(
            BackgroundFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        BackgroundFieldLayout.setVerticalGroup(
            BackgroundFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        jPanel1.add(BackgroundField);
        BackgroundField.setBounds(0, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserFieldActionPerformed
   
    }//GEN-LAST:event_UserFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
   
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
    
     
    if(CheckBox.isSelected()){
    PasswordViewField.setText(PasswordField.getText());    
    PasswordViewField.setVisible(true);PasswordField.setVisible(false);
    }else{
    PasswordField.setText(PasswordViewField.getText());
    PasswordViewField.setVisible(false);PasswordField.setVisible(true);
    }
        
    }//GEN-LAST:event_CheckBoxActionPerformed
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
   this.user= UserField.getText();
   this.password = PasswordField.getText();
   
   switch(UserField.getText()){
   case "adm":
            if("1234test".equals(PasswordField.getText()) || "1234test".equals(PasswordViewField.getText())){
            this.setVisible(false);
            CadastroUI.main(args);
            }else{PasswordField.setText("");
                  PasswordViewField.setText(""); 
                  System.out.println("erro");
                  PasswordUserError.setVisible(true);}
                  break;
   default: 
      PasswordField.setText("");
      PasswordViewField.setText(""); 
      System.out.println("erro");
      PasswordUserError.setVisible(true);
   }
    }//GEN-LAST:event_LoginButtonActionPerformed


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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundField;
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordUserError;
    private javax.swing.JTextField PasswordViewField;
    private javax.swing.JPanel TitleField;
    private javax.swing.JLabel Titletxt;
    private javax.swing.JTextField UserField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel userbackgroundboxField;
    // End of variables declaration//GEN-END:variables
}

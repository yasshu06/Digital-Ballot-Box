package DigitalBallotBox;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        AdminRadioButton = new javax.swing.JRadioButton();
        VoterRadioButton = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel9.setText("Select User Type:");
        UsernameField.setFont(new java.awt.Font("Arial", 1, 18));
        UsernameField.setToolTipText("Enter Username Here");
        UsernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        UsernameField.addFocusListener(new java.awt.event.FocusAdapter() {

            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFieldFocusGained(evt);
            }
        });
        jLabel10.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel10.setText("USERNAME:");
        jLabel11.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel11.setText("PASSWORD:");
        LoginButton.setBackground(new java.awt.Color(102, 153, 255));
        LoginButton.setFont(new java.awt.Font("Arial", 3, 18));
        LoginButton.setText("LOGIN");
        LoginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        PasswordField.setFont(new java.awt.Font("Arial", 1, 18));
        PasswordField.setToolTipText("Enter Password Here");
        PasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {

            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
        });
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        buttonGroup1.add(AdminRadioButton);
        AdminRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12));
        AdminRadioButton.setText("Admin");
        AdminRadioButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminRadioButtonActionPerformed(evt);
            }
        });
        buttonGroup1.add(VoterRadioButton);
        VoterRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12));
        VoterRadioButton.setText("Voter");
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(14, 14, 14).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(VoterRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(AdminRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(16, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(AdminRadioButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(VoterRadioButton).addGap(24, 24, 24)));
        jButton1.setFont(new java.awt.Font("Arial Black", 3, 14));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(31, 31, 31).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(44, 44, 44)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(80, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addGap(73, 73, 73).addComponent(jLabel9).addGap(48, 48, 48)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(21, 21, 21))).addComponent(jLabel10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jLabel11).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(32, 32, 32).addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(44, Short.MAX_VALUE)));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DIGITAL BALLOT BOX");
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel3.setText("Security Reminder:");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel4.setText("-> Keep your login information CONFIDENTIAL");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel5.setText("-> Do not share your credential with anyone");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel6.setText("-> Admins have access to system configuration");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel7.setText("-> Do not share your credential with anyone");
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel8.setText("Note:");
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel13.setText("     and voter registration");
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(6, 6, 6).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE).addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)).addGroup(jPanel3Layout.createSequentialGroup().addGap(20, 20, 20).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel3Layout.createSequentialGroup().addGap(47, 47, 47).addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel2).addGap(18, 18, 18).addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5).addGap(18, 18, 18).addComponent(jLabel8).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(4, 4, 4).addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel7).addContainerGap(143, Short.MAX_VALUE)));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
        setLocationRelativeTo(null);
    }

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (buttonGroup1.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Please Select the user type");
        } else if (UsernameField.getText().equals("") || PasswordField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter both Username and Password");
        } else if (AdminRadioButton.isSelected()) {
            if (UsernameField.getText().equals("Administrator") == false || PasswordField.getText().equals("Admin123") == false) {
                JOptionPane.showMessageDialog(this, "Please Enter Correct Credentials");
            } else if (UsernameField.getText().equals("Administrator") && PasswordField.getText().equals("Admin123")) {
                AdminDashboard ad = new AdminDashboard();
                ad.setVisible(true);
                dispose();
            }
        } else if (VoterRadioButton.isSelected()) {
            String user = UsernameField.getText();
            String pass = PasswordField.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
                PreparedStatement p = con.prepareStatement("Select * from Voters Where VUsername=? and VPassword=?;");
                p.setString(1, user);
                p.setString(2, pass);
                ResultSet rs = p.executeQuery();
                boolean b = rs.next();
                if (b) {
                    if (rs.getString(8).equals("true")) {
                        JOptionPane.showMessageDialog(this, "You have already Voted \nNo One is allowed to Vote again");
                    } else {
                        String ElectionName = rs.getString(6);
                        PreparedStatement p2 = con.prepareStatement("Select edate from election where etitle=?");
                        p2.setString(1, ElectionName);
                        ResultSet r = p2.executeQuery();
                        r.next();
                        java.sql.Date edate = r.getDate("edate");
                        Calendar calendar = Calendar.getInstance();
                        java.sql.Date todayDate = new java.sql.Date(calendar.getTimeInMillis());
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String edateStr = dateFormat.format(edate);
                        String todayDateStr = dateFormat.format(todayDate);
                        if (edateStr.equals(todayDateStr)) {
                            VoterDashboard vd = new VoterDashboard(ElectionName, user);
                            vd.setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "The time period has not yet commenced or has already concluded.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Credentials");
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }

    private void AdminRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        UsernameField.setText("Administrator");
    }

    private void UsernameFieldFocusGained(java.awt.event.FocusEvent evt) {
        UsernameField.setText("");
    }

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {
        PasswordField.setText("");
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    private javax.swing.JRadioButton AdminRadioButton;

    private javax.swing.JButton LoginButton;

    private javax.swing.JPasswordField PasswordField;

    private javax.swing.JTextField UsernameField;

    private javax.swing.JRadioButton VoterRadioButton;

    private javax.swing.ButtonGroup buttonGroup1;

    private javax.swing.JButton jButton1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel10;

    private javax.swing.JLabel jLabel11;

    private javax.swing.JLabel jLabel13;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JLabel jLabel8;

    private javax.swing.JLabel jLabel9;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JPanel jPanel2;

    private javax.swing.JPanel jPanel3;

   
}

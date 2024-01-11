package DigitalBallotBox;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ScheduleElection extends javax.swing.JFrame {

    public ScheduleElection() {
        initComponents();
        Calendar today = Calendar.getInstance();
        ElectionDate.setMinSelectableDate(today.getTime());
        DisplayElections();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ElectionTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ElectionDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        ScheduleButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CloseButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ElectionTable.setBackground(new java.awt.Color(255, 255, 153));
        ElectionTable.setFont(new java.awt.Font("Arial", 1, 14));
        ElectionTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null } }, new String[] { "Election id", "Election Title", "Election Date" }) {

            boolean[] canEdit = new boolean[] { false, false, false };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        ElectionTable.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ElectionTable);
        jLabel1.setFont(new java.awt.Font("Arial", 3, 30));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Scheduled Elections");
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel5Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(16, Short.MAX_VALUE)));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(56, 56, 56)));
        ElectionTitle.setFont(new java.awt.Font("Arial", 1, 18));
        ElectionTitle.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionTitleActionPerformed(evt);
            }
        });
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel3.setText("Election Title:");
        ElectionDate.addFocusListener(new java.awt.event.FocusAdapter() {

            public void focusGained(java.awt.event.FocusEvent evt) {
                ElectionDateFocusGained(evt);
            }
        });
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel4.setText("Election Date:");
        ScheduleButton.setBackground(new java.awt.Color(102, 102, 255));
        ScheduleButton.setFont(new java.awt.Font("Cambria", 3, 18));
        ScheduleButton.setText("Schedule");
        ScheduleButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleButtonActionPerformed(evt);
            }
        });
        EditButton.setBackground(new java.awt.Color(255, 204, 0));
        EditButton.setFont(new java.awt.Font("Cambria", 3, 18));
        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        DeleteButton.setBackground(new java.awt.Color(255, 102, 51));
        DeleteButton.setFont(new java.awt.Font("Cambria Math", 3, 18));
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        BackButton.setBackground(new java.awt.Color(51, 204, 255));
        BackButton.setFont(new java.awt.Font("Cambria Math", 3, 18));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        CloseButton.setBackground(new java.awt.Color(102, 153, 255));
        CloseButton.setFont(new java.awt.Font("Arial Black", 1, 14));
        CloseButton.setText("X");
        CloseButton.setBorder(null);
        CloseButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        jLabel8.setFont(new java.awt.Font("Arial", 3, 48));
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Digital Ballot Box");
        jLabel2.setFont(new java.awt.Font("Arial", 3, 30));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Schedule Elections");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(39, 39, 39).addComponent(jLabel7).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGap(18, 18, 18).addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(25, 25, 25)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel7).addComponent(jLabel8).addComponent(CloseButton)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel2).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jLabel5.setFont(new java.awt.Font("Arial", 3, 30));
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add Elections");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(30, 30, 30).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(ElectionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3).addComponent(ElectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(ScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(45, 45, 45).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE).addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))).addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(27, 27, 27)).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(37, 37, 37).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel5).addGap(18, 18, 18).addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(ElectionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(21, 21, 21).addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(ElectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(37, 37, 37).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(ScheduleButton).addComponent(EditButton)).addGap(29, 29, 29).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(BackButton).addComponent(DeleteButton))).addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(32, 32, 32)));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
        setLocationRelativeTo(null);
    }

    private void EmptyInput() {
        ElectionTitle.setText("");
        ElectionDate.setDate(null);
    }

    private void DisplayElections() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            Statement st = con.createStatement();
            String query = "Select * from election;";
            ResultSet rs = st.executeQuery(query);
            ElectionTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void ElectionTitleActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (ElectionTitle.getText().isEmpty() || isDateChooserEmpty(ElectionDate)) {
            JOptionPane.showMessageDialog(this, "Please Enter All details");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String etitle = ElectionTitle.getText();
            String edate = sdf.format(ElectionDate.getDate());
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
                PreparedStatement p = con.prepareStatement("Update election set etitle=? , edate=? where eid=?");
                p.setString(1, etitle);
                p.setString(2, edate);
                p.setInt(3, key);
                p.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "You have successfully Edited Election");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        DisplayElections();
        EmptyInput();
    }

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        dispose();
    }

    private static boolean isDateChooserEmpty(JDateChooser dateChooser) {
        Date selectedDate = dateChooser.getDate();
        return selectedDate == null;
    }

    private void ScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (ElectionTitle.getText().isEmpty() || isDateChooserEmpty(ElectionDate)) {
            JOptionPane.showMessageDialog(this, "Please Enter All details");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String etitle = ElectionTitle.getText();
            String edate = sdf.format(ElectionDate.getDate());
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
                ElectCount();
                PreparedStatement p = con.prepareStatement("Insert Into election values(?,?,?);");
                p.setInt(1, Eid);
                p.setString(2, etitle);
                p.setString(3, edate);
                p.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "You have successfully Scheduled Election");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        DisplayElections();
        EmptyInput();
    }

    int Eid = 0;

    private void ElectCount() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select Max(eid) from election;");
            ResultSet rs = p.executeQuery();
            rs.next();
            Eid = rs.getInt(1) + 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    int key = -1;

    private void ElectionTableMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel) ElectionTable.getModel();
        int MyIndex = ElectionTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        ElectionTitle.setText(model.getValueAt(MyIndex, 1).toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = (Date) model.getValueAt(MyIndex, 2);
        ElectionDate.setDate(date);
    }

    private void ElectionDateFocusGained(java.awt.event.FocusEvent evt) {
    }

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (key == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please Select the Election");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
                PreparedStatement p = con.prepareStatement("Delete from election where eid=?");
                p.setInt(1, key);
                try {
                    p.executeUpdate();
                    JOptionPane.showMessageDialog(rootPane, "You have successfully Deleted Election");
                } catch (java.sql.SQLIntegrityConstraintViolationException e) {
                    JOptionPane.showMessageDialog(this, "Cannot Delete this Election, Because Voters and Candidates are linked with it");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
            DisplayElections();
            EmptyInput();
        }
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
            java.util.logging.Logger.getLogger(ScheduleElection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleElection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleElection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleElection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ScheduleElection().setVisible(true);
            }
        });
    }

    private javax.swing.JButton BackButton;

    private javax.swing.JButton CloseButton;

    private javax.swing.JButton DeleteButton;

    private javax.swing.JButton EditButton;

    private com.toedter.calendar.JDateChooser ElectionDate;

    private javax.swing.JTable ElectionTable;

    private javax.swing.JTextField ElectionTitle;

    private javax.swing.JButton ScheduleButton;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JLabel jLabel8;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JPanel jPanel3;

    private javax.swing.JPanel jPanel5;

    private javax.swing.JScrollPane jScrollPane1;

  
}

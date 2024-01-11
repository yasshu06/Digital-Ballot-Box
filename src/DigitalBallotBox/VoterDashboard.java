package DigitalBallotBox;

import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class VoterDashboard extends javax.swing.JFrame {

    public VoterDashboard() {
        initComponents();
        DisplayCandidate();
    }

    String ElectionName, VUser;

    public VoterDashboard(String Election, String VUsername) {
        initComponents();
        ElectionName = Election;
        VUser = VUsername;
        DisplayCandidate();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        GenderList = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        AgeBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CPhotoLabel = new javax.swing.JLabel();
        VoteButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 40));
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DIGITAL BALLOT BOX");
        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 30));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Voting DashBoard");
        CloseButton.setBackground(new java.awt.Color(102, 153, 255));
        CloseButton.setFont(new java.awt.Font("Arial Black", 1, 14));
        CloseButton.setText("X");
        CloseButton.setBorder(null);
        CloseButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel2Layout.createSequentialGroup().addGap(6, 6, 6).addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2).addComponent(CloseButton))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel3).addContainerGap()));
        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CandidateTable.setBackground(new java.awt.Color(255, 255, 153));
        CandidateTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Candidate Id", "Name", "Gender", "Age" }));
        CandidateTable.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTable);
        jLabel4.setFont(new java.awt.Font("Arial", 3, 24));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Select Your Favorite Candidate");
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap(12, Short.MAX_VALUE).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(9, 9, 9)).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(22, 22, 22)));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel6.setText("Name:");
        NameTextField.setBackground(new java.awt.Color(204, 255, 204));
        NameTextField.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel7.setText("Gender:");
        GenderList.setBackground(new java.awt.Color(204, 255, 204));
        GenderList.setFont(new java.awt.Font("Arial", 1, 18));
        GenderList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female" }));
        GenderList.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderListActionPerformed(evt);
            }
        });
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel8.setText("Age:");
        AgeBox.setBackground(new java.awt.Color(204, 255, 204));
        AgeBox.setFont(new java.awt.Font("Arial", 1, 18));
        AgeBox.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeBoxActionPerformed(evt);
            }
        });
        AgeBox.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                AgeBoxKeyTyped(evt);
            }
        });
        jLabel11.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel11.setText("Years");
        jLabel5.setFont(new java.awt.Font("Arial", 3, 24));
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Candidate Details");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel9.setText("Photo:");
        CPhotoLabel.setFont(new java.awt.Font("Arial", 1, 18));
        CPhotoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        VoteButton.setBackground(new java.awt.Color(102, 153, 255));
        VoteButton.setFont(new java.awt.Font("Arial", 1, 18));
        VoteButton.setText("VOTE");
        VoteButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteButtonActionPerformed(evt);
            }
        });
        jLabel10.setFont(new java.awt.Font("Arial", 3, 20));
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Congratulations! Vote counted");
        BackButton.setBackground(new java.awt.Color(204, 255, 153));
        BackButton.setFont(new java.awt.Font("Arial", 1, 18));
        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel1Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel6).addGap(18, 18, 18).addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel9).addGap(18, 18, 18).addComponent(CPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel7).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(GenderList, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel8).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(AgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel11)).addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(44, 44, 44).addComponent(VoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(47, 47, 47)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 0, Short.MAX_VALUE)).addGroup(jPanel1Layout.createSequentialGroup().addGap(32, 32, 32).addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(GenderList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel11).addComponent(AgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel8)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel9).addComponent(CPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(VoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(75, Short.MAX_VALUE)))));
        jLabel10.setVisible(false);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        pack();
        setLocationRelativeTo(null);
    }

    private void DisplayCandidate() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select Cid,CName,CGender,CAge from Candidate where CElect=?");
            p.setString(1, ElectionName);
            ResultSet rs = p.executeQuery();
            CandidateTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void AgeBoxActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void GenderListActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void AgeBoxKeyTyped(java.awt.event.KeyEvent evt) {
    }

    private ImageIcon ResizePhoto(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newimg = img.getScaledInstance(CPhotoLabel.getWidth(), CPhotoLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }

    int VCount = 0;

    private void VoteCount() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select Max(VoteCount) from Candidate where CElect=?;");
            p.setString(1, ElectionName);
            ResultSet rs = p.executeQuery();
            rs.next();
            VCount = rs.getInt(1) + 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    int Key = -1;

    private void CandidateTableMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel) CandidateTable.getModel();
        int MyIndex = CandidateTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select * from Candidate where Cid=? and CElect=?");
            p.setInt(1, Key);
            p.setString(2, ElectionName);
            ResultSet rs = p.executeQuery();
            rs.next();
            NameTextField.setText(rs.getString(2));
            GenderList.setSelectedItem(rs.getString(3));
            AgeBox.setText(rs.getString(6));
            CPhotoLabel.setIcon(ResizePhoto(null, rs.getBytes(4)));
            NameTextField.setEnabled(false);
            GenderList.setEnabled(false);
            AgeBox.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void VoteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (Key == -1) {
            JOptionPane.showMessageDialog(this, "Please Select You Favorite Candidate");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
                PreparedStatement p = con.prepareStatement("Update Candidate set VoteCount=? where Cid=? and CElect=?");
                VoteCount();
                p.setInt(1, VCount);
                p.setInt(2, Key);
                p.setString(3, ElectionName);
                p.executeUpdate();
                PreparedStatement p1 = con.prepareStatement("Update Voters set Vote=? where VUsername=?");
                p1.setString(1, "true");
                p1.setString(2, VUser);
                p1.executeUpdate();
                JOptionPane.showMessageDialog(this, "You have Successfully Voted to Your Favorite contestant");
                VoteButton.setVisible(false);
                jLabel10.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new LoginPage().setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(VoterDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoterDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoterDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoterDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VoterDashboard().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField AgeBox;

    private javax.swing.JButton BackButton;

    private javax.swing.JLabel CPhotoLabel;

    private javax.swing.JTable CandidateTable;

    private javax.swing.JButton CloseButton;

    private javax.swing.JComboBox<String> GenderList;

    private javax.swing.JTextField NameTextField;

    private javax.swing.JButton VoteButton;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel10;

    private javax.swing.JLabel jLabel11;

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

    private javax.swing.JScrollPane jScrollPane1;

    
}

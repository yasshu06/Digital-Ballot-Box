package DigitalBallotBox;

import java.awt.Image;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Results extends javax.swing.JFrame {

    public Results() {
        initComponents();
        comboboxitems();
    }

    private void comboboxitems() {
        ElectionList.addItem("Select");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select etitle from election");
            ResultSet rs = p.executeQuery();
            ArrayList<String> data = new ArrayList<String>();
            while (rs.next()) {
                data.add(rs.getString("etitle"));
            }
            for (String item : data) {
                ElectionList.addItem(item);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        MainHeading = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        GenderTb = new javax.swing.JLabel();
        NameTb = new javax.swing.JLabel();
        AgeTb = new javax.swing.JLabel();
        CPhotoLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        NoOfVotes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ElectionList = new javax.swing.JComboBox();
        ShowResults = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultTable = new javax.swing.JTable();
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
        jLabel3.setText("Voting Results");
        CloseButton.setBackground(new java.awt.Color(102, 153, 255));
        CloseButton.setFont(new java.awt.Font("Arial Black", 1, 14));
        CloseButton.setText("X");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(56, Short.MAX_VALUE)).addGroup(jPanel2Layout.createSequentialGroup().addGap(121, 121, 121).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(20, 20, 20)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(CloseButton).addComponent(jLabel2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(jLabel3).addContainerGap()).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(jLabel1).addGap(18, 18, 18)))));
        MainHeading.setFont(new java.awt.Font("Arial", 3, 30));
        MainHeading.setForeground(new java.awt.Color(255, 0, 0));
        MainHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainHeading.setText("Candidate On Top");
        MainHeading.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel6.setText("Name:");
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel7.setText("Gender:");
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel8.setText("Age:");
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel9.setText("Photo:");
        GenderTb.setFont(new java.awt.Font("Arial", 2, 18));
        NameTb.setFont(new java.awt.Font("Arial", 2, 18));
        AgeTb.setFont(new java.awt.Font("Arial", 2, 18));
        CPhotoLabel.setFont(new java.awt.Font("Arial", 2, 18));
        CPhotoLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLabel10.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel10.setText("No. of Votes:");
        NoOfVotes.setFont(new java.awt.Font("Arial", 1, 18));
        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Select Election:");
        ElectionList.setBackground(new java.awt.Color(255, 255, 153));
        ElectionList.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionListActionPerformed(evt);
            }
        });
        ShowResults.setBackground(new java.awt.Color(102, 255, 51));
        ShowResults.setFont(new java.awt.Font("Arial", 1, 18));
        ShowResults.setText("Show Result");
        ShowResults.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowResultsActionPerformed(evt);
            }
        });
        ResultTable.setBackground(new java.awt.Color(255, 255, 153));
        ResultTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null } }, new String[] { "Candidate ID", "Name", "Gender", "Age ", "No of Votes" }) {

            boolean[] canEdit = new boolean[] { false, false, false, true, false };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        ResultTable.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ResultTable);
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(24, 24, 24)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addComponent(ShowResults).addGap(156, 156, 156))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(16, 16, 16)))));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4)).addGap(18, 18, 18).addComponent(ShowResults).addGap(19, 19, 19).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(46, 46, 46)));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(GenderTb, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(31, 31, 31).addComponent(CPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(AgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel6).addGap(32, 32, 32).addComponent(NameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(NoOfVotes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(MainHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(jPanel1Layout.createSequentialGroup().addGap(126, 126, 126).addComponent(jButton1))).addContainerGap(9, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(32, 32, 32).addComponent(MainHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel6).addComponent(NameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(GenderTb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel7)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(AgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel8)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(CPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel9)).addGap(7, 7, 7).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(NoOfVotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE).addComponent(jButton1)).addGroup(jPanel1Layout.createSequentialGroup().addGap(27, 27, 27).addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 0, Short.MAX_VALUE))).addContainerGap()));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        pack();
        setLocationRelativeTo(null);
    }

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void ElectionListActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void ShowResultsActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p2 = con.prepareStatement("Select edate from election where etitle=?");
            p2.setString(1, ElectionList.getSelectedItem().toString());
            ResultSet r = p2.executeQuery();
            r.next();
            java.sql.Date edate = r.getDate("edate");
            Calendar calendar = Calendar.getInstance();
            java.sql.Date todayDate = new java.sql.Date(calendar.getTimeInMillis());
            if (todayDate.before(edate)) {
                JOptionPane.showMessageDialog(this, "Election has not been conducted yet");
            } else {
                PreparedStatement p = con.prepareStatement("Select Cid,CName,CGender,CAge,VoteCount from Candidate where CElect=? ORDER BY VoteCount DESC");
                p.setString(1, ElectionList.getSelectedItem().toString());
                ResultSet rs = p.executeQuery();
                ResultTable.setModel(DbUtils.resultSetToTableModel(rs));
                PreparedStatement p1 = con.prepareStatement("Select * from Candidate where VoteCount=(Select MAX(VoteCount) From Candidate) and CElect=?");
                p1.setString(1, ElectionList.getSelectedItem().toString());
                ResultSet res = p1.executeQuery();
                boolean b = res.next();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String edateStr = dateFormat.format(edate);
                String todayDateStr = dateFormat.format(todayDate);
                if (!edateStr.equals(todayDateStr)) {
                    MainHeading.setText("Winner Candidate");
                } else {
                    MainHeading.setText("Candidate On Top");
                }
                NameTb.setText(res.getString(2));
                GenderTb.setText(res.getString(3));
                AgeTb.setText(String.valueOf(res.getInt(6)));
                CPhotoLabel.setIcon(ResizePhoto(null, res.getBytes(4)));
                NoOfVotes.setText(String.valueOf(res.getInt(7)));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        new AdminDashboard().setVisible(true);
        this.dispose();
    }

    int Key = -1;

    private void ResultTableMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel) ResultTable.getModel();
        int MyIndex = ResultTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select * from Candidate where Cid=? and CElect=?");
            p.setInt(1, Key);
            p.setString(2, ElectionList.getSelectedItem().toString());
            ResultSet res = p.executeQuery();
            res.next();
            MainHeading.setText("Candidate Details");
            NameTb.setText(res.getString(2));
            GenderTb.setText(res.getString(3));
            AgeTb.setText(String.valueOf(res.getInt(6)));
            CPhotoLabel.setIcon(ResizePhoto(null, res.getBytes(4)));
            NoOfVotes.setText(String.valueOf(res.getInt(7)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
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
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Results().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel AgeTb;

    private javax.swing.JLabel CPhotoLabel;

    private javax.swing.JButton CloseButton;

    private javax.swing.JComboBox<String> ElectionList;

    private javax.swing.JLabel GenderTb;

    private javax.swing.JLabel MainHeading;

    private javax.swing.JLabel NameTb;

    private javax.swing.JLabel NoOfVotes;

    private javax.swing.JTable ResultTable;

    private javax.swing.JButton ShowResults;

    private javax.swing.JButton jButton1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel10;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JLabel jLabel8;

    private javax.swing.JLabel jLabel9;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JPanel jPanel2;

    private javax.swing.JPanel jPanel3;

    private javax.swing.JScrollPane jScrollPane1;

   
}

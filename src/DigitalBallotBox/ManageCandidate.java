package DigitalBallotBox;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ManageCandidate extends javax.swing.JFrame {

    public ManageCandidate() {
        initComponents();
        comboboxitems();
        comboboxitems2();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTable = new javax.swing.JTable();
        ElectionList = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        ShowCandidates = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ElectionList1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        GenderList = new javax.swing.JComboBox();
        AgeBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        CPhotoLabel = new javax.swing.JLabel();
        BrowsePhoto = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 40));
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DIGITAL BALLOT BOX");
        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 30));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Candidates");
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
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 0, Short.MAX_VALUE))).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel1).addGap(12, 12, 12)).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2).addComponent(CloseButton)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel3)))));
        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CandidateTable.setBackground(new java.awt.Color(255, 255, 153));
        CandidateTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Candidate ID", "Candidate Name", "Gender", "Age" }));
        CandidateTable.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTable);
        ElectionList.setBackground(new java.awt.Color(255, 255, 153));
        ElectionList.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionListActionPerformed(evt);
            }
        });
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setText("Select Election:");
        ShowCandidates.setBackground(new java.awt.Color(153, 255, 153));
        ShowCandidates.setFont(new java.awt.Font("Arial", 0, 18));
        ShowCandidates.setText("Show Candidates");
        ShowCandidates.setBorder(null);
        ShowCandidates.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowCandidatesActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap(14, Short.MAX_VALUE).addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(14, 14, 14)).addGroup(jPanel4Layout.createSequentialGroup().addGap(150, 150, 150).addComponent(ShowCandidates, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(ShowCandidates, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jLabel5.setFont(new java.awt.Font("Arial", 3, 24));
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add Candidate");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setText("Name:");
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel7.setText("Gender:");
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setText("Age:");
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel9.setText("Photo:");
        ElectionList1.setBackground(new java.awt.Color(204, 255, 204));
        ElectionList1.setFont(new java.awt.Font("Arial", 1, 14));
        ElectionList1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionList1ActionPerformed(evt);
            }
        });
        jLabel10.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel10.setText("Select Election:");
        NameTextField.setBackground(new java.awt.Color(204, 255, 204));
        NameTextField.setFont(new java.awt.Font("Arial", 1, 14));
        GenderList.setBackground(new java.awt.Color(204, 255, 204));
        GenderList.setFont(new java.awt.Font("Arial", 1, 14));
        GenderList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female" }));
        AgeBox.setBackground(new java.awt.Color(204, 255, 204));
        AgeBox.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel11.setText("Years");
        AddButton.setBackground(new java.awt.Color(51, 204, 255));
        AddButton.setFont(new java.awt.Font("Arial", 1, 18));
        AddButton.setText("Add");
        AddButton.setBorder(null);
        AddButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        EditButton.setBackground(new java.awt.Color(102, 255, 102));
        EditButton.setFont(new java.awt.Font("Arial", 1, 18));
        EditButton.setText("Edit");
        EditButton.setBorder(null);
        EditButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        DeleteButton.setBackground(new java.awt.Color(255, 0, 0));
        DeleteButton.setFont(new java.awt.Font("Arial", 1, 18));
        DeleteButton.setText("Delete");
        DeleteButton.setBorder(null);
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        BackButton.setBackground(new java.awt.Color(255, 255, 0));
        BackButton.setFont(new java.awt.Font("Arial", 1, 18));
        BackButton.setText("Back");
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        CPhotoLabel.setBackground(new java.awt.Color(153, 153, 0));
        CPhotoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        BrowsePhoto.setBackground(new java.awt.Color(204, 255, 204));
        BrowsePhoto.setText("Browse");
        BrowsePhoto.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowsePhotoActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(ElectionList1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel6).addGap(18, 18, 18).addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel7).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(GenderList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel9).addGap(18, 18, 18).addComponent(BrowsePhoto))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(AgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel11)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(CPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(25, 25, 25)))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(51, 51, 51).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(25, 25, 25)).addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addComponent(jLabel10)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(27, 27, 27).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 40, Short.MAX_VALUE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel5).addGap(9, 9, 9).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(ElectionList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(GenderList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel8).addComponent(AgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel11)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel9).addComponent(CPhotoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(BrowsePhoto)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE).addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap()))));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        pack();
        setLocationRelativeTo(null);
    }

    private void DisplayVoterTable() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select Cid,CName,CGender,CAge from Candidate where CElect=?");
            p.setString(1, ElectionList1.getSelectedItem().toString());
            ResultSet rs = p.executeQuery();
            CandidateTable.setModel(DbUtils.resultSetToTableModel(rs));
            ElectionList.setSelectedItem(ElectionList1.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void EmptyInput() {
        ElectionList1.setSelectedItem("Select");
        NameTextField.setText("");
        GenderList.setSelectedItem("Select");
        AgeBox.setText("");
        CPhotoLabel.setIcon(null);
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

    private void comboboxitems2() {
        ElectionList1.addItem("Select");
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
                ElectionList1.addItem(item);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void ElectionListActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void ShowCandidatesActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select Cid,CName,CGender,CAge from Candidate where CElect=?");
            p.setString(1, ElectionList.getSelectedItem().toString());
            ResultSet rs = p.executeQuery();
            CandidateTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void ElectionList1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (NameTextField.getText().isEmpty() || GenderList.getSelectedItem().equals("Select") || AgeBox.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter all details");
        } else if (imgpath != null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
                PreparedStatement p2 = con.prepareStatement("Select edate from election where etitle=?");
                p2.setString(1, ElectionList1.getSelectedItem().toString());
                ResultSet r = p2.executeQuery();
                r.next();
                java.sql.Date edate = r.getDate("edate");
                Calendar calendar = Calendar.getInstance();
                java.sql.Date todayDate = new java.sql.Date(calendar.getTimeInMillis());
                if (todayDate.before(edate) || todayDate.equals(edate)) {
                    InputStream img = new FileInputStream(imgpath);
                    PreparedStatement p = con.prepareStatement("Update Candidate set CName=?, CGender=?,CPhoto=?,CAge=? Where Cid=? and CElect=?;");
                    p.setString(1, NameTextField.getText());
                    p.setString(2, GenderList.getSelectedItem().toString());
                    p.setBlob(3, img);
                    p.setInt(4, Integer.parseInt(AgeBox.getText()));
                    p.setInt(5, Key);
                    p.setString(6, ElectionList1.getSelectedItem().toString());
                    p.executeUpdate();
                    JOptionPane.showMessageDialog(this, " Candidate Updated");
                    DisplayVoterTable();
                    EmptyInput();
                } else {
                    JOptionPane.showMessageDialog(this, "I apologize, but the time period for editing candidate details has expired");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select Photo");
            CPhotoLabel.setIcon(null);
        }
    }

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (Key == -1) {
            JOptionPane.showMessageDialog(this, "Please Select the candidate");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
                PreparedStatement p = con.prepareStatement("Delete from Candidate Where Cid=? and CElect=?;");
                p.setInt(1, Key);
                p.setString(2, ElectionList1.getSelectedItem().toString());
                p.executeUpdate();
                JOptionPane.showMessageDialog(this, "Candidate Deleted Successfully;");
                DisplayVoterTable();
                EmptyInput();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        dispose();
    }

    String imgpath = null;

    private void BrowsePhotoActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg", "jpeg", "png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            String Path = selectedFile.getAbsolutePath();
            CPhotoLabel.setIcon(ResizePhoto(Path, null));
            imgpath = Path;
        }
    }

    int Cid = 0;

    private void CandidateCount() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select Max(Cid) from Candidate where CElect=?;");
            p.setString(1, (String) ElectionList1.getSelectedItem());
            ResultSet rs = p.executeQuery();
            rs.next();
            Cid = rs.getInt(1) + 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (ElectionList1.getSelectedItem().equals("Select")) {
            JOptionPane.showMessageDialog(this, "Select Election");
        } else if (NameTextField.getText().isEmpty() || GenderList.getSelectedItem().equals("Select") || AgeBox.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter all details");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
                PreparedStatement p2 = con.prepareStatement("Select edate from election where etitle=?");
                p2.setString(1, ElectionList1.getSelectedItem().toString());
                ResultSet r = p2.executeQuery();
                r.next();
                java.sql.Date edate = r.getDate("edate");
                Calendar calendar = Calendar.getInstance();
                java.sql.Date todayDate = new java.sql.Date(calendar.getTimeInMillis());
                if (todayDate.before(edate) || todayDate.equals(edate)) {
                    InputStream img = new FileInputStream(imgpath);
                    CandidateCount();
                    PreparedStatement p = con.prepareStatement("Insert Into Candidate values(?,?,?,?,?,?,?);");
                    p.setInt(1, Cid);
                    p.setString(2, NameTextField.getText());
                    p.setString(3, GenderList.getSelectedItem().toString());
                    p.setBlob(4, img);
                    p.setString(5, ElectionList1.getSelectedItem().toString());
                    p.setInt(6, Integer.parseInt(AgeBox.getText()));
                    p.setInt(7, 0);
                    p.executeUpdate();
                    JOptionPane.showMessageDialog(this, "You have Successfully Added Candidate");
                    DisplayVoterTable();
                    EmptyInput();
                } else {
                    JOptionPane.showMessageDialog(this, "Time Period for Adding Candidates is Over");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
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
            p.setString(2, ElectionList.getSelectedItem().toString());
            ResultSet rs = p.executeQuery();
            rs.next();
            ElectionList1.setSelectedItem(rs.getString(5));
            ElectionList1.setEnabled(false);
            NameTextField.setText(rs.getString(2));
            GenderList.setSelectedItem(rs.getString(3));
            AgeBox.setText(rs.getString(6));
            CPhotoLabel.setIcon(ResizePhoto(null, rs.getBytes(4)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageCandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ManageCandidate().setVisible(true);
            }
        });
    }

    private javax.swing.JButton AddButton;

    private javax.swing.JTextField AgeBox;

    private javax.swing.JButton BackButton;

    private javax.swing.JButton BrowsePhoto;

    private javax.swing.JLabel CPhotoLabel;

    private javax.swing.JTable CandidateTable;

    private javax.swing.JButton CloseButton;

    private javax.swing.JButton DeleteButton;

    private javax.swing.JButton EditButton;

    private javax.swing.JComboBox<String> ElectionList;

    private javax.swing.JComboBox<String> ElectionList1;

    private javax.swing.JComboBox<String> GenderList;

    private javax.swing.JTextField NameTextField;

    private javax.swing.JButton ShowCandidates;

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

    private javax.swing.JPanel jPanel4;

    private javax.swing.JScrollPane jScrollPane1;

   
}

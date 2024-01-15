package DigitalBallotBox;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ManageVoters extends javax.swing.JFrame {

    public ManageVoters() {
        initComponents();
        comboboxitems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VoterTable = new javax.swing.JTable();
        ElectionList = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        ShowVoters = new javax.swing.JButton();
        ShowPassword = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        jLabel12 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
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
        jLabel3.setText("Manage Voters");
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
        VoterTable.setBackground(new java.awt.Color(255, 255, 153));
        VoterTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null } }, new String[] { "Voter ID", "Voter Name", "Gender", "Age", "Username" }));
        VoterTable.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VoterTable);
        ElectionList.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionListActionPerformed(evt);
            }
        });
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setText("Select Election:");
        ShowVoters.setBackground(new java.awt.Color(153, 255, 153));
        ShowVoters.setFont(new java.awt.Font("Arial", 1, 18));
        ShowVoters.setText("Show Voters");
        ShowVoters.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowVotersActionPerformed(evt);
            }
        });
        ShowPassword.setBackground(new java.awt.Color(204, 255, 102));
        ShowPassword.setFont(new java.awt.Font("Arial", 1, 18));
        ShowPassword.setText("Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap(14, Short.MAX_VALUE).addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addComponent(ShowPassword).addGap(143, 143, 143)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(ShowVoters)).addGap(10, 10, 10)))));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4)).addGap(8, 8, 8).addComponent(ShowVoters).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(ShowPassword).addContainerGap()));
        jLabel5.setFont(new java.awt.Font("Arial", 3, 36));
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add Voter");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setText("Name:");
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel7.setText("Gender:");
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setText("Age:");
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
        GenderList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female" }));
        AgeBox.setBackground(new java.awt.Color(204, 255, 204));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel11.setText("Years");
        AddButton.setBackground(new java.awt.Color(51, 204, 255));
        AddButton.setFont(new java.awt.Font("Arial", 1, 18));
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        EditButton.setBackground(new java.awt.Color(102, 255, 102));
        EditButton.setFont(new java.awt.Font("Arial", 1, 18));
        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        DeleteButton.setBackground(new java.awt.Color(255, 0, 0));
        DeleteButton.setFont(new java.awt.Font("Arial", 1, 18));
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        BackButton.setBackground(new java.awt.Color(255, 255, 0));
        BackButton.setFont(new java.awt.Font("Arial", 1, 18));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jLabel12.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel12.setText("Password:");
        PasswordField.setBackground(new java.awt.Color(204, 255, 204));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel9.setText("Username:");
        UsernameField.setBackground(new java.awt.Color(204, 255, 204));
        UsernameField.setFont(new java.awt.Font("Arial", 1, 14));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel9).addGap(38, 38, 38).addComponent(UsernameField)).addGroup(jPanel1Layout.createSequentialGroup().addGap(116, 116, 116).addComponent(ElectionList1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel6).addGap(70, 70, 70).addComponent(NameTextField)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(36, 36, 36).addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(AgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(25, 25, 25).addComponent(jLabel11))).addComponent(jLabel10).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel7).addGap(58, 58, 58).addComponent(GenderList, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(31, 31, 31).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(DeleteButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(57, 57, 57))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(BackButton).addComponent(EditButton)).addGap(38, 38, 38))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(11, 11, 11)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(27, 27, 27).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(27, 27, 27)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel5).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(ElectionList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(GenderList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(AgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel11)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel12).addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(EditButton).addComponent(AddButton)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(DeleteButton).addComponent(BackButton)).addGap(0, 15, Short.MAX_VALUE)))));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxitems() {
        ElectionList.addItem("Select");
        ElectionList1.addItem("Select");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select etitle from election;");
            ResultSet rs = p.executeQuery();
            ArrayList<String> data = new ArrayList<String>();
            while (rs.next()) {
                data.add(rs.getString("etitle"));
            }
            for (String item : data) {
                ElectionList.addItem(item);
                ElectionList1.addItem(item);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void DisplayVoterTable() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select Vid,VName,VGender,VAge,VUsername from Voters where VElect=?");
            p.setString(1, ElectionList1.getSelectedItem().toString());
            ResultSet rs = p.executeQuery();
            VoterTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        PasswordField.setText("");
        UsernameField.setText("");
    }

    int Key = -1;

    private void VoterTableMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel) VoterTable.getModel();
        int MyIndex = VoterTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select * from Voters where Vid=? and VElect=?");
            p.setInt(1, Key);
            p.setString(2, ElectionList.getSelectedItem().toString());
            ResultSet rs = p.executeQuery();
            rs.next();
            ElectionList1.setSelectedItem(rs.getString(6));
            ElectionList1.setEnabled(false);
            NameTextField.setText(rs.getString(2));
            PasswordField.setText(rs.getString(5));
            GenderList.setSelectedItem(rs.getString(3));
            AgeBox.setText(rs.getString(4));
            UsernameField.setText(rs.getString(7));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void ElectionListActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void ShowVotersActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select Vid,VName,VGender,VAge,VUsername from Voters where VElect=?");
            p.setString(1, ElectionList.getSelectedItem().toString());
            ResultSet rs = p.executeQuery();
            VoterTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void ElectionList1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    int Vid = 0;

    private void VoterCount() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
            PreparedStatement p = con.prepareStatement("Select Max(Vid) from Voters where VElect=?;");
            p.setString(1, (String) ElectionList1.getSelectedItem());
            ResultSet rs = p.executeQuery();
            rs.next();
            Vid = rs.getInt(1) + 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (ElectionList1.getSelectedItem().equals("Select")) {
            JOptionPane.showMessageDialog(this, "Select Election");
        } else if (NameTextField.getText().isEmpty() || GenderList.getSelectedItem().equals("Select") || AgeBox.getText().isEmpty() || PasswordField.getText().isEmpty()) {
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
                    VoterCount();
                    PreparedStatement p = con.prepareStatement("Insert Into Voters values(?,?,?,?,?,?,?,?);");
                    p.setInt(1, Vid);
                    p.setString(2, NameTextField.getText());
                    p.setString(3, GenderList.getSelectedItem().toString());
                    p.setInt(4, Integer.parseInt(AgeBox.getText()));
                    p.setString(5, PasswordField.getText());
                    p.setString(6, ElectionList1.getSelectedItem().toString());
                    p.setString(7, UsernameField.getText());
                    p.setString(8, "false");
                    p.executeUpdate();
                    JOptionPane.showMessageDialog(this, "You have Successfully Added Voter");
                    DisplayVoterTable();
                    EmptyInput();
                } else {
                    JOptionPane.showMessageDialog(this, "Time Period for adding Voters is Over");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (NameTextField.getText().isEmpty() || GenderList.getSelectedItem().equals("Select") || AgeBox.getText().isEmpty() || PasswordField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter all details");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
                PreparedStatement p = con.prepareStatement("Update Voters set VName=?, VGender=?,VPassword=?,VAge=?,VUsername=? Where Vid=? and VElect=?;");
                p.setString(1, NameTextField.getText());
                p.setString(2, GenderList.getSelectedItem().toString());
                p.setString(3, PasswordField.getText());
                p.setInt(4, Integer.parseInt(AgeBox.getText()));
                p.setString(5, UsernameField.getText());
                p.setInt(6, Key);
                p.setString(7, ElectionList1.getSelectedItem().toString());
                p.executeUpdate();
                JOptionPane.showMessageDialog(this, "Voter Details Updated");
                DisplayVoterTable();
                EmptyInput();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (Key == -1) {
            JOptionPane.showMessageDialog(this, "Please Select the Voter");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
                PreparedStatement p = con.prepareStatement("Delete from Voters Where Vid=? and VElect=?;");
                p.setInt(1, Key);
                p.setString(2, ElectionList1.getSelectedItem().toString());
                p.executeUpdate();
                JOptionPane.showMessageDialog(this, "Voter Deleted Successfully;");
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

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {
        if (Key == -1) {
            JOptionPane.showMessageDialog(this, "Please Select the Voter");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://evs.ck0eaa1knnbn.eu-north-1.rds.amazonaws.com:3306/evs?useSSL=false&allowPublicKeyRetrieval=true", "root", "Yash1234");
                PreparedStatement p = con.prepareStatement("Select VPassword from Voters Where Vid=? and VElect=?;");
                p.setInt(1, Key);
                p.setString(2, ElectionList1.getSelectedItem().toString());
                ResultSet rs = p.executeQuery();
                rs.next();
                JOptionPane.showMessageDialog(this, "Your Password is : " + rs.getString(1));
                DisplayVoterTable();
                EmptyInput();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
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
            java.util.logging.Logger.getLogger(ManageVoters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageVoters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageVoters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageVoters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ManageVoters().setVisible(true);
            }
        });
    }
// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;

    private javax.swing.JTextField AgeBox;

    private javax.swing.JButton BackButton;

    private javax.swing.JButton CloseButton;

    private javax.swing.JButton DeleteButton;

    private javax.swing.JButton EditButton;

    private javax.swing.JComboBox<String> ElectionList;

    private javax.swing.JComboBox<String> ElectionList1;

    private javax.swing.JComboBox<String> GenderList;

    private javax.swing.JTextField NameTextField;

    private javax.swing.JPasswordField PasswordField;

    private javax.swing.JButton ShowPassword;

    private javax.swing.JButton ShowVoters;

    private javax.swing.JTextField UsernameField;

    private javax.swing.JTable VoterTable;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel10;

    private javax.swing.JLabel jLabel11;

    private javax.swing.JLabel jLabel12;

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

    // End of variables declaration//GEN-END:variables

}

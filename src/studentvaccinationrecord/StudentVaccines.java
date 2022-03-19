/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentvaccinationrecord;

import Class.StudentVaccinesClass;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import studentvaccinatio.record.Crypto.Asymmetric;
import studentvaccinatio.record.Crypto.Crypto;
import studentvaccinatio.record.Crypto.KeyAccess;
import studentvaccinatio.record.KeyGenerator.MyKeyPair;

/**
 *
 * @author cweng
 */
public class StudentVaccines extends javax.swing.JFrame {

    /**
     *
     */
    boolean isFound = false;
    public static ArrayList<StudentVaccinesClass> StudentID = new ArrayList<StudentVaccinesClass>();
    /**
     * Creates new form StudentVaccines
     */
    public StudentVaccines() {
        initComponents();
        
    }
    static Crypto crypto = new Asymmetric("RSA");
	
	static String send( String data, PublicKey key ) throws Exception{
		return crypto.encrypt(data, key);
	}
	
	static String receive(String cipherText, PrivateKey key) throws Exception {
		return crypto.decrypt(cipherText, key);
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtVacExpDate = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaEncryptData = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStuName = new javax.swing.JTextField();
        txtVacName = new javax.swing.JTextField();
        txtVacBatch = new javax.swing.JTextField();
        txtStuId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaVacInfo = new javax.swing.JTextArea();
        btnDecrypt = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Vaccination");
        setLocation(new java.awt.Point(800, 400));

        btnAdd.setText("Add");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtaEncryptData.setEditable(false);
        txtaEncryptData.setColumns(20);
        txtaEncryptData.setLineWrap(true);
        txtaEncryptData.setRows(5);
        jScrollPane1.setViewportView(txtaEncryptData);

        jLabel1.setText("Student ID");

        jLabel3.setText("Student Name");

        jLabel4.setText("Vaccine Name");

        jLabel6.setText("Vaccine Batch");

        jLabel7.setText("Vaccine Expired Date");

        txtStuName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStuNameActionPerformed(evt);
            }
        });

        jLabel8.setText("Encrypted Vaccine's Info");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtaVacInfo.setEditable(false);
        txtaVacInfo.setColumns(20);
        txtaVacInfo.setRows(5);
        jScrollPane2.setViewportView(txtaVacInfo);

        btnDecrypt.setText("Decrypt");
        btnDecrypt.setEnabled(false);
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        jLabel9.setText("Decrypted after Add data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSearch)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClear)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBack)))))))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVacExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVacBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStuName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVacName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStuId, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnDecrypt)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtStuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVacName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtVacBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtVacExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear)
                    .addComponent(btnBack)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDecrypt)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if( new File("KeyPair").exists() ) {
            try {
                //show
                PublicKey pubKey = KeyAccess.getPublicKey("KeyPair/PublicKey");
                PrivateKey prvKey = KeyAccess.getPrivateKey("KeyPair/PrivateKey");


String dtStuId= txtStuId.getText();
String dtStuName = txtStuName.getText();
String dtVacName = txtVacName.getText();
String dtVacBatch = txtVacBatch.getText();
String dtVacExpDate = txtVacExpDate.getText();
String VacDetail ="Vaccine Name: "+dtVacName+" , Batch: "+dtVacBatch+" , Expired Date: "+dtVacExpDate;
String cipherText = send( VacDetail, pubKey );
txtaEncryptData.setText( cipherText );
String dtEncryptData = txtaEncryptData.getText();


 if (dtStuId.isEmpty() || dtStuName.isEmpty() || dtVacName.isEmpty()|| dtVacBatch.isEmpty()|| dtVacExpDate.isEmpty() || dtEncryptData.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
           
        } 
      //if no found the txtfile, create new txtfile
      //if got, read from the txtfile based on the data seperate by ","
        else {
            File file = new File("StudentVaccinesLedger.txt");
            StudentVaccinesClass studentvaccines = new StudentVaccinesClass(dtStuId, dtStuName, dtVacName,dtVacBatch,dtVacExpDate,cipherText);
      //add new vaccine data
            try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
                pw.println(studentvaccines.toString());
                //alert
                JOptionPane.showMessageDialog(this, "Student "+dtStuId+" had been added vaccination detail. ");
                   
                //button and textbox enable or disable
                btnAdd.setEnabled(false);
                btnDecrypt.setEnabled(true);
                txtStuId.setEditable(false);
                txtStuName.setEditable(false);
                txtVacName.setEditable(false);
                txtVacBatch.setEditable(false);
                txtVacExpDate.setEditable(false);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }          
        }     

            } catch (Exception ex) {
                Logger.getLogger(StudentVaccines.class.getName()).log(Level.SEVERE, null, ex);
            }
			
		}else {
			//create
			MyKeyPair.create();
		}

    
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainMenu mainmenupage = new MainMenu();
        mainmenupage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtStuNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStuNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStuNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search_name = txtStuId.getText();
        //search_name is empty, show alert
        if (search_name.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Please insert Student Id to search.");

        } else {
            //if not found the txtfile, create new
            //if got read from the txtfile
            File file = new File("StudentVaccinesLedger.txt");
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String data;
                StudentVaccinesClass studentvaccinesclass;
                while ((data = br.readLine()) != null) {
                    studentvaccinesclass = new StudentVaccinesClass(data);
                    //if student id found, get other data
                    if (studentvaccinesclass.getStuId().equals(search_name)) {
                        isFound = true;
                        //Show message
                        JOptionPane.showMessageDialog(this,"Student "+search_name+" was already taken vaccine before. ");
                        //label,textbox and button to enable or disable

                        txtStuName.setText(studentvaccinesclass.getStuName());
                        txtVacName.setText(studentvaccinesclass.getVacName());
                        txtVacBatch.setText(studentvaccinesclass.getVacBatch());
                        txtVacExpDate.setText(studentvaccinesclass.getVacExpDate());
                        txtaEncryptData.setText(studentvaccinesclass.getEncryptData());                   
                        txtStuId.setEditable(false);
                        txtStuName.setEditable(false);
                        txtVacName.setEditable(false);
                        txtVacBatch.setEditable(false);
                        txtVacExpDate.setEditable(false);
                        btnSearch.setEnabled(false);
                        
                        return;
                    }
                }
                //If data not exist in system
                JOptionPane.showMessageDialog(this, "Student "+search_name+" WAS NOT taken vaccine yet. ");
                
                //label,textbox and button to enable or disable
                txtStuId.setEditable(false);
                btnSearch.setEnabled(false);
                btnAdd.setEnabled(true);
            } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            } catch (Exception ex) {
                Logger.getLogger(StudentVaccines.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //File file = new File("StudentVaccinesLedger.txt");
        //BufferedReader reader = null;
        //try {
            //	reader = new BufferedReader(new FileReader(file));
            //	String text;
            //
            //
            //	while ((text = reader.readLine()) != null) {
                //		jTextArea2.setText(text);
                //
                //	}
            //
            //}
        //catch (FileNotFoundException ex) {
            //            Logger.getLogger(StudentVaccines.class.getName()).log(Level.SEVERE, null, ex);
            //      } catch (IOException ex) {
            //            Logger.getLogger(StudentVaccines.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtStuId.setEditable(true);
        txtStuName.setEditable(true);
        txtVacName.setEditable(true);
        txtVacBatch.setEditable(true);
        txtVacExpDate.setEditable(true);
        txtStuId.setText("");
        txtStuName.setText("");
        txtVacName.setText("");
        txtVacBatch.setText("");
        txtVacExpDate.setText("");
        txtaEncryptData.setText("");
        txtaVacInfo.setText("");
        btnSearch.setEnabled(true);
        btnAdd.setEnabled(false);
        btnDecrypt.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        // TODO add your handling code here:
        String cipherText = txtaEncryptData.getText();
        try{
        PrivateKey prvKey = KeyAccess.getPrivateKey("KeyPair/PrivateKey");
                        
                        String content = receive( cipherText, prvKey );
                        txtaVacInfo.setText(content);
                        btnDecrypt.setEnabled(false);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnDecryptActionPerformed

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
            java.util.logging.Logger.getLogger(StudentVaccines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentVaccines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentVaccines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentVaccines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentVaccines().setVisible(true);
            }
        });
        
         try{
         
            Scanner s = new Scanner(new File("StudentVaccinesLedger.txt"));
            s.useDelimiter(",");
            while(s.hasNext()){        
                ArrayList<StudentVaccinesClass> studentlist = new ArrayList<>();
                String line1 = s.next();    //name
                String line2 = s.next();      //pin
                String line3 = s.next();      //email  
                String line4 = s.next(); //hpnumber
                String line5 = s.next(); //address
                String line6 = s.next();
                StudentVaccinesClass student = new StudentVaccinesClass(line1,line2,line3,line4,line5,line6);
                studentlist.add(student);
            }} catch(FileNotFoundException ex){
            System.out.println("File not found when you first time run this!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtStuId;
    private javax.swing.JTextField txtStuName;
    private javax.swing.JTextField txtVacBatch;
    private javax.swing.JTextField txtVacExpDate;
    private javax.swing.JTextField txtVacName;
    private javax.swing.JTextArea txtaEncryptData;
    private javax.swing.JTextArea txtaVacInfo;
    // End of variables declaration//GEN-END:variables
}

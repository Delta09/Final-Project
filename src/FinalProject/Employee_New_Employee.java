/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FinalProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Daanyaal
 */
public class Employee_New_Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee_New_Employee
     */
    public Employee_New_Employee() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back_Button = new javax.swing.JButton();
        Username_Input = new javax.swing.JTextField();
        Password_Input = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        information_Username = new javax.swing.JLabel();
        Information_Password = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Back_Button.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        Username_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_InputActionPerformed(evt);
            }
        });

        Password_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_InputActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter New Employee ID Number:");

        jLabel2.setText("Enter New Employee Password :");

        jLabel3.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel3.setText("Create New Employee Login");

        Create.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        information_Username.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        information_Username.setForeground(new java.awt.Color(0, 51, 255));
        information_Username.setText("i");
        information_Username.setToolTipText("Username must cotain only numbers.");

        Information_Password.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        Information_Password.setForeground(new java.awt.Color(0, 51, 255));
        Information_Password.setText("i");
        Information_Password.setToolTipText("Password must contain: \n2 Uppercase letters, \n2 numers, \nCan only be letters and numbers.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Back_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Create))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Username_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Password_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(information_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(Information_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Username_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(information_Username))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Password_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Information_Password))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_Button)
                    .addComponent(Create))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        this.setVisible(false);
        Employee_Interface f = new Employee_Interface();
        f.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
    Employee_New_Employee_Error eNEE = new Employee_New_Employee_Error();
        
    boolean status = true;
    
    for (int i = 0; i < Username_Input.getText().length(); i++) 
    {
        try
        {
            Integer.parseInt(Username_Input.getText());                          //makes sure username is in integers
            status = true;
        }
        catch (NumberFormatException e)
        {
            eNEE.Message.setText("ID can only be a number!");
            eNEE.setVisible(true);
            status = false;
        }
    }
    
    int length = 0;                                                             // Stores the number characters in the password
    int numCount = 0;                                                           // Variable used to store numbers in the password
    int capCount = 0;                                                           // Variable used to store capital letters in the password
    
    String password = Arrays.toString(Password_Input.getPassword());
    String Password = password.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\, ", "");
    for (int x =0; x < Password.length() ; x++)
    {
	if (Password.charAt(x) >= 47 && Password.charAt(x) <= 58 || Password.charAt(x) >= 64 && Password.charAt(x) <= 91 || Password.charAt(x) >= 97 && Password.charAt(x) <= 122) 
        {                                                                       //Keep the Password
	} 
        else 
        {
            eNEE.Message.setText("Password Contains Invalid Character!");	//Checks that password contains only letters and numbers
            eNEE.setVisible(true);
	}

	if (Password.charAt(x) > 47 && Password.charAt(x) < 58) 
        {		
            numCount ++;                                                        // Counts the number of numbers in password
	}

	if (Password.charAt(x) > 64 && Password.charAt(x)< 91) 
        {		
            capCount ++;                                                        // Counts the number of capital letters
	}

	length = (x + 1);							// Counts the passwords length

	} // Ends the for loop

    if (numCount < 2)
    {										// Checks that password contains two numbers
        eNEE.Message.setText("Not Enough Numbers in Password!");
        eNEE.setVisible(true);
    }

    if (capCount < 2) 
    {										// Checks that password contains two capital letters
        eNEE.Message.setText("Not Enough Capital Letters in Password!");
        eNEE.setVisible(true);
    }

    if (length < 8)
    {										// Checks that password is long enough
        eNEE.Message.setText("Password is Too Short!");
        eNEE.setVisible(true);
    }
        
        
    if (length >= 8 && capCount >= 2 && numCount >= 2 && status == true)
    {     
        
        try { 
            BufferedWriter pswd = new BufferedWriter(new FileWriter("Password.txt" , true));   //writes password to file
            pswd.newLine();
            pswd.append(Password);
            pswd.close(); 
        } 
        catch (IOException ex) {}
        
         try { 
            BufferedWriter user = new BufferedWriter(new FileWriter("Username.txt" , true));    //writes username to file
            user.newLine();
            user.append(Username_Input.getText());
            user.close(); 
        } 
        catch (IOException ex) {}
        
        this.setVisible(false);
        Employee_New_Employee_Notification f = new Employee_New_Employee_Notification();
        f.setVisible(true);
    }
    }//GEN-LAST:event_CreateActionPerformed

    private void Username_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_InputActionPerformed
     
    }//GEN-LAST:event_Username_InputActionPerformed

    private void Password_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_InputActionPerformed
        
    }//GEN-LAST:event_Password_InputActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_New_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_New_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_New_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_New_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_New_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Create;
    private javax.swing.JLabel Information_Password;
    public javax.swing.JPasswordField Password_Input;
    public javax.swing.JTextField Username_Input;
    private javax.swing.JLabel information_Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
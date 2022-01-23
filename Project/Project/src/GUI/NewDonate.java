/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import project.BLL;
import project.Organization;
import project.OtherItems;
import project.Projects;
import project.Donation;
import project.Donor;
import project.Gift;
import project.Loan;
import project.Pledge;
/**
 *
 * @author Faizan
 */
public class NewDonate extends javax.swing.JFrame {
    int count;
    Organization o;
    project.Projects P;
    
    
    /**
     * Creates new form Donate
     */
    public NewDonate() {
        initComponents();
    }
    public NewDonate(Organization o1, project.Projects P2,int counter) {
        initComponents();
        o=o1;
        P=P2;
        count=counter;
        oName.setText(o1.name);
        pName.setText(P2.projName);
       // fundsRad.setVisible(false);
        //otherRad.setVisible(false);
        loanRad.setVisible(false);
        giftRad.setVisible(false);
        payRad.setVisible(false);
        laterRad.setVisible(false);
        amLbl.setVisible(false);
        retDLbl.setVisible(false);
        rDLbl.setVisible(false);
        itLbl.setVisible(false);
        nOItLbl.setVisible(false);
        amountField.setVisible(false);
        retDateField.setVisible(false);
        relDateField.setVisible(false);
        itNameField.setVisible(false);
        nItemsField.setVisible(false);
        ok2.setVisible(false);
        ok3.setVisible(false);
        sub.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        fundsRad = new javax.swing.JRadioButton();
        otherRad = new javax.swing.JRadioButton();
        giftRad = new javax.swing.JRadioButton();
        loanRad = new javax.swing.JRadioButton();
        payRad = new javax.swing.JRadioButton();
        laterRad = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        ok2 = new javax.swing.JButton();
        ok3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sub = new javax.swing.JButton();
        itNameField = new javax.swing.JTextField();
        itLbl = new javax.swing.JLabel();
        nOItLbl = new javax.swing.JLabel();
        nItemsField = new javax.swing.JTextField();
        amLbl = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        retDLbl = new javax.swing.JLabel();
        retDateField = new javax.swing.JTextField();
        rDLbl = new javax.swing.JLabel();
        relDateField = new javax.swing.JTextField();
        oName = new javax.swing.JLabel();
        pName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NAME : ");

        name.setText("Name");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        age.setText("AGe");
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        fundsRad.setText("Funds");

        otherRad.setText("Other Items");

        giftRad.setText("Gift");

        loanRad.setText("Loan");

        payRad.setText("PayNow");

        laterRad.setText("Later");

        jButton1.setText("Okay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ok2.setText("Okay");
        ok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok2ActionPerformed(evt);
            }
        });

        ok3.setText("Okay");
        ok3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Age :");

        date.setText("Don Date");

        jLabel3.setText("Don Date:");

        sub.setText("Submit");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        itNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itNameFieldActionPerformed(evt);
            }
        });

        itLbl.setText("Item Name");

        nOItLbl.setText("Number of Items");

        amLbl.setText("Amount :");

        retDLbl.setText("Returning Date");

        rDLbl.setText("Release Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(payRad)
                                            .addComponent(giftRad)
                                            .addComponent(itLbl)
                                            .addComponent(nOItLbl))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(itNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                                .addComponent(nItemsField))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(laterRad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ok3))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(fundsRad)
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(loanRad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ok2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(otherRad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1)))))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(amLbl)
                                        .addGap(26, 26, 26)
                                        .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(retDLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(retDateField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rDLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(relDateField))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(oName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(oName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fundsRad)
                            .addComponent(otherRad)
                            .addComponent(jButton1)
                            .addComponent(amLbl)
                            .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(loanRad)
                                .addComponent(ok2)
                                .addComponent(retDLbl)
                                .addComponent(retDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(giftRad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ok3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(laterRad)
                                .addComponent(payRad))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rDLbl)
                        .addComponent(relDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nOItLbl)
                    .addComponent(nItemsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void itNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itNameFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(fundsRad.isSelected())
        {
            giftRad.setVisible(true);
            loanRad.setVisible(true);
           amLbl.setVisible(true);
           amountField.setVisible(true);
           ok2.setVisible(true);
           
      
        }
        else if(otherRad.isSelected())
        {
         itLbl.setVisible(true);
         nOItLbl.setVisible(true);
         itNameField.setVisible(true);
         nItemsField.setVisible(true);
         sub.setVisible(true);
        }




        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok2ActionPerformed

            if(giftRad.isSelected())
            {
                payRad.setVisible(true);
                laterRad.setVisible(true);
                ok3.setVisible(true);
                //sub.setVisible(true);
                
            }
            else if(loanRad.isSelected())
            {
                payRad.setVisible(true);
                laterRad.setVisible(true);
                ok3.setVisible(true);
                retDLbl.setVisible(true);
                retDateField.setVisible(true);
                
                //sub.setVisible(true);
                
            }

        // TODO add your handling code here:
    }//GEN-LAST:event_ok2ActionPerformed

    private void ok3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok3ActionPerformed

            if(payRad.isSelected())
            {
                sub.setVisible(true);
            
            }
            else if(laterRad.isSelected())
            {
                rDLbl.setVisible(true);
                relDateField.setVisible(true);
                sub.setVisible(true);
            }




        // TODO add your handling code here:
    }//GEN-LAST:event_ok3ActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
             String dName=name.getText();
            int dAge=Integer.parseInt(age.getText());
            String dDate=date.getText();
            Donor d=new Donor(dName,dAge);
            BLL b=BLL.getInstance();
            b.addDonorToSystem(d);
        if(otherRad.isSelected())
        {
           String itName=itNameField.getText();
           int number=Integer.parseInt(nItemsField.getText());
           
            Donation donation=new OtherItems(count++,dDate,d,true,null,itName,number,P,number);
            b.addNewDonationToProj(o, P, donation);
        }
        else if(fundsRad.isSelected())
        {
            if(giftRad.isSelected())
            {
                 if(payRad.isSelected())
                 {
                     int amo=Integer.parseInt(amountField.getText());
                     Donation donation=new Gift(count++,dDate,d,true,null,amo,P,amo);
                      b.addNewDonationToProj(o, P, donation);
                 }
                 if(laterRad.isSelected())
                 {
                    int amo=Integer.parseInt(amountField.getText());
                    String releaseDate=relDateField.getText();
                    Pledge p=new Pledge(releaseDate,dDate);
                    
                    Donation donation=new Gift(count++,null,d,true,p,amo,P,amo);
                    b.addNewDonationToProj(o, P, donation);
                 }
            
            }
            if(loanRad.isSelected())
            {
                 if(payRad.isSelected())
                 {
                     int amo=Integer.parseInt(amountField.getText());
                     String retDate=retDateField.getText();
                     Donation donation=new Loan(count++,dDate,d,true,null,amo,retDate,P,amo);
                       b.addNewDonationToProj(o, P, donation);
                 }
                 if(laterRad.isSelected())
                 {
                    int amo=Integer.parseInt(amountField.getText());
                    String releaseDate=relDateField.getText();
                    String retDate=retDateField.getText();
                     Pledge p=new Pledge(releaseDate,dDate);
                     Donation donation=new Loan(count++,dDate,d,true,null,amo,retDate,P,amo);
                       b.addNewDonationToProj(o, P, donation);
                       
                 }
            
            }
        }


            Project2 p2=new Project2(o,P);
            this.setVisible(false);
            p2.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed

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
            java.util.logging.Logger.getLogger(NewDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDonate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDonate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JLabel amLbl;
    private javax.swing.JTextField amountField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField date;
    private javax.swing.JRadioButton fundsRad;
    private javax.swing.JRadioButton giftRad;
    private javax.swing.JLabel itLbl;
    private javax.swing.JTextField itNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton laterRad;
    private javax.swing.JRadioButton loanRad;
    private javax.swing.JTextField nItemsField;
    private javax.swing.JLabel nOItLbl;
    private javax.swing.JTextField name;
    private javax.swing.JLabel oName;
    private javax.swing.JButton ok2;
    private javax.swing.JButton ok3;
    private javax.swing.JRadioButton otherRad;
    private javax.swing.JLabel pName;
    private javax.swing.JRadioButton payRad;
    private javax.swing.JLabel rDLbl;
    private javax.swing.JTextField relDateField;
    private javax.swing.JLabel retDLbl;
    private javax.swing.JTextField retDateField;
    private javax.swing.JButton sub;
    // End of variables declaration//GEN-END:variables
}

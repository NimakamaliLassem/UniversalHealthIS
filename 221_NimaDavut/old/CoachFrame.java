/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import system.UniverseHealthSys;
import static system.UniverseHealthSys.addCoach;

/**
 *
 * @author Nima's Stuff
 */
public class CoachFrame extends javax.swing.JFrame {

    LoginFrame lf;
    public CoachFrame(LoginFrame lof) {
        initComponents();
        lf=lof;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibg = new javax.swing.ButtonGroup();
        dbg = new javax.swing.ButtonGroup();
        tcmb = new javax.swing.JComboBox<>();
        ecmb = new javax.swing.JComboBox<>();
        dcmb = new javax.swing.JComboBox<>();
        ewd = new javax.swing.JComboBox<>();
        fakex2 = new javax.swing.JButton();
        in = new javax.swing.JRadioButton();
        iy = new javax.swing.JRadioButton();
        dn = new javax.swing.JRadioButton();
        dy = new javax.swing.JRadioButton();
        Totalp = new javax.swing.JLabel();
        calc = new javax.swing.JButton();
        finish = new javax.swing.JButton();
        DontLookAtMe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        tcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MORNING", "AFTERNOON", "EVENING" }));
        tcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcmbActionPerformed(evt);
            }
        });
        getContentPane().add(tcmb);
        tcmb.setBounds(290, 130, 100, 30);

        ecmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Part-time", "Full-time" }));
        ecmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecmbActionPerformed(evt);
            }
        });
        getContentPane().add(ecmb);
        ecmb.setBounds(230, 190, 90, 30);

        dcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EVEN", "ODD" }));
        dcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcmbActionPerformed(evt);
            }
        });
        getContentPane().add(dcmb);
        dcmb.setBounds(160, 130, 90, 30);

        ewd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        ewd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ewdActionPerformed(evt);
            }
        });
        getContentPane().add(ewd);
        ewd.setBounds(230, 230, 90, 30);

        fakex2.setBackground(new java.awt.Color(255, 0, 0));
        fakex2.setText("X");
        fakex2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fakex2ActionPerformed(evt);
            }
        });
        getContentPane().add(fakex2);
        fakex2.setBounds(510, 10, 60, 30);

        in.setBackground(new java.awt.Color(34, 34, 34));
        ibg.add(in);
        getContentPane().add(in);
        in.setBounds(430, 270, 20, 30);

        iy.setBackground(new java.awt.Color(34, 34, 34));
        ibg.add(iy);
        iy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iyActionPerformed(evt);
            }
        });
        getContentPane().add(iy);
        iy.setBounds(350, 271, 21, 30);

        dn.setBackground(new java.awt.Color(34, 34, 34));
        dbg.add(dn);
        getContentPane().add(dn);
        dn.setBounds(430, 310, 20, 30);

        dy.setBackground(new java.awt.Color(34, 34, 34));
        dbg.add(dy);
        dy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dyActionPerformed(evt);
            }
        });
        getContentPane().add(dy);
        dy.setBounds(350, 310, 21, 30);

        Totalp.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        Totalp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Totalp);
        Totalp.setBounds(400, 330, 110, 60);

        calc.setText("Calculate");
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });
        getContentPane().add(calc);
        calc.setBounds(60, 350, 100, 30);

        finish.setText("FINISH");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        getContentPane().add(finish);
        finish.setBounds(180, 400, 200, 23);

        DontLookAtMe.setBackground(new java.awt.Color(34, 34, 34));

        javax.swing.GroupLayout DontLookAtMeLayout = new javax.swing.GroupLayout(DontLookAtMe);
        DontLookAtMe.setLayout(DontLookAtMeLayout);
        DontLookAtMeLayout.setHorizontalGroup(
            DontLookAtMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        DontLookAtMeLayout.setVerticalGroup(
            DontLookAtMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(DontLookAtMe);
        DontLookAtMe.setBounds(420, 90, 70, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Coach.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 600, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcmbActionPerformed

    private void ecmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecmbActionPerformed

    private void dcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dcmbActionPerformed

    private void ewdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ewdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ewdActionPerformed

    private void fakex2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fakex2ActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_fakex2ActionPerformed

    private void iyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iyActionPerformed

    private void dyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dyActionPerformed

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        double Total = 0;
        if(setEmp(String.valueOf(ecmb.getSelectedItem())).equalsIgnoreCase("full"))
            Total = 4000;
        else if (setEmp(String.valueOf(ecmb.getSelectedItem())).equalsIgnoreCase("part"))
            Total = 2000;
        
        //int extraDays;
        //System.out.println("How many extra days did you work? ");
        //extraDays = sc.nextInt();
        
        Total +=  Integer.parseInt(String.valueOf(ewd.getSelectedItem()))* 100;
        
        if(in.isSelected())
            Total -= 250;
        
        if(dy.isSelected())
           Total*=.25;
         Totalp.setText(String.valueOf(Total));

        // TODO add your handling code here:
    }//GEN-LAST:event_calcActionPerformed

     int setDay(String s)
    {
        if(s.equalsIgnoreCase("even"))
            return 1;
        return 2;
    }
     String setEmp(String s)
    {
        if(s.equalsIgnoreCase("Part-time"))
            return "part";
        return "full";
    }
     String setDon()
    {
        if(dy.isSelected())
            return "yes";
        return "no";
    }
     boolean setIn()
    {
        if(iy.isSelected())
            return true;
        return false;
    }
     
    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        
        int days;
        days=setDay(String.valueOf(dcmb.getSelectedItem()));
        String empt = setEmp(String.valueOf(ecmb.getSelectedItem()));
        try {
            UniverseHealthSys.addCoach(Integer.parseInt(lf.getFinalId()),
                    lf.getNsname().getText(),lf.getNpass().getText(),
                    empt ,setDon(), setDay(String.valueOf(dcmb.getSelectedItem())),
                    setIn(), Integer.parseInt(String.valueOf(ewd.getSelectedItem())));
            
            
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(CoachFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
            PostRFrame newpf = new PostRFrame();
        newpf.setSize(512, 387);
        newpf.setLocationRelativeTo(null);
        newpf.setVisible(true);
    }//GEN-LAST:event_finishActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DontLookAtMe;
    private javax.swing.JLabel Totalp;
    private javax.swing.JButton calc;
    private javax.swing.ButtonGroup dbg;
    private javax.swing.JComboBox<String> dcmb;
    private javax.swing.JRadioButton dn;
    private javax.swing.JRadioButton dy;
    private javax.swing.JComboBox<String> ecmb;
    private javax.swing.JComboBox<String> ewd;
    private javax.swing.JButton fakex2;
    private javax.swing.JButton finish;
    private javax.swing.ButtonGroup ibg;
    private javax.swing.JRadioButton in;
    private javax.swing.JRadioButton iy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> tcmb;
    // End of variables declaration//GEN-END:variables
}

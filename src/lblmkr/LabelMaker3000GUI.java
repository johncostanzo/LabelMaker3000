package lblmkr;

import java.io.File;
import java.io.PrintWriter;

public class LabelMaker3000GUI extends javax.swing.JFrame {

    public LabelMaker3000GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        aisleStartTF = new javax.swing.JTextField();
        createFileButton = new javax.swing.JButton();
        aisleEndTF = new javax.swing.JTextField();
        sectionStartTF = new javax.swing.JTextField();
        sectionEndTF = new javax.swing.JTextField();
        levelStartTF = new javax.swing.JTextField();
        levelEndTF = new javax.swing.JTextField();
        positionStartTF = new javax.swing.JTextField();
        positionEndTF = new javax.swing.JTextField();
        startLabel = new javax.swing.JLabel();
        endLabel = new javax.swing.JLabel();
        aisleLabel = new javax.swing.JLabel();
        sectionLabel = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        positionLabel = new javax.swing.JLabel();
        aisle2 = new javax.swing.JRadioButton();
        aisle4 = new javax.swing.JRadioButton();
        section2 = new javax.swing.JRadioButton();
        section4 = new javax.swing.JRadioButton();
        totemPole = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Label Maker 3000");

        aisleStartTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aisleStartTFActionPerformed(evt);
            }
        });

        createFileButton.setText("Create File");
        createFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFileButtonActionPerformed(evt);
            }
        });

        sectionStartTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionStartTFActionPerformed(evt);
            }
        });

        sectionEndTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionEndTFActionPerformed(evt);
            }
        });

        startLabel.setText("Start");

        endLabel.setText("End");

        aisleLabel.setText("Aisle");

        sectionLabel.setText("Section");

        levelLabel.setText("Level");

        positionLabel.setText("Position");

        buttonGroup1.add(aisle2);
        aisle2.setText("Every 2");
        aisle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aisle2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(aisle4);
        aisle4.setText("Every 4");
        aisle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aisle4ActionPerformed(evt);
            }
        });

        buttonGroup2.add(section2);
        section2.setText("Every 2");
        section2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(section4);
        section4.setText("Every 4");
        section4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section4ActionPerformed(evt);
            }
        });

        totemPole.setText("Totem Poles");
        totemPole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totemPoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createFileButton)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(endLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(aisleLabel))
                            .addComponent(aisleStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aisleEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(section2)
                                    .addComponent(section4))
                                .addGap(18, 18, 18)
                                .addComponent(totemPole))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(sectionEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sectionLabel)
                                            .addComponent(sectionStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(levelStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(positionStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positionEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positionLabel)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(aisle2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(aisle4))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aisleLabel)
                    .addComponent(sectionLabel)
                    .addComponent(levelLabel)
                    .addComponent(positionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aisleStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startLabel)
                    .addComponent(sectionStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aisleEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endLabel)
                    .addComponent(levelEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectionEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aisle2)
                            .addComponent(section2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aisle4)
                            .addComponent(section4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(totemPole)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(createFileButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void makeLabels(int aisleStart, int aisleEnd, 
            int sectionStart, int sectionEnd, char levelStart, char levelEnd,
            int positionStart, int positionEnd){
        
        String desktop = System.getProperty("user.home") + "\\Desktop";
        
        File file2 = new File(desktop, "labels2.txt");
        
        try (PrintWriter output = new PrintWriter(file2);){
            
            for (;aisleStart < aisleEnd + 1; aisleStart++){
                for (;sectionStart < sectionEnd + 1; sectionStart++)
                    for (;levelStart < levelEnd + 1; levelStart++)
                        for (;positionStart < positionEnd + 1; positionStart++){
                            
                            String s1 = Integer.toString(aisleStart / 10)
                                    + Integer.toString(aisleStart % 10);

                            String s2 = Integer.toString(sectionStart / 10)
                                    + Integer.toString(sectionStart % 10);

                            String s3 = Character.toString(levelStart);

                            String s4 = Integer.toString(positionStart);

                            output.println(s1 + "-" + s2 + "-" + s3 + "-" + s4);
                        }
            }
        }
            
        catch(Exception ex){        
        }
    }
    
    public static void makeLabels(File file, PrintWriter output,
            int aisleStart, int aisleEnd, int sectionStart, int sectionEnd,
            char levelStart, char levelEnd, int positionStart, int positionEnd){
    
        for (;aisleStart < aisleEnd + 1; aisleStart++){
            
            makeLabels(file, output, aisleStart, sectionStart, sectionEnd, levelStart, levelEnd, positionStart,
                    positionEnd);
            
            if (aisle2.isSelected())
                    aisleStart++;
                
            else if (aisle4.isSelected())
                    aisleStart += 3;
            
        }
    }
    
    public static void makeLabels(File file, PrintWriter output, int aisle,
            int sectionStart, int sectionEnd, char levelStart, char levelEnd,
            int positionStart, int positionEnd){
        
        for (;sectionStart < sectionEnd + 1; sectionStart++){
            makeLabels(file, output, aisle, sectionStart, levelStart, levelEnd, positionStart,
                    positionEnd);
            
            if (section2.isSelected())
                    sectionStart++;
                
            else if (section4.isSelected())
                    sectionStart += 3;
            
            if (totemPole.isSelected())
                output.println();
        }
    }

    public static void makeLabels(File file, PrintWriter output, int aisle, 
            int section, char levelStart, char levelEnd, int positionStart,
            int positionEnd){
        
        for (;levelStart < levelEnd + 1; levelStart++)
            makeLabels(file, output, aisle, section, levelStart, positionStart,
                    positionEnd);
    }
    
    public static void makeLabels(File file, PrintWriter output, int aisle, 
            int section, char level, int positionStart, int positionEnd){

        for (;positionStart < positionEnd + 1; positionStart++){
            
            String s1 = Integer.toString(aisle / 10)
                    + Integer.toString(aisle % 10);

            String s2 = Integer.toString(section / 10)
                    + Integer.toString(section % 10);

            String s3 = Character.toString(level);

            String s4 = Integer.toString(positionStart);

            output.print(s1 + "-" + s2 + "-" + s3 + "-" + s4);
            
            if (totemPole.isSelected())
                output.print("\t");
            else
                output.println();
        }   
    }
    
    private void createFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFileButtonActionPerformed
        
        String desktop = System.getProperty("user.home") + "\\Desktop";
        
        File file = new File(desktop, "labels.txt");
            
        int aisleStart = (int)(Integer.parseInt(aisleStartTF.getText()));
        int aisleEnd = (int)(Integer.parseInt(aisleEndTF.getText()));
            
        int sectionStart = (int)(Integer.parseInt(sectionStartTF.getText()));
        int sectionEnd = (int)(Integer.parseInt(sectionEndTF.getText()));
            
        String temp = levelStartTF.getText();
        char levelStart = temp.charAt(0);
        String temp2 = levelEndTF.getText();
        char levelEnd = temp2.charAt(0);
            
        int positionStart = (int)(Integer.parseInt(positionStartTF.getText()));
        int positionEnd = (int)(Integer.parseInt(positionEndTF.getText()));
        
        /*
        makeLabels(aisleStart, aisleEnd, sectionStart, sectionEnd, levelStart, 
                levelEnd, positionStart, positionEnd);
        */
        
        try (PrintWriter output = new PrintWriter(file);){
        makeLabels(file, output, aisleStart, aisleEnd, sectionStart, 
                sectionEnd, levelStart, levelEnd, positionStart, positionEnd);
        }
            
        catch(Exception ex){        
        }
    }//GEN-LAST:event_createFileButtonActionPerformed

    private void aisleStartTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aisleStartTFActionPerformed

    }//GEN-LAST:event_aisleStartTFActionPerformed

    private void sectionStartTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionStartTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionStartTFActionPerformed

    private void sectionEndTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionEndTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionEndTFActionPerformed

    private void aisle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aisle2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aisle2ActionPerformed

    private void section2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section2ActionPerformed

    private void aisle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aisle4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aisle4ActionPerformed

    private void section4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section4ActionPerformed

    private void totemPoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totemPoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totemPoleActionPerformed
 
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
            java.util.logging.Logger.getLogger(LabelMaker3000GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabelMaker3000GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabelMaker3000GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabelMaker3000GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabelMaker3000GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JRadioButton aisle2;
    private static javax.swing.JRadioButton aisle4;
    private javax.swing.JTextField aisleEndTF;
    private javax.swing.JLabel aisleLabel;
    private javax.swing.JTextField aisleStartTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton createFileButton;
    private javax.swing.JLabel endLabel;
    private javax.swing.JTextField levelEndTF;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField levelStartTF;
    private javax.swing.JTextField positionEndTF;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JTextField positionStartTF;
    private static javax.swing.JRadioButton section2;
    private static javax.swing.JRadioButton section4;
    private javax.swing.JTextField sectionEndTF;
    private javax.swing.JLabel sectionLabel;
    private javax.swing.JTextField sectionStartTF;
    private javax.swing.JLabel startLabel;
    private static javax.swing.JRadioButton totemPole;
    // End of variables declaration//GEN-END:variables
}
/**
 * 
 * Programmer: 		John Costanzo
 * Date created:	062815
 * 
 *
 * This class will create a GUI that 
 */

public class LabelMakerGUI extends javax.swing.JFrame {

	
	/**
	 * Suppresses warning:
	 * "The serializable class LabelMakerGUI does not declare a static final serialVersionUID field
	 *  of type long"
	 */
	private static final long serialVersionUID = 1L;
	
	public LabelMakerGUI() {
        initComponents();
    }

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
        aisle2RB = new javax.swing.JRadioButton();
        aisle4RB = new javax.swing.JRadioButton();
        section2RB = new javax.swing.JRadioButton();
        section4RB = new javax.swing.JRadioButton();
        totemPoleRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LabelMaker3000");

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

        buttonGroup1.add(aisle2RB);
        aisle2RB.setText("Every 2");
        aisle2RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aisle2RBActionPerformed(evt);
            }
        });

        buttonGroup1.add(aisle4RB);
        aisle4RB.setText("Every 4");
        aisle4RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aisle4RBActionPerformed(evt);
            }
        });

        buttonGroup2.add(section2RB);
        section2RB.setText("Every 2");
        section2RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section2RBActionPerformed(evt);
            }
        });

        buttonGroup2.add(section4RB);
        section4RB.setText("Every 4");
        section4RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section4RBActionPerformed(evt);
            }
        });

        totemPoleRB.setText("Totem Poles");
        totemPoleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totemPoleRBActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
                        		.LEADING)
                            .addComponent(startLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement
                                		.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(endLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
                        		.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(aisleLabel))
                            .addComponent(aisleStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                            		javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aisleEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                            		javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
                        		.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                                		.Alignment
                                		.LEADING)
                                    .addComponent(section2RB)
                                    .addComponent(section4RB))
                                .addGap(18, 18, 18)
                                .addComponent(totemPoleRB))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                                		.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                    		.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(sectionEndTF, javax.swing.GroupLayout
                                        		.PREFERRED_SIZE, 40, javax.swing.GroupLayout
                                        		.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.
                                        		GroupLayout.Alignment.LEADING)
                                            .addComponent(sectionLabel)
                                            .addComponent(sectionStartTF, javax.swing.GroupLayout
                                            		.PREFERRED_SIZE, 40, javax.swing.GroupLayout
                                            		.PREFERRED_SIZE))))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                                		.Alignment
                                		.TRAILING)
                                    .addComponent(levelStartTF, javax.swing.GroupLayout
                                    		.PREFERRED_SIZE, 40, javax.swing.GroupLayout
                                    		.PREFERRED_SIZE)
                                    .addComponent(levelEndTF, javax.swing.GroupLayout
                                    		.PREFERRED_SIZE, 40, javax.swing.GroupLayout
                                    		.PREFERRED_SIZE)
                                    .addComponent(levelLabel, javax.swing.GroupLayout.Alignment
                                    		.LEADING))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                                		.Alignment.LEADING)
                                    .addComponent(positionStartTF, javax.swing.GroupLayout
                                    		.PREFERRED_SIZE, 40, javax.swing.GroupLayout
                                    		.PREFERRED_SIZE)
                                    .addComponent(positionEndTF, javax.swing.GroupLayout
                                    		.PREFERRED_SIZE, 40, javax.swing.GroupLayout
                                    		.PREFERRED_SIZE)
                                    .addComponent(positionLabel)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(aisle2RB))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                        		.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(aisle4RB))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
        		.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aisleLabel)
                    .addComponent(sectionLabel)
                    .addComponent(levelLabel)
                    .addComponent(positionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aisleStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax
                    		.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startLabel)
                    .addComponent(sectionStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax
                    		.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax
                    		.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionStartTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, 
                    		javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aisleEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax
                    		.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax
                    		.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endLabel)
                    .addComponent(levelEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax
                    		.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectionEndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax
                    		.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
                        		.BASELINE)
                            .addComponent(aisle2RB)
                            .addComponent(section2RB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
                        		.BASELINE)
                            .addComponent(aisle4RB)
                            .addComponent(section4RB)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(totemPoleRB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short
                		.MAX_VALUE)
                .addComponent(createFileButton)
                .addContainerGap()));
        pack();
    }
	
    /**
     * TODO
     */
    private void createFileButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	String aisleStart = aisleStartTF.getText();
  		String aisleEnd = aisleEndTF.getText();
  		String sectionStart = sectionStartTF.getText();
  		String sectionEnd = sectionEndTF.getText();
  		String levelStart = levelStartTF.getText();
  		String levelEnd = levelEndTF.getText();
  		String positionStart = positionStartTF.getText();
  		String positionEnd = positionEndTF.getText();
  		boolean aisle2 = aisle2RB.isSelected();
  		boolean aisle4 = aisle4RB.isSelected();
  		boolean section2 = section2RB.isSelected();
  		boolean section4 = section4RB.isSelected();
  		boolean totemPole = totemPoleRB.isSelected();
    	
    	LabelMaker lblmkr = new LabelMaker(aisleStart, aisleEnd, sectionStart, sectionEnd, 
    			levelStart, levelEnd, positionStart, positionEnd, aisle2, aisle4, section2, 
    			section4, totemPole);
    	
    	
    }

    private void aisleStartTFActionPerformed(java.awt.event.ActionEvent evt) {}

    private void sectionStartTFActionPerformed(java.awt.event.ActionEvent evt) {}

    private void sectionEndTFActionPerformed(java.awt.event.ActionEvent evt) {}

    private void aisle2RBActionPerformed(java.awt.event.ActionEvent evt) {}

    private void section2RBActionPerformed(java.awt.event.ActionEvent evt) {}

    private void aisle4RBActionPerformed(java.awt.event.ActionEvent evt) {}

    private void section4RBActionPerformed(java.awt.event.ActionEvent evt) {}

    private void totemPoleRBActionPerformed(java.awt.event.ActionEvent evt) {}
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and 
         * feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf
         * .html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
            		.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LabelMakerGUI.class.getName()).log(java.util.logging
            		.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabelMakerGUI.class.getName()).log(java.util.logging
            		.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabelMakerGUI.class.getName()).log(java.util.logging
            		.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabelMakerGUI.class.getName()).log(java.util.logging
            		.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabelMakerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private static javax.swing.JRadioButton aisle2RB;
    private static javax.swing.JRadioButton aisle4RB;
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
    private static javax.swing.JRadioButton section2RB;
    private static javax.swing.JRadioButton section4RB;
    private javax.swing.JTextField sectionEndTF;
    private javax.swing.JLabel sectionLabel;
    private javax.swing.JTextField sectionStartTF;
    private javax.swing.JLabel startLabel;
    private static javax.swing.JRadioButton totemPoleRB;
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




/*
 *  IndividualSupport.java
 * 
 *  Rev 1
 *
 *  17-4-13

 * @author Kellie Hughes x12388761
 *
 */
public class IndividualSupport extends javax.swing.JFrame {

    /**
     * Creates new form IndividualSupport
     */
    public IndividualSupport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IndividualSupport = new javax.swing.JPanel();
        IndividualTitle = new javax.swing.JLabel();
        TextIS = new javax.swing.JLabel();
        Meeting = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IndividualSupport.setBackground(new java.awt.Color(255, 255, 255));

        IndividualTitle.setBackground(new java.awt.Color(255, 255, 255));
        IndividualTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        IndividualTitle.setText("Individual Support");

        TextIS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextIS.setText("<html> At National College of Ireland we care very much for the individual student and how they are coping with college life. We feel everyone should have equal opportunities. If you feel that you are struggling with your course and that you need some help please do not hesitate to organise a meeting with us. </html>");

        Meeting.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Meeting.setText("ORGANISE A MEETING TODAY");
        Meeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeetingActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NCILOGO.jpg"))); // NOI18N

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK TO LEARNING SUPPORT");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IndividualSupportLayout = new javax.swing.GroupLayout(IndividualSupport);
        IndividualSupport.setLayout(IndividualSupportLayout);
        IndividualSupportLayout.setHorizontalGroup(
            IndividualSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(IndividualSupportLayout.createSequentialGroup()
                .addGroup(IndividualSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IndividualSupportLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(IndividualTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IndividualSupportLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Meeting, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IndividualSupportLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextIS, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IndividualSupportLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        IndividualSupportLayout.setVerticalGroup(
            IndividualSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IndividualSupportLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IndividualTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextIS, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Meeting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IndividualSupport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IndividualSupport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeetingActionPerformed
        // TODO add your handling code here:
        new MeetingGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MeetingActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new LearningSupport().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IndividualSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndividualSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndividualSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndividualSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new IndividualSupport().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IndividualSupport;
    private javax.swing.JLabel IndividualTitle;
    private javax.swing.JButton Meeting;
    private javax.swing.JLabel TextIS;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}

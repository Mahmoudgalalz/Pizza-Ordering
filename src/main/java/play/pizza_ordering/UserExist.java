
package play.pizza_ordering;
//Importations 
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.JRootPane;

public class UserExist extends javax.swing.JFrame {
    Controller Controle=new Controller();
    public UserExist() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        phoneBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NextCheck = new javax.swing.JButton();
        errMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User");
        setLocation(new java.awt.Point(400, 600));
        setLocationByPlatform(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);

        phoneBox.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        phoneBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneBoxFocusGained(evt);
            }
        });
        phoneBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneBoxKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your Phone Number");
        jLabel1.setToolTipText("");

        NextCheck.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        NextCheck.setForeground(new java.awt.Color(255, 102, 102));
        NextCheck.setText("Next");
        NextCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextCheck(evt);
            }
        });

        errMsg.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        errMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneBox)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(NextCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addGap(48, 48, 48)))
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(errMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(121, 121, 121))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(phoneBox, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(errMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NextCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void NextCheck(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextCheck
        //Error Handling -> User mistake
        int len=phoneBox.getText().length();
        if(len==11 && Controle.isExist(phoneBox.getText())){
           // go to the Bill Section
           errMsg.setText("user is found");
        }
        if  (len <11 || len>11){
            errMsg.setForeground(Color.red);
            errMsg.setText("Wrong Number");
        }
        if(!Controle.isExist(phoneBox.getText())){
            // go to registertion from
            Register rg=new Register();
            rg.PhoneField.setText(phoneBox.getText());
            rg.show();
            dispose();
        }
        
    }//GEN-LAST:event_NextCheck

    private void phoneBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneBoxFocusGained
        errMsg.setText("");
    }//GEN-LAST:event_phoneBoxFocusGained

    private void phoneBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneBoxKeyPressed
        
    }//GEN-LAST:event_phoneBoxKeyPressed

    public static void main(String args[]) {
        //UI
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserExist us=new UserExist();
                us.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NextCheck;
    private javax.swing.JLabel errMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phoneBox;
    // End of variables declaration//GEN-END:variables
}

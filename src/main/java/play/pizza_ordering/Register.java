
package play.pizza_ordering;

import java.awt.Color;

public class Register extends javax.swing.JFrame {
    Controller Controle=new Controller();

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        PhoneField = new javax.swing.JTextField();
        AddressPick = new javax.swing.JLabel();
        Checkout = new javax.swing.JToggleButton();
        err = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");

        jLabel1.setFont(new java.awt.Font("Fredoka SemiBold", 1, 18)); // NOI18N
        jLabel1.setText("Your Information");

        NameField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        NameField.setText("Full Name");
        NameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameFieldFocusGained(evt);
            }
        });
        NameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NameFieldMousePressed(evt);
            }
        });

        PhoneField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        PhoneField.setText("Phone Number");
        PhoneField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneFieldFocusGained(evt);
            }
        });

        AddressPick.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        AddressPick.setText("Address :");
        AddressPick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddressPick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddressPickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddressPickMouseExited(evt);
            }
        });

        Checkout.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Checkout.setText("Checkout");
        Checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutActionPerformed(evt);
            }
        });

        err.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        err.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NameField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(AddressPick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(260, 260, 260))
                                    .addComponent(PhoneField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(17, 17, 17)))
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(err, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(PhoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(AddressPick, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(err, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Checkout, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddressPickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddressPickMouseEntered
        AddressPick.setForeground(Color.green);
    }//GEN-LAST:event_AddressPickMouseEntered

    private void NameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFieldFocusGained
        
    }//GEN-LAST:event_NameFieldFocusGained

    private void NameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameFieldMousePressed
        NameField.setText("");
        err.setText("");
    }//GEN-LAST:event_NameFieldMousePressed

    private void PhoneFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneFieldFocusGained
        err.setText("");
    }//GEN-LAST:event_PhoneFieldFocusGained

    private void AddressPickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddressPickMouseExited
         AddressPick.setForeground(Color.black);
    }//GEN-LAST:event_AddressPickMouseExited

    private void CheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutActionPerformed
        //Save the user 
        // need modefication of location data
        //avoid some user's errors
        
        String phone=PhoneField.getText();
        String name=NameField.getText();
        if(phone.length()<11 || phone.length()>11){
            err.setForeground(Color.red);
            err.setText("invaild phone number");
        }
        /*  if(AddressPick) -> check if he chose a location*/
        if(phone.length()==11 && name!=" " && name!=""){
            Controle.user.add(new User(name,phone));
            err.setForeground(Color.GREEN);
            err.setText("Registertion done");
            // Open Bill Form
            // Change to Bill
            System.out.println("User added");
            new UserExist().setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_CheckoutActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressPick;
    private javax.swing.JToggleButton Checkout;
    private javax.swing.JTextField NameField;
    public javax.swing.JTextField PhoneField;
    private javax.swing.JLabel err;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

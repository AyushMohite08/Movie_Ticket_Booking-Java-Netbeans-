package p1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import javax.swing.JToggleButton;

/**
 *
 * @author ayush
 */
public class Seats extends javax.swing.JFrame {

    /**
     * Creates new form seats
     */String Date,Time;
    public Seats(String Date,String Time) {
        this.Date=Date;
        this.Time=Time;
        initComponents();
        disableBookedSeats();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        button1 = new javax.swing.JToggleButton();
        button2 = new javax.swing.JToggleButton();
        button3 = new javax.swing.JToggleButton();
        button4 = new javax.swing.JToggleButton();
        button5 = new javax.swing.JToggleButton();
        button6 = new javax.swing.JToggleButton();
        button7 = new javax.swing.JToggleButton();
        button8 = new javax.swing.JToggleButton();
        button9 = new javax.swing.JToggleButton();
        button10 = new javax.swing.JToggleButton();
        button11 = new javax.swing.JToggleButton();
        button12 = new javax.swing.JToggleButton();
        button13 = new javax.swing.JToggleButton();
        button14 = new javax.swing.JToggleButton();
        button15 = new javax.swing.JToggleButton();
        button16 = new javax.swing.JToggleButton();
        button17 = new javax.swing.JToggleButton();
        button18 = new javax.swing.JToggleButton();
        button19 = new javax.swing.JToggleButton();
        button20 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Screen");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 260, 40));

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 90, 30));

        button1.setText("A1");
        button1.setName(""); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 50, 50));

        button2.setText("A2");
        button2.setName(""); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 50, 50));

        button3.setText("A3");
        button3.setName(""); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 50, 50));

        button4.setText("A4");
        button4.setName(""); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        getContentPane().add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 50, 50));

        button5.setText("A5");
        button5.setName(""); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        getContentPane().add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 50, 50));

        button6.setText("B1");
        button6.setName(""); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        getContentPane().add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 50, 50));

        button7.setText("B2");
        button7.setName(""); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        getContentPane().add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 50, 50));

        button8.setText("B3");
        button8.setName(""); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        getContentPane().add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 50, 50));

        button9.setText("B4");
        button9.setName(""); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        getContentPane().add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 50, 50));

        button10.setText("B5");
        button10.setName(""); // NOI18N
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        getContentPane().add(button10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 50, 50));

        button11.setText("C1");
        button11.setName(""); // NOI18N
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });
        getContentPane().add(button11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 50, 50));

        button12.setText("C2");
        button12.setName(""); // NOI18N
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });
        getContentPane().add(button12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 50, 50));

        button13.setText("C3");
        button13.setName(""); // NOI18N
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });
        getContentPane().add(button13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 50, 50));

        button14.setText("C4");
        button14.setName(""); // NOI18N
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14ActionPerformed(evt);
            }
        });
        getContentPane().add(button14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 50, 50));

        button15.setText("C5");
        button15.setName(""); // NOI18N
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });
        getContentPane().add(button15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 50, 50));

        button16.setText("D1");
        button16.setName(""); // NOI18N
        button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button16ActionPerformed(evt);
            }
        });
        getContentPane().add(button16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 50, 50));

        button17.setText("D2");
        button17.setName(""); // NOI18N
        button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button17ActionPerformed(evt);
            }
        });
        getContentPane().add(button17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 50, 50));

        button18.setText("D3");
        button18.setName(""); // NOI18N
        button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button18ActionPerformed(evt);
            }
        });
        getContentPane().add(button18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 50, 50));

        button19.setText("D4");
        button19.setName(""); // NOI18N
        button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button19ActionPerformed(evt);
            }
        });
        getContentPane().add(button19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 50, 50));

        button20.setText("D5");
        button20.setName(""); // NOI18N
        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });
        getContentPane().add(button20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 50, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void disableBookedSeats(){
 PreparedStatement pst;
 String q;
 java.util.List<JToggleButton> toggleButtons = new java.util.ArrayList<>();
 toggleButtons.add(button1);
 toggleButtons.add(button2);
 toggleButtons.add(button3);
 toggleButtons.add(button4);
 toggleButtons.add(button5);
 toggleButtons.add(button6);
 toggleButtons.add(button7);
 toggleButtons.add(button8);
 toggleButtons.add(button9);
 toggleButtons.add(button10);
 toggleButtons.add(button11);
 toggleButtons.add(button12);
 toggleButtons.add(button13);
 toggleButtons.add(button14);
 toggleButtons.add(button15);
 toggleButtons.add(button16);
 toggleButtons.add(button17);
 toggleButtons.add(button18);
 toggleButtons.add(button19);
 toggleButtons.add(button20);
 
 for(JToggleButton button : toggleButtons)
 {
    button.setBackground(Color.GRAY);
    button.setEnabled(true);
 }
  try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?" +"user=root");
    q="select seats from tickets where id=1 and date=? and time=?";
    pst=conn.prepareStatement(q);
    pst.setString(1, Date);
    pst.setString(2, Time);
    ResultSet rs=pst.executeQuery();
    while(rs.next())
    {
        String bookedSeats=rs.getString("seats");
        String[] bookedSeatsArray = bookedSeats.split(",");
        
        for(JToggleButton button : toggleButtons)
        {
          for(String bookedSeat : bookedSeatsArray)
          {
            if(button.getText().equals(bookedSeat))
            {
                button.setEnabled(false);
                button.setBackground(Color.red);
            }
          }
        }
    }
}
 catch(Exception e)
 {
    System.out.println(e);
 }
}
    
private void saveSelectedSeats(){
    
 int nofseat=0;
 StringBuilder s = new StringBuilder(); 
 java.util.List<JToggleButton> toggleButtons = new java.util.ArrayList<>();
 toggleButtons.add(button1);
 toggleButtons.add(button2);
 toggleButtons.add(button3);
 toggleButtons.add(button4);
 toggleButtons.add(button5);
 toggleButtons.add(button6);
 toggleButtons.add(button7);
 toggleButtons.add(button8);
 toggleButtons.add(button9);
 toggleButtons.add(button10);
 toggleButtons.add(button11);
 toggleButtons.add(button12);
 toggleButtons.add(button13);
 toggleButtons.add(button14);
 toggleButtons.add(button15);
 toggleButtons.add(button16);
 toggleButtons.add(button17);
 toggleButtons.add(button18);
 toggleButtons.add(button19);
 toggleButtons.add(button20);
 for(JToggleButton button : toggleButtons)
 {
     if(button.isSelected())
     {
         String seatNumber = button.getText();
         s.append(seatNumber).append(",");
         nofseat++;
         button.setBackground(Color.GRAY); // Reset to gray after saving
         button.setSelected(false);
         System.out.println(s);
     }
 }
 // Remove last comma if there are any selected seats
 if (s.length() > 0) 
 {
     s.setLength(s.length()-1);
 }
 try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?" +"user=root");
         String q="update ticket set seats=?,nofseat=? where id=1";
         PreparedStatement pst=conn.prepareStatement(q);
         System.out.println(s.toString()+ "   " + nofseat);
         pst.setString(1,s.toString());
         pst.setInt(2, nofseat);
         pst.executeUpdate();
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
}
        
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
if(button1.getBackground()!=Color.green)
    button1.setBackground(Color.green);
else
    button1.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//jButton2.addActionListener(new ActionListener(){
//    public void actionPerformed(ActionEvent e){
//        saveSelectedSeats();
//    }
//});
saveSelectedSeats();
    PayNConfirm obj = new PayNConfirm(Date,Time);
    obj.setVisible(true);
    this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
if(button2.getBackground()!=Color.green)
    button2.setBackground(Color.green);
else
    button2.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
if(button3.getBackground()!=Color.green)
    button3.setBackground(Color.green);
else
    button3.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
if(button4.getBackground()!=Color.green)
    button4.setBackground(Color.green);
else
    button4.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
if(button5.getBackground()!=Color.green)
    button5.setBackground(Color.green);
else
    button5.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
if(button6.getBackground()!=Color.green)
    button6.setBackground(Color.green);
else
    button6.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
if(button7.getBackground()!=Color.green)
    button7.setBackground(Color.green);
else
    button7.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
if(button8.getBackground()!=Color.green)
    button8.setBackground(Color.green);
else
    button8.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
if(button9.getBackground()!=Color.green)
    button9.setBackground(Color.green);
else
    button9.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button9ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
if(button10.getBackground()!=Color.green)
    button10.setBackground(Color.green);
else
    button10.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button10ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
if(button11.getBackground()!=Color.green)
    button11.setBackground(Color.green);
else
    button11.setBackground(Color.GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_button11ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
if(button12.getBackground()!=Color.green)
    button12.setBackground(Color.green);
else
    button12.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button12ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
if(button13.getBackground()!=Color.green)
    button13.setBackground(Color.green);
else
    button13.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button13ActionPerformed

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button14ActionPerformed
if(button14.getBackground()!=Color.green)
    button14.setBackground(Color.green);
else
    button14.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button14ActionPerformed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
if(button15.getBackground()!=Color.green)
    button15.setBackground(Color.green);
else
    button15.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button15ActionPerformed

    private void button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button16ActionPerformed
if(button16.getBackground()!=Color.green)
    button16.setBackground(Color.green);
else
    button16.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button16ActionPerformed

    private void button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button17ActionPerformed
if(button17.getBackground()!=Color.green)
    button17.setBackground(Color.green);
else
    button17.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button17ActionPerformed

    private void button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button18ActionPerformed
if(button18.getBackground()!=Color.green)
    button18.setBackground(Color.green);
else
    button18.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button18ActionPerformed

    private void button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button19ActionPerformed
if(button19.getBackground()!=Color.green)
    button19.setBackground(Color.green);
else
    button19.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button19ActionPerformed

    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
if(button20.getBackground()!=Color.green)
    button20.setBackground(Color.green);
else
    button20.setBackground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_button20ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Seats().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton button1;
    private javax.swing.JToggleButton button10;
    private javax.swing.JToggleButton button11;
    private javax.swing.JToggleButton button12;
    private javax.swing.JToggleButton button13;
    private javax.swing.JToggleButton button14;
    private javax.swing.JToggleButton button15;
    private javax.swing.JToggleButton button16;
    private javax.swing.JToggleButton button17;
    private javax.swing.JToggleButton button18;
    private javax.swing.JToggleButton button19;
    private javax.swing.JToggleButton button2;
    private javax.swing.JToggleButton button20;
    private javax.swing.JToggleButton button3;
    private javax.swing.JToggleButton button4;
    private javax.swing.JToggleButton button5;
    private javax.swing.JToggleButton button6;
    private javax.swing.JToggleButton button7;
    private javax.swing.JToggleButton button8;
    private javax.swing.JToggleButton button9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}





import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.util.calendar.Gregorian;

public class DOB extends javax.swing.JFrame 
{
    GregorianCalendar calendar = new GregorianCalendar();
    int sm=0;
    int sy=0;
   
    public DOB() 
    {
        initComponents();
        setTitle("How Old Are You");
        setSize(805,530);
        background.setIcon(new ImageIcon("Date.jpg"));
        exit.setIcon(new ImageIcon("e.png"));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(0);
        
        int cyf = calendar.get(calendar.YEAR);
        for(int i=cyf ; i>cyf-100; --i)
        {
            y.addItem(i);
        }
        y.setSelectedIndex(0);
        for(int i=1 ; i<=12; ++i)
        {
            m.addItem(i);
        }
        m.setSelectedIndex(0);
        for(int i=1 ; i<=31; ++i)
        {
            d.addItem(i);
        }
        d.setSelectedIndex(0);
        
    }
    
    //دالة تأتي بتاريخ ميلاد الشخص    
    public int[] calculatDate(int iy, int im, int id)
    {
        int currnetDay = calendar.get(calendar.DAY_OF_MONTH);
        int currnetMonth = calendar.get(calendar.MONTH)+1;
        int currnetYear = calendar.get(calendar.YEAR);
        
        int yy=0 , ym = 0, yd=0 ;
        
        yy= currnetYear-iy ;
        ym= currnetMonth-im ;
        yd= currnetDay-id ;
       
        if(ym==0 && yd==0)
        {
            yy= currnetYear-iy ;
        }
        else
        if(ym==0 && yd<0)
        {
            yy= currnetYear-iy-1 ;
            ym= 11;
            int md = monthDay(currnetMonth-1, currnetYear);
            yd= md-id+currnetDay;
        }
        else
        if(ym>0 && yd>0)
        {
             yy= currnetYear-iy ;
             ym= currnetMonth-im ;
             yd= currnetDay-id ;
        }
        else
        if(ym<0 && yd<0)
        {
             yy= currnetYear-iy-1 ;
             ym= 12-im+currnetMonth ;
             if(im==12)
             {
                 int md = monthDay(im, currnetYear);
                 yd = md-id+currnetDay;
             }
             else
             {
             int md = monthDay(im-1, currnetYear);
             yd = md-id+currnetDay;
             }
        }
        else
        if(ym>0 && yd<0)
        {
             yy= currnetYear-iy ;
             ym= currnetMonth-im-1 ;
             int md = monthDay(currnetMonth-1,currnetYear);
             yd = md-id+currnetDay;
        }
        else
        if(ym<0 && yd>0)
        {
             yy= currnetYear-iy-1 ;
             ym= 12-im+currnetMonth ;
             yd= currnetDay-id;
        }
        else
        if(ym<0 && yd<0 && yy==0)
        {
           yy=-1;
        }
       int yourDate[] = new int[3] ;
       yourDate[0]= yy ;
       yourDate[1]= ym ;
       yourDate[2]= yd ;
      
       return yourDate ;
    }
    
//دالة تأتي بعدد أيام الشهر
    public int monthDay(int m, int y)
    {
        int md=0;
        switch(m)
        {
            case 1 : md= 31   ;  break;
            case 2 :
                if(y%4==0)
                {
                    md = 29;
                }
                else
                { md= 28   ;  }
                break;
            case 3 : md= 31   ;  break;
            case 4 : md= 30   ;  break;
            case 5 : md= 31   ;  break;
            case 6 : md= 30   ;  break;
            case 7 : md= 31   ;  break;
            case 8 : md= 31   ;  break;
            case 9 : md= 30   ;  break;
            case 10 : md= 31  ;  break;
            case 11 : md= 30  ;  break;
            case 12 : md= 31  ;  break;
         }
        return md ;
   }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        countDate = new javax.swing.JButton();
        m = new javax.swing.JComboBox();
        d = new javax.swing.JComboBox();
        y = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(20, 413, 60, 50);

        countDate.setBackground(new java.awt.Color(255, 51, 102));
        countDate.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        countDate.setText("كم عمري ؟");
        countDate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        countDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countDateActionPerformed(evt);
            }
        });
        getContentPane().add(countDate);
        countDate.setBounds(320, 340, 120, 40);

        m.setBackground(new java.awt.Color(51, 153, 0));
        m.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        getContentPane().add(m);
        m.setBounds(370, 300, 50, 20);

        d.setBackground(new java.awt.Color(51, 153, 0));
        d.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(d);
        d.setBounds(440, 300, 50, 20);

        y.setBackground(new java.awt.Color(51, 153, 0));
        y.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });
        getContentPane().add(y);
        y.setBounds(280, 300, 70, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("اليوم");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 270, 50, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("الشهر");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 270, 50, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("السنة");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 270, 70, 25);

        background.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        background.setForeground(new java.awt.Color(204, 255, 0));
        getContentPane().add(background);
        background.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new Main().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void countDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countDateActionPerformed

        Object iy = y.getSelectedItem();
        Object im = m.getSelectedItem();
        Object id = d.getSelectedItem();

        int yourDate[] = calculatDate((int)iy, (int)im, (int)id);

        if(yourDate[0]==0 && yourDate[1]==0 && yourDate[2]==0)
        {
            JOptionPane.showMessageDialog(null, " عمرك بضع ساعات", "تنبيه!!" , 0);
        }
        else
        if(yourDate[0]==-1)
        {
            JOptionPane.showMessageDialog(null, " هذا التاريخ خاطأ", "تنبيه!!" , 0);
        }
        else
        {
            JOptionPane.showMessageDialog(null, " عمرك بالضبط\n "+yourDate[0]+"\b      "+"سنة"+"\n"+yourDate[1]+"\b      "+"شهر"+"\n"+yourDate[2]+"\b       "+"يوم");
        }

    }//GEN-LAST:event_countDateActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        sm = (int)m.getSelectedItem();
        sy = (int)y.getSelectedItem();
        int md = monthDay(sm,sy);
        d.removeAllItems();
        for(int i=1 ; i<=md ; ++i)
        {
            d.addItem(i);
        }
    }//GEN-LAST:event_mActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
        int md = monthDay(sm,sy);
        d.removeAllItems();
        for(int i=1 ; i<=md ; ++i)
        {
            d.addItem(i);
        }
    }//GEN-LAST:event_yActionPerformed

  
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
            java.util.logging.Logger.getLogger(DOB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DOB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DOB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DOB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DOB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton countDate;
    private static javax.swing.JComboBox d;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JComboBox m;
    private static javax.swing.JComboBox y;
    // End of variables declaration//GEN-END:variables
}

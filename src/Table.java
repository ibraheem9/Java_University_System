
import java.awt.Dimension;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.*;


public class Table extends javax.swing.JFrame 
{
    Conection con = new Conection();
    JTable table ;
    JScrollPane scrolPane;
    DefaultTableModel model;
   
    public Table() 
    {
        initComponents();
        setSize(705, 425);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        
        
        String studentTable[][]=con.getTable(Main.studentId);
        String title[] = {"Day / Time","8-9","9-10","10-11","11-12","12-13","13-14","14-15"};
        model = new DefaultTableModel(null,title);
        table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(400,150));
        scrolPane = new JScrollPane(table);
        scrolPane.setBounds(44,162,600,125);  
        add(scrolPane);
        String days[] = {"Satrday","Sunday","Monday","Tuesday","Wednsday","Thursday"};
        model.addRow(new Object[]{days[0],studentTable[0][0],studentTable[0][1],studentTable[0][2],studentTable[0][3],studentTable[0][4],studentTable[0][5],studentTable[0][6]});
        model.addRow(new Object[]{days[1],studentTable[1][0],studentTable[1][1],studentTable[1][2],studentTable[1][3],studentTable[1][4],studentTable[1][5],studentTable[1][6]});
        model.addRow(new Object[]{days[2],studentTable[2][0],studentTable[2][1],studentTable[2][2],studentTable[2][3],studentTable[2][4],studentTable[2][5],studentTable[2][6]});
        model.addRow(new Object[]{days[3],studentTable[3][0],studentTable[3][1],studentTable[3][2],studentTable[3][3],studentTable[3][4],studentTable[3][5],studentTable[3][6]});
        model.addRow(new Object[]{days[4],studentTable[4][0],studentTable[4][1],studentTable[4][2],studentTable[4][3],studentTable[4][4],studentTable[4][5],studentTable[4][6]});
        model.addRow(new Object[]{days[5],studentTable[5][0],studentTable[5][1],studentTable[5][2],studentTable[5][3],studentTable[5][4],studentTable[5][5],studentTable[5][6]});
       
        back.setIcon(new ImageIcon("back.png"));
        JLabel background = new JLabel();
        background.setBounds(0, 0, 700, 400);
        background.setIcon(new ImageIcon("table.jpg"));
        add(background);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        back.setForeground(new java.awt.Color(51, 51, 51));
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\back.png")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(20, 10, 80, 70);

        print.setBackground(new java.awt.Color(51, 51, 51));
        print.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\print.png")); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print);
        print.setBounds(210, 320, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Student().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try
        {
            MessageFormat header = new MessageFormat("**page**");
            MessageFormat footer = new MessageFormat("no[1]");
            table.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(null, "Can not print","Warning",1);
        }
       
        
    }//GEN-LAST:event_printActionPerformed

  
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}

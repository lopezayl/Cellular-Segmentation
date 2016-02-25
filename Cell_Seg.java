/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lopezayl
 */

import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;

public class Cell_Seg extends java.awt.Frame implements ij.plugin.filter.PlugInFilter{

    /**
     * Creates new form Cell_Seg
     */
    public Cell_Seg() {
        initComponents();
        this.setVisible(true);
        //this is what runs
        //convert image to RGB stack, 3 slices
        void convertToRGBStack();
        //duplicate the image so that the original image is untouched
        
        //threshold the image to reduce noise
        //use gaussian blur to further reduce noise
        //find edges
        //analyze particles to trace features
        //extract x,y, and z coordinates from tracings
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OK_jButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        OK_jButton.setText("OK");
        OK_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_jButtonActionPerformed(evt);
            }
        });
        jPanel1.add(OK_jButton);

        jLabel1.setText("Press OK to trace the soma.");
        jPanel1.add(jLabel1);

        Cancel.setText("Cancel");
        Cancel.setActionCommand("Cancel");
        jPanel1.add(Cancel);
        Cancel.getAccessibleContext().setAccessibleName("Cancel");

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // closes the plugin
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void OK_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_jButtonActionPerformed
        //call function Cell_Seg

        
    }//GEN-LAST:event_OK_jButtonActionPerformed
    
    public int setup(java.lang.String arg, ImagePlus ermergerd)
    {
        m_arg = arg;
        m_pretty = ermergerd;
        return DOES_8C + DONE;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cell_Seg().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton OK_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    // just kidding. more variables!
    private ImagePlus m_pretty;
    private java.lang.String m_arg;
}

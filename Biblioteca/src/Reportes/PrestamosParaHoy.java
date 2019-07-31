/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import Bibliotecario.RegitroDePrestamos;
import Bibliotecario.Libro;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 *
 * @author jhonny-G
 */
public class PrestamosParaHoy extends javax.swing.JFrame {

    /**
     * Creates new form PrestamosParaHoy
     */
    public PrestamosParaHoy() {
        initComponents();
        Analizar();
        matris();
    }
   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 390, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "LIBROS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, 290));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ReportesCLase a=new  ReportesCLase();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
public LinkedList<String> archivos=new LinkedList();
Date end;
Date inicio;
public void matris(){
    int x=1;
    int y=0;
 String matris[][]=new String[archivos.size()][x];
 for(int i=0;i<archivos.size();i++){
 matris[i][y]=archivos.get(i);
 }
 
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
          matris,
            new String [] {
                "LIBRO"
            }
        ));
    
    
 
}
 
    public void Analizar(){
String tmp="";

SimpleDateFormat date2 =new SimpleDateFormat("yyyy-MM-dd");
 Calendar c=new GregorianCalendar();        

        String path = "src\\ArchivoDePrestamos"; 

        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles(); 
  
        for (int i = 0; i < listOfFiles.length; i++)         {

            if (listOfFiles[i].isFile())             {
                
                files = listOfFiles[i].getName();
                
        RegitroDePrestamos tmps;
         
        FileInputStream filein;
        ObjectInputStream objectin;
               try {
            filein=new FileInputStream(path+"\\"+files);
           
            objectin=new ObjectInputStream(filein);
           tmps=(RegitroDePrestamos) objectin.readObject();
           String done=tmps.getFecha();
           String today=Integer.toString(c.get(Calendar.YEAR))+"-"+Integer.toString(c.get(Calendar.MONTH)+1)+"-"
                   +Integer.toString(c.get(Calendar.DAY_OF_MONTH));
           
           
         System.out.println(today);
           
      try {
            inicio=date2.parse(done);
      } catch (ParseException ex) {
        }
    
    
        try {
           end=date2.parse(today);
      } catch (ParseException ex) {
        }
    int dias=(int) ((end.getTime()-inicio.getTime())/86400000);
       
          if(dias<3){
          AdquirirLibro(tmps.getCodigoLibro());
          }
           
               } catch (FileNotFoundException ex) {
        System.out.println("h1");
        } catch (IOException ex) {
      System.out.println("h2");
        } catch (ClassNotFoundException ex) {
            System.out.println("h3");
        }     
        
            }
        }

}
    public void AdquirirLibro(String cod){
        String path = "src\\ArchivosDelibros"; 
        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles(); 
  
        for (int i = 0; i < listOfFiles.length; i++)         {

               if (listOfFiles[i].isFile())             {
                files = listOfFiles[i].getName();
        Libro tmps;
         
        FileInputStream filein;
        ObjectInputStream objectin;
               try {
            filein=new FileInputStream(path+"\\"+files);
           
            objectin=new ObjectInputStream(filein);
           tmps=(Libro) objectin.readObject();
           if(cod.equals(tmps.getCodigo())){
           archivos.add(tmps.getTitulo());
           }
               } catch (FileNotFoundException ex) {
        System.out.println("h1");
        } catch (IOException ex) {
      System.out.println("h2");
        } catch (ClassNotFoundException ex) {
            System.out.println("h3");
        }     
        
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(PrestamosParaHoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestamosParaHoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestamosParaHoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestamosParaHoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrestamosParaHoy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prestamos;

<<<<<<< HEAD
=======
import Bibliotecario.Libro;
>>>>>>> NewMaster
import Bibliotecario.RegitroDePrestamos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import javax.swing.JOptionPane;
////
/**
 *
 * @author jhonny-G
 */
public class GenerarPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form GenerarPrestamo
     */
    public GenerarPrestamo() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cod = new javax.swing.JTextField();
        carnet = new javax.swing.JTextField();
        carrera = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodActionPerformed(evt);
            }
        });
        Cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CodKeyTyped(evt);
            }
        });
        getContentPane().add(Cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 110, 30));

        carnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                carnetKeyTyped(evt);
            }
        });
        getContentPane().add(carnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 110, 30));

        carrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                carreraKeyTyped(evt);
            }
        });
        getContentPane().add(carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. Carnet");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 110, 40));

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cod. Libro");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Carrera");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 80, 80));

        jButton2.setText("Registrar Estudiante");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -30, 660, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carnetKeyTyped
        // TODO add your handling code here:
        
          if(carnet.getText().length()<=8){
         char validar=evt.getKeyChar(); 
        if(Character.isLetter(validar)){
         getToolkit().beep();
        evt.consume();
        }
        }else{
         getToolkit().beep();
        evt.consume();
        
        }
        
        
    }//GEN-LAST:event_carnetKeyTyped

    private void carreraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carreraKeyTyped
        // TODO add your handling code here:
       char validar=evt.getKeyChar(); 
        if(Character.isLetter(validar)){
         getToolkit().beep();
        evt.consume();
        }
         
    }//GEN-LAST:event_carreraKeyTyped

    private void CodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_CodActionPerformed

    private void CodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodKeyTyped
        // TODO add your handling code here:
        
             char validar=evt.getKeyChar();
        String tmp="";
        tmp=Cod.getText();
        
    
        if(tmp.length()<=2){
          if(Character.isLetter(validar) ){   
        getToolkit().beep();
        evt.consume();
        }
       
        }
        if(tmp.length()==3){
        if(validar!='-'){
        getToolkit().beep();
        evt.consume();
        }
        }
        if(tmp.length()>3 && tmp.length()<7 ){
        if(Character.isDigit(validar)){
         getToolkit().beep();
        evt.consume();
        }
        }
        if(tmp.length()>=7){
         getToolkit().beep();
        evt.consume();
        }
        
    }//GEN-LAST:event_CodKeyTyped
public boolean validar=false;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        validar=false;
        Validar();
        if(validar){
        HacerPrestamo();}
        if(validar){
            validar=false;
            verificarLibro();
            if(validar){
        ValidarPrestamo();}else{
             JOptionPane.showMessageDialog(this, "Libro no disponible");
         
                
            }
        }else{
JOptionPane.showMessageDialog(this, "Verifique los datos");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
public void Validar(){
String tmp="";
int tm=0;
tmp=carnet.getText()+".bin";
        String path = "src\\ArchivosDeEstudiantes1"; 

        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles(); 
        tm=listOfFiles.length-1;
        for (int i = 0; i < listOfFiles.length; i++)         {

            if (listOfFiles[i].isFile())             {
                files = listOfFiles[i].getName();
             if(tmp.equals(files)){
                 validar=true;
                 break;
             }
             if(tm==i){
              JOptionPane.showMessageDialog(this, "Estudiante no registrado, pulsa registrar estudiante");

             }
        
            }
        }
        
        
       

}
public void HacerPrestamo(){
String tmp="";
int tm=0;
tmp=carnet.getText()+Cod.getText()+".bin";
        String path = "src\\ArchivoDePrestamos"; 

        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles(); 
        tm=listOfFiles.length-1;
        for (int i = 0; i < listOfFiles.length; i++)         {

            if (listOfFiles[i].isFile())             {
                files = listOfFiles[i].getName();
             if(tmp.equals(files)){
                 validar=false;
                 break;
             }
             
        
            }
        }
        
        


}
public void verificarLibro(){
String tmp="";
int tm=0;

        String path = "src\\ArchivosDelibros"; 

        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles(); 
        tm=listOfFiles.length-1;
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
           if(tmps.getCodigo().equals(Cod.getText())){
           validar=true;
           break;
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


public void ValidarPrestamo(){
RegitroDePrestamos tmp;
Calendar c=new GregorianCalendar();
String fecha=Integer.toString(c.get(Calendar.YEAR)+c.get(Calendar.MONTH)+c.get(Calendar.DAY_OF_MONTH));
tmp=new RegitroDePrestamos(Cod.getText(),Integer.parseInt(carnet.getText()),fecha);
FileOutputStream fileOut;
ObjectOutputStream objectout;
File file=new File("src\\ArchivoDePrestamos\\"+tmp.getCarnet()+tmp.getCodigoLibro()+".bin");

 try {
            fileOut=new FileOutputStream(file);
            objectout=new ObjectOutputStream(fileOut);
            objectout.writeObject(tmp);
            System.out.println("logro");
            
        } catch (FileNotFoundException ex) {
       
        } catch (IOException ex) {
        
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
            java.util.logging.Logger.getLogger(GenerarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cod;
    private javax.swing.JTextField carnet;
    private javax.swing.JTextField carrera;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

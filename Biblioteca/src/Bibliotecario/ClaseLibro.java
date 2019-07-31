/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotecario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author jhonny-G
 */
public class ClaseLibro extends javax.swing.JFrame implements Serializable{

  //  public LinkedList<Libro> RegistroLibro =new LinkedList();
    /**
     * Creates new form ClaseLibro
     */
    public ClaseLibro() {
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

        Label = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        autor = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editorial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Label.setText("CODIGO");
        getContentPane().add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 120, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 90, 80));
        getContentPane().add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 120, 30));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 120, 30));

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 120, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("AUTOR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("TITULO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("CANTIDAD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("FECHA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        getContentPane().add(editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 120, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("EDITORIAL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        Fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaKeyTyped(evt);
            }
        });
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 120, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Ver registro de libros");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Registro de Libros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 60, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Libros.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
        String tmp="";
        tmp=codigo.getText();
        
        
    }//GEN-LAST:event_codigoActionPerformed
boolean validacion =true;
    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        // TODO add your handling code here:
        
        if(Label.getText().equals("CODIGO")){
        char validar=evt.getKeyChar();
        String tmp="";
        tmp=codigo.getText();
        
    
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
       }
       
        
        
        ////
        
    }//GEN-LAST:event_codigoKeyTyped

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    
        
    }//GEN-LAST:event_cantidadActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        // TODO add your handling code here:
         char validar=evt.getKeyChar(); 
        if(Character.isLetter(validar)){
         getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_cantidadKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cod;
        cod=codigo.getText();
        String aut=autor.getText();
        String tit=titulo.getText();
        String date=Fecha.getText();
        String edit=editorial.getText();
        int cant=0;
   if(cantidad.getText().equals("")){
 cant=0;
   }else{
    cant=Integer.parseInt(cantidad.getText());
   }
     
        
       
        
      
     
        if(cod.length()<7 || autor.equals("")||tit.equals("")||cant==0   ){
        JOptionPane.showMessageDialog(null, "Este libro no cumple con los requisitos,"
                + "puede ver el area de informacion");
        }else{
        
        Registrar(cod,aut,tit,cant,date,edit);
        }
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
public int a;
    public void Registrar(String cod, String aut, String tit, int cant, String date, String edit) {
  
Libro tmp;
tmp=new Libro(cod,aut,tit,cant,date,edit);

File file=new File("src\\ArchivosDelibros\\"+tit+".bin");

if(file.exists()){

  try {
      FileInputStream filein;
ObjectInputStream objectin;
Libro tmps;
File ft=new File("src\\ArchivosDelibros\\"+tit+".bin");

           filein=new FileInputStream(ft);
           
            objectin=new ObjectInputStream(filein);
            ft.delete();
       tmps=(Libro) objectin.readObject();
        this.a=tmps.getCantidad()+tmp.getCantidad();
      
       
       
       } catch (FileNotFoundException ex) {
       
       } catch (IOException ex) {
           Logger.getLogger(ClaseLibro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(ClaseLibro.class.getName()).log(Level.SEVERE, null, ex);
       }
        }
    tmp.setCantidad(a);
        
   System.out.println("hola"+tmp.getCantidad());
FileOutputStream fileOut;
ObjectOutputStream objectout;

       try {
            fileOut=new FileOutputStream(file);
            objectout=new ObjectOutputStream(fileOut);
            objectout.writeObject(tmp);
            
            
        } catch (FileNotFoundException ex) {
       
        } catch (IOException ex) {
        
        }






}




    private void FechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaKeyTyped
        // TODO add your handling code here:
         char validar=evt.getKeyChar();
         int tmp=Fecha.getText().length();
         if(tmp<2){
          if(Character.isLetter(validar) ){   
        getToolkit().beep();
        evt.consume();
        }
         }
         if(tmp==2){
         if(validar!='-'){
        getToolkit().beep();
        evt.consume();
        }
         }
         if(tmp>2 && tmp<5){
                   if(Character.isLetter(validar) ){   
        getToolkit().beep();
        evt.consume();
        }
         }
          if(tmp==5){
         if(validar!='-'){
        getToolkit().beep();
        evt.consume();
        }}
          
             if(tmp>5 && tmp<10){
                   if(Character.isLetter(validar) ){   
        getToolkit().beep();
        evt.consume();
        }}
             
                if(tmp>=10 ){
                    
        getToolkit().beep();
        evt.consume();
        } 
         
         
    }//GEN-LAST:event_FechaKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // TODO add your handling code here:
            
             JOptionPane.showMessageDialog(null, "Para el registro de un nuevo libro tiene que cumplir con ciertos "
                    + "datos obligatorio los cuales son: Titulo, Codigo, Autor, Cantida");
      
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
    public static LinkedList<Libro> tmp ;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//sa       
        tmp= new LinkedList<>();
        LinkedList<String> pa=new LinkedList();
        String path = "src\\ArchivosDelibros"; 

        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles(); 

        for (int i = 0; i < listOfFiles.length; i++)         {

            if (listOfFiles[i].isFile())             {
                files = listOfFiles[i].getName();
                System.out.println(files);
        pa.add(files);
        
            }
        }
        
        Libro tmps;
        FileInputStream filein;
        ObjectInputStream objectin;
        for(int i=0;i<pa.size();i++){
       try {
            filein=new FileInputStream(path+"\\"+pa.get(i));
           
            objectin=new ObjectInputStream(filein);
           tmps=(Libro) objectin.readObject();
       tmp.add(tmps);
      
        } catch (FileNotFoundException ex) {
        System.out.println("h1");
        } catch (IOException ex) {
      System.out.println("h2");
        } catch (ClassNotFoundException ex) {
            System.out.println("h3");
        }
        }
           
        ListadoDeLibros a=new ListadoDeLibros();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       ClaseBibliotecario a =new ClaseBibliotecario();
       a.setVisible(true);
       this.setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ClaseLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaseLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaseLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaseLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClaseLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fecha;
    private javax.swing.JLabel Label;
    private javax.swing.JTextField autor;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField editorial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables

    
}

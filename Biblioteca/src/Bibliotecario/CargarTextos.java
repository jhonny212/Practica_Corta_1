/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotecario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author jhonny-G
 */
public class CargarTextos extends javax.swing.JFrame {
//  public LinkedList<Libro> RegistroLibro =new LinkedList();
//  public LinkedList<RegistroEstudiantes> RegistroEstudiantes =new LinkedList();
//  public LinkedList<RegitroDePrestamos> RegistroPrestamos =new LinkedList();

    /**
     * Creates new form CargarTextos
     */
    public CargarTextos() {
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

        selectorArchivos = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectorArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorArchivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectorArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectorArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectorArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorArchivosActionPerformed
        // TODO add your handling code here:
  
  File archivo = selectorArchivos.getSelectedFile();
  String a=archivo.getAbsolutePath();    
       if ((archivo == null) || (archivo.getName().equals(""))) {
 JOptionPane.showMessageDialog(this, "Nombre de archivo inválido", "Nombre de archivo inválido", JOptionPane.ERROR_MESSAGE);
}else{
       CargarArchivos(a); 
       
       }
       

    }//GEN-LAST:event_selectorArchivosActionPerformed
    public void CargarArchivos(String a){
    boolean validar=false;
        try {
            FileReader fr=new FileReader(a);
            BufferedReader br=new BufferedReader(fr);
            String linea;
            LinkedList<String> Datos = new LinkedList<String>();
            while((linea=br.readLine())!=null){
                if(linea.equals("LIBRO")||linea.equals("ESTUDIANTE") ||linea.equals("PRESTAMO")   )
                {
                validar=true;
                }
            Datos.add(linea);
         }
            if(validar){
               for(int i=0;i<Datos.size();i++){
            if(Datos.get(i).equals("LIBRO")){
               
                String titulo= Datos.get(i+1).replaceAll("TITULO:","");
                String autor= Datos.get(i+2).replaceAll("AUTOR:","");
                String codigo= Datos.get(i+3).replaceAll("CODIGO:","");
                int cantidad=Integer.parseInt(Datos.get(i+4).replaceAll("CANTIDAD:",""));
                Libro tmp=null;
                tmp=new Libro(codigo,autor,titulo,cantidad,"","");
                
                registrarlibro(tmp);
                
                
             }
              if(Datos.get(i).equals("ESTUDIANTE")){
               int carnet=Integer.parseInt(Datos.get(i+1).replaceAll("CARNET:",""));                
               String nombre= Datos.get(i+2).replaceAll("NOMBRE:","");
               int carrera=Integer.parseInt(Datos.get(i+3).replaceAll("CARRERA:",""));              
               RegistroEstudiantes tmp;
               tmp=new RegistroEstudiantes(carnet,nombre,carrera);
               RegistrarEstudiantes(tmp);
             }
               
               if(Datos.get(i).equals("PRESTAMO")){
               String codigolibro=Datos.get(i+1).replaceAll("CODIGOLIBRO:","");                
               String fecha= Datos.get(i+3).replaceAll("FECHA:","");
               int carnet=Integer.parseInt(Datos.get(i+2).replaceAll("CARNET:",""));              
               RegitroDePrestamos tmp;
               tmp=new RegitroDePrestamos(codigolibro,carnet,fecha);
               RegistrarPrestamos(tmp);
             }
             
             
             
         }
            }else{
    JOptionPane.showMessageDialog(this, "No valido se pudo leer");
         
            }
            
            
            
        } catch (FileNotFoundException ex) {
       System.out.println("in");
            
        } catch (IOException ex) {
       System.out.println("in");
        }

}
     public void RegistrarPrestamos(RegitroDePrestamos tmp){
String path = "src\\ArchivosDePrestamos";     
File file=new File("src\\ArchivoDePrestamos\\"+tmp.getCarnet()+tmp.getCodigoLibro()+".bin");

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
    public void RegistrarEstudiantes(RegistroEstudiantes tmp){
       
String path = "src\\ArchivosDelibros";   
File file=new File("src\\ArchivosDeEstudiantes1\\"+tmp.getCarnet()+".bin");

FileOutputStream fileOut;
ObjectOutputStream objectout;
if(file.exists()){
}else{
        try {
            fileOut=new FileOutputStream(file);
            objectout=new ObjectOutputStream(fileOut);
            objectout.writeObject(tmp);
            
            
        } catch (FileNotFoundException ex) {
       
        } catch (IOException ex) {
        
        }

}
    }
    public int a;
    public void registrarlibro(Libro tmp){
String path = "src\\ArchivosDelibros";     
//File file;

File file=new File("src\\ArchivosDelibros\\"+tmp.getTitulo()+".bin");


if(file.exists()){

  try {
      FileInputStream filein;
ObjectInputStream objectin;
Libro tmps;
File ft=new File("src\\ArchivosDelibros\\"+tmp.getTitulo()+".bin");

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

FileOutputStream fileOut;
ObjectOutputStream objectout;

       



        try {
            fileOut=new FileOutputStream(file);
            objectout=new ObjectOutputStream(fileOut);
            objectout.writeObject(tmp);
            
            
        } catch (FileNotFoundException ex) {
       
        } catch (IOException ex) {
        
        }
    this.setVisible(false);
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
            java.util.logging.Logger.getLogger(CargarTextos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarTextos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarTextos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarTextos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarTextos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser selectorArchivos;
    // End of variables declaration//GEN-END:variables
}
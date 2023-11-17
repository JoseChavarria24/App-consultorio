/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import Componentes.MyTextField;
import Repositorio.RepositorioCitas;
import Repositorio.RepositorioPacientes;
import java.util.List;
import javax.swing.JList;
import javax.swing.JOptionPane;
import modelo.vc.ModeloCitasTabla;
import modelo.vo.Calendario;
import modelo.vo.Citas;
import modelo.vo.Paciente;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;

public class PanelCitas extends javax.swing.JPanel {
      RepositorioCitas repo;

    public PanelCitas() {
        repo =new RepositorioCitas();
        initComponents();
        cargarSugerencias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_busquedaNombre = new javax.swing.JLabel();
        lbl_dia = new javax.swing.JLabel();
        txt_dia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_año = new javax.swing.JTextField();
        txt_mes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_HoraInc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_MinInc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        try {
            fechaActualizada2 = new Componentes.FechaActualizada();
        } catch (modelo.excepciones.HoraInvalida e1) {
            e1.printStackTrace();
        } catch (modelo.excepciones.MinutoInvalido e2) {
            e2.printStackTrace();
        }
        txt_HoraF = new javax.swing.JTextField();
        txt_MinF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tablaCitas1 = new Componentes.TablaCitas();
        txt_nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        lbl_busquedaNombre.setText("Nombre: ");

        lbl_dia.setText("DIA");

        txt_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diaActionPerformed(evt);
            }
        });

        jLabel1.setText("MES");

        txt_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_añoActionPerformed(evt);
            }
        });

        txt_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mesActionPerformed(evt);
            }
        });

        jLabel2.setText("AÑO");

        txt_HoraInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HoraIncActionPerformed(evt);
            }
        });

        jLabel3.setText(":");

        txt_MinInc.setText("00");
        txt_MinInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MinIncActionPerformed(evt);
            }
        });

        jLabel4.setText("HORA INICIO");

        fechaActualizada2.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N

        txt_MinF.setText("00");

        jLabel5.setText("HORA FINAL");

        jLabel6.setText(":");

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
        });

        jButton1.setText("Nueva cita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cambiar cita");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaActualizada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_busquedaNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_HoraInc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_MinInc, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_HoraF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_MinF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lbl_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton2)))))
                .addGap(18, 18, 18)
                .addComponent(tablaCitas1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablaCitas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fechaActualizada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_HoraInc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MinInc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_busquedaNombre))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(lbl_dia)
                                    .addComponent(jLabel2))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_HoraF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MinF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(240, 240, 240))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField1ActionPerformed

    private void JTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField2ActionPerformed

    private void JTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField3ActionPerformed

    private void JTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField4ActionPerformed

    private void txt_HoraIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HoraIncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HoraIncActionPerformed

    private void txt_añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_añoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_añoActionPerformed

    private void txt_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mesActionPerformed

    private void txt_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_diaActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
    
   
       
        
        
        
        
        
        
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        
        
        
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void txt_MinIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MinIncActionPerformed

   
    }//GEN-LAST:event_txt_MinIncActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        Calendario horaI= new Calendario();
        Calendario horaF= new Calendario();
        Calendario fecha= new Calendario();
        
        String paciente;
        
        horaI.setHora(Integer.parseInt(txt_HoraInc.getText()));
        horaI.setMinuto(Integer.parseInt(txt_MinInc.getText()));
        
        horaI.setComponenteHora(horaI.getHora(), horaI.getMinuto());
        
        horaF.setHora(Integer.parseInt(txt_HoraF.getText()));
        horaF.setMinuto(Integer.parseInt(txt_MinF.getText()));
        
        horaF.setComponenteHora(horaF.getHora(), horaF.getMinuto());

        fecha.setDia(Integer.parseInt(txt_dia.getText()));
        fecha.setMes(Integer.parseInt(txt_mes.getText()));
        fecha.setAño(Integer.parseInt(txt_año.getText()));
        
        fecha.setComponenteFecha(fecha.getDia(), fecha.getMes(), fecha.getAño());
        
        paciente=txt_nombre.getText();
       Citas cita= new Citas(fecha.getComponenteFecha(),horaI.getComponenteHoram(),horaF.getComponenteHoram());
        
       Paciente pac=repo.buscarPaciente(paciente);
       if(pac.getCita()==""){
       pac.setCita(cita.toString());
       
       txt_nombre.setText("");
       txt_dia.setText("");
       txt_mes.setText("");
       txt_año.setText("");
       txt_MinInc.setText("00");
       txt_HoraInc.setText("");
       txt_HoraF.setText("");
       txt_MinF.setText("00");
       
         tablaCitas1.actualizarDatos();  
       }else{
           JOptionPane.showConfirmDialog(txt_MinInc, "quep");
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void cargarSugerencias(){
    
        JList lista=new JList(RepositorioPacientes.getArregloNombrePacientes());
        AutoCompleteDecorator.decorate(lista, txt_nombre, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
      
      
              }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.FechaActualizada fechaActualizada2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_busquedaNombre;
    private javax.swing.JLabel lbl_dia;
    private Componentes.TablaCitas tablaCitas1;
    private javax.swing.JTextField txt_HoraF;
    private javax.swing.JTextField txt_HoraInc;
    private javax.swing.JTextField txt_MinF;
    private javax.swing.JTextField txt_MinInc;
    private javax.swing.JTextField txt_año;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_mes;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}

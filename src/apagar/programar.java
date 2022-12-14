package apagar;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Usuario
 */
public class programar extends javax.swing.JFrame {

    int x, y;
    Timer timer;

    int horas, minutos, segundos = 59;

    String sistema = System.getProperty("os.name");
    String shutdownCommand = "";
    alerta mensaje = new alerta();

    public programar() {
        initComponents();
        setSize(350, 460);
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        btn_parar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cerrar = new javax.swing.JButton();
        lbl_logo = new javax.swing.JLabel();
        lbl_apagado = new javax.swing.JLabel();
        lbl_linea = new javax.swing.JLabel();
        lbl_automatico = new javax.swing.JLabel();
        lbl_minutos = new javax.swing.JLabel();
        txt_minutos = new javax.swing.JTextField();
        lbl_horas = new javax.swing.JLabel();
        txt_horas = new javax.swing.JTextField();
        lbl_puntos = new javax.swing.JLabel();
        btn_iniciar = new javax.swing.JButton();
        btn_parar = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(300, 500));
        setSize(new java.awt.Dimension(350, 550));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar1.png"))); // NOI18N
        btn_cerrar.setBorder(null);
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.setFocusPainted(false);
        btn_cerrar.setFocusable(false);
        btn_cerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar2.png"))); // NOI18N
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cerrar);
        btn_cerrar.setBounds(270, 25, 40, 22);

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        getContentPane().add(lbl_logo);
        lbl_logo.setBounds(30, 70, 110, 110);

        lbl_apagado.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbl_apagado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_apagado.setText("Apagado");
        getContentPane().add(lbl_apagado);
        lbl_apagado.setBounds(160, 90, 130, 40);

        lbl_linea.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbl_linea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_linea.setText("_________");
        getContentPane().add(lbl_linea);
        lbl_linea.setBounds(146, 100, 160, 40);

        lbl_automatico.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbl_automatico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_automatico.setText("autom??tico");
        getContentPane().add(lbl_automatico);
        lbl_automatico.setBounds(150, 130, 150, 40);

        lbl_minutos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_minutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_minutos.setText("Minutos");
        getContentPane().add(lbl_minutos);
        lbl_minutos.setBounds(210, 320, 70, 22);

        txt_minutos.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        txt_minutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_minutos.setText("00");
        txt_minutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_minutosMouseClicked(evt);
            }
        });
        txt_minutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_minutosKeyTyped(evt);
            }
        });
        getContentPane().add(txt_minutos);
        txt_minutos.setBounds(180, 200, 120, 110);

        lbl_horas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_horas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_horas.setText("Horas");
        getContentPane().add(lbl_horas);
        lbl_horas.setBounds(70, 320, 50, 22);

        txt_horas.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        txt_horas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_horas.setText("00");
        txt_horas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_horasMouseClicked(evt);
            }
        });
        txt_horas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_horasKeyTyped(evt);
            }
        });
        getContentPane().add(txt_horas);
        txt_horas.setBounds(30, 200, 120, 110);

        lbl_puntos.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        lbl_puntos.setForeground(new java.awt.Color(208, 0, 29));
        lbl_puntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_puntos.setText(":");
        getContentPane().add(lbl_puntos);
        lbl_puntos.setBounds(150, 220, 30, 70);

        btn_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar2.png"))); // NOI18N
        btn_iniciar.setBorder(null);
        btn_iniciar.setBorderPainted(false);
        btn_iniciar.setContentAreaFilled(false);
        btn_iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar.setFocusPainted(false);
        btn_iniciar.setFocusable(false);
        btn_iniciar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar1.png"))); // NOI18N
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_iniciar);
        btn_iniciar.setBounds(40, 360, 250, 60);

        btn_parar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/parar1.png"))); // NOI18N
        btn_parar.setBorder(null);
        btn_parar.setBorderPainted(false);
        btn_parar.setContentAreaFilled(false);
        btn_parar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_parar.setFocusPainted(false);
        btn_parar.setFocusable(false);
        btn_parar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/parar2.png"))); // NOI18N
        btn_parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pararActionPerformed(evt);
            }
        });
        getContentPane().add(btn_parar);
        btn_parar.setBounds(40, 360, 250, 60);

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        getContentPane().add(lbl_fondo);
        lbl_fondo.setBounds(0, 0, 330, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        x = evt.getX();
        y = evt.getY();

    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);


    }//GEN-LAST:event_formMouseDragged

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed

        System.exit(0);

    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void txt_horasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_horasKeyTyped

        char c = evt.getKeyChar();

        if (txt_horas.getText().length() >= 2) {
            evt.consume();
        } else {

            if (!Character.isDigit(c)) {
                evt.consume();
            }

        }


    }//GEN-LAST:event_txt_horasKeyTyped

    private void txt_minutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_minutosKeyTyped

        char c = evt.getKeyChar();

        if (txt_minutos.getText().length() >= 2) {
            evt.consume();
        } else {

            if (!Character.isDigit(c)) {
                evt.consume();
            }

        }

    }//GEN-LAST:event_txt_minutosKeyTyped

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        horas = Integer.parseInt(txt_horas.getText());
        minutos = Integer.parseInt(txt_minutos.getText());
        int tiempo = (((horas * 60) * 60) + (minutos * 60) * 60);
        ActionListener listener;
        if (tiempo > 0) {
            txt_minutos.setEnabled(false);
            txt_horas.setEnabled(false);
            btn_iniciar.setVisible(false);
            btn_parar.setVisible(true);
            listener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt_minutos.setText(Integer.toString(minutos));
                    txt_horas.setText(Integer.toString(horas));
                    segundos--;
                    if (minutos == 0 && horas >= 1) {
                        horas--;
                        minutos = 59;
                    }
                    if (segundos == 0 && minutos >= 1) {
                        minutos--;
                        segundos = 59;
                    }
                }
            };
            timer = new Timer(1000, listener);
            timer.start();
            if (sistema.contains("Windows") || sistema.contains("windows")) {
                shutdownCommand = "shutdown.exe -s -f -t " + tiempo;
                try {
                    Runtime.getRuntime().exec(shutdownCommand);
                } catch (IOException ex) {
                    Logger.getLogger(programar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            mensaje.setVisible(true);
        }
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void txt_horasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_horasMouseClicked
        txt_horas.setText("");
    }//GEN-LAST:event_txt_horasMouseClicked

    private void txt_minutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_minutosMouseClicked
        txt_minutos.setText("");
    }//GEN-LAST:event_txt_minutosMouseClicked

    private void btn_pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pararActionPerformed
        txt_minutos.setText("00");
        txt_horas.setText("00");
        txt_horas.setEnabled(true);
        txt_minutos.setEnabled(true);
        btn_parar.setVisible(false);
        btn_iniciar.setVisible(true);
        timer.stop();
        if (sistema.contains("Windows") || sistema.contains("windows")) {
            shutdownCommand = "shutdown.exe -a";
            try {
                Runtime.getRuntime().exec(shutdownCommand);
            } catch (IOException ex) {
                Logger.getLogger(programar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_pararActionPerformed

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
            java.util.logging.Logger.getLogger(programar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(programar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(programar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(programar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new programar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_parar;
    private javax.swing.JLabel lbl_apagado;
    private javax.swing.JLabel lbl_automatico;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_horas;
    private javax.swing.JLabel lbl_linea;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_minutos;
    private javax.swing.JLabel lbl_puntos;
    private javax.swing.JTextField txt_horas;
    private javax.swing.JTextField txt_minutos;
    // End of variables declaration//GEN-END:variables
}

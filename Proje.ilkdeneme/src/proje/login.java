package proje;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class login extends javax.swing.JFrame {

    public static void DosyaOkuBH() throws IOException {
        File f = new File("BeniHatırla.txt");
 
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));

            String satir = reader.readLine();

            if (satir.equals("check")) {
                BeniHatırla.setSelected(true);
                KullanıcıAdı.setText(reader.readLine());
                Şifre.setText(reader.readLine());
               reader.close();
            }
            else
                reader.close();
        } catch (FileNotFoundException ex) {

        }

    }

    public static void DosyaOlustur(String URL) {
        File f = new File(URL);
        try {
            if (!f.exists()) {
                f.createNewFile();
                System.out.println(f.getName() + " adlı dosya Oluşturuldu..");
            } else {
                System.out.println("Dosya olduğundan oluşturma işlemi yapılmayacaktır. ");
            }
        } catch (IOException e) {

        }
        
    }

    public static void DosyaSil(String URL) {
        File f = new File(URL);
        f.delete();
        System.out.println("silindi");
    }

    public static void DosyaYazBH(String id, String pass, String URL) {
   
        try {
            String check = "check";
            File f = new File(URL);
            FileWriter yazici = new FileWriter(f, true);
            BufferedWriter yaz = new BufferedWriter(yazici);
            if (!("").equals(id) && !("").equals(pass)) {
                yaz.write(check);
                yaz.newLine();
                yaz.write(id);
                yaz.newLine();
                yaz.write(pass);
                yaz.newLine();
                yaz.close();
                System.out.println("Ekleme İşlemi Başarılı");
            }
        } catch (Exception hata) {
            
        }
    }

    public static void DosyaYaz(String id, String pass, String URL) {
        try {
            File f = new File(URL);
            FileWriter yazici = new FileWriter(f, true);
            BufferedWriter yaz = new BufferedWriter(yazici);
            if (!("").equals(id) && !("").equals(pass)) {
                yaz.write(id);
                yaz.newLine();
                yaz.write(pass);
                yaz.newLine();
                yaz.close();
                System.out.println("Ekleme İşlemi Başarılı");
            }
        } catch (Exception hata) {
            hata.printStackTrace();
        }
    }

    public ArrayList<String> DosyaOkuIdPass() throws IOException {
        File f = new File("idpass.txt");
        ArrayList<String> idpass = new ArrayList<>();
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            int i = 0;
            String satir = reader.readLine();

            while (satir != null) {
                idpass.add(satir);
                
                satir = reader.readLine();
                i++;
            }
           
        } catch (FileNotFoundException ex) {
        }
        
        
        return (idpass);
    }

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        KullanıcıAdı = new javax.swing.JTextPane();
        Şifre = new javax.swing.JPasswordField();
        Girişbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BeniHatırla = new javax.swing.JCheckBox();
        Kayıt = new java.awt.Button();
        Girişbtn2 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ŞİFRENİZİ GİRİNİZ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 236, 338, 54));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("KULLANICI ADNIZI GİRİNİZ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 106, 338, 54));

        KullanıcıAdı.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(KullanıcıAdı);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 178, 296, 47));

        Şifre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Şifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ŞifreActionPerformed(evt);
            }
        });
        Şifre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ŞifreKeyPressed(evt);
            }
        });
        getContentPane().add(Şifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 296, 292, 47));

        Girişbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Girişbtn.setText("GİRİŞ");
        Girişbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirişbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Girişbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 377, 100, 52));

        jPanel1.setBackground(new java.awt.Color(25, 181, 254));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SERA SULAMA SİSTEMİ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        jPanel2.setBackground(new java.awt.Color(249, 191, 59));

        BeniHatırla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BeniHatırla.setText("Beni Hatırla");
        BeniHatırla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BeniHatırla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeniHatırlaActionPerformed(evt);
            }
        });

        Kayıt.setActionCommand("Kayıt Ol");
        Kayıt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Kayıt.setLabel("Kayıt Ol");
        Kayıt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KayıtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 237, Short.MAX_VALUE)
                .addComponent(Kayıt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BeniHatırla, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(BeniHatırla, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Kayıt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        Girişbtn2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Girişbtn2.setText("GİRİŞ");
        Girişbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Girişbtn2MouseClicked(evt);
            }
        });
        Girişbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Girişbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(Girişbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 377, 100, 52));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GirişbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirişbtnActionPerformed
 if (BeniHatırla.isSelected()) {
            String id = KullanıcıAdı.getText();
            String pass = Şifre.getText();
            DosyaSil("BeniHatırla.txt");
            DosyaYazBH(id, pass, "BeniHatırla.txt");

        }
        else 
            DosyaSil("BeniHatırla.txt");
        try {
            ArrayList<String> idpass = DosyaOkuIdPass();

            for (int i = 0; i < idpass.size(); i += 2) {
                if (KullanıcıAdı.getText().equals(idpass.get(i)) ) {if(Şifre.getText().equals(idpass.get(i + 1))) {
                    Sulama yeni = new Sulama();
                    yeni.setVisible(true);
                    yeni.parent = this;
                    this.dispose();
                } }
                else
                    System.out.println(idpass.get(i)+"= değil"+KullanıcıAdı.getText()+"\n"+idpass.get(i+1)+"=değil"+Şifre.getText());
            }
        } catch (IOException ex) {
          
        }
    }//GEN-LAST:event_GirişbtnActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
 if (BeniHatırla.isSelected()) {
            String id = KullanıcıAdı.getText();
            String pass = Şifre.getText();
            DosyaSil("BeniHatırla.txt");
            DosyaYazBH(id, pass, "BeniHatırla.txt");

        }
        else 
            DosyaSil("BeniHatırla.txt");     
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void BeniHatırlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeniHatırlaActionPerformed
 if (BeniHatırla.isSelected()) {
            String id = KullanıcıAdı.getText();
            String pass = Şifre.getText();
            DosyaSil("BeniHatırla.txt");
            DosyaYazBH(id, pass, "BeniHatırla.txt");

        }
        else 
            DosyaSil("BeniHatırla.txt");        

    }//GEN-LAST:event_BeniHatırlaActionPerformed

    private void ŞifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ŞifreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Girişbtn.doClick();
        }
    }//GEN-LAST:event_ŞifreKeyPressed

    private void ŞifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ŞifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ŞifreActionPerformed

    private void Girişbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Girişbtn2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Girişbtn2MouseClicked

    private void Girişbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Girişbtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Girişbtn2ActionPerformed

    private void KayıtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KayıtActionPerformed
        DosyaOlustur("idpass.txt");
        String id = KullanıcıAdı.getText();
        String pass = Şifre.getText();
        DosyaYaz(id, pass, "idpass.txt");


    }//GEN-LAST:event_KayıtActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      try {
            DosyaOkuBH();
        } catch (IOException ex) {
        }

    }//GEN-LAST:event_formWindowActivated

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);

        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JCheckBox BeniHatırla;
    private javax.swing.JButton Girişbtn;
    private javax.swing.JButton Girişbtn2;
    private java.awt.Button Kayıt;
    private static javax.swing.JTextPane KullanıcıAdı;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JPasswordField Şifre;
    // End of variables declaration//GEN-END:variables
}

package proje;

import java.awt.event.KeyEvent; 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class login extends javax.swing.JFrame {                                             
Sulama yeni = new Sulama();

    public static void beniHatirla() {
        if (beniHatirla.isSelected()) {
            String ePosta = eMail.getText();
            String id = kullaniciAdi.getText();
            String pass = sifre.getText();
            DosyaSil("BeniHatırla.txt");
            DosyaYazBH(ePosta, id, pass, "BeniHatırla.txt"); //sıralı kullanıcı bilgileri

        } else {
            DosyaSil("BeniHatırla.txt");
        }

    }

    public static void beniHatirlaKontrol() {                                                           
        try {
            DosyaOkuBH();
        } catch (IOException ex) {
        }
    }

    public static void kayitOl() {
        DosyaOlustur("idpass.txt");
        String ePosta = eMail.getText();
        String id = kullaniciAdi.getText();
        String pass = sifre.getText();
        DosyaYaz(ePosta, id, pass, "idpass.txt");
    }

    public static void DosyaOkuBH() throws IOException {
        File f = new File("BeniHatırla.txt");

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));

            String satir = reader.readLine();

            if (satir.equals("check")) {
                beniHatirla.setSelected(true);
                eMail.setText(reader.readLine());
                kullaniciAdi.setText(reader.readLine());      //Kullanıcı bilgi kontrol
                sifre.setText(reader.readLine());
                reader.close();
            } else {
                reader.close();
            }
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

    public static void DosyaYazBH(String ePosta, String id, String pass, String URL) {

        try {
            String check = "check";
            File f = new File(URL);
            FileWriter yazici = new FileWriter(f, true);
            BufferedWriter yaz = new BufferedWriter(yazici);
            if (!("").equals(id) && !("").equals(pass)) {
                yaz.write(check);
                yaz.newLine();
                yaz.write(ePosta);
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

    public static void DosyaYaz(String ePosta, String id, String pass, String URL) {
        try {
            File f = new File(URL);
            FileWriter yazici = new FileWriter(f, true);
            BufferedWriter yaz = new BufferedWriter(yazici);
            if (!("").equals(id) && !("").equals(pass)) {
                yaz.write(ePosta);
                yaz.newLine();
                yaz.write(id);       //kayıt olma
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

      public static void DosyaYazLog(String id, String URL) {
        try {
            Date simdikiZaman = new Date();
            System.out.println(simdikiZaman.toString());
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd   HH:mm");
            System.out.println(df.format(simdikiZaman));
            File f = new File(URL);
            FileWriter yazici = new FileWriter(f, true);
            BufferedWriter yaz = new BufferedWriter(yazici);             //Giriş logu txtye yazma
            if (!("").equals(id)) {

                yaz.write("Kullanıcı adı :  " + id);
                yaz.newLine();
                yaz.write(df.format(simdikiZaman) + " -----> Giris yapıldı");
                yaz.newLine();

                yaz.close();
                System.out.println("Ekleme İşlemi Başarılı");
            }
        } catch (IOException hata) {
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
                idpass.add(satir);    //Önceden kayıt olurken kullanılan bilgileri txtden alıp arrayliste aktarma

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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cikis = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        beniHatirla = new javax.swing.JCheckBox();
        kayitBtn = new java.awt.Button();
        girisBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kullaniciAdi = new javax.swing.JTextPane();
        sifre = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eMail = new javax.swing.JTextPane();

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

        jPanel1.setBackground(new java.awt.Color(25, 181, 254));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SERA SULAMA SİSTEMİ");

        cikis.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        cikis.setForeground(new java.awt.Color(255, 255, 255));
        cikis.setText("X");
        cikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikisMouseClicked(evt);
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
                .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cikis))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        jPanel2.setBackground(new java.awt.Color(249, 191, 59));

        beniHatirla.setBackground(new java.awt.Color(249, 191, 59));
        beniHatirla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        beniHatirla.setText("Beni Hatırla");
        beniHatirla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        beniHatirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beniHatirlaActionPerformed(evt);
            }
        });

        kayitBtn.setActionCommand("Kayıt Ol");
        kayitBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        kayitBtn.setLabel("Kayıt Ol");
        kayitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitBtnActionPerformed(evt);
            }
        });

        girisBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        girisBtn.setText("GİRİŞ");
        girisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("KULLANICI ADINIZI GİRİNİZ");

        kullaniciAdi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(kullaniciAdi);

        sifre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreActionPerformed(evt);
            }
        });
        sifre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sifreKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ŞİFRENİZİ GİRİNİZ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("E-POSTA ADRESİNİZİ GİRİNİZ");

        eMail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane2.setViewportView(eMail);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 95, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(beniHatirla, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(girisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kayitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(sifre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beniHatirla, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(girisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kayitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void girisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisBtnActionPerformed
        if (beniHatirla.isSelected()) {
            String ePosta = eMail.getText(); //kontrol edilecek satırlar
            String id = kullaniciAdi.getText();
            String pass = sifre.getText();
            DosyaSil("BeniHatırla.txt");
            DosyaYazBH(ePosta, id, pass, "BeniHatırla.txt");

        } else {
            DosyaSil("BeniHatırla.txt");
        }
        try {
            ArrayList<String> idpass = DosyaOkuIdPass();

            for (int i = 0; i < idpass.size(); i += 3) {
                if (eMail.getText().equals(idpass.get(i)) && kullaniciAdi.getText().equals(idpass.get(i + 1)) && sifre.getText().equals(idpass.get(i + 2))) {
                    DosyaYazLog(kullaniciAdi.getText(),"log1.txt");
                    DosyaYazLog(kullaniciAdi.getText(),"log2.txt"); //Giriş kullanıcı Logları
                    
                    yeni.gelenlerVeriler(kullaniciAdi.getText());
                    yeni.setVisible(true);
                    yeni.parent = this;
                    this.dispose();
                }
                else {
                    System.out.println(eMail.getText()+"  eşit değil  "+idpass.get(i));
                    System.out.println(kullaniciAdi.getText()+"  eşit değil  "+idpass.get(i+1)); //hatalı giriş
                    System.out.println(sifre.getText()+"  eşit değil  "+idpass.get(i+2));
                }

            }
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_girisBtnActionPerformed

    private void cikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikisMouseClicked
        beniHatirla();
        this.dispose();
    }//GEN-LAST:event_cikisMouseClicked

    private void beniHatirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beniHatirlaActionPerformed
        beniHatirla();
    }//GEN-LAST:event_beniHatirlaActionPerformed

    private void sifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sifreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            girisBtn.doClick();
        }
    }//GEN-LAST:event_sifreKeyPressed

    private void sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifreActionPerformed

    private void kayitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitBtnActionPerformed
        kayitOl();


    }//GEN-LAST:event_kayitBtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        beniHatirlaKontrol();

    }//GEN-LAST:event_formWindowActivated

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);

        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JCheckBox beniHatirla;
    private javax.swing.JLabel cikis;
    private static javax.swing.JTextPane eMail;
    private javax.swing.JButton girisBtn;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Button kayitBtn;
    private static javax.swing.JTextPane kullaniciAdi;
    private static javax.swing.JPasswordField sifre;
    // End of variables declaration//GEN-END:variables
}

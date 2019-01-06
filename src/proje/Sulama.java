/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akink
 */
public class Sulama extends javax.swing.JFrame {

    static int sayac = 0;
    ArrayList<String> otoArray = new ArrayList<>();
    ArrayList<String> otoArray2 = new ArrayList<>();
    ArrayList<String> ekleArray2 = new ArrayList<>();
    ArrayList<String> ekleArray = new ArrayList<>();

    public static void DosyaYazLog(String yazi, String URL) {
        try {
            Date simdikiZaman = new Date();
            System.out.println(simdikiZaman.toString());
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd   HH:mm"); //zaman formatı tanımlama
            System.out.println(df.format(simdikiZaman));
            File f = new File(URL);
            FileWriter yazici = new FileWriter(f, true);
            try (BufferedWriter yaz = new BufferedWriter(yazici)) {
                yaz.write(df.format(simdikiZaman) + yazi);
                yaz.newLine();
            }
            System.out.println("Ekleme İşlemi Başarılı");

        } catch (IOException hata) {
        }
    }

    public Sulama() {
        initComponents();
    }

    public login parent;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        detayliBtn = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        otoMin = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        otoMax = new javax.swing.JTextPane();
        otomatikBtn = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        detayliSure = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        ekleBtn = new javax.swing.JButton();
        ayarlaBtn = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        detayliSaat = new javax.swing.JTextPane();
        jFrame2 = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        detayliBtn2 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        otoMin2 = new javax.swing.JTextPane();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        otoMax2 = new javax.swing.JTextPane();
        otomatikBtn2 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        detayliSure2 = new javax.swing.JTextPane();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        detayliSaat2 = new javax.swing.JTextPane();
        ekleBtn2 = new javax.swing.JButton();
        ayarlaBtn2 = new javax.swing.JButton();
        Hata = new javax.swing.JFrame();
        hataBtn = new java.awt.Button();
        Log = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        log2Txt = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        log1Txt = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saatLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sulanmaLbl = new javax.swing.JLabel();
        sicaklikLbl = new javax.swing.JLabel();
        jlbl9 = new javax.swing.JLabel();
        durdurBtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        nemLbl = new java.awt.Label();
        saat = new java.awt.Label();
        havaLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nemLbl2 = new javax.swing.JLabel();
        sulanmaLbl2 = new javax.swing.JLabel();
        sicaklikLbl2 = new javax.swing.JLabel();
        durdurBtn2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        logBtn = new java.awt.Button();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setResizable(false);
        jFrame1.setSize(new java.awt.Dimension(440, 560));

        jPanel3.setBackground(new java.awt.Color(249, 191, 59));
        jPanel3.setPreferredSize(new java.awt.Dimension(415, 448));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sera 1");

        detayliBtn.setBackground(new java.awt.Color(249, 191, 59));
        detayliBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        detayliBtn.setForeground(new java.awt.Color(255, 255, 255));
        detayliBtn.setText("Detaylı ayarlama");
        detayliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detayliBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Optimum nem aralığınızı giriniz :");

        otoMin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        otoMin.setEnabled(false);
        jScrollPane1.setViewportView(otoMin);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("-");

        otoMax.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        otoMax.setEnabled(false);
        jScrollPane2.setViewportView(otoMax);

        otomatikBtn.setBackground(new java.awt.Color(249, 191, 59));
        otomatikBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        otomatikBtn.setForeground(new java.awt.Color(255, 255, 255));
        otomatikBtn.setText("Otomatik Sulama");
        otomatikBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otomatikBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sulamanın süresini giriniz (dakika) :");

        detayliSure.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        detayliSure.setEnabled(false);
        jScrollPane3.setViewportView(detayliSure);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sulamanın başlayacağı saati giriniz :");

        ekleBtn.setBackground(new java.awt.Color(249, 191, 59));
        ekleBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ekleBtn.setForeground(new java.awt.Color(255, 255, 255));
        ekleBtn.setText("EKLE");
        ekleBtn.setEnabled(false);
        ekleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleBtnActionPerformed(evt);
            }
        });

        ayarlaBtn.setBackground(new java.awt.Color(249, 191, 59));
        ayarlaBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ayarlaBtn.setForeground(new java.awt.Color(255, 255, 255));
        ayarlaBtn.setText("AYARLA");
        ayarlaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayarlaBtnActionPerformed(evt);
            }
        });

        detayliSaat.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        detayliSaat.setText("14.22");
        detayliSaat.setToolTipText("");
        detayliSaat.setEnabled(false);
        detayliSaat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detayliSaatMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(detayliSaat);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(detayliBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otomatikBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jScrollPane13)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ayarlaBtn)
                            .addComponent(ekleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(113, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(otomatikBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(detayliBtn)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(ekleBtn)
                .addGap(33, 33, 33)
                .addComponent(ayarlaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(253, 253, 253)
                    .addComponent(jLabel14)
                    .addContainerGap(235, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        jFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame2.setSize(new java.awt.Dimension(440, 560));

        jPanel5.setBackground(new java.awt.Color(249, 191, 59));
        jPanel5.setPreferredSize(new java.awt.Dimension(415, 448));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Sera 2");

        detayliBtn2.setBackground(new java.awt.Color(249, 191, 59));
        detayliBtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        detayliBtn2.setForeground(new java.awt.Color(255, 255, 255));
        detayliBtn2.setText("Detaylı ayarlama");
        detayliBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detayliBtn2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Optimum nem aralığınızı giriniz :");

        otoMin2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        otoMin2.setEnabled(false);
        jScrollPane9.setViewportView(otoMin2);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("-");

        otoMax2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        otoMax2.setEnabled(false);
        jScrollPane10.setViewportView(otoMax2);

        otomatikBtn2.setBackground(new java.awt.Color(249, 191, 59));
        otomatikBtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        otomatikBtn2.setForeground(new java.awt.Color(255, 255, 255));
        otomatikBtn2.setText("Otomatik Sulama");
        otomatikBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otomatikBtn2ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Sulamanın süresini giriniz (dakika) :");

        detayliSure2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        detayliSure2.setEnabled(false);
        jScrollPane11.setViewportView(detayliSure2);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Sulamanın başlayacağı saati giriniz :");

        detayliSaat2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        detayliSaat2.setText("18.35");
        detayliSaat2.setEnabled(false);
        detayliSaat2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detayliSaat2MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(detayliSaat2);

        ekleBtn2.setBackground(new java.awt.Color(249, 191, 59));
        ekleBtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ekleBtn2.setForeground(new java.awt.Color(255, 255, 255));
        ekleBtn2.setText("EKLE");
        ekleBtn2.setEnabled(false);
        ekleBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleBtn2ActionPerformed(evt);
            }
        });

        ayarlaBtn2.setBackground(new java.awt.Color(249, 191, 59));
        ayarlaBtn2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ayarlaBtn2.setForeground(new java.awt.Color(255, 255, 255));
        ayarlaBtn2.setText("AYARLA");
        ayarlaBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayarlaBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(detayliBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otomatikBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ekleBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ayarlaBtn2))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(113, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(otomatikBtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9))
                .addGap(18, 18, 18)
                .addComponent(detayliBtn2)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(ekleBtn2)
                .addGap(57, 57, 57)
                .addComponent(ayarlaBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(253, 253, 253)
                    .addComponent(jLabel24)
                    .addContainerGap(235, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        Hata.setSize(new java.awt.Dimension(162, 126));

        hataBtn.setActionCommand("HATA");
        hataBtn.setBackground(new java.awt.Color(255, 0, 51));
        hataBtn.setForeground(new java.awt.Color(255, 255, 255));
        hataBtn.setLabel("HATA");
        hataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hataBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HataLayout = new javax.swing.GroupLayout(Hata.getContentPane());
        Hata.getContentPane().setLayout(HataLayout);
        HataLayout.setHorizontalGroup(
            HataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HataLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(hataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        HataLayout.setVerticalGroup(
            HataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HataLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(hataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        Log.setSize(new java.awt.Dimension(662, 585));

        jScrollPane4.setViewportView(log2Txt);

        jScrollPane6.setViewportView(log1Txt);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Sera 2 ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Sera 1 ");

        javax.swing.GroupLayout LogLayout = new javax.swing.GroupLayout(Log.getContentPane());
        Log.getContentPane().setLayout(LogLayout);
        LogLayout.setHorizontalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(129, 129, 129))
        );
        LogLayout.setVerticalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogLayout.createSequentialGroup()
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("HOŞGELDİNİZ YIKIK BEY");

        saatLbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        saatLbl.setText("Tarih saat");

        jPanel1.setBackground(new java.awt.Color(249, 191, 59));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sera 1");

        sulanmaLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sulanmaLbl.setForeground(new java.awt.Color(255, 255, 255));
        sulanmaLbl.setText("Sulanma durumu : ");

        sicaklikLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sicaklikLbl.setForeground(new java.awt.Color(255, 255, 255));
        sicaklikLbl.setText("Anlık sıcaklık durumu : ");

        jlbl9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlbl9.setForeground(new java.awt.Color(255, 255, 255));
        jlbl9.setText("Anlık nem durumu : %");

        durdurBtn.setBackground(new java.awt.Color(255, 0, 0));
        durdurBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        durdurBtn.setForeground(new java.awt.Color(255, 255, 255));
        durdurBtn.setText("SULAMAYI DURDUR");
        durdurBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durdurBtnActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(249, 191, 59));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Ayarlar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        nemLbl.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nemLbl.setForeground(new java.awt.Color(255, 255, 255));
        nemLbl.setPreferredSize(new java.awt.Dimension(38, 29));
        nemLbl.setText("0");

        saat.setForeground(new java.awt.Color(249, 191, 59));
        saat.setText("label1");

        havaLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        havaLbl.setForeground(new java.awt.Color(255, 255, 255));
        havaLbl.setText("Hava durumu : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(durdurBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(nemLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel4))
                            .addComponent(saat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sulanmaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(48, 48, 48))
                            .addComponent(sicaklikLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(havaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jlbl9)
                    .addContainerGap(166, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(nemLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(sulanmaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sicaklikLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(havaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(durdurBtn)
                .addGap(21, 21, 21)
                .addComponent(saat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jlbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(358, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(249, 191, 59));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sera 2");

        nemLbl2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nemLbl2.setForeground(new java.awt.Color(255, 255, 255));
        nemLbl2.setText("Anlık nem durumu : %x");

        sulanmaLbl2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sulanmaLbl2.setForeground(new java.awt.Color(255, 255, 255));
        sulanmaLbl2.setText("Sulanma durumu : ");

        sicaklikLbl2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sicaklikLbl2.setForeground(new java.awt.Color(255, 255, 255));
        sicaklikLbl2.setText("Anlık sıcaklık durumu : ");

        durdurBtn2.setBackground(new java.awt.Color(255, 0, 0));
        durdurBtn2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        durdurBtn2.setForeground(new java.awt.Color(255, 255, 255));
        durdurBtn2.setText("SULAMAYI DURDUR");
        durdurBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durdurBtn2ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(249, 191, 59));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Ayarlar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sicaklikLbl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sulanmaLbl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nemLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(durdurBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(nemLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sulanmaLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sicaklikLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(durdurBtn2)
                .addGap(43, 43, 43))
        );

        logBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        logBtn.setLabel("LOG");
        logBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saatLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saatLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DosyaYazLog(" -----> Cikis yapildi", "log1.txt");
        DosyaYazLog(" -----> Cikis yapildi", "log2.txt"); //Çıkış logları

    }//GEN-LAST:event_formWindowClosing

    private void detayliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detayliBtnActionPerformed
        if (detayliBtn.isSelected()) {
            otomatikBtn.setSelected(false);
            detayliSaat.setEnabled(true);
            detayliSure.setEnabled(true);
            ekleBtn.setEnabled(true);
            otoMin.setEnabled(false);         //1. sera için detaylı kutucuğunun durumunun incelenmesi
            otoMax.setEnabled(false);
        } else {
            detayliSaat.setEnabled(false);
            detayliSure.setEnabled(false);
            ekleBtn.setEnabled(false);
        }
    }//GEN-LAST:event_detayliBtnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jFrame2.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void detayliBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detayliBtn2ActionPerformed
        if (detayliBtn2.isSelected()) {
            otomatikBtn2.setSelected(false);
            detayliSaat2.setEnabled(true);
            detayliSure2.setEnabled(true);
            ekleBtn2.setEnabled(true);
            otoMin2.setEnabled(false);          //2. sera için detaylı kutucuğunun durumunun incelenmesi
            otoMax2.setEnabled(false);
        } else {
            detayliSaat2.setEnabled(false);
            detayliSure2.setEnabled(false);
            ekleBtn2.setEnabled(false);
        }
    }//GEN-LAST:event_detayliBtn2ActionPerformed

    private void otomatikBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otomatikBtnActionPerformed
        if (otomatikBtn.isSelected()) {
            detayliBtn.setSelected(false);
            otoMin.setEnabled(true);
            otoMax.setEnabled(true);
            detayliSaat.setEnabled(false);
            detayliSure.setEnabled(false);         //1. sera için otomatik kutucuğunun durmununun incelenmesi
            ekleBtn.setEnabled(false);
        } else {
            otoMin.setEnabled(false);
            otoMax.setEnabled(false);
        }
    }//GEN-LAST:event_otomatikBtnActionPerformed

    private void otomatikBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otomatikBtn2ActionPerformed
        if (otomatikBtn2.isSelected()) {
            detayliSaat2.setEnabled(false);
            detayliSure2.setEnabled(false);
            ekleBtn2.setEnabled(false);
            detayliBtn2.setSelected(false);      //2. sera için otomatik kutucuğunun durmununun incelenmesi
            otoMin2.setEnabled(true);
            otoMax2.setEnabled(true);
        } else {
            otoMin2.setEnabled(false);
            otoMax2.setEnabled(false);
        }
    }//GEN-LAST:event_otomatikBtn2ActionPerformed

    private void ekleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleBtnActionPerformed

        if (!("").equals(detayliSaat.getText()) && !("").equals(detayliSure.getText())) {
            ekleArray.add(detayliSaat.getText());   //detaylı seçim esnasında girilen saat ve sürenin arraye aktarılması
            ekleArray.add(detayliSure.getText());
        }
    }//GEN-LAST:event_ekleBtnActionPerformed

    private void ayarlaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayarlaBtnActionPerformed
        if (otomatikBtn.isSelected() && !("").equals(otoMin.getText()) && !("").equals(otoMax.getText())) {
            if (Integer.parseInt(otoMin.getText()) < Integer.parseInt(otoMax.getText())) {
                DosyaYazLog(" -----> Otomatige alindi   degerler : " + otoMin.getText() + "-" + otoMax.getText(), "log1.txt");
                otoArray.add(otoMin.getText());
                otoArray.add(otoMax.getText());
                jFrame1.setVisible(false);
                ekleArray.clear();
            } else {
                Hata.setVisible(true);
            } //ayar logları
        }
        if (detayliBtn.isSelected()) {
            DosyaYazLog(" -----> Detayliya alindi", "log1.txt");
            for (int i = 0; i < ekleArray.size(); i += 2) {
                DosyaYazLog(" -----> Saat : " + ekleArray.get(i) + "  Sure : " + ekleArray.get(i + 1) + " dakika", "log1.txt");
            }
            otoArray.clear();
            jFrame1.setVisible(false);
        }
    }//GEN-LAST:event_ayarlaBtnActionPerformed

    private void hataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hataBtnActionPerformed
        Hata.setVisible(false);
    }//GEN-LAST:event_hataBtnActionPerformed

    private void ayarlaBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayarlaBtn2ActionPerformed
        if (otomatikBtn2.isSelected() && !("").equals(otoMin2.getText()) && !("").equals(otoMax2.getText())) {
            if (Integer.parseInt(otoMin2.getText()) < Integer.parseInt(otoMax2.getText())) {
                DosyaYazLog(" -----> Otomatige alindi   degerler : " + otoMin2.getText() + "-" + otoMax2.getText(), "log2.txt");
                otoArray2.add(otoMin2.getText());
                otoArray2.add(otoMax2.getText());
                ekleArray2.clear();
                jFrame2.setVisible(false);
            } else {           //ayar logları
                Hata.setVisible(true);
            }
        }
        if (detayliBtn2.isSelected()) {
            System.out.println("sa");
            DosyaYazLog(" -----> Detayliya alindi", "log2.txt");
            for (int i = 0; i < ekleArray2.size(); i += 2) {
                DosyaYazLog(" -----> Saat : " + ekleArray2.get(i) + "  Sure : " + ekleArray2.get(i + 1) + " dakika", "log2.txt");

            }
            otoArray2.clear();
            jFrame2.setVisible(false);
        }

    }//GEN-LAST:event_ayarlaBtn2ActionPerformed

    private void ekleBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleBtn2ActionPerformed
        if (!("").equals(detayliSaat2.getText()) && !("").equals(detayliSure2.getText())) {
            ekleArray2.add(detayliSaat2.getText());   //detaylı seçim esnasında girilen saat ve sürenin arraye aktarılması
            ekleArray2.add(detayliSure2.getText());
        }
    }//GEN-LAST:event_ekleBtn2ActionPerformed

    private void detayliSaat2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detayliSaat2MouseClicked
        detayliSaat2.setText("");
    }//GEN-LAST:event_detayliSaat2MouseClicked

    private void detayliSaatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detayliSaatMouseClicked
        detayliSaat.setText("");
    }//GEN-LAST:event_detayliSaatMouseClicked

    private void durdurBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durdurBtn2ActionPerformed
        DosyaYazLog(" -----> Sulama Durduruldu", "log2.txt");  //Sulama durdurup loga yazma
        sulanmaLbl2.setText("Sulanma durumu : Sera sulanmıyor");

    }//GEN-LAST:event_durdurBtn2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jFrame1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void durdurBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durdurBtnActionPerformed
        DosyaYazLog(" -----> Sulama Durduruldu", "log1.txt");  //Sulama durdurup loga yazma
        sulanmaLbl.setText("Sulanma durumu : Sera sulanmıyor");
    }//GEN-LAST:event_durdurBtnActionPerformed

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        FileReader reader2 = null;
        FileReader reader = null;
        try {
            reader2 = new FileReader("log2.txt");     //logların gözükeceği pencereyi açma ve logların txtden okunup yazdırılması
            reader = new FileReader("log1.txt");
            log1Txt.read(reader, "log1.txt");
            log2Txt.read(reader2, "log2.txt");
        } catch (IOException ex) {
            Logger.getLogger(Sulama.class.getName()).log(Level.SEVERE, null, ex);
        }
        Log.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_logBtnActionPerformed
    public void gelenlerVeriler2(String[] infoArray) {

        if (infoArray[0].equals("on")) {
            sulanmaLbl.setText("Sulanma durumu : Sera sulanıyor");
        } else if (infoArray[0].equals("off")) {        
            sulanmaLbl.setText("Sulanma durumu : Sera sulanmıyor");        //mqttden gelen verilerin uygun yerlere yerleştirilmesi
        }
        sicaklikLbl.setText("Anlık sıcaklık durumu : " + infoArray[1] + "°C");
        nemLbl.setText(infoArray[2]);
        havaLbl.setText("Hava durumu : " + infoArray[3]);
    }

    public void gelenlerVeriler(String isim) {

        Timer myTimer = new Timer();
        TimerTask gorev = new TimerTask() {

            @Override
            public void run() {

                Date simdikiZaman = new Date();
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd   HH.mm.ss");
                DateFormat xd = new SimpleDateFormat("HH.mm");
                saatLbl.setText(df.format(simdikiZaman));
                saat.setText(xd.format(simdikiZaman));
            }
        };

        myTimer.schedule(gorev, 0, 1000);

        Timer harbi = new Timer();
        TimerTask harbii = new TimerTask() {

            @Override
            public void run() {

                Random r = new Random(); //random sınıfı
                int a =15+ r.nextInt(31);//15 ten 45 e kadar random sıcaklık
                int b = r.nextInt(101); // 1 den 100 e kadar random nem yüzdesi
                sicaklikLbl2.setText("Anlık sıcaklık durumu : "+Integer.toString(a)+"°C");
                nemLbl2.setText("Anlık nem durumu : %" + Integer.toString(b));
                try {

                    if (Integer.parseInt(nemLbl.getText()) < Integer.parseInt(otoArray.get(0)) && Integer.parseInt(otoArray.get(0)) >= 0) {
                        sulanmaLbl.setText("Sulanma durumu : Sera sulanıyor"); //otomatik ayar seçildiğinde mqttden alınan nem değeriyle optimum değerlerin karşılaştırılması
                        DosyaYazLog(" -----> Sera sulanıyor", "log1.txt");
                    } else {
                        sulanmaLbl.setText("Sulanma durumu : Sera sulanmıyor");
                        DosyaYazLog(" -----> Sera sulanmıyor", "log1.txt");
                    }
                } catch (IndexOutOfBoundsException otoArray) {

                }
                try {

                    if (b < Integer.parseInt(otoArray2.get(0)) && Integer.parseInt(otoArray2.get(0)) >= 0) {
                        sulanmaLbl2.setText("Sulanma durumu : Sera sulanıyor");
                        DosyaYazLog(" -----> Sera sulanıyor", "log2.txt");
                    } else {     //otomatik ayar seçildiğinde 5 saniyede bir rastgele değişen nem değeriyle optimum değerlerin karşılaştırılması
                        sulanmaLbl2.setText("Sulanma durumu : Sera sulanmıyor");
                    }
                    DosyaYazLog(" -----> Sera sulanmıyor", "log2.txt");
                } catch (IndexOutOfBoundsException otoArray2) {

                }

            }
        };

        myTimer.schedule(harbii, 0, 5000);

        jLabel1.setText("Hoşgeldiniz  " + isim);
        Timer myTimer3 = new Timer();       //giriş yapulan kullanıcı adının sağ üste yazdırılması
        TimerTask gorev3 = new TimerTask() {

            @Override
            public void run() {
                try {

                    for (int i = 0; i < ekleArray.size(); i += 2) {
                        if (saat.getText().equals(ekleArray.get(i))) {
                            DosyaYazLog(" -----> Sera sulanıyor", "log1.txt"); //detaylı ayar seçildiğinde saniyede 1 girilen saatlerden biriyle anlık saat eşleşiyor mu diye kontrol edilmesi
                            Timer myTimer2 = new Timer();
                            TimerTask gorev2 = new TimerTask() {

                                @Override
                                public void run() {
                                    myTimer3.cancel();
                                    sulanmaLbl.setText("Sulanma durumu : Sera sulanıyor");
                                    sayac++;
                                    System.out.println("Deneme:" + sayac);
                                    if (sayac == 2) {
                                        sulanmaLbl.setText("Sulanma durumu : Sera sulanmıyor");
                                        DosyaYazLog(" -----> Sera sulanmıyor", "log1.txt");
                                        myTimer2.cancel();

                                    }
                                }
                            };

                            myTimer2.schedule(gorev2, 0, Integer.parseInt(ekleArray.get(i + 1)) * 60000); //sulamanın istenilen sürede gerçekleştirilmesi

                        }
                    }
                } catch (IndexOutOfBoundsException ekleArray) {

                }
            }
        };

        myTimer3.schedule(gorev3, 0, 1000);
        Timer myTimer5 = new Timer();
        TimerTask gorev5 = new TimerTask() {

            @Override
            public void run() {
                try {

                    for (int i = 0; i < ekleArray2.size(); i += 2) {
                        if (saat.getText().equals(ekleArray2.get(i))) {   //detaylı ayar seçildiğinde saniyede 1 girilen saatlerden biriyle anlık saat eşleşiyor mu diye kontrol edilmesi
                            DosyaYazLog(" -----> Sera sulanıyor", "log2.txt");
                            Timer myTimer4 = new Timer();
                            TimerTask gorev4 = new TimerTask() {

                                @Override
                                public void run() {
                                    myTimer5.cancel();
                                    sulanmaLbl2.setText("Sulanma durumu : Sera sulanıyor");
                                    sayac++;
                                    System.out.println("Deneme:" + sayac);
                                    if (sayac == 2) {
                                        sulanmaLbl2.setText("Sulanma durumu : Sera sulanmıyor");
                                        DosyaYazLog(" -----> Sera sulanmıyor", "log2.txt");
                                        myTimer4.cancel();

                                    }
                                }
                            };

                            myTimer4.schedule(gorev4, 0, Integer.parseInt(ekleArray2.get(i + 1)) * 60000); //sulamanın istenilen sürede gerçekleştirilmesi

                        }
                    }
                } catch (IndexOutOfBoundsException ekleArray) {

                }
            }
        };

        myTimer5.schedule(gorev5, 0, 1000);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sulama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Hata;
    private javax.swing.JFrame Log;
    private javax.swing.JButton ayarlaBtn;
    private javax.swing.JButton ayarlaBtn2;
    private javax.swing.JCheckBox detayliBtn;
    private javax.swing.JCheckBox detayliBtn2;
    public static javax.swing.JTextPane detayliSaat;
    public static javax.swing.JTextPane detayliSaat2;
    public static javax.swing.JTextPane detayliSure;
    public static javax.swing.JTextPane detayliSure2;
    private javax.swing.JButton durdurBtn;
    private javax.swing.JButton durdurBtn2;
    public static javax.swing.JButton ekleBtn;
    public static javax.swing.JButton ekleBtn2;
    private java.awt.Button hataBtn;
    public static javax.swing.JLabel havaLbl;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    public static javax.swing.JLabel jlbl9;
    private javax.swing.JTextPane log1Txt;
    public static javax.swing.JTextPane log2Txt;
    private java.awt.Button logBtn;
    public static java.awt.Label nemLbl;
    private javax.swing.JLabel nemLbl2;
    public static javax.swing.JTextPane otoMax;
    public static javax.swing.JTextPane otoMax2;
    public static javax.swing.JTextPane otoMin;
    public static javax.swing.JTextPane otoMin2;
    private javax.swing.JCheckBox otomatikBtn;
    private javax.swing.JCheckBox otomatikBtn2;
    public static java.awt.Label saat;
    public static javax.swing.JLabel saatLbl;
    public static javax.swing.JLabel sicaklikLbl;
    public static javax.swing.JLabel sicaklikLbl2;
    public static javax.swing.JLabel sulanmaLbl;
    private javax.swing.JLabel sulanmaLbl2;
    // End of variables declaration//GEN-END:variables
}

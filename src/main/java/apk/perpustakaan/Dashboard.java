package apk.perpustakaan;

import java.awt.CardLayout;
import java.awt.*;
import javax.swing.SwingConstants;
import javax.swing.table.*;

public class Dashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Dashboard.class.getName());

    /**
     * Creates new form kdankndkajwdnk
     */
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        new RoundedPanel(40);
        CardLayout cl = (CardLayout) jPanel3.getLayout();
        cl.show(jPanel3, "dashboard");
        
        //Dashboard table 
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.setRowHeight(35);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jScrollPane1.setBorder(null);
        jTable1.getTableHeader().setBorder(null);
        jTable1.getTableHeader().setBackground(java.awt.Color.WHITE);
        jTable1.getTableHeader().setBackground(Color.WHITE);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Laskar Pelangi", "Ahmad Fauzi", "21 Apr 2026", "Dipinjam"});
        model.addRow(new Object[]{"2", "Bumi Manusia", "Siti Aminah", "20 Apr 2026", "Kembali"});
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        
        }
        //Transaksi Table
        tabletransaksi.setBorder(null);
        tabletransaksi.setShowGrid(false);
        tabletransaksi.setIntercellSpacing(new Dimension(0, 0));
        tabletransaksi.setBackground(Color.WHITE);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        tabletransaksi.getTableHeader().setBorder(null);
        tabletransaksi.getTableHeader().setBackground(Color.WHITE);
        tabletransaksi.setRowHeight(35);
        tabletransaksi.setSelectionBackground(new Color(220, 240, 255));
        tabletransaksi.setSelectionForeground(Color.BLACK);
        DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    
        for (int i = 0; i < tabletransaksi.getColumnCount(); i++) {
        tabletransaksi.getColumnModel().getColumn(i).setCellRenderer(centerRenderer2);
    }
        
        tablebuku.setBorder(null);
        tablebuku.setShowGrid(false);
        tablebuku.setIntercellSpacing(new Dimension(0, 0));
        tablebuku.setBackground(Color.WHITE);
        jScrollPane3.setBorder(null);
        jScrollPane3.setViewportBorder(null);
        jScrollPane3.getViewport().setBackground(Color.WHITE);
        tablebuku.getTableHeader().setBorder(null);
        tablebuku.getTableHeader().setBackground(Color.WHITE);
        tablebuku.setRowHeight(35);
        tablebuku.setSelectionBackground(new Color(220, 240, 255));
        tablebuku.setSelectionForeground(Color.BLACK);
        DefaultTableCellRenderer centerRenderer3 = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    
        for (int i = 0; i < tablebuku.getColumnCount(); i++) {
        tablebuku.getColumnModel().getColumn(i).setCellRenderer(centerRenderer3);
  
        }
        
        tableuser.setBorder(null);
        tableuser.setShowGrid(false);
        tableuser.setIntercellSpacing(new Dimension(0, 0));
        tableuser.setBackground(Color.WHITE);
        jScrollPane4.setBorder(null);
        jScrollPane4.setViewportBorder(null);
        jScrollPane4.getViewport().setBackground(Color.WHITE);
        tableuser.getTableHeader().setBorder(null);
        tableuser.getTableHeader().setBackground(Color.WHITE);
        tableuser.setRowHeight(35);
        tableuser.setSelectionBackground(new Color(220, 240, 255));
        tableuser.setSelectionForeground(Color.BLACK);
        DefaultTableCellRenderer centerRenderer4 = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    
        for (int i = 0; i < tablebuku.getColumnCount(); i++) {
        tablebuku.getColumnModel().getColumn(i).setCellRenderer(centerRenderer4);
  
        }
    ((DefaultTableCellRenderer)tabletransaksi.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(SwingConstants.CENTER);


         
      }

// Method untuk membuka Dialog Tambah Transaksi
private void btnBukaDialogActionPerformed(java.awt.event.ActionEvent evt) {
    tambahtransaksi dialog = new tambahtransaksi(this, true);
    dialog.setVisible(true);
}
     
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        roundedPanel1 = new apk.perpustakaan.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        roundedPanel2 = new apk.perpustakaan.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        roundedPanel3 = new apk.perpustakaan.RoundedPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        roundedPanel4 = new apk.perpustakaan.RoundedPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        roundedPanel5 = new apk.perpustakaan.RoundedPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        roundedPanel6 = new apk.perpustakaan.RoundedPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        roundedPanel7 = new apk.perpustakaan.RoundedPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        transaksi = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btntransaksi = new apk.perpustakaan.RoundedButton2();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        roundedPanel8 = new apk.perpustakaan.RoundedPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        roundedPanel9 = new apk.perpustakaan.RoundedPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        roundedPanel10 = new apk.perpustakaan.RoundedPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        roundedPanel11 = new apk.perpustakaan.RoundedPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        roundedPanel14 = new apk.perpustakaan.RoundedPanel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabletransaksi = new javax.swing.JTable();
        buku = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        roundedPanel13 = new apk.perpustakaan.RoundedPanel();
        roundedButton21 = new apk.perpustakaan.RoundedButton2();
        jLabel42 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        roundedPanel16 = new apk.perpustakaan.RoundedPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        roundedPanel18 = new apk.perpustakaan.RoundedPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        roundedPanel15 = new apk.perpustakaan.RoundedPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablebuku = new javax.swing.JTable();
        user = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        roundedPanel17 = new apk.perpustakaan.RoundedPanel();
        roundedButton23 = new apk.perpustakaan.RoundedButton2();
        jLabel46 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        roundedPanel19 = new apk.perpustakaan.RoundedPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        roundedPanel20 = new apk.perpustakaan.RoundedPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        roundedPanel21 = new apk.perpustakaan.RoundedPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableuser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(752, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2841, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(140, 421));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\house (1).png")); // NOI18N
        jButton1.setText("Dashboard");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\credit-card.png")); // NOI18N
        jButton2.setText("Transaksi");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jButton3.setBackground(new java.awt.Color(0, 51, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\book-open.png")); // NOI18N
        jButton3.setText("Buku");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(this::jButton3ActionPerformed);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, -1));

        jButton4.setBackground(new java.awt.Color(0, 51, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\users-three.png")); // NOI18N
        jButton4.setText("User Manage");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(this::jButton4ActionPerformed);
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\power.png")); // NOI18N
        jButton5.setText("Logout");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(this::jButton5ActionPerformed);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 70, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.CardLayout());

        dashboard.setBackground(new java.awt.Color(246, 246, 246));
        dashboard.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 50, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("Dashboard");
        jLabel15.setPreferredSize(new java.awt.Dimension(900, 20));
        dashboard.add(jLabel15);

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel1.setPreferredSize(new java.awt.Dimension(250, 140));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Total Buku");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 6, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setText("Buku Terdaftar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        roundedPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\Screenshot 2026-04-24 174558.png")); // NOI18N
        roundedPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, 60));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("500");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(this::jTextField2ActionPerformed);
        roundedPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        dashboard.add(roundedPanel1);

        roundedPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel2.setPreferredSize(new java.awt.Dimension(250, 140));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setText("Total User");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setText("Anggota Aktif");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\Screenshot 2026-04-24 174923.png")); // NOI18N

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("200");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addGap(28, 28, 28)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addGap(66, 66, 66))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(24, 24, 24))
        );

        dashboard.add(roundedPanel2);

        roundedPanel3.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel3.setPreferredSize(new java.awt.Dimension(250, 140));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setText("Peminjam Aktif");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setText("Orang Sedang Meminjam");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\Screenshot 2026-04-24 175154.png")); // NOI18N

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("30");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(this::jTextField4ActionPerformed);

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel3Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45))
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(33, 33, 33)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(25, 25, 25))
        );

        dashboard.add(roundedPanel3);

        roundedPanel4.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel4.setPreferredSize(new java.awt.Dimension(250, 140));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setText("Buku Dipinjam");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel11.setText("Buku Keluar");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\Screenshot 2026-04-24 175445.png")); // NOI18N

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("120");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(this::jTextField5ActionPerformed);

        javax.swing.GroupLayout roundedPanel4Layout = new javax.swing.GroupLayout(roundedPanel4);
        roundedPanel4.setLayout(roundedPanel4Layout);
        roundedPanel4Layout.setHorizontalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel4Layout.createSequentialGroup()
                        .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(88, 88, 88))))
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundedPanel4Layout.setVerticalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(24, 24, 24))
        );

        dashboard.add(roundedPanel4);

        roundedPanel5.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel5.setPreferredSize(new java.awt.Dimension(250, 140));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setText("Buku Dikembalikan");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel12.setText("Buku Kembali");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\Screenshot 2026-04-24 175543.png")); // NOI18N

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("90");
        jTextField6.setBorder(null);
        jTextField6.addActionListener(this::jTextField6ActionPerformed);

        javax.swing.GroupLayout roundedPanel5Layout = new javax.swing.GroupLayout(roundedPanel5);
        roundedPanel5.setLayout(roundedPanel5Layout);
        roundedPanel5Layout.setHorizontalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel5Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(33, 33, 33))
            .addGroup(roundedPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel5Layout.setVerticalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jTextField6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(21, 21, 21))
        );

        dashboard.add(roundedPanel5);

        roundedPanel6.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel6.setPreferredSize(new java.awt.Dimension(250, 140));
        roundedPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("Keterlambatan");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        roundedPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 6, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel13.setText("Buku Terlambat");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        roundedPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 108, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\Screenshot 2026-04-24 175628.png")); // NOI18N
        roundedPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("10");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(this::jTextField1ActionPerformed);
        roundedPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 71, 52));

        dashboard.add(roundedPanel6);

        roundedPanel7.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel7.setPreferredSize(new java.awt.Dimension(850, 180));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Aktivitas Terakhir");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout roundedPanel7Layout = new javax.swing.GroupLayout(roundedPanel7);
        roundedPanel7.setLayout(roundedPanel7Layout);
        roundedPanel7Layout.setHorizontalGroup(
            roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        roundedPanel7Layout.setVerticalGroup(
            roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        dashboard.add(roundedPanel7);

        jPanel3.add(dashboard, "dashboard");

        transaksi.setBackground(new java.awt.Color(250, 249, 249));
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksiMouseClicked(evt);
            }
        });
        transaksi.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel4.setPreferredSize(new java.awt.Dimension(3163, 50));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Transaksi");
        jLabel2.setAlignmentX(0.5F);
        jPanel4.add(jLabel2, java.awt.BorderLayout.WEST);

        btntransaksi.setBorder(null);
        btntransaksi.setText("+ Tambah Transaksi");
        btntransaksi.setPreferredSize(new java.awt.Dimension(150, 10));
        btntransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntransaksiMouseExited(evt);
            }
        });
        btntransaksi.addActionListener(this::btntransaksiActionPerformed);
        jPanel4.add(btntransaksi, java.awt.BorderLayout.EAST);

        transaksi.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(246, 246, 246));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel6.setLayout(new java.awt.GridLayout(1, 4, 30, 10));

        roundedPanel8.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel8.setPreferredSize(new java.awt.Dimension(641, 100));

        jLabel22.setText("Total Transaksi");

        jLabel23.setText("Semua Transaksi");

        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\file-text.png")); // NOI18N

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("200");
        jTextField9.setBorder(null);
        jTextField9.addActionListener(this::jTextField9ActionPerformed);

        javax.swing.GroupLayout roundedPanel8Layout = new javax.swing.GroupLayout(roundedPanel8);
        roundedPanel8.setLayout(roundedPanel8Layout);
        roundedPanel8Layout.setHorizontalGroup(
            roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel8Layout.createSequentialGroup()
                .addGroup(roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35)
                        .addGap(58, 58, 58)
                        .addGroup(roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(roundedPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel36)))
                .addContainerGap(491, Short.MAX_VALUE))
        );
        roundedPanel8Layout.setVerticalGroup(
            roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel36))
                    .addComponent(jTextField9))
                .addGap(12, 12, 12)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addGap(22, 22, 22))
        );

        jPanel6.add(roundedPanel8);

        roundedPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setText("Peminjaman Aktif");

        jLabel25.setText("Sedang Dipinjam");

        jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\Screenshot 2026-04-24 175154.png")); // NOI18N

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("100");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(this::jTextField10ActionPerformed);

        javax.swing.GroupLayout roundedPanel9Layout = new javax.swing.GroupLayout(roundedPanel9);
        roundedPanel9.setLayout(roundedPanel9Layout);
        roundedPanel9Layout.setHorizontalGroup(
            roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel9Layout.createSequentialGroup()
                .addGroup(roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38))
                    .addGroup(roundedPanel9Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundedPanel9Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel24)
                                .addComponent(jLabel25)))))
                .addContainerGap(493, Short.MAX_VALUE))
        );
        roundedPanel9Layout.setVerticalGroup(
            roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel9Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jLabel38))
                    .addComponent(jTextField10))
                .addGap(14, 14, 14)
                .addComponent(jLabel25)
                .addGap(18, 18, 18))
        );

        jPanel6.add(roundedPanel9);

        roundedPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setText("Dipinjam Hari Ini");

        jLabel27.setText("Transaksi Hari Ini");

        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\Screenshot 2026-04-24 175445.png")); // NOI18N

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("100");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(this::jTextField11ActionPerformed);

        javax.swing.GroupLayout roundedPanel10Layout = new javax.swing.GroupLayout(roundedPanel10);
        roundedPanel10.setLayout(roundedPanel10Layout);
        roundedPanel10Layout.setHorizontalGroup(
            roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel10Layout.createSequentialGroup()
                .addGroup(roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel10Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addGroup(roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundedPanel10Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel26))))
                    .addGroup(roundedPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37)))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        roundedPanel10Layout.setVerticalGroup(
            roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(21, 21, 21))
        );

        jPanel6.add(roundedPanel10);

        roundedPanel11.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setText("Dikembalikan Hari Ini");
        roundedPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 14, -1, -1));

        jLabel29.setText("Transaksi Hari Ini");
        roundedPanel11.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 116, -1, -1));
        roundedPanel11.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, -1, -1));
        roundedPanel11.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 62, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\arrow-counter-clockwise (1).png")); // NOI18N
        roundedPanel11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("50");
        jTextField12.setBorder(null);
        jTextField12.addActionListener(this::jTextField12ActionPerformed);
        roundedPanel11.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jPanel6.add(roundedPanel11);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel7.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel10.setLayout(new java.awt.BorderLayout());
        jPanel7.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        roundedPanel14.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        roundedPanel14.setPreferredSize(new java.awt.Dimension(886, 343));
        roundedPanel14.setLayout(new java.awt.BorderLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setText("Daftar Transaksi");
        jLabel34.setPreferredSize(new java.awt.Dimension(0, 20));
        roundedPanel14.add(jLabel34, java.awt.BorderLayout.PAGE_START);

        tabletransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID Transaksi", "Peminjam", "Buku", "Tgl Pinjam", "Tgl Kembali", "Denda", "Catatan", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabletransaksi.setOpaque(false);
        jScrollPane2.setViewportView(tabletransaksi);
        if (tabletransaksi.getColumnModel().getColumnCount() > 0) {
            tabletransaksi.getColumnModel().getColumn(0).setMinWidth(30);
            tabletransaksi.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        roundedPanel14.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel7.add(roundedPanel14, java.awt.BorderLayout.WEST);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        transaksi.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel3.add(transaksi, "transaksi");

        buku.setLayout(new java.awt.BorderLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel11.setLayout(new java.awt.BorderLayout());

        roundedPanel13.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel13.setPreferredSize(new java.awt.Dimension(700, 100));

        roundedButton21.setText("+ Tambah buku baru");
        roundedButton21.addActionListener(this::roundedButton21ActionPerformed);

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setText("Cari Buku");

        jTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField8.setName(""); // NOI18N
        jTextField8.addActionListener(this::jTextField8ActionPerformed);

        javax.swing.GroupLayout roundedPanel13Layout = new javax.swing.GroupLayout(roundedPanel13);
        roundedPanel13.setLayout(roundedPanel13Layout);
        roundedPanel13Layout.setHorizontalGroup(
            roundedPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(roundedPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel13Layout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roundedButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(roundedPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        roundedPanel13Layout.setVerticalGroup(
            roundedPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addGap(2, 2, 2)
                .addGroup(roundedPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roundedButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel11.add(roundedPanel13, java.awt.BorderLayout.WEST);

        buku.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel12.setPreferredSize(new java.awt.Dimension(182, 681));
        jPanel12.setRequestFocusEnabled(false);
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        roundedPanel16.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel16.setPreferredSize(new java.awt.Dimension(170, 150));

        jLabel44.setText("Total Judul");

        jLabel45.setText("Judul Buku Terdaftar");

        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\Screenshot 2026-04-24 174558.png")); // NOI18N

        javax.swing.GroupLayout roundedPanel16Layout = new javax.swing.GroupLayout(roundedPanel16);
        roundedPanel16.setLayout(roundedPanel16Layout);
        roundedPanel16Layout.setHorizontalGroup(
            roundedPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel16Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(28, 28, 28))
            .addGroup(roundedPanel16Layout.createSequentialGroup()
                .addGroup(roundedPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel16Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel44))
                    .addGroup(roundedPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel16Layout.setVerticalGroup(
            roundedPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addGap(18, 18, 18))
        );

        jPanel12.add(roundedPanel16);

        roundedPanel18.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel18.setPreferredSize(new java.awt.Dimension(170, 150));

        jLabel48.setText("Jumlah Stok Buku");

        jLabel49.setText("Total Stok");

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\file-text.png")); // NOI18N

        javax.swing.GroupLayout roundedPanel18Layout = new javax.swing.GroupLayout(roundedPanel18);
        roundedPanel18.setLayout(roundedPanel18Layout);
        roundedPanel18Layout.setHorizontalGroup(
            roundedPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel18Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(37, 37, 37))
            .addGroup(roundedPanel18Layout.createSequentialGroup()
                .addGroup(roundedPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel18Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel49))
                    .addGroup(roundedPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel18Layout.setVerticalGroup(
            roundedPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addGap(21, 21, 21)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(18, 18, 18))
        );

        jPanel12.add(roundedPanel18);

        buku.add(jPanel12, java.awt.BorderLayout.LINE_END);

        jPanel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel13.setLayout(new java.awt.BorderLayout());

        roundedPanel15.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        roundedPanel15.setLayout(new java.awt.BorderLayout());

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel43.setText("Daftar Buku");
        roundedPanel15.add(jLabel43, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel14.setLayout(new java.awt.BorderLayout());

        tablebuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Judul Buku", "Kategori", "Pengarang", "Stok"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablebuku);
        if (tablebuku.getColumnModel().getColumnCount() > 0) {
            tablebuku.getColumnModel().getColumn(0).setMinWidth(30);
            tablebuku.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jPanel14.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        roundedPanel15.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel13.add(roundedPanel15, java.awt.BorderLayout.CENTER);

        buku.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel3.add(buku, "buku");

        user.setLayout(new java.awt.BorderLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel15.setLayout(new java.awt.BorderLayout());

        roundedPanel17.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel17.setPreferredSize(new java.awt.Dimension(700, 100));

        roundedButton23.setText("+ Tambah User baru");
        roundedButton23.addActionListener(this::roundedButton23ActionPerformed);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setText("Cari User");

        jTextField13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField13.setName(""); // NOI18N
        jTextField13.addActionListener(this::jTextField13ActionPerformed);

        javax.swing.GroupLayout roundedPanel17Layout = new javax.swing.GroupLayout(roundedPanel17);
        roundedPanel17.setLayout(roundedPanel17Layout);
        roundedPanel17Layout.setHorizontalGroup(
            roundedPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel17Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(roundedPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel17Layout.createSequentialGroup()
                        .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roundedButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(roundedPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        roundedPanel17Layout.setVerticalGroup(
            roundedPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addGap(2, 2, 2)
                .addGroup(roundedPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roundedButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel15.add(roundedPanel17, java.awt.BorderLayout.WEST);

        user.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel16.setPreferredSize(new java.awt.Dimension(182, 681));
        jPanel16.setRequestFocusEnabled(false);
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        roundedPanel19.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel19.setPreferredSize(new java.awt.Dimension(170, 150));

        jLabel47.setText("Total User");

        jLabel50.setText("User Terdaftar");

        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\Screenshot 2026-04-24 174923.png")); // NOI18N

        javax.swing.GroupLayout roundedPanel19Layout = new javax.swing.GroupLayout(roundedPanel19);
        roundedPanel19.setLayout(roundedPanel19Layout);
        roundedPanel19Layout.setHorizontalGroup(
            roundedPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel19Layout.createSequentialGroup()
                .addGroup(roundedPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel19Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel47))
                    .addGroup(roundedPanel19Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel50))
                    .addComponent(jLabel32))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        roundedPanel19Layout.setVerticalGroup(
            roundedPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(18, 18, 18))
        );

        jPanel16.add(roundedPanel19);

        roundedPanel20.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel20.setPreferredSize(new java.awt.Dimension(170, 150));

        jLabel51.setText("Anggota Yang Masih Aktif");

        jLabel52.setText("User Active");

        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\resources\\assets\\Screenshot 2026-04-24 174923.png")); // NOI18N

        javax.swing.GroupLayout roundedPanel20Layout = new javax.swing.GroupLayout(roundedPanel20);
        roundedPanel20.setLayout(roundedPanel20Layout);
        roundedPanel20Layout.setHorizontalGroup(
            roundedPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel20Layout.createSequentialGroup()
                .addGroup(roundedPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel20Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel52))
                    .addGroup(roundedPanel20Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel51))
                    .addGroup(roundedPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        roundedPanel20Layout.setVerticalGroup(
            roundedPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(jLabel51)
                .addGap(18, 18, 18))
        );

        jPanel16.add(roundedPanel20);

        user.add(jPanel16, java.awt.BorderLayout.LINE_END);

        jPanel17.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel17.setLayout(new java.awt.BorderLayout());

        roundedPanel21.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel21.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        roundedPanel21.setLayout(new java.awt.BorderLayout());

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel53.setText("Daftar User");
        roundedPanel21.add(jLabel53, java.awt.BorderLayout.PAGE_START);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel18.setLayout(new java.awt.BorderLayout());

        tableuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "NIK", "Nama Lengkap", "Username", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableuser);
        if (tableuser.getColumnModel().getColumnCount() > 0) {
            tableuser.getColumnModel().getColumn(0).setMinWidth(30);
            tableuser.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jPanel18.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        roundedPanel21.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel17.add(roundedPanel21, java.awt.BorderLayout.CENTER);

        user.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel3.add(user, "user");

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseClicked
        
    }//GEN-LAST:event_transaksiMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        CardLayout cl = (CardLayout) jPanel3.getLayout();
        cl.show(jPanel3, "dashboard");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        CardLayout cl = (CardLayout) jPanel3.getLayout();
        cl.show(jPanel3, "transaksi");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void btntransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransaksiMouseEntered
      btntransaksi.setBackground(new Color(0, 80, 200));
    }//GEN-LAST:event_btntransaksiMouseEntered

    private void btntransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransaksiMouseExited
        btntransaksi.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_btntransaksiMouseExited

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void btntransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransaksiActionPerformed
        tambahtransaksi dialog = new tambahtransaksi(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_btntransaksiActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       CardLayout cl = (CardLayout) jPanel3.getLayout();
       cl.show(jPanel3, "buku");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CardLayout cl = (CardLayout) jPanel3.getLayout();
        cl.show(jPanel3, "user");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void roundedButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundedButton23ActionPerformed

    private void roundedButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedButton21ActionPerformed
        tambahbukubaru dialog = new tambahbukubaru(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_roundedButton21ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Dashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private apk.perpustakaan.RoundedButton2 btntransaksi;
    private javax.swing.JPanel buku;
    private javax.swing.JPanel dashboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private apk.perpustakaan.RoundedButton2 roundedButton21;
    private apk.perpustakaan.RoundedButton2 roundedButton23;
    private apk.perpustakaan.RoundedPanel roundedPanel1;
    private apk.perpustakaan.RoundedPanel roundedPanel10;
    private apk.perpustakaan.RoundedPanel roundedPanel11;
    private apk.perpustakaan.RoundedPanel roundedPanel13;
    private apk.perpustakaan.RoundedPanel roundedPanel14;
    private apk.perpustakaan.RoundedPanel roundedPanel15;
    private apk.perpustakaan.RoundedPanel roundedPanel16;
    private apk.perpustakaan.RoundedPanel roundedPanel17;
    private apk.perpustakaan.RoundedPanel roundedPanel18;
    private apk.perpustakaan.RoundedPanel roundedPanel19;
    private apk.perpustakaan.RoundedPanel roundedPanel2;
    private apk.perpustakaan.RoundedPanel roundedPanel20;
    private apk.perpustakaan.RoundedPanel roundedPanel21;
    private apk.perpustakaan.RoundedPanel roundedPanel3;
    private apk.perpustakaan.RoundedPanel roundedPanel4;
    private apk.perpustakaan.RoundedPanel roundedPanel5;
    private apk.perpustakaan.RoundedPanel roundedPanel6;
    private apk.perpustakaan.RoundedPanel roundedPanel7;
    private apk.perpustakaan.RoundedPanel roundedPanel8;
    private apk.perpustakaan.RoundedPanel roundedPanel9;
    public javax.swing.JTable tablebuku;
    public javax.swing.JTable tabletransaksi;
    private javax.swing.JTable tableuser;
    private javax.swing.JPanel transaksi;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author asus
 */
public class sukses extends javax.swing.JFrame {

    /**
     * Creates new form sukses
     */
    public sukses() throws ClassNotFoundException, SQLException {
        initComponents();
        show_user();
        
        kode.addItem("");
        kode.addItem("LPNG01");
        kode.addItem("LPNG01");
        kode.addItem("LPNG02");
        kode.addItem("LPNG03");
        kode.addItem("LPNG04");
        kode.addItem("LPNG05");
        
        
        
        for (int a=0; a<=31; a++){
            if(a==0){
                String tgl = "";
                Tgl.addItem(tgl);
            }
            String tgl = Integer.toString(a);
            Tgl.addItem(tgl);
        }
        
        Bln.addItem("");
        Bln.addItem("Januari");
        Bln.addItem("Februari");
        Bln.addItem("Maret");
        Bln.addItem("April");
        Bln.addItem("Mei");
        Bln.addItem("Juni");
        Bln.addItem("Juli");
        Bln.addItem("Agustus");
        Bln.addItem("September");
        Bln.addItem("Oktober");  
        Bln.addItem("November");
        Bln.addItem("Desember");
        
        for (int b=2016; b<=2020; b++){
            if(b==2016){
                String thn = "";
                Thn.addItem(thn);
            }
            String thn = Integer.toString(b);
            Thn.addItem(thn);        
        } 
        
        Jam1.addItem("");
        Jam1.addItem("07.00");
        Jam1.addItem("08.00");
        Jam1.addItem("09.00");
        Jam1.addItem("10.00");
        Jam1.addItem("11.00");
        Jam1.addItem("12.00");
        Jam1.addItem("13.00");
        Jam1.addItem("14.00");
        Jam1.addItem("15.00");
        Jam1.addItem("16.00");
        Jam1.addItem("17.00");
        Jam1.addItem("18.00");
        Jam1.addItem("19.00");
        Jam1.addItem("20.00");
        Jam1.addItem("21.00");
        Jam1.addItem("22.00");
        Jam1.addItem("23.00");
        Jam1.addItem("24.00");
        
        Jam2.addItem("");
        Jam2.addItem("08.00");
        Jam2.addItem("09.00");
        Jam2.addItem("10.00");
        Jam2.addItem("11.00");
        Jam2.addItem("12.00");
        Jam2.addItem("13.00");
        Jam2.addItem("14.00");
        Jam2.addItem("15.00");
        Jam2.addItem("16.00");
        Jam2.addItem("17.00");
        Jam2.addItem("18.00");
        Jam2.addItem("19.00");
        Jam2.addItem("20.00");
        Jam2.addItem("21.00");
        Jam2.addItem("22.00");
        Jam2.addItem("23.00");
        Jam2.addItem("24.00");
        Jam2.addItem("01.00");
        
        
        
        
        double hrgx = 0; 
        String hrg11 = String.valueOf(hrgx);
        lama.setText(hrg11);
    }
    
    public ArrayList<User> userList() throws ClassNotFoundException, SQLException{
        ArrayList<User> userList = new ArrayList<>();
        try {
            
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url ="jdbc:sqlserver://localhost:1433;databaseName=futsal;user=sandi;password=sandi;";
        Connection con = DriverManager.getConnection(url);
        String query1 = "select*from pesan";
        Statement st =con.createStatement();
            ResultSet rs =st.executeQuery(query1);
            User user;
            while(rs.next()){
                user = new User(rs.getInt("pno"),rs.getString("Kode"),rs.getString("Tanggal"),rs.getString("Waktu"),rs.getString("Nomer_Member"),rs.getString("Nama_Member"),rs.getString("Harga"),rs.getString("Dp"),rs.getString("Sisa"));
                userList.add(user);
            }
        
        } catch (Exception e) {
        }
        return userList;
    }
    
    public void show_user() throws ClassNotFoundException, SQLException{
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) tblBarang.getModel();
        Object[] row = new Object[9];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getPno();
            row[1] = list.get(i).getKode();
            row[2] = list.get(i).getTanggal();
            row[3] = list.get(i).getWaktu();
            row[4] = list.get(i).getNomer_Member();
            row[5] = list.get(i).getNama_Member();
            row[6] = list.get(i).getHarga();
            row[7] = list.get(i).getDp();
            row[8] = list.get(i).getSisa();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jam1 = new javax.swing.JComboBox<>();
        Jam2 = new javax.swing.JComboBox<>();
        lama = new javax.swing.JTextField();
        txtTeam = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        dp = new javax.swing.JTextField();
        sisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hitung = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        bayar = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        kode = new javax.swing.JComboBox<>();
        Tgl = new javax.swing.JComboBox<>();
        Bln = new javax.swing.JComboBox<>();
        Thn = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        KTP = new javax.swing.JRadioButton();
        KTM = new javax.swing.JRadioButton();
        SIM = new javax.swing.JRadioButton();
        PASPOR = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Kode Lap");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 90, 30);

        jLabel2.setText("Booking jam");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 100, 90, 30);

        jLabel3.setText("Nomor Member");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 200, 100, 30);

        jLabel4.setText("Nama Member");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 240, 100, 30);

        jLabel5.setText("Harga");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 290, 50, 30);

        jLabel6.setText("Dp");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 330, 40, 30);

        jLabel7.setText("Sisa");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 370, 40, 30);

        Jam1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Jam1ItemStateChanged(evt);
            }
        });
        getContentPane().add(Jam1);
        Jam1.setBounds(110, 100, 70, 30);

        Jam2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Jam2ItemStateChanged(evt);
            }
        });
        Jam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jam2ActionPerformed(evt);
            }
        });
        getContentPane().add(Jam2);
        Jam2.setBounds(210, 100, 70, 30);

        lama.setEnabled(false);
        lama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lamaMouseClicked(evt);
            }
        });
        lama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamaActionPerformed(evt);
            }
        });
        lama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lamaKeyTyped(evt);
            }
        });
        getContentPane().add(lama);
        lama.setBounds(350, 100, 50, 30);

        txtTeam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTeamKeyTyped(evt);
            }
        });
        getContentPane().add(txtTeam);
        txtTeam.setBounds(110, 200, 110, 30);
        getContentPane().add(txtNama);
        txtNama.setBounds(110, 240, 160, 30);

        harga.setEnabled(false);
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });
        getContentPane().add(harga);
        harga.setBounds(120, 290, 110, 30);

        dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpActionPerformed(evt);
            }
        });
        dp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dpKeyTyped(evt);
            }
        });
        getContentPane().add(dp);
        dp.setBounds(120, 330, 110, 30);

        sisa.setEnabled(false);
        getContentPane().add(sisa);
        sisa.setBounds(120, 370, 110, 30);

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "sno", "Kode", "Tanggal", "Waktu", "Nomor Member", "Nama Member", "Harga", "Dp", "Sisa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBarang);
        if (tblBarang.getColumnModel().getColumnCount() > 0) {
            tblBarang.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(440, 90, 450, 460);

        jLabel8.setText("s/d");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 100, 20, 30);

        jLabel9.setText("lama main");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(290, 110, 60, 14);

        jLabel10.setText("jam");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(410, 110, 30, 14);

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung);
        hitung.setBounds(40, 430, 90, 40);

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan);
        simpan.setBounds(170, 430, 100, 40);

        bayar.setText("Bayar");
        getContentPane().add(bayar);
        bayar.setBounds(470, 20, 110, 40);

        cari.setText("Cari");
        getContentPane().add(cari);
        cari.setBounds(610, 20, 110, 40);

        jLabel11.setText("Tanggal Booking");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 60, 100, 30);

        getContentPane().add(kode);
        kode.setBounds(110, 20, 200, 30);

        getContentPane().add(Tgl);
        Tgl.setBounds(110, 60, 70, 30);

        getContentPane().add(Bln);
        Bln.setBounds(190, 60, 120, 30);

        Thn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThnActionPerformed(evt);
            }
        });
        getContentPane().add(Thn);
        Thn.setBounds(330, 60, 90, 30);

        jLabel12.setText("Tanda Pengenal Member");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(290, 200, 140, 20);

        bg.add(KTP);
        KTP.setText("KTP");
        getContentPane().add(KTP);
        KTP.setBounds(320, 230, 100, 30);

        bg.add(KTM);
        KTM.setText("KTM");
        getContentPane().add(KTM);
        KTM.setBounds(320, 260, 90, 30);

        bg.add(SIM);
        SIM.setText("SIM");
        getContentPane().add(SIM);
        SIM.setBounds(320, 290, 90, 30);

        bg.add(PASPOR);
        PASPOR.setText("Paspor");
        getContentPane().add(PASPOR);
        PASPOR.setBounds(320, 320, 59, 23);

        jLabel13.setText("07.00 s/d 15.00 = Rp.100.000");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 130, 220, 30);

        jLabel14.setText("16.00 s/d 02.00 = Rp.130.000");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 170, 180, 30);

        jLabel15.setText("15.00 s/d 16.00 = Istirahat");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(260, 150, 150, 30);

        setSize(new java.awt.Dimension(927, 704));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        int salah = 0;
        
        //Tipe Pengenal
        String tanda ="";
        if(KTP.isSelected()){
            tanda= "KTP";
        } else if (KTM.isSelected()){
            tanda= "KTM";
        } else if (SIM.isSelected()){
            tanda= "SIM";
        }  else if (PASPOR.isSelected()){
            tanda= "Paspor";
        } else {
            salah = 1;
            JOptionPane.showMessageDialog(null,"Masukkan Tipe Tanda Pengenal Member");
        }
        
        //Nomor Pengenal
        String nox = txtTeam.getText();
        if(nox.isEmpty()){
            salah = 1;
            JOptionPane.showMessageDialog(null,"Masukkan Nomor Tanda Pengenal Member");
        }
        
        //Lapangan
        String kdx = String.valueOf(kode.getSelectedItem());
        if(kdx.isEmpty()){
            salah = 1;
            JOptionPane.showMessageDialog(null,"Masukkan Kode Lapangan");
        }
        
        
        //Jam
        String jam1 = String.valueOf(Jam1.getSelectedItem());
        String jam2 = String.valueOf(Jam2.getSelectedItem());
        
        
        if(jam1.isEmpty()){
            salah = 1;
            JOptionPane.showMessageDialog(null,"Maaf Jam Harus diisi");
        } else if(jam2.isEmpty()){
            salah = 1;
            JOptionPane.showMessageDialog(null,"Maaf Jam Harus diisi");
        }
        
        //Tanggal
         String tglx = String.valueOf(Tgl.getSelectedItem());
         String blnx = String.valueOf(Bln.getSelectedItem());
         String thnx = String.valueOf(Thn.getSelectedItem());
         if(tglx.isEmpty()){
              salah = 1;
                JOptionPane.showMessageDialog(null,"Maaf Tanggal Harus diisi");
         } else if(blnx.isEmpty()){
              salah = 1;
                JOptionPane.showMessageDialog(null,"Maaf Bulan Harus diisi");
         } else if(thnx.isEmpty()){
              salah = 1;
                JOptionPane.showMessageDialog(null,"Maaf Tahun Harus diisi");
         } 
         
         
        //Print
        if (salah==0){
        String[] data = new String[8];
        data[0] = (""+kode.getSelectedItem());
        data[1]= (""+Tgl.getSelectedItem()+"-"+Bln.getSelectedItem()+"-"+Thn.getSelectedItem());
        data[2] = (""+Jam1.getSelectedItem()+"-"+Jam2.getSelectedItem());
        data[3] = txtTeam.getText()+"("+tanda+")";
        data[4] = txtNama.getText();
        data[5] = harga.getText();
        data[6] = dp.getText();
        data[7] = sisa.getText();
        
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url ="jdbc:sqlserver://localhost:1433;databaseName=futsal;user=sandi;password=sandi;";
                Connection con = DriverManager.getConnection(url);
                String query = "insert into pesan(Kode, Tanggal, Waktu, Nomor_Member, Nama_Member, Harga, Dp, Sisa)values(?,?,?,?,?,?,?,?)";
                PreparedStatement pst =con.prepareStatement(query);
                String kd;
                kd=kode.getSelectedItem().toString();
                pst.setString(1, kd);
                String tanggal;
                tanggal=Tgl.getSelectedItem().toString()+"-"+Bln.getSelectedItem().toString()+"-"+Thn.getSelectedItem().toString();
                pst.setString(2, tanggal);
                String waktu;
                waktu=Jam1.getSelectedItem().toString()+"-"+Jam2.getSelectedItem().toString();
                pst.setString(3, waktu);
                String nomor;
                nomor=txtTeam.getText()+"("+tanda+")";
                pst.setString(4, nomor);
                pst.setString(5, txtNama.getText());
                pst.setString(6, harga.getText());
                pst.setString(7, dp.getText());
                pst.setString(8, sisa.getText());
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Telah Disimpan Di Database");
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Maaf, Database Error");
            }
            
        }
        
        kode.setSelectedIndex(0);
        Tgl.setSelectedIndex(0);
        Bln.setSelectedIndex(0);
        Thn.setSelectedIndex(0);
        Jam1.setSelectedIndex(0);
        Jam2.setSelectedIndex(0);
        bg.clearSelection();
        lama.setText("");
        txtTeam.setText("");
        txtNama.setText("");
        harga.setText("");
        dp.setText("");
        sisa.setText("");
        
    }//GEN-LAST:event_simpanActionPerformed

    private void ThnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThnActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void lamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lamaKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_lamaKeyTyped

    private void lamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lamaActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        
        //hitung sisa
        double hrg1 =Double.parseDouble(harga.getText());
        double hrgz =Double.parseDouble(dp.getText());
        double dpx = 0.5*hrg1;
        if(hrgz>(dpx-1)){
        double sisax = hrg1-hrgz;
        String sisa1 = String.valueOf(sisax);
        sisa.setText(sisa1);
        }else{
                     JOptionPane.showMessageDialog(null,"Maaf, Dp minimal 50000");
        }
        
    }//GEN-LAST:event_hitungActionPerformed

    private void dpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dpKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
        double hrgz = Double.parseDouble(harga.getText());
        double hrgy = Double.parseDouble(lama.getText());
        double hrgx = hrgz*hrgy; 
        String hrg11 = String.valueOf(hrgx);
        harga.setText(hrg11);
    }//GEN-LAST:event_dpKeyTyped

    private void dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpActionPerformed

    private void lamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lamaMouseClicked
        // TODO add your handling code here:
        String hrg11 = "";
        lama.setText(hrg11);
    }//GEN-LAST:event_lamaMouseClicked

    private void txtTeamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeamKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtTeamKeyTyped

    private void Jam2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Jam2ItemStateChanged
        // TODO add your handling code here:
        String jam1 = String.valueOf(Jam1.getSelectedItem());
        double jamx = 0;
        double jamy = 0;
        double hrgx = 0;
        int salah2 = 0;
        
        if(jam1=="07.00"){
            jamx=7;
            hrgx = 100000;
        } else if(jam1=="08.00"){
            jamx=8;
             hrgx = 100000;
        } else if(jam1=="09.00"){
            jamx=9;
             hrgx = 100000;
        } else if(jam1=="10.00"){
            jamx=10;
             hrgx = 100000;
        } else if(jam1=="11.00"){
             jamx=11;
              hrgx = 100000;
        } else if(jam1=="12.00"){
             jamx=12;
              hrgx = 100000;
        } else if(jam1=="13.00"){
             jamx=13;
              hrgx = 100000;
        } else if(jam1=="14.00"){
             jamx=14;
              hrgx = 100000;
        } else if(jam1=="15.00"){
            jamx=15;
             hrgx = 130000; 
        } else if(jam1=="16.00"){
             jamx=16;
             hrgx = 130000;
        } else if(jam1=="17.00"){
             jamx=17;
             hrgx = 130000;
        } else if(jam1=="18.00"){
             jamx=18;
             hrgx = 130000;
        } else if(jam1=="19.00"){
             jamx=19;
             hrgx = 130000;
        } else if(jam1=="20.00"){
             jamx=20;
             hrgx = 130000;
        } else if(jam1=="21.00"){
             jamx=21;
             hrgx = 130000;
        } else if(jam1=="22.00"){
             jamx=22;
             hrgx = 130000;
        } else if(jam1=="23.00"){
             jamx=23;
             hrgx = 130000;
        } else if(jam1=="24.00"){
             jamx=24;
             hrgx = 130000;
        }
        
        
        String jam2 = String.valueOf(Jam2.getSelectedItem());
        
        if(jam2=="08.00"){
             jamy=8;
             hrgx = 100000;
        } else if(jam2=="09.00"){
             jamy=9;
             hrgx = 100000;
        } else if(jam2=="10.00"){
             jamy=10;
             hrgx = 100000;
        } else if(jam2=="11.00"){
             jamy=11;
             hrgx = 100000;
        } else if(jam2=="12.00"){
             jamy=12;
             hrgx = 100000;
        } else if(jam2=="13.00"){
             jamy=13;
             hrgx = 100000;
        } else if(jam2=="14.00"){
             jamy=14;
             hrgx = 100000;
        } else if(jam2=="15.00"){
             jamy=15;
             hrgx = 100000;
        } else if(jam2=="16.00"){
             jamy=17;
             hrgx = 130000;
             salah2 =1;
             JOptionPane.showMessageDialog(null,"Maaf, Jadwal Istirahat");
        } else if(jam2=="17.00"){
             jamy=17;
             hrgx = 130000;
        } else if(jam2=="18.00"){
             jamy=18;
             hrgx = 130000;
        } else if(jam2=="19.00"){
             jamy=19;
             hrgx = 130000;
        } else if(jam2=="20.00"){
             jamy=20;
             hrgx = 130000;
        } else if(jam2=="21.00"){
             jamy=21;
             hrgx = 130000;
        } else if(jam2=="22.00"){
             jamy=22;
             hrgx = 130000;
        } else if(jam2=="23.00"){
             jamy=23;
             hrgx = 130000;
        } else if(jam2=="24.00"){
             jamy=24;
             hrgx = 130000;
        } else if(jam2=="01.00"){
             jamy=25;
             hrgx = 130000;
        }
        
        if(salah2==1){
            
             Jam1.setSelectedIndex(0);
             Jam2.setSelectedIndex(0);
             lama.setText("");
             harga.setText("");
             
             
        }else if(salah2==0){
            double jamz = jamy-jamx;
            String hrg1 = String.valueOf(jamz);
            lama.setText(hrg1);
            
            double hrgz = hrgx*jamz;
            String hrg2 = String.valueOf(hrgz);
            harga.setText(hrg2);
        }
    }//GEN-LAST:event_Jam2ItemStateChanged

    private void Jam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jam2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jam2ActionPerformed

    private void Jam1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Jam1ItemStateChanged
        // TODO add your handling code here:
        String jam1 = String.valueOf(Jam1.getSelectedItem());
        double jamx = 0;
        double jamy = 0;
        double hrgx = 0;
        int salah1 = 0;
        
        if(jam1=="07.00"){
            jamx=7;
            hrgx = 100000;
        } else if(jam1=="08.00"){
            jamx=8;
             hrgx = 100000;
        } else if(jam1=="09.00"){
            jamx=9;
             hrgx = 100000;
        } else if(jam1=="10.00"){
            jamx=10;
             hrgx = 100000;
        } else if(jam1=="11.00"){
             jamx=11;
              hrgx = 100000;
        } else if(jam1=="12.00"){
             jamx=12;
              hrgx = 100000;
        } else if(jam1=="13.00"){
             jamx=13;
              hrgx = 100000;
        } else if(jam1=="14.00"){
             jamx=14;
              hrgx = 100000;
        } else if(jam1=="15.00"){
            jamx=15;
             hrgx = 130000; 
            salah1 = 1;
            JOptionPane.showMessageDialog(null,"Maaf, Jadwal Istirahat");
        } else if(jam1=="16.00"){
             jamx=16;
             hrgx = 130000;
        } else if(jam1=="17.00"){
             jamx=17;
             hrgx = 130000;
        } else if(jam1=="18.00"){
             jamx=18;
             hrgx = 130000;
        } else if(jam1=="19.00"){
             jamx=19;
             hrgx = 130000;
        } else if(jam1=="20.00"){
             jamx=20;
             hrgx = 130000;
        } else if(jam1=="21.00"){
             jamx=21;
             hrgx = 130000;
        } else if(jam1=="22.00"){
             jamx=22;
             hrgx = 130000;
        } else if(jam1=="23.00"){
             jamx=23;
             hrgx = 130000;
        } else if(jam1=="24.00"){
             jamx=24;
             hrgx = 130000;
        }
        
        
        String jam2 = String.valueOf(Jam2.getSelectedItem());
        
        if(jam2=="08.00"){
             jamy=8;
             hrgx = 100000;
        } else if(jam2=="09.00"){
             jamy=9;
             hrgx = 100000;
        } else if(jam2=="10.00"){
             jamy=10;
             hrgx = 100000;
        } else if(jam2=="11.00"){
             jamy=11;
             hrgx = 100000;
        } else if(jam2=="12.00"){
             jamy=12;
             hrgx = 100000;
        } else if(jam2=="13.00"){
             jamy=13;
             hrgx = 100000;
        } else if(jam2=="14.00"){
             jamy=14;
             hrgx = 100000;
        } else if(jam2=="15.00"){
             jamy=15;
             hrgx = 100000;
        } else if(jam2=="16.00"){
             jamy=17;
             hrgx = 130000;
        } else if(jam2=="17.00"){
             jamy=17;
             hrgx = 130000;
        } else if(jam2=="18.00"){
             jamy=18;
             hrgx = 130000;
        } else if(jam2=="19.00"){
             jamy=19;
             hrgx = 130000;
        } else if(jam2=="20.00"){
             jamy=20;
             hrgx = 130000;
        } else if(jam2=="21.00"){
             jamy=21;
             hrgx = 130000;
        } else if(jam2=="22.00"){
             jamy=22;
             hrgx = 130000;
        } else if(jam2=="23.00"){
             jamy=23;
             hrgx = 130000;
        } else if(jam2=="24.00"){
             jamy=24;
             hrgx = 130000;
        } else if(jam2=="01.00"){
             jamy=25;
             hrgx = 130000;
        }
        
        if(salah1==1){
            
             Jam1.setSelectedIndex(0);
             Jam2.setSelectedIndex(0);
             lama.setText("");
             harga.setText("");
             
        }else if(salah1==0){
            double jamz = jamy-jamx;
            String hrg1 = String.valueOf(jamz);
            lama.setText(hrg1);
            
            double hrgz = hrgx*jamz;
            String hrg2 = String.valueOf(hrgz);
            harga.setText(hrg2);
        }
    }//GEN-LAST:event_Jam1ItemStateChanged

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
            java.util.logging.Logger.getLogger(sukses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sukses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sukses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sukses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new sukses().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(sukses.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(sukses.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bln;
    private javax.swing.JComboBox<String> Jam1;
    private javax.swing.JComboBox<String> Jam2;
    private javax.swing.JRadioButton KTM;
    private javax.swing.JRadioButton KTP;
    private javax.swing.JRadioButton PASPOR;
    private javax.swing.JRadioButton SIM;
    private javax.swing.JComboBox<String> Tgl;
    private javax.swing.JComboBox<String> Thn;
    private javax.swing.JButton bayar;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton cari;
    private javax.swing.JTextField dp;
    private javax.swing.JTextField harga;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kode;
    private javax.swing.JTextField lama;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField sisa;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables
}

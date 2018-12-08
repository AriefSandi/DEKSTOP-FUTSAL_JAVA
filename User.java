/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
class User {
    int pno;
    String Kode,Tanggal, Waktu, Nomer_Member, Nama_Member, Harga, Dp, Sisa;

    public User(int pno,String Kode, String Tanggal, String Waktu, String Nomer_Member, String Nama_Member, String Harga, String Dp, String Sisa) {
        this.pno = pno;
        this.Kode = Kode;
        this.Tanggal = Tanggal;
        this.Waktu = Waktu;
        this.Nomer_Member = Nomer_Member;
        this.Nama_Member = Nama_Member;
        this.Harga = Harga;
        this.Dp = Dp;
        this.Sisa = Sisa;
    }

    public int getPno() {
        return pno;
    }

    
    public String getKode() {
        return Kode;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public String getWaktu() {
        return Waktu;
    }

    public String getNomer_Member() {
        return Nomer_Member;
    }

    public String getNama_Member() {
        return Nama_Member;
    }

    public String getHarga() {
        return Harga;
    }

    public String getDp() {
        return Dp;
    }

    public String getSisa() {
        return Sisa;
    }
    
    
    
}

package com.kpaydeveloper.hibernatevalidator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.transform.Source;

public class Buku {

    @Size(min = 6, max = 10) // angka minimal 6 maksimal 10 tidak bisa kurang
private String kode;
    @NotNull // tidak boleh kosong harus ada isinya
private String judul;
    @NotNull // Tidak boleh kosong
private String penulis;
    @NotNull  // tidak boleh kosong
private String penerbit;
    @Min(1970) // tahun terbit minimal 1970
private  int tahun_terbit;
    @Size(min = 13, max = 13)
private String isbn;


    // kita buat constructor

    public Buku(){

    }
    // nilai constructonya

    public Buku(String kode, String judul, String penulis, String penerbit, int tahun_terbit, String isbn) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahun_terbit = tahun_terbit;
        this.isbn = isbn;
    }


    // kita buat getter dan setter

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}

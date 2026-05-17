package org.example;

import java.util.ArrayList;
import java.util.List;

public class Divisi {

    private String namaDivisi;
    private List<Karyawan> daftarKaryawan = new ArrayList<>();

    public Divisi(String namaDivisi) {
        if (namaDivisi == null || namaDivisi.isEmpty()) {
            throw new IllegalArgumentException("Nama Divisi tidak boleh kosong");
        }

        this.namaDivisi = namaDivisi;
        this.daftarKaryawan = new ArrayList<>();
    }

    public void tambahKaryawan(Karyawan karyawan) {
        if (karyawan == null) {
            throw new IllegalArgumentException("Karyawan tidak boleh null");
        }

        daftarKaryawan.add(karyawan);
    }

    public int getJumlahKaryawan() {
        return daftarKaryawan.size();
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public List<Karyawan> getDaftarKaryawan() {
        return daftarKaryawan;
    }
}

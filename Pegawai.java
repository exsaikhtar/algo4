/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exa2;
public class Pegawai {
    private String Nama;
    private String jenisKelamin;
    private String noPegawai;
    private boolean menikah;

    public Pegawai(String Nama, String jenisKelamin, String noPegawai, boolean menikah) {
        this.Nama = Nama;
        this.jenisKelamin = jenisKelamin;
        this.noPegawai = noPegawai;
        this.menikah = menikah;
    }

    public int getTunjangan() {
        if (menikah && jenisKelamin.equals("Laki-laki")) {
            return 200000;
        } else if (menikah && jenisKelamin.equals("Perempuan")) {
            return 150000;
        } else {
            return 100000;
        }
    }

    public void toShow() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("No Pegawai: " + noPegawai);
        System.out.println("Status Menikah: " + (menikah ? "Sudah Menikah" : "Belum Menikah"));
    }
}


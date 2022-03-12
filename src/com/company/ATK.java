package com.company;

public class ATK implements Comparable<ATK> {
    // data member
    private String nama;
    private int stock;
    private String code;

    // class dengan constructor
    public ATK(String code, String nama, int stock) {
        this.code = code;
        this.nama = nama;
        this.stock = stock;
    }
    // getter
    public String getNama() {

        return nama;
    }

    public String getCode() {

        return code;
    }

    public void setCode(String kode) {

        this.code = kode;
    }
    public int getStok(){

        return stock;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    @Override
    public String toString() {
        return "ATK{" +
                "code='" + code + '\'' +
                ", nama='" + nama + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }

    @Override
    public int compareTo(ATK o) {
        return this.getNama().compareTo(o.getNama());
    }
}

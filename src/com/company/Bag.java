package com.company;

public class Bag implements Comparable<Bag> {
    // data member
    private String code;
    private String nama;
    private int stock;

    // class dengan constructor
    public Bag(String code, String nama, int stock) {
        this.code = code;
        this.nama = nama;
        this.stock = stock;
    }
    // getter
    public String getCode() {

        return code;
    }

    public String getNama() {

        return nama;
    }
    public int getStock(){

        return stock;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "code='" + code + '\'' +
                ", nama='" + nama + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }

    @Override
    public int compareTo(Bag o) {
        return this.getCode().compareTo(o.getCode());
    }
}

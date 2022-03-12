package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean quit = false;
//        ArrayList<ATK> atkList = new ArrayList<>();
//        ArrayList<ATK> bagList = new ArrayList<>();
        TokoGeneric toko = new TokoGeneric();


//        GenArrayList<Bag> bagList = new GenArrayList<>();
//        GenArrayList<ATK> atkList = new GenArrayList<>();
        printInstraction();

        while (!quit) {
            System.out.println("Masukan Pilihan: ");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    printInstraction();
                    break;
                case 1:
                    toko.displayATK();
                    toko.displayBag();
                    break;
                case 2:
                    System.out.print("Code : ");
                    String code = input.next();
                    System.out.print("Nama : ");
                    String nama = input.next();
                    System.out.print("Stock : ");
                    int stock = input.nextInt();
                    if (code.contains("A") || code.contains(("B"))) {
                        ATK atk = new ATK(code, nama, stock);
                        toko.addATK(atk);
                    }
                    else if(code.contains("C")){
                        Bag bg = new Bag(code, nama, stock);
                        toko.addBag(bg);
                    }
                    System.out.println("Barang disimpan");
                    break;
                case 3:
                    System.out.println("Masukkan kode barang yang ingin dihapus :");
                    String code2 = input.next();
                    if(code2.contains("A") || code2.contains("B") ){
                        toko.remove(code2);

                        break;
                    }
                    else if(code2.contains("C")){
                        toko.remove(code2);

                        break;
                    }
                case 4:
                    break;
                case 5:
                    quit = true;
                    break;


            }
        }
    }

    public static void printInstraction() {
        System.out.println("\nTekan");
        System.out.println("0 - melihat opsi pilihan");
        System.out.println("1 - melihat barang");
        System.out.println("2 - tambah barang");
        System.out.println("3 - hapus barang");
        System.out.println("4 - mengubah barang");
        System.out.println("5 - keluar");

    }


}
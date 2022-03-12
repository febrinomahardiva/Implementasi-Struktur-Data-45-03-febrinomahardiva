package com.company;

import java.util.ArrayList;

public class TokoGeneric<E extends Comparable<? super E>> {
    private  ArrayList<ATK> listAtk = new ArrayList<>();
    private  ArrayList<Bag> listBag = new ArrayList<>();

    public void addATK(ATK atk){
        listAtk.add(atk);
    }

    public void addBag(Bag bag){

        listBag.add(bag);
    }

    public void remove(String kode){
        if(kode.contains("A")) {
            for (int i = 0; i <= listAtk.size(); i++) {
                listAtk.remove(i);
            }
        }
        else if(kode.contains("B")) {
            for (int i = 0; i <= listAtk.size(); i++) {
                listAtk.remove(i);
            }
        }
        else if(kode.contains("C")){
            for (int i = 0; i <= listBag.size(); i++) {
                listBag.remove(i);
            }
        }
    }
    public void displayATK(){
        for (ATK atk : listAtk) {
            System.out.println(atk);
        }
    }
    public void displayBag(){
        for (Bag bag : listBag) {
            System.out.println(bag);
        }
    }

//    public GenArrayList(int capacity) {
//        int initCapacity = capacity > 0 ? capacity : 0;
//        list = new ArrayList<>(initCapacity);
//    }
//
//    public void addData(E values) {
//
//        list.add(values);
//    }
//
//    public void display() {
//        for (int i = 0; i < list.size(); i++) {
//            System.out.printf("\n" +list.get(i) + " ");
//        }
//        System.out.println();
//    }
//
//    public void displaySort() {
//        Collections.sort(list);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.printf("\n" +list.get(i) + " ");
//        }
//        System.out.println();
//    }
//
//    public void removeData() {
//        Collections.sort(list);
//        if(code.cont)
//
//    }
//
//    public void setData(String object1, String object2) {
//        int index = list.indexOf(object1);
//        list.add(index, object2);
//    }
}

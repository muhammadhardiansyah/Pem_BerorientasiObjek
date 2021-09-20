/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author asus
 */
public class BangunDatarMain {
    public static void main(String[] args){
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 25;
        pp.lebar = 38;
        System.out.println("Persegi Panjang dengan "
                + "panjang " + pp.panjang + " dan lebar " + pp.lebar);
        pp.hitungLuas();
        pp.hitungKeliling();
        System.out.println("");
        
        Persegi p = new Persegi();
        p.sisi = 10;
        System.out.println("Persegi dengan sisi " + p.sisi);
        p.hitungLuas();
        p.hitungKeliling();
        System.out.println("");
        p.sisi = 15;
        System.out.println("Persegi dengan sisi " + p.sisi);
        p.hitungLuas();
        p.hitungKeliling();
        System.out.println("");
        
        Lingkaran L = new Lingkaran();
        L.jari = 25;
        System.out.println("Lingkaran dengan jari-jari "+ L.jari);
        L.hitungLuas();
        L.hitungKeliling();
        System.out.println("");
        L.jari = 37;
        System.out.println("Lingkaran dengan jari-jari " + L.jari);
        L.hitungLuas();
        L.hitungKeliling();
    }
}

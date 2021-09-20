/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author asus
 */
public class BangunRuangMain {
    public static void main(String[] args){
        Bola b = new Bola();
        b.r = 10;
        System.out.println("Jari-jari Bola: " + b.r);
        b.hitungVol();
        b.hitungLuasSelimut();
        System.out.println("");
        
        Tabung tb = new Tabung();
        tb.r = 10;
        tb.t = 10;
        System.out.println("Tabung dengan jari-jari " + tb.r +
        " dan tinggi " + tb.t);
        tb.hitungVol();
        tb.hitungLuasSelimut();
        System.out.println("");
        
        Kerucut k = new Kerucut();
        k.r = 8;
        k.t = 6;
        k.s = 10;
        System.out.println("Kerucut dengan jari-jari "+ k.r
        + " tinggi "+ k.t + " dan sisi miring " + k.s);
        k.hitungVol();
        k.hitungLuasSelimut();
        System.out.println("");
        
    }
}

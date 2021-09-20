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
public class Tabung {
    final double pi = 3.14;
    double r;
    double t;
    void hitungVol(){
        double hasil = this.pi * (this.r * this.r) * this.t;
        System.out.println("Volume Tabung: " + hasil);
    }
    void hitungLuasSelimut(){
        double hasil = 2 * this.pi * this.r * this.t;
        System.out.println("Luas Selimut Tabung: " + hasil);
    }
}
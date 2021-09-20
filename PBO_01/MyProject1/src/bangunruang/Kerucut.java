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
public class Kerucut {
    final double pi = 3.14;
    double r;
    double s;
    double t;
    void hitungVol(){
        double hasil = 1.0 / 3.0 * this.pi * this.r * this.r * this.t;
        System.out.println("Volume Kerucut: " + hasil);
    }
    void hitungLuasSelimut(){
        double hasil = this.pi *this.r * this.s;
        System.out.println("Luas Selimut Kerucut: " + hasil);
    }
}

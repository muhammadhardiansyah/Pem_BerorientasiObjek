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
public class Bola {
    final double pi = 3.14;
    double r;
    void hitungVol(){
        double hasil = (4.0 / 3.0) * this.pi * (this.r*this.r*this.r);
        System.out.println("Volume Bola: " + hasil);
    }
    void hitungLuasSelimut(){
        double hasil = 4.0 * this.pi * (this.r*this.r);
        System.out.println("Luas Permukaan Bola: " + hasil);
    }
    
}

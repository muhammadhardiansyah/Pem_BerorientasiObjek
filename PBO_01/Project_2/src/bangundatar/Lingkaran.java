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
public class Lingkaran {
    double jari;
    void hitungLuas(){
        double hasil = 3.14 * (this.jari*this.jari);
        System.out.println("Luas Lingkaran: " + hasil);
    }
    void hitungKeliling(){
        double hasil = 3.14 * 2 * this.jari;
        System.out.println("Keliling Lingkaran: " + hasil);
    }
}

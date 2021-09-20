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
public class PersegiPanjang {
    int panjang;
    int lebar;
    
    void hitungLuas(){
        int hasil = this.panjang * this.lebar;
        System.out.println("Luas Persegi Panjang: " + hasil);
    }
    void hitungKeliling(){
        int hasil = (this.panjang * 2) + (this.lebar * 2);
        System.out.println("Keliling Persegi Panjang: " + hasil);
    }
}

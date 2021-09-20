/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

/**
 *
 * @author asus
 */
public class MainProject_1 {
    public static void main(String [] args){
        OperasiBilangan op = new OperasiBilangan();
        op.bilPertama = 100;
        System.out.println("Bilangan pertama : "+ op.bilPertama);
        op.bilKedua = 150;
        System.out.println("Bilangan kedua : " + op.bilKedua);
        op.hitungPenjumlahan();
        op.hitungPengurangan();
        op.hitungPerkalian();
        op.hitungPembagian();
    }
}

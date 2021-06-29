/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1;

/**
 *
 * @author Sahrul
 */
public class TumpukanApp {
    public static void main (String[]args){
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(56);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        long nilai1 = tumpukan.peek();
        System.out.println("Nilai teratas = " + nilai1);
        System.out.println("Nama Saya Adalah Muhamad Sahrul Syabani");
        long nilai2 = tumpukan.pop();
        System.out.println("Nilai yang dihapus " + nilai2);
        tumpukan.baca();
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
        
    }
}

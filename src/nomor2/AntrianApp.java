/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor2;

/**
 *
 * @author Sahrul
 */
public class AntrianApp {
    public static void main (String[]args){
        Antrian antrian = new Antrian(10);
        antrian.enqueue(56);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("Nilai yang paling depan " + antrian.peek());
        System.out.println("Nama Saya Adalah Muhamad Sahrul Syabani");
        antrian.enqueue(70);
        antrian.display();
        System.out.println("Nilai yang diambil dari antrian " + antrian.dequeue());
        antrian.display();
        System.out.println("Nilai yang diambil dari antrian "+ antrian.dequeue());
        
        
        
    }
}

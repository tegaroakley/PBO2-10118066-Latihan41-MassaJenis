/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan41.massajenis;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan41MassaJenis {
    private static int volume;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi        : "+ kubus.getSisi());
        System.out.println("Massa       : "+ kubus.getMassa());
        System.out.println("");
        volume = kubus.hitungVolume(kubus.getSisi());
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume      : "+ volume);
        System.out.println("Massa Jenis : "+ kubus.hitungMassaJenis(kubus.getMassa(), volume));
        
    }
    
}

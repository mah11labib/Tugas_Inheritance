/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceBangunDatar;

/**
 *
 * @author pc20
 */
public class Main {
    public static void main (String [] args){
        //object bangun datar
        BangunDatar bangundatar= new BangunDatar();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 4;
                
        Lingkaran lingkaran= new Lingkaran();
        lingkaran.r =23;
        
        PersegiPanjang persegipanjang = new PersegiPanjang();   
        persegipanjang.lebar = 5;
        persegipanjang.panjang = 8;
             
        Segitiga segitiga = new Segitiga();
        segitiga.alas=15;
        segitiga.tinggi=6;
        
        //menunjukkan inheritage
        bangundatar.luas();
        bangundatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
    }
}
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
        
        
        //menunjukkan inheritace
        bangundatar.luas();
        persegi.luas();
        bangundatar.keliling();
        persegi.keliling();
        
        bangundatar.luas();
        persegipanjang.luas();
        bangundatar.keliling();
        persegipanjang.keliling();
        
        bangundatar.luas();
        segitiga.luas();
        bangundatar.keliling();
        segitiga.keliling();
        
        bangundatar.luas();
        lingkaran.luas();
        bangundatar.keliling();
        lingkaran.keliling();
        
        bangundatar.luas();
        lingkaran.luas();
        bangundatar.keliling();
        lingkaran.keliling();
    }
}
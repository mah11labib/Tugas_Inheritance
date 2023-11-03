/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceBangunDatar;

/**
 *
 * @author pc20
 */
public class Segitiga extends BangunDatar{
    float tinggi;
    float alas; 
    
    @Override
    float luas (){
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga = " + luas);
        return luas;
    }
    @Override
    float keliling (){
        float keliling = alas * 3;
        System.out.println("Keliling Segitiga = " + keliling);
        return keliling;
    }
    }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInheritance;

/**
 *
 * @author pc20
 */
public class Main {
    public static void main(String[] args){
        Tumbuhan tumbuhan = new Tumbuhan();
    
        tumbuhan.akar("Pohon Pepaya");
        PohonPepaya pohonpepaya = new PohonPepaya();
        pohonpepaya.akar();
        
        tumbuhan.akar("PohonRambutan");
        PohonRambutan pohonrambutan = new PohonRambutan();
        pohonrambutan.akar();
        
        tumbuhan.akar("PohonTerong");
        PohonTerong pohonterong = new PohonTerong();
        pohonterong.akar();
        
        tumbuhan.akar("PohonTomat");
        PohonTomat pohontomat = new PohonTomat();
        pohontomat.akar();
    }
    
}

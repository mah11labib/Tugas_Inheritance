/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Inheitance;

/**
 *
 * @author user
 */
public class Main {

   public static void main (String []args){
       Enemy monster = new Enemy();
       
    Zombie zumbi = new Zombie();
    zumbi.name = "Zumbie";
    zumbi.hp = 60;
    zumbi.attackpoin = 30;
    System.out.println(zumbi.name + "Healt Poin = " + zumbi.hp + "Attact poin = "+ zumbi.attackpoin);
    zumbi.walk();
 
    Pocong pocong = new Pocong();
    pocong.name = "Poci";
    pocong.hp = 55;
    pocong.attackpoin = 30;
    System.out.println(pocong.name + "Healt Poin = " + pocong.hp + "Attact poin = "+ pocong.attackpoin);
    pocong.jump();
    
    Burung dara = new Burung();
    dara.name = "Dara";
    dara.hp = 30;
    dara.attackpoin = 30;
    System.out.println(dara.name + "Healt Poin = " + dara.hp + "Attact poin = "+ dara.attackpoin);
    dara.walk();
    dara.jump();
    dara.fly();
    }

}


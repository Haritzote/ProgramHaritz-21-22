/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementazioa;




/**
 *
 * @author otero.haritz
 */
public class WaterMonster implements Monstruosoa {
      /** Constructs a WaterMonster instance with the given name */
    String name;
    public WaterMonster(String name) {
      this.name = name;
   }
   /** Subclass provides actual implementation for attack() */
   public String attack() {
      return "Attack with water!";
   }
}

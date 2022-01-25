/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.orduenproiektua;

/**
 *
 * @author otero.haritz
 */
public class TestTime {
    public static void main(String[] args) {
      // Test Constructors and toString()
      Time t1 = new Time(8, 10, 3);
      System.out.println(t1);  // toString()
      Time t2 = new Time("12:05:59");    // The default constructor
      System.out.println(t2);
      

      // Test Setters and Getters
      t1.setHour(4);
      t1.setMinute(5);
      t1.setSecond(6);
      System.out.println(t1);  // run toString() to inspect the modified instance
      System.out.println("Hour is: " + t1.getHour());
      System.out.println("Minute is: " + t1.getMinute());
      System.out.println("Second is: " + t1.getSecond());

      // Test setTime()
      t1.setTime(58, 58, 56);
      System.out.println(t1);  // toString()

      // Test nextSecond() and chaining
      System.out.println(t1.nextSecond()); // Return an instance of Time. Invoke Time's toString()
      System.out.println(t1.nextSecond().nextSecond().nextSecond());
      System.out.println();
   }
}
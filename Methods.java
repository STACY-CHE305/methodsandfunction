/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods;

import java.util.Scanner;


public class Methods {
static double width;
static double length;
static double Area;
   
   static void capture(){
    Scanner s = new Scanner(System.in); 
        System.out.println("enter your length");
        length = s.nextDouble();
        
        System.out.println("enter the width");
        width = s.nextDouble();
   }
    static double calArea(){
        Area = length*width;
        return Area;
    }
    public static void main(String[] args) {
     capture();
        System.out.println("the area is "+calArea());
    }
    
}

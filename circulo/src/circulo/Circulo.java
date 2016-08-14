/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. hola
 */
package circulo;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Circulo {
  private double radio,area,circunferencia;
  private Scanner leer;

    public double getArea() {
        return area;
    }

    
  
  
  public double getRadio() {
        return radio;
    }

    
  
  
  
  public void leerradio(){
  leer=new Scanner(System.in);
  System.out.print("Ingrese el radio del circulo");
  radio=leer.nextDouble();
  
  }
  
 public void area(){
 area=Math.PI*radio*radio;
 System.out.print("El area es"+area);
 }
 
 
 public void longitud(){
 circunferencia=2*Math.PI*radio;
 System.out.print("La longitud es"+circunferencia);
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

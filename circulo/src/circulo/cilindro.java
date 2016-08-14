/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates hola
 * and open the template in the editor.
 */
package circulo;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class cilindro extends Circulo {
    private Double altura,areac,longitudc;
    private Scanner leer;

    public Double getAltura() {
        return altura;
    }
    
    
    
    
  public void datos(){
  leer=new Scanner(System.in);    
  leerradio();
  System.out.println("Ingrese la altura");
  altura=leer.nextDouble();


}
  
  public void areac(){
  Double radio;
  radio=getRadio();
  areac=(2*Math.PI*radio)+(2*Math.PI*radio*radio);
  System.out.print("el area es"+areac);
  
  }
  
  public void volumen(){
  Double area;
  longitudc=getArea()*altura;
  System.out.print("el volumen es"+longitudc);
  
  }
    
    
    
    
}




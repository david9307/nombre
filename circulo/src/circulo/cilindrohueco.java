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
public class cilindrohueco extends cilindro{
    private Double radiointerno,longitud,volumen;
    private Scanner leer;
    
    public void datosch(){
    leer=new Scanner(System.in);
    leerradio();
    datos();
    System.out.print("Ingrese el radio interno");
    radiointerno=leer.nextDouble();
    
    }
    
    public void longitudh(){
    Double radio,altura;
    altura=getAltura();
    radio=getRadio();
    longitud=2*Math.PI*(Math.pow(radio, 2)-Math.pow(radiointerno, 2))+2*
            Math.PI*altura*radio+2*Math.PI*altura*radiointerno;
    
    System.out.print("La longitud es"+longitud);
    }
    
    
    public void volumench(){
    Double radio,altura;
    altura=getAltura();
    radio=getRadio();
    volumen=Math.PI*altura*(Math.pow(radio, 2)-Math.pow(radiointerno, 2));
    System.out.print("El volumen es"+volumen);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

/*
//ahora si 
//hicimos muchas cosas nuevas
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Nombre {
private String nombre,primer_apellido,segundo_apellido;
private Scanner leer;
    public Nombre(String nombre, String primer_apellido, String segundo_apellido) {
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }

    public Nombre() {
        
    }
    

   public void leernombre(){
   leer=new Scanner(System.in);
   System.out.println("Ingrese nombre completo");
   nombre=leer.next();
   primer_apellido=leer.next();
   segundo_apellido=leer.next();
   
   
   }
   
   public void mostrar(){
   System.out.println("Su nombre es "+nombre+" "+primer_apellido+" "+segundo_apellido);
   
   }
           

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    direccion dir=new direccion();
   
    dir.nueva_dir();
    dir.nuevonombre();
    dir.mostrardatos();
    
    
        // TODO code application logic here
    }
    
}

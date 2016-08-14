/*
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
public class direccion extends Nombre{
    private String calle,ciudad,provincia,codigo_postal;
    private Scanner leer;
    
    public void nueva_dir(){
    leer=new Scanner(System.in);
    System.out.println("Ingrese la nueva calle");
    calle=leer.next();
     System.out.println("Ingrese la nueva ciudad");
     ciudad=leer.next();
     System.out.println("Ingrese la nueva provincia");
     provincia=leer.next();
     System.out.println("Ingrese el nuevo codigo postal");
     codigo_postal=leer.next();
     
    
    
    }
    
    
    
    public void nuevonombre(){
    leernombre();
    
    
    
    }
    
    public void mostrardatos(){
     mostrar();
     System.out.println("calle "+calle);
     System.out.println("ciudad "+ciudad);
     System.out.println("provincia "+provincia);
     System.out.println("codigo postal"+codigo_postal);
    
    }
    
}

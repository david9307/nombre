/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. hola
 */
package circulo;

/**
 *
 * @author David
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circ=new Circulo();
        cilindro cilin=new cilindro();
        cilindrohueco cilinh=new cilindrohueco();
        
        
        circ.leerradio();
        circ.area();
        circ.longitud();
        cilin.datos();
        cilin.areac();
        cilin.volumen();
        cilinh.datosch();
        cilinh.longitudh();
        cilinh.volumench();
        
    }
    
}

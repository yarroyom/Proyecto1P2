
package com.mycompany.p2c4;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class ClsVendedores {
      private String nombre;
    private double enero;
    private double febrero;
    private double marzo;

 

 
    
    public void llenar_informacion(){
        Scanner t = new Scanner (System.in);
        System.out.println("Ingrese nombre");
        setNombre(t.nextLine());
        System.out.println("Enero");
        setEnero((double) Double.valueOf(t.nextLine()));
        System.out.println("Febrero");
        setFebrero(t.nextDouble());
        System.out.println("Marzo");
        setMarzo(t.nextDouble());
       
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the enero
     */
    public double getEnero() {
        return enero;
    }

    /**
     * @param enero the enero to set
     */
    public void setEnero(double enero) {
        this.enero = enero;
    }

    /**
     * @return the febrero
     */
    public double getFebrero() {
        return febrero;
    }

    /**
     * @param febrero the febrero to set
     */
    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    /**
     * @return the marzo
     */
    public double getMarzo() {
        return marzo;
    }

    /**
     * @param marzo the marzo to set
     */
    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }

    
}

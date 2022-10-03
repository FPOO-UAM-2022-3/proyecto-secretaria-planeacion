/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author pipet
 */
public class Lider extends Habitante{
    private int añoEleccion;

    public Lider(String cedula,
            String nombre,
            int añoEleccion) {
        
        super(cedula, nombre);
        this.añoEleccion = añoEleccion;
    }
    

    /**
     * @return the añoEleccion
     */
    public int getAñoEleccion() {
        return añoEleccion;
    }

    /**
     * @param añoEleccion the añoEleccion to set
     */
    public void setAñoEleccion(int añoEleccion) {
        this.añoEleccion = añoEleccion;
    }
    
}

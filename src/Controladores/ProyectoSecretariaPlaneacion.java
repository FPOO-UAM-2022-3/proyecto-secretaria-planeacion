/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Habitante;
import Modelos.Lider;
import java.util.LinkedList;

/**
 *
 * @author pipet
 */
public class ProyectoSecretariaPlaneacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Habitante h1=new Habitante("a1", "Lucas");
        Lider h2=new Lider("q2", "Juan Tenorio", 2020);
        LinkedList<Habitante> pobladores=new LinkedList<>();
        pobladores.add(h1);
        pobladores.add(h2);
        for(Habitante actual:pobladores){
            System.out.print("Cedula "+actual.getCedula());
            System.out.print(" Nombre "+actual.getNombre());
            if (actual instanceof Lider) {
                System.out.println(" Lider "+((Lider) actual).getAñoEleccion());
            }
            System.out.println("");
        }
        
    }
    
}

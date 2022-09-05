/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Date;

/**
 *
 * @author Admin
 *
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her

        int dia = 17;
        int mes = 5;
        int anio = 2006;

        Date fechaActual = new Date();
        Date fecha = new Date(anio-1900, mes-1, dia);

        System.out.println(fecha);
        System.out.println(fechaActual);
         
       

        int difDia =   fechaActual.getDate()-fecha.getDate();
        int difmes = fechaActual.getMonth()- fecha.getMonth();
        int difanio = fechaActual.getYear()-fecha.getYear();
        
        if (difDia<0||difDia==0){
            
                    
        }
        System.out.println(difDia);
        System.out.println(difmes);
        System.out.println(difanio);
        
    }

}

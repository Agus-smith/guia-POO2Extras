/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Admin
 */
public class date {

    private int[] fechaActual = new int[3];
    private int[] fecha = new int[3];

    public date(int dia, int mes, int año) {

        this.fecha[0] = dia;
        this.fecha[1] = mes;
        this.fecha[2] = año;
        
        this.fechaActual[0] = 30;
        this.fechaActual[1] = 8;
        this.fechaActual[2] = 2022;

    }

//SET
    public void setFechaActual(int[] fechaActual) {
        this.fechaActual = fechaActual;
    }

    public void setFecha(int[] fecha) {
        this.fecha = fecha;
    }
//GET

    public int[] getFechaActual() {
        return fechaActual;
    }

    public int[] getFecha() {
        return fecha;
    }

//METODO
}

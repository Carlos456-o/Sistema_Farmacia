/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;


/**
 *
 * @author burgos
 */
public class Compras {
    int ID_compras;
    Date Fecha_Compras;

    public Compras(int ID_compras, Date Fecha_Compras) {
        this.ID_compras = ID_compras;
        this.Fecha_Compras = Fecha_Compras;
    }

    public Compras(Date Fecha_Compras) {
        this.Fecha_Compras = Fecha_Compras;
    }

    public int getID_compras() {
        return ID_compras;
    }

    public void setID_compras(int ID_compras) {
        this.ID_compras = ID_compras;
    }

    public Date getFecha_Compras() {
        return Fecha_Compras;
    }

    public void setFecha_Compras(Date Fecha_Compras) {
        this.Fecha_Compras = Fecha_Compras;
    }
    
    
}

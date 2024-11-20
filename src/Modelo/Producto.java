/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date;
/**
 *
 * @author vily0
 */
public class Producto {
    
    private int Id_productos;
    private String Nombre;
    private String Categoria;
    private String Descripcion;
    private int Cantidad;
    private Date fechaVen;
    private double Prec_unit;

    public Producto(int Id_productos, String Nombre, String Categoria, String Descripcion, int Cantidad, Date fechaVen, double Prec_unit) {
        this.Id_productos = Id_productos;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.fechaVen = fechaVen;
        this.Prec_unit = Prec_unit;
    }

    public Producto(String Nombre, String Categoria, String Descripcion, int Cantidad, Date fechaVen, double Prec_unit) {
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.fechaVen = fechaVen;
        this.Prec_unit = Prec_unit;
    }

    Producto(String NombreC, String ApellidoC, String EmailC, int CedulaC, int TelefonoC) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_productos() {
        return Id_productos;
    }

    public void setId_productos(int Id_productos) {
        this.Id_productos = Id_productos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Date getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(Date fechaVen) {
        this.fechaVen = fechaVen;
    }

    public double getPrec_unit() {
        return Prec_unit;
    }

    public void setPrec_unit(double Prec_unit) {
        this.Prec_unit = Prec_unit;
    }

 
}

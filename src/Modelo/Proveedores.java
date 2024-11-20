/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author portatiles
 */
public class Proveedores {

    static void add(Proveedores Pro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     int Id_Proveedores;
     String NombreP;
     String telefonoP;
     String EmaiP;
     String DirrecionP;

    public Proveedores(int Id_Proveedores, String NombreP, String telefonoP, String EmaiP, String DirrecionP) {
        this.Id_Proveedores = Id_Proveedores;
        this.NombreP = NombreP;
        this.telefonoP = telefonoP;
        this.EmaiP = EmaiP;
        this.DirrecionP = DirrecionP;
    }

    public Proveedores(String NombreP, String telefonoP, String EmaiP, String DirrecionP) {
        this.NombreP = NombreP;
        this.telefonoP = telefonoP;
        this.EmaiP = EmaiP;
        this.DirrecionP = DirrecionP;
    }

    public int getId_Proveedores() {
        return Id_Proveedores;
    }

    public void setId_Proveedores(int Id_Proveedores) {
        this.Id_Proveedores = Id_Proveedores;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public String getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }

    public String getEmaiP() {
        return EmaiP;
    }

    public void setEmaiP(String EmaiP) {
        this.EmaiP = EmaiP;
    }

    public String getDirrecionP() {
        return DirrecionP;
    }

    public void setDirrecionP(String DirrecionP) {
        this.DirrecionP = DirrecionP;
    }
     
     
}
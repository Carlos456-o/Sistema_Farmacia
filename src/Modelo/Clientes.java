/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author portatiles
 */
public class Clientes {
    
    private int Id_Clientes;
    private String NombreC;
    private String ApellidoC;
    private String EmailC;
    private int CedulaC;
    private int TelefonoC;

    public Clientes(int Id_Clientes, String NombreC, String ApellidoC, String EmailC, int CedulaC, int TelefonoC) {
        this.Id_Clientes = Id_Clientes;
        this.NombreC = NombreC;
        this.ApellidoC = ApellidoC;
        this.EmailC = EmailC;
        this.CedulaC = CedulaC;
        this.TelefonoC = TelefonoC;
    }

    public Clientes(String NombreC, String ApellidoC, String EmailC, int CedulaC, int TelefonoC) {
        this.NombreC = NombreC;
        this.ApellidoC = ApellidoC;
        this.EmailC = EmailC;
        this.CedulaC = CedulaC;
        this.TelefonoC = TelefonoC;
    }

    public int getId_Clientes() {
        return Id_Clientes;
    }

    public void setId_Clientes(int Id_Clientes) {
        this.Id_Clientes = Id_Clientes;
    }

    public String getNombreC() {
        return NombreC;
    }

    public void setNombreC(String NombreC) {
        this.NombreC = NombreC;
    }

    public String getApellidoC() {
        return ApellidoC;
    }

    public void setApellidoC(String ApellidoC) {
        this.ApellidoC = ApellidoC;
    }

    public String getEmailC() {
        return EmailC;
    }

    public void setEmailC(String EmailC) {
        this.EmailC = EmailC;
    }

    public int getCedulaC() {
        return CedulaC;
    }

    public void setCedulaC(int CedulaC) {
        this.CedulaC = CedulaC;
    }

    public int getTelefonoC() {
        return TelefonoC;
    }

    public void setTelefonoC(int TelefonoC) {
        this.TelefonoC = TelefonoC;
    }
    
    

    
}

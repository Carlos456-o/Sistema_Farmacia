/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kristing 
 */
public class DAOClientes {

    public DAOClientes() {
    }
    
    public Producto Insertar(String NombreC, String ApellidoC , String EmailC, 
                      int CedulaC, int TelefonoC) {
    String transaccion = "INSERT INTO Autor (cedula, nombres, apellidos, email, "
            + "fechaNac) VALUES ('"
        + NombreC + "', '"
        + ApellidoC + "', '"
        + EmailC + "', '"
        + CedulaC + "', '"
        + TelefonoC + "', '"  ;  
        
    
    if (new DataBase().Actualizar(transaccion) > 0) {
        return new Producto(NombreC, ApellidoC, EmailC, CedulaC, TelefonoC);
    }
    return null;
}
    public int Actualizar(int id, String NombreC, String ApellidoC, 
                      String EmailC, int CedulaC, int TelefonoC) {
        String transaccion = "UPDATE Clientes SET nombres='" 
        + NombreC + "', ApellidoC='" 
        + ApellidoC + "', EmailC='" 
        + EmailC + "', CedulaC='" 
        + CedulaC + "', TelefonoC='" 
        + TelefonoC + "' WHERE id_autor=" 
        + id + ";";
                
    return new DataBase().Actualizar(transaccion);
}
public List<Clientes> ObtenerDatos() {
    String transaccion = "SELECT * FROM Autor";
   
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Clientes> Clientes = new ArrayList<>(); 
    
    
    for (Map registro : registros) {
        Clientes  Cli= new Clientes((int) registro.get("Id_Cliente"),
            (String) registro.get("NombreC"),
            (String) registro.get("ApellidoC"),
            (String) registro.get("EmailC"),
            (int) registro.get("CedulaC"),
            (int) registro.get("TelefonoC"));
        Clientes.add(Cli);
    }
    
    return Clientes; 
}
public int Eliminar(int id) {
    String transaccion = "DELETE FROM Cliente WHERE id_Cliente=" + id + "";
    return new DataBase().Actualizar(transaccion);
}
}

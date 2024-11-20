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
 * @author portatiles
 */
public class DAOProveedores {
    public Proveedores Insertar(String NombreP, String telefonoP, String EmailP, 
                       String DireccionP) {
    String transaccion = "INSERT INTO Autor (cedula, nombres, apellidos, email, "
            + "fechaNac) VALUES ('"
        + NombreP + "', '"
        + telefonoP + "', '"
        + EmailP + "', '"
        + DireccionP + "')";
    
    if (new DataBase().Actualizar(transaccion) > 0) {
        return new Proveedores(NombreP, telefonoP, EmailP, DireccionP);
    }
    return null;
}
    public int Actualizar(int Id_Proveedores, String NombreP, String telefonoP, 
                      String EmailP, String DireccionP ) {
        String transaccion = "UPDATE Proveedores SET nombres='" 
        + NombreP + "', telefonoP='" 
        + telefonoP + "', EmailP='" 
        + EmailP + "', DirecionP='" 
        + DireccionP+ "' WHERE Id_Proveedores=" 
        + Id_Proveedores + ";";

    return new DataBase().Actualizar(transaccion);
}
public List<Proveedores> ObtenerDatos() {
    String transaccion = "SELECT * FROM Autor";
   
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Proveedores> proveedores = new ArrayList<>(); 
    
    
    for (Map registro : registros) {
        Proveedores Pro = new Proveedores((int) registro.get("Id_Proveedores"),
            (String) registro.get("NombreP"),
            (String) registro.get("telefonoP"),
            (String) registro.get("EmailP"),
            (String) registro.get("DireccionP"));
       Proveedores.add(Pro);
    }
    
    return proveedores; 
}
public int Eliminar(int Id_Proveedores) {
    String transaccion = "DELETE FROM Proveedores WHERE id_autor=" + Id_Proveedores + "";
    return new DataBase().Actualizar(transaccion);
}

    public List<Proveedores> obtenerDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

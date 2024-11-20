/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author burgos
 */
public class DAOCompras {
 public Compras Insertar(Date Fecha_Compras) {
    String transaccion = "INSERT INTO Compras (Fecha_Compras, "
            + ") VALUES ('"   
        + Fecha_Compras + "');";
    
    if (new DataBase().Actualizar(transaccion) > 0) {
        return new Compras(Fecha_Compras);
    }
    return null;
}
    public int Actualizar(int ID_Compras, java.util.Date Fecha_Compras) {
        String transaccion = "UPDATE Compras SET Fecha_Compras='" 
        + Fecha_Compras + "' WHERE ID_Compras=" 
        + ID_Compras + ";";

    return new DataBase().Actualizar(transaccion);
}
public List<Compras> ObtenerDatos() {
    String transaccion = "SELECT * FROM Autor";
   
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Compras> Compras = new ArrayList<>(); 
    
    
    for (Map registro : registros) {
        Compras pro = new Compras((int) registro.get("ID_Compras"),
            (Date) registro.get("Fecha_Compras"));
        Compras.add(pro);
    }
    
    return Compras; 
}
public int Eliminar(int ID_Compras) {
    String transaccion = "DELETE FROM Compras WHERE ID_Compras=" + ID_Compras + "";
    return new DataBase().Actualizar(transaccion);
}

}

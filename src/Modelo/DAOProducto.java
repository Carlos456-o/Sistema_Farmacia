
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
 * @author vily0
 */
public class DAOProducto {
    public Producto Insertar(String Nombre, String Categoria, String Descripcion, 
                      int Cantidad, java.sql.Date fechaVen, Double prec_unit) {
    String transaccion = "INSERT INTO Autor (cedula, nombres, apellidos, email, "
            + "fechaNac) VALUES ('"
        + Nombre + "', '"
        + Categoria + "', '"
        + Descripcion + "', '"
        + Cantidad + "', '"
        + fechaVen + "', '"    
        + prec_unit + "');";
    
    if (new DataBase().Actualizar(transaccion) > 0) {
        return new Producto(Nombre, Categoria, Descripcion, Cantidad, fechaVen,
        prec_unit);
    }
    return null;
}
    public int Actualizar(int id, String Nombre, String Categoria, 
                      String Descripcion, int Cantidad, java.sql.Date fechaVen, 
                      Double prec_unit) {
        String transaccion = "UPDATE Producto SET nombres='" 
        + Nombre + "', Categoria='" 
        + Categoria + "', Descripcion='" 
        + Descripcion + "', fechaVen='" 
        + fechaVen + "', prec_unit='" 
        + prec_unit + "', Cantidad='" 
        + Cantidad + "' WHERE id_autor=" 
        + id + ";";

    return new DataBase().Actualizar(transaccion);
}
public List<Producto> ObtenerDatos() {
    String transaccion = "SELECT * FROM Autor";
   
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Producto> autores = new ArrayList<>(); 
    
    
    for (Map registro : registros) {
        Producto pro = new Producto((int) registro.get("Id_Produtos"),
            (String) registro.get("Nombre"),
            (String) registro.get("Categoria"),
            (String) registro.get("Descripcion"),
            (int) registro.get("Cantidad"),
            (java.sql.Date) registro.get("fechaVen"),
            (Double) registro.get("Precio"));
        autores.add(pro);
    }
    
    return autores; 
}
public int Eliminar(int id) {
    String transaccion = "DELETE FROM Autor WHERE id_autor=" + id + "";
    return new DataBase().Actualizar(transaccion);
}

}


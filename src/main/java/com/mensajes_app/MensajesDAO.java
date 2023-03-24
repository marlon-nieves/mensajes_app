package com.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {
    //DAO = Data Access Object
   public static void crearMensajeDAO(Mensajes mensajes){
      Conexion db_connect = new Conexion();
      try(Connection conexion = db_connect.get_connection()){
         PreparedStatement ps = null;
         try{
            String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
            ps = conexion.prepareStatement(query);
            ps.setString(1, mensajes.getMensaje());
            ps.setString(2, mensajes.getAutor_mensaje());
            ps.executeUpdate();
            System.out.println("Mensaje creado");
         }catch (SQLException ex){
            System.out.println(ex);
         }

   } catch (SQLException e) {
      System.out.println(e);
      }
   }

   public static void leerMensajeDAO(){

   }

   public static void borrarMensajeDAO(int id_mensaje){

   }

   public static void actualizarMensajeDAO(Mensajes mensajes){

   }
}

package com.mensajes_app;

import java.util.Scanner;

public class MensajesService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje: ");
        String mensaje = sc.nextLine();

        System.out.println("Tu nombre: ");
        String nombre = sc.nextLine();

        Mensajes datos = new Mensajes();
        datos.setMensaje(mensaje);
        datos.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(datos);


    }
    public static void listarMensajes(){
        MensajesDAO.leerMensajeDB();

    }

    public static void borrarMensajes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el id del mensaje a borrar: ");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);

    }

    public static void editarMensajes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje: ");
        String mensaje = sc.nextLine();

        System.out.println("Escribe el nuevo autor del mensaje: ");
        String nombre1 = sc.nextLine();

        System.out.println("Indica el id del mensaje a editar: ");
        int id_mensaje = sc.nextInt();

        Mensajes actualizacion = new Mensajes();
        actualizacion.setMensaje(mensaje);
        actualizacion.setAutor_mensaje(nombre1);
        actualizacion.setId_mensaje(id_mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
}

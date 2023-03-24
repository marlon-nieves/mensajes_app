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
        MensajesDAO.crearMensajeDAO(datos);


    }
    public static void leerMensaje(){

    }

    public static void borrarMensaje(){

    }

    public static void editarMensaje(){

    }
}

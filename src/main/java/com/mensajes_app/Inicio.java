package com.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("-----------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear mensajes");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensajes");
            System.out.println("4. Eliminar mensajes");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.editarMensajes();
                    break;
                case 4:
                    MensajesService.borrarMensajes();
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }
}



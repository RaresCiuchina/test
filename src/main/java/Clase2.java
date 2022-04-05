import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {

        ListaUsuarios l = new ListaUsuarios();


        // Pedir iniciar sesión a un usuario.
        // Primero hay que comprobar el nombre.
        // Si el nombre es correcto, entonces te pide la contraseña.
        // Si no te sigo preguntando por el nombre.
        // Si la contraseña es correcta te digo: usuario logueado!
        // Si no te pregunto hasta 2 veces más por la contraseña como máximo.
        // Si tras esos intentos no he conseguido acertar, entonces finaliza el programa escribiendo:
        // Alerta Hackerman!


            if (l.iniciarSesion()){
                System.out.println("Usuario logueado");
            }else{System.out.println("Alerta Hackerman!");
            }
    }
}



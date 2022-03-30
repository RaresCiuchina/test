import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Antonio", "1234");
        Usuario u2 = new Usuario();
        System.out.println(u2);
        Usuario[] usuarios = new Usuario[2];
        usuarios[0] = u1;
        usuarios[1] = u2;

        // Pedir iniciar sesión a un usuario.
        // Primero hay que comprobar el nombre.
        // Si el nombre es correcto, entonces te pide la contraseña.
        // Si no te sigo preguntando por el nombre.
        // Si la contraseña es correcta te digo: usuario logueado!
        // Si no te pregunto hasta 2 veces más por la contraseña como máximo.
        // Si tras esos intentos no he conseguido acertar, entonces finaliza el programa escribiendo:
        // Alerta Hackerman!

        if (iniciarSesion(usuarios)){
            System.out.println("Usuario logueado");
        } else {
            System.out.println("Alerta Hackerman!");
        }
    }


    public static boolean iniciarSesion(Usuario[] usuarios){
        Scanner sc = new Scanner(System.in);
        Usuario usuarioCandidato;
        System.out.println("Comenzando el login");

        do {
            System.out.println("Introduce el nombre del usuario");
            String nombreCandidato = sc.nextLine();
            usuarioCandidato = buscarUsuarioPorNombre(usuarios, nombreCandidato);
            if (usuarioCandidato != null) {
                System.out.println(nombreCandidato + " es un nombre correcto.");
            }
        } while (usuarioCandidato == null);

        do {
            System.out.println("Introduce la contraseña");
            String passCandidata = sc.nextLine();
            if (usuarioCandidato.passCorrecta(passCandidata)) {
                return true;
            }
        } while (usuarioCandidato.quedanIntentos());
        return false;

    }

    private static Usuario buscarUsuarioPorNombre(Usuario[] usuarios, String nombreCandidato){
        for (Usuario u : usuarios) {
            if (u.nombreCorrecto(nombreCandidato)) return u;
        }
        return null;
    }
}

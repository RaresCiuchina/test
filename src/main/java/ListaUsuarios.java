import java.util.Scanner;

public class ListaUsuarios {
    Usuario[] usuarios;

    ListaUsuarios() {
        Usuario u1 = new Usuario("Antonio", "1234");
        Usuario u2 = new Usuario();
        System.out.println(u2);
        usuarios = new Usuario[2];
        usuarios[0] = u1;
        usuarios[1] = u2;
    }

    public boolean iniciarSesion(){
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

    private Usuario buscarUsuarioPorNombre(Usuario[] usuarios, String nombreCandidato){
        for (Usuario u : usuarios) {
            if (u.nombreCorrecto(nombreCandidato)) return u;
        }
        return null;
    }
}

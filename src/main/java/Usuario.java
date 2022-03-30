import java.util.Scanner;

public class Usuario {

    private String nombre;
    private String pass;
    private int intentosRestantes = 3;

    Usuario() {
        System.out.println("Creando usuario...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del usuario");
        this.nombre = sc.nextLine();
        System.out.println("Introduce la pass del usuario " + this.nombre);
        this.pass = sc.nextLine();
        System.out.println("Usuario creado correctamente");
    }

    Usuario(String nombre, String pass){
        this.nombre = nombre;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + " y mi pass es " + pass;
    }

    public boolean nombreCorrecto(String nombreCandidato) {
        return nombreCandidato.contentEquals(nombre);
    }

    public boolean passCorrecta(String pasCandidata) {
        if (pasCandidata.contentEquals(pass)) {
            intentosRestantes = 3;
            return true;
        } else {
            intentosRestantes--;
            return false;
        }
    }

    public boolean quedanIntentos(){
        return intentosRestantes > 0;
    }
}

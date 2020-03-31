package bolt_18_2;

import java.util.Scanner;

/**
 *
 * @author agonzalezacevedo
 */
public class Bolt_18_2 {

    public static void main(String[] args) {
        Metodos alumnos = new Metodos();
        int respuesta;
        alumnos.notas();
        do {System.out.println("-----------Menu-----------"
                            + "\n 1.-Buscar a nota dun alumno determinado"
                            + "\n 2.-Mostrar os nomes dos alumnos aprobados"
                            + "\n 3.-Ordenar notas"
                            + "\n 0.-Saír");
            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1:alumnos.buscarAlumnoNota();break;
                case 2:alumnos.nomeAprobados();break;
                case 3:alumnos.ordenarNotas();break;
            }
        } while (respuesta != 0);

    }

}

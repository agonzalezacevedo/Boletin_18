package bolt_18_2;

import java.util.Scanner;

/**
 *
 * @author agonzalezacevedo
 */
class Metodos {

    int[] notas = new int[30];
    String[] nomes = new String[30];
    String[] aprobados = new String[notas.length];
    Scanner sc = new Scanner(System.in);

    public void notas() {
        int aprobados = 0;
        int suspensos = 0;
        float media = 0;
        int notaMax = 0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.floor(Math.random() * (11 - 1) + 1));
            media = notas[i] + media;
            if (notas[i] > notaMax) {
                notaMax = notas[i];
            }
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
            System.out.println(notas[i]);
        }
        System.out.println("Dame nome de alumnos");
        for (int j = 0; j < nomes.length; j++) {
            nomes[j] = sc.nextLine();

        }

        System.out.println("Os aprobados son " + aprobados + " e os suspensos " + suspensos);
        System.out.println(media / notas.length);
        System.out.println(notaMax);

    }

    public void buscarAlumnoNota() {
        int contador = 0;
        System.out.println("Que alumno quieres buscar?");
        String buscar;
        buscar = sc.nextLine();
        for (int j = 0; j < nomes.length; j++) {
            if (buscar.equals(nomes[j])) {
                contador = j;
            }
        }
        System.out.println("El alumno " + buscar + " ha sacado un " + notas[contador]);
    }

    public void nomeAprobados() {
        System.out.println("Los alumnos aprobados son:");
        int j = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados[j] = nomes[i];
                j++;
            }
        }
    }

    public void ordenarNotas() {
        int aux;
        String auxNomes;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < nomes.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    auxNomes = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = auxNomes;
                }
            }
            System.out.println(notas[i]);
        }
    }
}

package bolt_18;

/**
 *
 * @author agonzalezacevedo
 */
public class Metodos {

    int[] numeros = new int[6];

    public void crearArray() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50 + 1);
            System.out.println(numeros[i]);
        }
    }

    public void aleatorioReves() {
        for (int j = numeros.length - 1; j >= 0; j--) {
            System.out.println(numeros[j]);
        }
    }
}

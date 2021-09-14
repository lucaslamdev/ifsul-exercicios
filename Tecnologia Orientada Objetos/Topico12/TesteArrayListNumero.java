
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TesteArrayListNumero {

    public static ArrayList<Integer> entradaNumeros() {
        ArrayList<Integer> numeros = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        int auxiliar;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o (" + (i + 1) + ") número: ");
            auxiliar = entrada.nextInt();
            numeros.add(auxiliar);
        }
        return numeros;
    }

    public static void lerNumeros(ArrayList<Integer> arrayNumeros) {

        boolean aux = false;

        for (Integer i : arrayNumeros) {
            if (i == 10 || i == 100 || i == 1000) {
                aux = true;
            }
        }

        if (aux) {
            System.out.println("Você ganhou um bônus de R$50,00");
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayNumeros = entradaNumeros();
        lerNumeros(arrayNumeros);

    }
}

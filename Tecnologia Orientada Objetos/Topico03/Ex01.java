
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Número de prestações: ");
        int numPrestacoes = entradas.nextInt();

        System.out.println("Qual o valor total da compra: ");
        double valorTotal = entradas.nextDouble();

        double valorPrestacoes = valorTotal / numPrestacoes;

        System.out.println("O valor total é de R$" + valorTotal + " .");
        System.out.println("O valor total divido em " + numPrestacoes + " é de R$" + valorPrestacoes + " .");
        entradas.close();
    }
}

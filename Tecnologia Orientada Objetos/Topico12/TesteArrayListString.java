
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TesteArrayListString {
    
    public static ArrayList<String> removerPosicaoStr(ArrayList<String> listaStr) {
        Scanner entrada = new Scanner(System.in);
        int posicao;
        System.out.println("Você poderá remover 2 posições da lista!");
        for(int i = 0; i < 2; i++){
            System.out.println("Digite a (" + (i + 1) + ") que deseja remover: ");
            posicao = entrada.nextInt();
            listaStr.remove(posicao);
        } 
        return listaStr;
    }

    public static void exibirStr(ArrayList<String> listaStr) {
     listaStr.stream().forEach(elemento -> System.out.println("Elemento: " + elemento));
    }

    public static ArrayList<String> entradaStr() {
        ArrayList<String> listaStr = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        String auxiliar;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a palavra (" + (i + 1) + "): ");
            auxiliar = entrada.next();
            listaStr.add(auxiliar);
        }
        return listaStr;
    }

    public static void main(String[] args) {

        ArrayList<String> strArray = entradaStr();
        exibirStr(strArray);
        strArray = removerPosicaoStr(strArray);
        exibirStr(strArray);
        System.out.println("A quantidade final de elementos é de " + strArray.size() + " .");

    }
}

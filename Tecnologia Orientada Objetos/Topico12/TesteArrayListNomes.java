
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class TesteArrayListNomes {
        
    public static ArrayList<String> ordenar(ArrayList<String> listaNomes) {
        Collections.sort(listaNomes); 
        return listaNomes;
    }

    public static void exibirStr(ArrayList<String> listaNomes) {
     listaNomes.stream().forEach(nome -> System.out.println("Nome: " + nome));
    }

    public static ArrayList<String> entradaStr() {
        ArrayList<String> listaStr = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        String nome;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome da pessoa (" + (i + 1) + "): ");
            nome = entrada.next();
            listaStr.add(nome);
        }
        return listaStr;
    }

    public static void main(String[] args) {

        ArrayList<String> nomesArray = entradaStr();
        System.out.println("Nomes Desordenado: ");
        exibirStr(nomesArray);
        nomesArray = ordenar(nomesArray);
        System.out.println("Nomes Ordenados: ");
        exibirStr(nomesArray);
    }
}

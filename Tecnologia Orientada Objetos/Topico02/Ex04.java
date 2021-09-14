/*
Faça um programa que leia no console o nome de uma pessoa, 
o nome de uma disciplina, e duas notas da disciplina. 
Imprima no console o nome da pessoa e da disciplina, e a média das notas. 
Entregue o código fonte (arquivo .java) .
 */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Informe o nome da pessoa: ");
        String nome_Pessoa = entradas.nextLine();

        System.out.println("Informe o nome da disciplina: ");
        String nome_Disciplina = entradas.nextLine();

        System.out.println("Informe a primeira nota da pessoa: ");
        float nota_1 = entradas.nextFloat();

        System.out.println("Informe a segunda nota da pessoa: ");
        float nota_2 = entradas.nextFloat();

        float media = (nota_1 + nota_2)/2;

        System.out.println("A pessoa " + nome_Pessoa + ", cursando a disciplina " + nome_Disciplina + ".");
        System.out.println("Teve como sua primeira nota " + nota_1 + " e sua segunda nota " + nota_2 + " ." );
        System.out.println("A média das notas é: " + media + " .");
    }
}

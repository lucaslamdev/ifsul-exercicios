/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class UsaComposicao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Curso curso = new Curso();

        System.out.println("Informe o Código do Curso:");
        curso.codigo = Integer.parseInt(entrada.nextLine());

        System.out.println("Informe o Nome do Curso:");
        curso.nome = entrada.nextLine();

        System.out.println("Informe o nome do Coordenador do Curso:");
        curso.coordenador = entrada.nextLine();
        int valor;
        do {
            System.out.println("Deseja adicionar quantas disciplinas?");
            valor = Integer.parseInt(entrada.nextLine());
            if (valor < 0 || valor == 0) {
                System.out.println("Informe um valor maior que 0 para continuar!");
            }
        } while (valor < 0 || valor == 0);

        
        for (int i = 0; i < valor; i++) {
            Disciplina disciplina1 = new Disciplina();
            System.out.println("Nome da Disciplina");
            disciplina1.nomeDisciplina = entrada.nextLine();

            System.out.println("Nome do Professor da Disciplina:");
            disciplina1.professor = entrada.nextLine();

            System.out.println("Total de Horas da Disciplina:");
            disciplina1.horasTotais = Integer.parseInt(entrada.nextLine());

            curso.disciplinas.add(disciplina1);
        }
        System.out.println("\n\n\n\n");

        System.out.println("Codigo Curso: " + curso.codigo);
        System.out.println("Nome Curso: " + curso.nome);
        System.out.println("Coordenador do Curso: " + curso.coordenador);

        System.out.println("Listando disciplinas:");

        for (Disciplina dis : curso.disciplinas) {
            System.out.println("Nome Disciplina: " + dis.nomeDisciplina);
            System.out.println("Nome do Professor da Disciplina: " + dis.professor);
            System.out.println("Total de Horas da Disciplina: " + dis.horasTotais + " Horas.");

        }

    }
}

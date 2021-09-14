/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associacao;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class UsaAssociacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Informe o nome da Pessoa:");
        pessoa.nomePessoa = entrada.nextLine();
        System.out.println("Informe o CPF:");
        pessoa.CPF = entrada.nextLine();
        System.out.println("Informe o Telefone:");
        pessoa.telefone = entrada.nextLine();

        Cidade cidade = new Cidade();
        Profissao profissao = new Profissao();
        
        System.out.println("Informe o nome da Cidade:");
        cidade.nomeCidade = entrada.nextLine();
        System.out.println("Informe a sigla do estado (Ex: RS):");
        cidade.uf = entrada.next();
        
        System.out.println("Informe o nome da profissão:");
        profissao.nomeProfissao = entrada.nextLine(); 
        System.out.println("Informe o salario médio dessa profissão:");
        profissao.salarioMedio = entrada.nextFloat();
        
        pessoa.cidade = cidade;
        pessoa.profissao = profissao;
        
        pessoa.exibirDados();
        System.out.println("A cidade onde trabalha se chama " + pessoa.cidade.nomeCidade); 
        System.out.println("O uf de sua cidade é " + pessoa.cidade.uf);
        System.out.println("Sua profissão é " + pessoa.profissao.nomeProfissao);
        System.out.println("A média salarial de sua area é de R$" + pessoa.profissao.salarioMedio);

    }

}

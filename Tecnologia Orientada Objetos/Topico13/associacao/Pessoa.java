/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associacao;

/**
 *
 * @author lucas
 */
public class Pessoa {

    String nomePessoa;
    String CPF;
    String telefone;
    Cidade cidade;
    Profissao profissao;

    public Pessoa() {
        this.nomePessoa = "Não informado";
        this.CPF = "Não informado";
        this.telefone = "Não informado";
    }
    
    public void exibirDados(){
        System.out.println("O nome é " + this.nomePessoa);
        System.out.println("Seu CPF é " + this.CPF);
        System.out.println("O telefone para contato é " + this.telefone);
    }

}

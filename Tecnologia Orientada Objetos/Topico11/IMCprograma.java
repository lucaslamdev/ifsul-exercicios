
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
class IMC{
    String nome;
    Double altura;
    Double peso;
    Double IMC;
    String Classificacao;
    
    public void calculaIMC() {
        
        this.IMC = this.peso / (this.altura*this.altura);
        
        if(this.IMC < 18.5){
            this.Classificacao = "Magreza";
        }else if(this.IMC >= 18.5 && this.IMC <= 24.9){
            this.Classificacao = "Normal";
        }else if(this.IMC >= 25.0 && this.IMC <= 29.9){
            this.Classificacao = "Sobrepeso";
        }else if(this.IMC >= 30.0 && this.IMC <= 39.9){
            this.Classificacao = "Obesidade";
        }else if(this.IMC >= 40.0){
            this.Classificacao = "Obesidade Grave!";
        }
    }
    
    public void exibirDados(){
        System.out.println("O seu nome é "+ this.nome +" .");
        System.out.println("O seu peso é de "+ this.peso +"KG.");
        System.out.println("O sua altura é de "+ this.altura +"metros.");
        System.out.println("O seu IMC é de "+ String.format("%.2f", this.IMC) + " .");
        System.out.println("Devido ao seu IMC você é classificado como "+ this.Classificacao + " .");
    }
    
}


public class IMCprograma {
    public static void main(String[] args) {
        
        IMC pessoa = new IMC();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome da pessoa:");
        pessoa.nome = entrada.next();
        
        System.out.println("Digite a altura da pessoa em metros:");
        pessoa.altura = entrada.nextDouble();
        
        System.out.println("Digite o peso da pessoa em KG:");
        pessoa.peso = entrada.nextDouble();
        
        pessoa.calculaIMC();
        pessoa.exibirDados();
    }
    
}

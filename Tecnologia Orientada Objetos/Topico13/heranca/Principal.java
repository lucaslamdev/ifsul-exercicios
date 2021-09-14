package heranca;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Principal {
    
    public static void opcaoVip(){
        Scanner entrada = new Scanner(System.in); 
        VIP pessoaVip = new VIP();
        System.out.println("Informe o valor do Ingresso:");
        pessoaVip.valor = entrada.nextFloat();
        System.out.println("Informe o custo adicional: ");
        pessoaVip.adicional = entrada.nextFloat();
        System.out.println("\n\n");
        System.out.println("O valor total do ingresso será de " + pessoaVip.retornarValor());
    }
    
    public static void opcaoNormal(){
        Scanner entrada = new Scanner(System.in);
        Normal pessoaNormal = new Normal();
        System.out.println("Informe o valor normal do Ingresso:");
        pessoaNormal.valor = entrada.nextFloat();
        System.out.println("Informe a localizacao (EX: A2):");
        pessoaNormal.localizacao = entrada.next();
        pessoaNormal.imprimeNormal();
    }
    
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        char opcao = '9';
        
        do{
        System.out.println("\n\n\n\n");
        System.out.println("=======MENU=======");
        System.out.println("0 - Sair");
        System.out.println("1 - VIP");
        System.out.println("2 - Normal");
        System.out.println("\n\nDigite uma opção: ");
        opcao = entrada.next().charAt(0);
        switch (opcao){
            case '0':
                System.out.println("Finalizando o Programa!");
                break;
            case '1':
                opcaoVip();
                break;
            case '2':
                opcaoNormal();
                break;
            default:
                System.out.println("Opção Informada Incorreta.");
                break;
        }
        }while(opcao != '0');
    }
}

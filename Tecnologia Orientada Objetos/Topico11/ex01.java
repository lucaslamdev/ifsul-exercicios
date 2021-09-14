
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
class TELHA {

    String marca;
    Double comprimento;
    Double largura;
    Double preco;
    Integer quantidade;

    public TELHA() {
        this.marca = "Não informado";
        this.comprimento = 0.0;
        this.largura = 0.0;
        this.preco = 0.0;
        this.quantidade = 0;
    }

    public void exibirDadosconsole() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("Largura: " + this.largura);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade de Telhas: " + this.quantidade);
    }

    public void lerTelhas() {
        this.marca = JOptionPane.showInputDialog("Digite a marca da telha:");
        this.comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da telha em metros:"));
        this.largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura da telha em metros:"));
        this.preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago por cada telha:"));
        this.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de telhas: "));
    }

    public void exibirDadosJOption() {
        Double area = this.comprimento * this.largura;
        Double areatotal = area * this.quantidade;
        JOptionPane.showMessageDialog(null, "O nome da marca das telhas é " + this.marca + " .\n"
                + "O comprimenhto da telha é de " + this.comprimento + " metros.\n"
                + "A largura da telha é de " + this.largura + " metros.\n"
                + "O preço de cada telha é de R$" + String.format("%.2f", this.preco) + " .\n"
                + "A quantidade de telhas é de " + this.quantidade + " .\n"
                + "O preço total pago é de R$" + (this.quantidade * this.preco) + " .\n"
                + "Area ocupado por cada telha é de " + String.format("%.2f", area) + " metros quadrados.\n"
                + "Area total ocupada por todas telhas é de " + String.format("%.2f", areatotal) + " metros quadrados.");
    }

}

public class ex01 {

    public static void main(String[] args) {
        TELHA telhas = new TELHA();

        telhas.exibirDadosconsole();
        telhas.lerTelhas();
        telhas.exibirDadosJOption();
    }
}

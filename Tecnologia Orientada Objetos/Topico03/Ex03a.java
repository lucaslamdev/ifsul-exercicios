import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex03a {
    public static void main(String[] args) {
        String valorStr = JOptionPane.showInputDialog("Informe o valor a ser calculado:");
        String tamTabuadaStr = JOptionPane.showInputDialog("Informe o tamanho da tabuada:");
        int valor = Integer.parseInt(valorStr);
        int tamTabuada = Integer.parseInt(tamTabuadaStr);
        String tabuadaInteira = "";
        for (int i = 0; i <= tamTabuada; i++)
        {
          tabuadaInteira += valor + " X " + i + " = " + i*valor + "\n"; 
        }
        JOptionPane.showMessageDialog(null, tabuadaInteira);
    }
}
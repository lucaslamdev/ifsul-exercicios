
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex03b {

    public static void main(String[] args) {
        int i = 0;
        String valorStr = JOptionPane.showInputDialog("Informe o valor a ser calculado:");
        String tamTabuadaStr = JOptionPane.showInputDialog("Informe o tamanho da tabuada:");
        int valor = Integer.parseInt(valorStr);
        int tamTabuada = Integer.parseInt(tamTabuadaStr);
        String tabuadaInteira = "";
        while (i <= tamTabuada) {
            tabuadaInteira += valor + " X " + i + " = " + i * valor + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, tabuadaInteira);
    }
}

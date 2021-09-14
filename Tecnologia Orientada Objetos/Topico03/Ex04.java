
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex04 {

    public static void main(String[] args) {
        String valorInicialStr = JOptionPane.showInputDialog("Informe o valor inicial:");
        String valorFinalStr = JOptionPane.showInputDialog("Informe o valor final:");
        int valorInicial = Integer.parseInt(valorInicialStr);
        int valorFinal = Integer.parseInt(valorFinalStr);
        String pares = "Pares: ";
        for (int i = valorInicial; i <= valorFinal; i++) {
            if (i == 0 || i % 2 == 0) {
                pares += i;
                if (i < valorFinal) {
                    pares += ", ";
                } else {
                    pares += ".";
                }
            }
        }
        JOptionPane.showMessageDialog(null, pares);
    }
}

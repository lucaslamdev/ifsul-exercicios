
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex05 {

    public static void main(String[] args) {
        String valorFatorarStr = JOptionPane.showInputDialog("Informe o valor a ser fatorado:");
        int valorFatorar = Integer.parseInt(valorFatorarStr);
        String fatorado = "Fatorial de " + valorFatorar + ": ";
        int resultadoFatorado = 1;
        for (int i = valorFatorar; i >= 1; i--) {
        resultadoFatorado = i*resultadoFatorado;
        if (i > 1)
        {
            fatorado += i + " * ";
        }else
        {
            fatorado += i + " = " + resultadoFatorado;
        }
        }
        JOptionPane.showMessageDialog(null, fatorado);
    }
}

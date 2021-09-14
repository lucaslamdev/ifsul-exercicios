
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ex02 {
        
    public static void main(String[] args) {
        Integer inteiroNum[] = new Integer[10];
        Integer numNumeros = 0;
        try {
            for (numNumeros = 0; numNumeros < inteiroNum.length; numNumeros++) {
                try { // aqui vão os comandos que podem gerar erros

                    String strNumero1 = JOptionPane.showInputDialog("Informe o (" + (numNumeros + 1) + ") número");
                    inteiroNum[numNumeros] = Integer.parseInt(strNumero1);

                } catch (NumberFormatException ne) {
                    JOptionPane.showMessageDialog(null, "Número Inválido: "
                            + ne.getMessage());
                    numNumeros--;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                            + "\nClasse do Erro: " + e.getClass());
                    e.printStackTrace();
                    numNumeros--;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        } finally {
            Arrays.sort(inteiroNum);
            Integer maiorNum = inteiroNum[9];
            Integer menorNum = inteiroNum[0];
            JOptionPane.showMessageDialog(null, "O maior número é:  " + maiorNum + "."
            + "\nO menor número é: " + menorNum + ".");
            JOptionPane.showMessageDialog(null, "Acabou a execução do programa");
        }

    }

}

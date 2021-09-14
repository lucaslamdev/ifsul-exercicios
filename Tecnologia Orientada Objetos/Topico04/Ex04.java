
import javax.swing.JOptionPane;

public class Ex04 {

    public static void main(String[] args) {
        Integer inteiroNum[] = new Integer[10];
        Integer numNumeros = 0;
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

        String stringnumImpares = "";
        String stringnumPares = "";
        String stringVetorInteiro = "";
        for (numNumeros = 0; numNumeros < inteiroNum.length; numNumeros++) {
            stringVetorInteiro += inteiroNum[numNumeros] + ", ";
            if (inteiroNum[numNumeros] % 2 == 0) {
                stringnumPares += inteiroNum[numNumeros] + ", ";
            } else {
                stringnumImpares += inteiroNum[numNumeros] + ", ";
            }
        }
        JOptionPane.showMessageDialog(null, "Vetor: " + stringVetorInteiro
                + "\nImpares: " + stringnumImpares
                + "\nPares: " + stringnumPares);
        JOptionPane.showMessageDialog(null, "Acabou a execução do programa");

    }

}

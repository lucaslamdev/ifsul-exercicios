
import javax.swing.JOptionPane;

public class Ex01 {

    public static void main(String[] args) {
        Integer inteiroNum[] = new Integer[10];
        Integer numNumeros = 0;
        double numMedio = 0;
        String numAcimaMedia = "";
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
            for (numNumeros = 0; numNumeros < inteiroNum.length; numNumeros++) {
                numMedio = numMedio + inteiroNum[numNumeros];
            }
            numMedio = numMedio / inteiroNum.length;
            for (numNumeros = 0; numNumeros < inteiroNum.length; numNumeros++) {
                if(inteiroNum[numNumeros] >= numMedio){
                    numAcimaMedia += inteiroNum[numNumeros] + " ,";
                }
            }
            numAcimaMedia =  numAcimaMedia.substring(0, numAcimaMedia.length()-1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        } finally {
            JOptionPane.showMessageDialog(null, "Os valores acima da média são: " + numAcimaMedia + ".");
            JOptionPane.showMessageDialog(null, "Acabou a execução do programa");
        }

    }

}

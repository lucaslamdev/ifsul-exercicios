
import javax.swing.JOptionPane;

public class Ex03 {

    public static void main(String[] args) {
        String stringNome[] = new String[10];
        Integer numNumeros = 0;
        try {
            for (numNumeros = 0; numNumeros < 10; numNumeros++) {
                try { // aqui vão os comandos que podem gerar erros

                    String strNome = JOptionPane.showInputDialog("Informe o (" + (numNumeros + 1) + ") nome: ");
                    stringNome[numNumeros] = strNome;

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
            String strNomeVerficar = JOptionPane.showInputDialog("Informe o nome a verificar no array:");
            Integer posicaoArray = -1;
            strNomeVerficar = strNomeVerficar.toLowerCase();
            for (numNumeros = 0; numNumeros < 10; numNumeros++) {
                String nomeMinusculo = stringNome[numNumeros];
                nomeMinusculo = nomeMinusculo.toLowerCase();
                if(nomeMinusculo.equals(strNomeVerficar)){
                    posicaoArray = numNumeros;
                }
                }
                if(posicaoArray != -1){
                  JOptionPane.showMessageDialog(null, "O nome " + stringNome[posicaoArray] + " foi encontrado.");  
                }else{
                  JOptionPane.showMessageDialog(null, "O nome " + strNomeVerficar + " não foi encontrado.");  
                }
                
                JOptionPane.showMessageDialog(null, "Acabou a execução do programa");
            }

        }

    }

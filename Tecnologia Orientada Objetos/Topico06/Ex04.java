
import javax.swing.JOptionPane;

public class Ex04 {

    public static void main(String[] args) {
        Integer inteiroNumA[] = new Integer[10];
        Integer inteiroNumB[] = new Integer[10];
        Integer valS = 0;
        double valC[] = new double[10];
        Integer numNumeros = 0;
        try {
            // Array A
            for (numNumeros = 0; numNumeros < inteiroNumA.length; numNumeros++) {
                try { // aqui vão os comandos que podem gerar erros

                    String strNumeroA = JOptionPane.showInputDialog("Informe o (" + (numNumeros + 1) + ") número da array A");
                    inteiroNumA[numNumeros] = Integer.parseInt(strNumeroA);

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

            //Array B
            for (numNumeros = 0; numNumeros < inteiroNumB.length; numNumeros++) {
                try { // aqui vão os comandos que podem gerar erros

                    String strNumeroB = JOptionPane.showInputDialog("Informe o (" + (numNumeros + 1) + ") número da array B");
                    inteiroNumB[numNumeros] = Integer.parseInt(strNumeroB);

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
            
            //calcular valor S
            Integer maisA = 0;
            Integer menosB = 9;
            for (numNumeros = 0; numNumeros < inteiroNumB.length; numNumeros++) {
                valS = valS + (inteiroNumA[maisA] * inteiroNumB[menosB]);
                maisA++; 
                menosB--;
            }

            //calcular valor C
            double doubleIntA = 0;
            double doubleIntB = 0;
            for (numNumeros = 0; numNumeros < inteiroNumB.length; numNumeros++) {
                doubleIntA = inteiroNumA[numNumeros];
                doubleIntB = inteiroNumB[numNumeros];
                valC[numNumeros] = ( doubleIntA / doubleIntB );
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        } finally {
            //separar pares A
            String strA = "";
            
            for (numNumeros = 0; numNumeros < inteiroNumA.length; numNumeros++) {
                if (inteiroNumA[numNumeros] % 2 == 0) {
                    strA += inteiroNumA[numNumeros] + ", ";
                }
            }
            
            //separar  C
            String strC = "";
            for (numNumeros = 0; numNumeros < inteiroNumB.length; numNumeros++) {
                strC += valC[numNumeros] + " ,";
            }
            //remove a ultima virgula
            strA = strA.substring(0, strA.length() - 1);
            strC = strC.substring(0, strC.length() - 1);
            System.out.println("Os números pares de A são:  " + strA + ".");
            System.out.println("\nO valor de S é:" + valS + ".");
            System.out.println("\nOs números de C são:" + strC + ".");
            
            JOptionPane.showMessageDialog(null, "Acabou a execução do programa");
        }

    }

}

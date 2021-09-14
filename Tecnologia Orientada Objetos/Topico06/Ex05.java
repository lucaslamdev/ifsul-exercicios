
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05 {

    public static void main(String[] args) {
        Integer codigo[] = new Integer[5];
        String nome[] = new String[5];
        Date dataNascimento[] = new Date[5];
        double salario[] = new double[5];
        Integer reajuste = 0;
        double novoSalario[] = new double[5];
        Integer numNumeros = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            // Informar dados
            for (numNumeros = 0; numNumeros < codigo.length; numNumeros++) {
                try { // aqui vão os comandos que podem gerar erros
                    String strCodigo = JOptionPane.showInputDialog("Informe o (" + (numNumeros + 1) + ") código em números inteiros: ");
                    codigo[numNumeros] = Integer.parseInt(strCodigo);

                    String strNome = JOptionPane.showInputDialog("Informe o (" + (numNumeros + 1) + ") nome: ");
                    nome[numNumeros] = strNome;

                    String strData = JOptionPane.showInputDialog("Informe o (" + (numNumeros + 1) + ") data de nascimento(dd/mm/aaaa): ");
                    Date dataChecar = sdf.parse(strData);
                    dataNascimento[numNumeros] = dataChecar;

                    String strSalario = JOptionPane.showInputDialog("Informe o (" + (numNumeros + 1) + ") salário atual: ");
                    salario[numNumeros] = Double.parseDouble(strSalario);

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
            String strReajuste = JOptionPane.showInputDialog("Informe o reajuste em porcentagem: ");
            reajuste = Integer.parseInt(strReajuste);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        } finally {
            //separar pares A
            String strA = "";

            for (numNumeros = 0; numNumeros < codigo.length; numNumeros++) {
                novoSalario[numNumeros] = salario[numNumeros] + (salario[numNumeros] * (reajuste / 100.0));
            }

            for (numNumeros = 0; numNumeros < codigo.length; numNumeros++) {
                System.out.println("=======================================");
                System.out.println("Código: " + codigo[numNumeros] + " .");
                System.out.println("Nome: " + nome[numNumeros] + " .");
                System.out.println("Data de Nascimento: " + sdf.format(dataNascimento[numNumeros]) + " .");
                System.out.println("Salario: " + salario[numNumeros] + " .");
                System.out.println("Porcentagem Aumento: " + reajuste + "% .");
                System.out.println("Salario reajustado: " + novoSalario[numNumeros] + " .");
                System.out.println("=======================================");
            }

            JOptionPane.showMessageDialog(null, "Acabou a execução do programa");
        }

    }

}

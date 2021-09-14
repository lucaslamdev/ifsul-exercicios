
import javax.swing.JOptionPane;

public class Ex03 {

    public static void main(String[] args) {
        Double doubleNum1 = null;
        Double doubleNum2 = null;
        
        try { // aqui vão os comandos que podem gerar erros
            String strNumero1 = JOptionPane.showInputDialog("Informe o primeiro número");
            String strNumero2 = JOptionPane.showInputDialog("Informe o segundo número");
            doubleNum1 = Double.parseDouble(strNumero1);
            doubleNum2 = Double.parseDouble(strNumero2);
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "Número Inválido: "
                    + ne.getMessage());
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        } finally { 
            JOptionPane.showMessageDialog(null, "Divisão: " + (doubleNum1 / doubleNum1));
            JOptionPane.showMessageDialog(null, "Acabou a execução do programa");
        }

    }

}

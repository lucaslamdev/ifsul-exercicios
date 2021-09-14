import javax.swing.JOptionPane;

public class Ex02 {

    public static void main(String[] args) {
        try {
            String strNumero1 = JOptionPane.showInputDialog("Informe o primeiro número");
            String strNumero2 = JOptionPane.showInputDialog("Informe o segundo número");
            Double doubleNum1 = Double.parseDouble(strNumero1);
            Double doubleNum2 = Double.parseDouble(strNumero2);

            JOptionPane.showMessageDialog(null, "Divisão: " + (doubleNum1 / doubleNum2));
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "Número Inválido: "
                    + ne.getMessage());
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        } finally { 
            JOptionPane.showMessageDialog(null, "Acabou a execução do programa");
        }

    }

}
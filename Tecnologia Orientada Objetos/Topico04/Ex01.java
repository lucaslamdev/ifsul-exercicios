import javax.swing.JOptionPane;

public class Ex01 {

    public static void main(String[] args) {
        try { 
            String strNumero1 = JOptionPane.showInputDialog("Informe o primeiro número: ");
            String strNumero2 = JOptionPane.showInputDialog("Informe o segundo número: ");
            double doubleNum1 = Double.parseDouble(strNumero1);
            double doubleNum2 = Double.parseDouble(strNumero2);
            
            JOptionPane.showMessageDialog(null, "Divisão: " + (doubleNum1 / doubleNum2));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro...: " + e.getMessage() 
                                                + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
            
        }



    }

}


import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {

    public static void main(String[] args) {
        try {
            String dataResposta = JOptionPane.showInputDialog("Informe a data em dd/mm/aaaa");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            Date dataChecar = sdf.parse(dataResposta);
            JOptionPane.showMessageDialog(null, sdf.format(dataChecar));
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        } finally { 
            JOptionPane.showMessageDialog(null, "Acabou a execução do programa");
        }

    }

}
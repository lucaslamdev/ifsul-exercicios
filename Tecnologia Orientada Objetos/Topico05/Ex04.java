
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {

    public static void main(String[] args) {
        try {
            Calendar hoje = Calendar.getInstance();
            int diaAtual = hoje.get(Calendar.DAY_OF_YEAR);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String stringDataProva = "18/08/2021";
            Date dateDataProva = sdf.parse(stringDataProva);
            Calendar dataProva = Calendar.getInstance();
            dataProva.setTime(dateDataProva);
            int diaProva = dataProva.get(Calendar.DAY_OF_YEAR);
            JOptionPane.showMessageDialog(null, "Faltam " + (diaProva-diaAtual) + " dias para Prova!");
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        } finally { 
            JOptionPane.showMessageDialog(null, "Acabou a execução do programa");
        }
    }
}
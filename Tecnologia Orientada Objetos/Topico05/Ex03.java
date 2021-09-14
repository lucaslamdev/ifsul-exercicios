
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class Ex03 {

    public static void main(String[] args) {
        try {
            String dataResposta = JOptionPane.showInputDialog("Informe a data em dd/mm/aaaa");
            DateTimeFormatter dtfDMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataChecar = LocalDate.parse(dataResposta, dtfDMY);
            LocalDate dataMaisNoventa = dataChecar.plusDays(90);
            JOptionPane.showMessageDialog(null, "Data Inserida: " + dataChecar.format(dtfDMY)
                                            + "\nData com mais 90 dias: " + dataMaisNoventa.format(dtfDMY));
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "Ocorreu uma exceção: " + e.getMessage()
                    + "\nClasse do Erro: " + e.getClass());
            e.printStackTrace();
        } finally { 
            JOptionPane.showMessageDialog(null, "Acabou a execução do programa");
        }

    }

}
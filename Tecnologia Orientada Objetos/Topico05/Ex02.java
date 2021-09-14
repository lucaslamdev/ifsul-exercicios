
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {

    public static void main(String[] args) {
        Date hoje = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy");
        JOptionPane.showMessageDialog(null, "Hoje é " + sdf.format(hoje));
    }
}

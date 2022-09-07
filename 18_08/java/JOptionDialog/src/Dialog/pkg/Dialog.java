package Dialog.pkg;
import javax.swing.JOptionPane;
public class Dialog {

    public static void main(String[] args) {
        Object[] options = {"Sim", "Não"};
        JOptionPane.showOptionDialog(null, "Sim ou não? ", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[1]);
    }
}

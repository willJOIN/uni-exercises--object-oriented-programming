package confirm.pkg;

import javax.swing.JOptionPane;

public class Confirm {

    public static void main(String[] args) {
        JOptionPane.showConfirmDialog(null, "Deseja realizar o cadastro ?"); //Esse dá uma caixa de diálogo de confirmação
        //JOptionPane.InputDialog com IntegerParseInt = número
        //JOptionPane.InputDialog sem IntegerParseInt = objeto (número ou palavra)
    }
}
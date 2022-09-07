package Replace.pkg;

import javax.swing.JOptionPane;

public class Replace {

    public static void main(String[] args) {
        String s = "Este comentário foi péssimo.";
               s = s.replace("péssimo", "bom");
        JOptionPane.showMessageDialog(null, s);
    }
}
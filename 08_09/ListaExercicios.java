import java.util.Scanner;

public class ListaExercicios {
    public void exercicio1() {
        System.out.println("Alo mundo");
    }
    public void exercicio2() {
        int numero = 0;
        System.out.println("Digite um numero:\n");

        try {
            Scanner scanner1 = new Scanner(System.in);
            numero = scanner1.nextInt();
            scanner1.close();
        } catch (Exception ex) {
            System.out.println("Erro ao pegar numero no exercicio2():\n" + ex);
        }
        System.out.println("O numero informado foi:\n" + numero);
    }
}

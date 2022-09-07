import java.util.Scanner;

//@author William Hirano

public class CalculadorImc {
    public static void main(String[] args) throws Exception {
        System.out.println("Abrindo calculadora IMC...");
        Thread.sleep(5_000);
        float peso = 0, altura = 0, imc;

        // Le input peso
        try {
             peso = getPeso();
        } catch (Exception ex) {
            System.out.println("Erro ao pegar peso no getPeso():\n" + ex);
        }

        // Le input leitura
        try {
            altura = getAltura();
        } catch (Exception ex) {
            System.out.println("Erro ao pegar peso no getPeso():\n" + ex);
        }

        // Verifica se peso e altura sao validos
        if (peso == 0
                && altura == 0) {
            System.out.println("Peso e/ou altura invalidos!");
            throw new NullPointerException();
        }
        System.out.println("Peso e/ou altura validos!");

        // Calcula imc
        try {
            imc = calculaImc(peso, altura);
            System.out.println("Seu IMC eh:\n" + imc);
        } catch (Exception ex) {
            System.out.println("Erro ao calcular imc no calculaImc():\n" + ex);
        }

        System.out.println("Fechando calculadora IMC...");
        Thread.sleep(5_000);
    }

    private static float getPeso() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite seu peso(kg):\n");

        return scanner1.nextInt();
    }

    private static float getAltura() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite sua altura(m):\n");

        return scanner1.nextInt();
    }

    private static float calculaImc(float peso, float altura) {
        return peso / (altura * altura);
    }
}

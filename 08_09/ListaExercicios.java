import java.util.Scanner;
import java.lang.Math;
import javax.swing.JOptionPane;

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
    public void exercicio3() {
        float num1 = 0, num2 = 0;
        System.out.println("Digite o primeiro numero:\n");

        try {
            Scanner scanner1 = new Scanner(System.in);
            num1 = scanner1.nextFloat();

            System.out.println("Digite o segundo numero:\n");
            num2 = scanner1.nextFloat();
            scanner1.close();
        } catch (Exception ex) {
            System.out.println("Erro ao pegar num1 e/ou num2 no exercicio3():\n" + ex);
        }
        System.out.println("A soma de " + num1 + " e " + num2 + " eh:\n" + num1 + num2);
    }
    public void exercicio4() {
        float temperaturaF = 0;

        System.out.println("Digite a temperatura em Celsius:\n");

        try {
            Scanner scanner1 = new Scanner(System.in);
            temperaturaF = scanner1.nextFloat();
            scanner1.close();
        } catch (Exception ex) {
            System.out.println("Erro ao pegar temperaturaF no exercicio4():\n" + ex);
        }
        System.out.println("A temperatura em Fahren de " + temperaturaF + " eh:\n" + (int) (5 * ((temperaturaF - 32) / 9)) + " Fahrenheit.");
    }
    public void exercicio16() {
        float area, quantidadeLatas;
        double quantidadeArredondadaLatas = 0, precoTotal = 0;
        System.out.println("Digite o valor da area (m²) a ser pintada:\n");

        try {
            Scanner scanner1 = new Scanner(System.in);
            area = scanner1.nextFloat();
            scanner1.close();
            
            // 1 (L) -> 3 (m²)
            // area (L) -> tamanho (m²)
            quantidadeLatas = area / 3;
            quantidadeLatas = quantidadeLatas / 18;
            quantidadeArredondadaLatas = Math.ceil(quantidadeLatas);
            
            if (quantidadeArredondadaLatas < 2) {
                precoTotal = 80.0F;
            }
            else {
                precoTotal = 80.0F * quantidadeArredondadaLatas;
            }
        } catch (Exception ex) {
            System.out.println("Erro ao pegar tamanho no exercicio16():\n" + ex);
        }
        System.out.println("Quantidade de latas de tinta a serem compradas: " + (int) quantidadeArredondadaLatas);
        System.out.println("Preco total: R$" + Math.ceil(precoTotal));
    }
}

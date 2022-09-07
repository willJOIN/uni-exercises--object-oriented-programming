package Poképark.pkg;

public class Principal {

    public static void main(String[] args) {
        Pokepark pokepark = new Pokepark(); // Maiúsculo primeiro pois Camel Case, Primeiro = Nome da Classe, Segundo = objeto
        pokepark.nome = "Poképark";
        pokepark.tema = "Pokémon";
        pokepark.local = "Sinnoh";
        pokepark.empresa = "Nintendo";
        pokepark.capacidadeMax = "10.000";
        pokepark.lojas = "Poké Shop, Pokemon Center";
        pokepark.restaurantes = "Sopa do Brock";
        pokepark.atrações = "Ginásios, Estátua do Mewtwo, Bonecos, Pelúcias, Panos de prato";
        System.out.printf("O novo parque %s, com o tema de %s, inaugurado pela empresa %s está localizada na região de %s, com capacidade máxima de %s pessoas, tem diversas lojas, como  o %s e um restaurante chamado %s. Também conta com várias atrações, como %s ", pokepark.nome, pokepark.tema, pokepark.empresa, pokepark.local, pokepark.capacidadeMax, pokepark.lojas, pokepark.restaurantes, pokepark.atrações); //Liga os %s, printLn e JOptionPane n funciona no obj
    }
}

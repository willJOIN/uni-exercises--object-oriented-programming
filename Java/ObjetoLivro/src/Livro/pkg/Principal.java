package Livro.pkg;

import static Livro.pkg.Livro.livro;

public class Principal {
    public static void main(String[] args) {
        Livro.livro = new Livro();
        livro.nome = "diario de um banana";
        livro.descricao = "conta a história de um adolescente";
        livro.autor = "Jeff";
        livro.dataPub = "01/04/2007";
        livro.preco = "R$40,00";
        livro.paginas = "100";
        livro.cor = "azul";
        
        System.out.printf("O livro %s, na cor %s, lançado em %s, pelo autor %s, com %s páginas, no valor de %s ",livro.nome,livro.cor,livro.dataPub,livro.autor,livro.paginas,livro.preco);
    }
}
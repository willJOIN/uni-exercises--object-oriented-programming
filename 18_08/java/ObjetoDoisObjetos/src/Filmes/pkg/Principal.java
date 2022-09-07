package Filmes.pkg;

public class Principal{
    public static void main(String[] args) {
        Filme1 filme1 = new Filme1();
        Filme2 filme2 = new Filme2();
        filme1.nome = "Percy Jackson";
        filme2.nome = "O Show do Truman";
        filme1.gênero = "aventura/fantasia";
        filme2.gênero = "comédia/drama";
        filme1.AnoInícioProdução = "2009";
        filme2.AnoInícioProdução = "1996";
        filme1.AnoLançamento = "2010";
        filme2.AnoLançamento = "1998";
        filme1.duração = "1h58m";
        filme2.duração = "1h43m";
        filme1.bilheteria = "199,9 milhões USD";
        filme2.bilheteria = "264,1 milhões USD";
        filme1.classificacaoIndicativa = "12";
        filme2.classificacaoIndicativa = "12";
        filme1.notaRottenCríticos = "49%";
        filme2.notaRottenCríticos = "95%";
        filme1.notaRottenUsuários = "53%";
        filme2.notaRottenUsuários = "89%";
        
        System.out.printf("Hoje no Cinemark temos dois filmes em cartaz, o primeiro é %s e o segundo é %s. O filme do %s é do gênero %s, teve como ano de início de produção %s e lançamento %s. Tem duração de %s, bilheteria de %s e classificação indicativa de %s anos. A nota rotten dos críticos é de %s enquanto a dos usuários é de %s. Já o filme %s é do gênero %s, teve o início de sua produção em %s e seu ano de lançamento em %s. Tem duração de %s e bilheteria de %s. Sua classificação indicativa é de %s anos. A nota do Rotten dos críticos é de %s, enquanto a dos usuários é de %s.", filme1.nome, filme2.nome, filme1.nome, filme1.gênero, filme1.AnoInícioProdução, filme1.AnoLançamento, filme1.duração, filme1.bilheteria, filme1.classificacaoIndicativa, filme1.notaRottenCríticos, filme1.notaRottenUsuários, filme2.nome, filme2.gênero, filme2.AnoInícioProdução, filme2.AnoLançamento, filme2.duração, filme2.bilheteria, filme2.classificacaoIndicativa, filme2.notaRottenCríticos, filme2.notaRottenUsuários);    
    }

}
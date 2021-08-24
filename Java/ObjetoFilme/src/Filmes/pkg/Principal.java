package Filmes.pkg;

 public class Principal {
     public static void main(String[] args) {
        Filme1 filme1 = new Filme1();
        filme1.nome = "Percy Jackson";
        filme1.diretor = "Thor Freudenthal";
        filme1.gênero = "aventura/fantasia";
        filme1.duração = "1 hora e 59 minutos";
        filme1.bilheteria = "199,9 milhões USD";
        filme1.classificacaoIndicativa = "não recomendado para menores de 12 anos ";
        
         System.out.printf("O filme %s, dirigido por %s, do gênero %s, tem duração de %s, lucrou %s e tem classificação indicativa de %s" ,filme1.nome,filme1.diretor,filme1.gênero,filme1.duração,filme1.bilheteria,filme1.classificacaoIndicativa);
                
 
     
     
     }
 }
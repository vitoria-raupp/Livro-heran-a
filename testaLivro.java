package livro;
public class testaLivro {
    public static void main(String[] args) {
      
    Autor a1 = new Autor ("Taylor ","Jenkins Reid");
    Livro l1 = new Livro ( "Os sete maridos de Evelyn Hugo", "Com todo o esplendor que só a Hollywood do século passado pode oferecer, esta é uma narrativa inesquecível sobre os sacrifícios que fazemos por amor, o perigo dos segredos e o preço da fama. ", 59 , a1);
       
        System.out.println(l1);
        l1.aplicaDesconto(0.10);
        System.out.println("");
        System.out.println(l1);
        l1.aplicaDesconto(0.15);
        System.out.println(l1);
        
        System.out.println("");
    EBook b1 = new EBook ("Amor(es) verdadeiro(s)", "O que fazer quando a vida te dá dois amores verdadeiros? Quem é o seu verdadeiro amor? O que significa amar de verdade?",39,a1);
        
        System.out.println(b1);
        b1.aplicaDesconto(0.30);
        System.out.println("");
        System.out.println(b1);
        b1.aplicaDesconto(0.60);
        System.out.println(b1);
        System.out.println("");
    }
}

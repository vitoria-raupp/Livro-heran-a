package livro;
public class EBook extends Livro{

    public EBook(String nome, String descricao, float valor, Autor autor) {
        super(nome, descricao, valor, autor);
    }
    
    
    
    public boolean aplicaDesconto(double percentual){
        if (super.descontoRealizado == false){
            
            if (percentual <= 0.30){
                super.valor = super.valor - (percentual * super.valor) ;
                super.descontoRealizado = true;
                return true;} 
            else 
                return false;
        }else
            return false;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}

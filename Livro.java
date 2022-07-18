package livro;
public class Livro {
    public String nome;
    public String descricao;
    public double valor;
    public Autor autor;
    public boolean descontoRealizado;

    public Livro(String nome, String descricao, double valor, Autor autor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    
    public boolean aplicaDesconto(double porcentagem){
        if (descontoRealizado == false){
            
            if (porcentagem <= 0.15){
                this.valor = this.valor - (porcentagem * this.valor) ;
                descontoRealizado = true;
                return true;} 
            else 
                return false;
        }else
            return false;
    }
    
    @Override
    public String toString(){
        return this.nome + "\nAutor: " + this.autor + "\nValor: " + this.valor + "\nDescrição: " + this.descricao;
    }
}
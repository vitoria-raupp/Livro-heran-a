package livro;
public class Autor {
    public String Nome;
    public String Sobrenome;

    public Autor(String Nome, String sobrenome) {
        this.Nome = Nome;
        this.Sobrenome = sobrenome;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.Sobrenome = sobrenome;
    }
    
    @Override
    public String toString(){
        return Nome + Sobrenome;
    }
    
}

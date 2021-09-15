public class Jogador {

    
    private String nome;
    private String sobreNome;
    private Integer idade;
    private Time time;

    public Jogador(){
        time = new Time();
    }

    public void setNome(String newNome) {
    this.nome = newNome;
    }
    
    public void setSobreNome(String newSobreNome) {
    this.sobreNome = newSobreNome;
    }
    
    public void setIdade(Integer newIdade) {
    this.idade = newIdade;
    }
    public void imprimir()
    {
        System.out.println( this.nome);
    }
    public String getNome(){
        return this.nome;
    }
}
public class Sims {
    private String nome;
    private int idade;
    public String genero;
    public String humor;
    public int fome;
    public int sede;
    Emprego emprego;


    // Contrutor --------------------------------------------------
    
    public Sims(String nome, int idade, String genero, String humor, int fome, int sede) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.humor = humor;
        this.fome = fome;
        this.sede = sede;

    }
    
    // Getters e Setters
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    // Metodos
    
    public void brincar(){
        if (humor.equals("Brava") || humor.equals("Bravo") ) {
            IO.println(nome + " não quer brincar agora.");
        }
        
        else if (humor.equals("Faminta") || humor.equals("Faminto") ) {
            IO.println(nome + "  está com muita fome.");
        }
        else{
            IO.println(nome + " está indo brincar.");
        }
    }

}
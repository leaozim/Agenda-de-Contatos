public abstract class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa() {
        
    }

    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;

    }

    public String setNome() {
        return nome;
    }
    public void getName(String nome) {
         this.nome = nome;
    }

    public String SetSobrenome(){
        return sobrenome;
    }
    public void GetSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String SetNomeCompleto() {
        return this.nome +" "+ this.sobrenome;        
    }
} 
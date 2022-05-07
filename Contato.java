public class Contato extends Pessoa {
    private Integer id;
    private String numero;

    public Contato(String nome, String sobrenome, String numero){
        super(nome, sobrenome);
        this.numero = numero;
    }

    public void setId(Integer id){
            this.id = id;
    }  
    public void setNumero(String numero){
            this.numero = numero;
    }
    public Integer getId(){
        return this.id;
    }
    public String getNumero(){
        return this.numero;
    }
    
    @Override
    public String toString() {
        return super.getNome();
    }


}
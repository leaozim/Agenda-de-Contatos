public class Contato extends Pessoa {
    private String numero;

    public Contato(String nome, String sobrenome, String numero){
        super(nome, sobrenome);
        setNumero(numero);
    }    
    
    public void setNumero(String numero){
            this.numero = numero;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    @Override
    public String toString() {
        return super.getNome();
    }


}
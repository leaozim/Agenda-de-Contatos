import java.util.HashMap;

public class Agenda{
    private HashMap<Integer, Contato> contatos;
    private int serialId;
    
    public Agenda() {
        this.contatos = new HashMap<Integer, Contato>();
        this.serialId = 1;
    }

    public HashMap<Integer, Contato> getContatos() {
        return this.contatos;
    }

    public void adicionarContato(Contato contato) {
        this.contatos.put(this.serialId, contato);
        this.serialId++;
    }

    public void removerContato(Integer id){
        this.contatos.remove(id);

    }
    public void editarContato(Integer id, String nome, String sobrenome, String numero) {
        Contato contato = contatos.get(id);
        contato.setNome(nome); 
        contato.setSobrenome(sobrenome);
        contato.setNumero(numero);
    }
}    




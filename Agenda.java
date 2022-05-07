import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

public class Agenda{
    private HashMap<Integer, Contato> contatos;
    private int serialId;
    
    public Agenda() {
        this.contatos = new HashMap<Integer, Contato>();
        this.serialId = 1;
    }

    public List<Contato> getContatos() {
        return this.contatos.values().stream()
            .sorted(Comparator.comparing(Contato::getNome))
            .collect(Collectors.toList());
    }

    public void adicionarContato(Contato contato) {
        contato.setId(this.serialId);
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
    public void exibirContatos(){
        int contador = 1;
        for (Contato contato : this.getContatos()){
            System.out.println("[" + contador + "] " + contato.getNome() + " - " + contato.getNumero());
            contador++;
        }
    }
}    




import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Validador validador = new Validador(); 
        Scanner input = new Scanner(System.in);
        String entrada = "default";

        while(!entrada.equals("0")) {
            exibirMenu();
            entrada = input.next();
            
            if (entrada.equals("1")){
                String nome, sobrenome, numero;
                while (true){
                    System.out.println("Digite o nome:");
                    nome = input.next();
                    if (validador.ehPalavraValida(nome)) break;
                    else System.out.println("Nome só pode conter letras!");
                }
                while (true){
                    System.out.println("Digite o sobrenome:");
                    sobrenome = input.next();
                    if (validador.ehPalavraValida(sobrenome)) break;
                    else System.out.println("Nome só pode conter letras!");
                }
                while (true){
                    System.out.println("Digite o número:");
                    numero = input.next();
                    if (validador.ehNumeroValido(numero)) break;
                    else System.out.println("Formato invalido!");
                }
                Contato contato = new Contato(nome, sobrenome, numero);
                agenda.adicionarContato(contato);
                System.out.println(agenda.getContatos());
                System.out.println("Contato adicionado com sucessso!");
            }
            else if (entrada.equals("2")){
                String nomeEditado, sobrenomeEditado, numeroEditado;

                System.out.println(agenda.getContatos());
                System.out.println("Selcione qual contato gostaria de editar:");
                Integer id = input.nextInt();
                while (true){
                    System.out.println("Digite o nome:");
                    nomeEditado = input.next();
                    if (validador.ehPalavraValida(nomeEditado)) break;
                    else System.out.println("Nome só pode conter letras!");
                }
                while (true){
                    System.out.println("Digite o sobrenome:");
                    sobrenomeEditado = input.next();
                    if (validador.ehPalavraValida(sobrenomeEditado)) break;
                    else System.out.println("Sobrenome só pode conter letras!");
                }
                while (true){
                    System.out.println("Digite o número:");
                    numeroEditado = input.next();
                    if (validador.ehNumeroValido(numeroEditado)) break;
                    else System.out.println("Formato invalido!");
                }
                agenda.editarContato(id, nomeEditado, sobrenomeEditado, numeroEditado);
                System.out.println(agenda.getContatos());
                System.out.println("Contato editado com sucessso!");
            }
            else if (entrada.equals("3")){
                System.out.println(agenda.getContatos());
                System.out.println("Selecione qual o número do contato que gostaria de excluir:");
                Integer id = input.nextInt();
                agenda.removerContato(id);
                System.out.println(agenda.getContatos());
                System.out.println("Contato removido com sucesso!");
            }
            else if (entrada.equals("4")){
                if (agenda.getContatos().size() == 0) 
                    System.out.println("Sua lista de contatos esta vazia!");
                else
                {
                    System.out.println("Sua lista de contatos: ");
                    for (Map.Entry<Integer, Contato> elemento: agenda.getContatos().entrySet()){
                        System.out.println(elemento.getValue().getNome() + " - "
                               + elemento.getValue().getNumero());
                    }
                }              
            }
        }
        input.close();
    }

    private static void exibirMenu() {
        String menu = "------- Menu -------\n"
        + "1. Registrar contato \n"
        + "2. Editar contato\n"
        + "3. Excluir Contato\n"
        + "4. Listar Contatos\n"
        + "0. Sair\n"
        + "Digite sua opção";
        System.out.println(menu);
        }
}

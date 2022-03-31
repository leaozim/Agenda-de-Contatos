import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato contato1 = new Contato("pedr", "lari", "86534646454");
        Contato contato2 = new Contato("laru", "jhgh", "86534646454");
        Contato contato3 = new Contato("eduarda", "jhgh", "86534646454");
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);
        System.out.println(agenda.getContatos());   

        exibirMenu();
        Scanner input = new Scanner(System.in);
        String entrada = input.next();
        
        if (entrada.equals("1")){
            System.out.println("Digite o nome:");
            String nome = input.next();
            System.out.println("Digite o sobrenome:");
            String sobrenome = input.next();
            System.out.println("Digite o número:");
            String numero = input.next();
            Contato contato = new Contato(nome, sobrenome, numero);
            agenda.adicionarContato(contato);
            System.out.println(agenda.getContatos());
            System.out.println("Contato adicionado com sucessso!");
        }
        else if (entrada.equals("2")){
            System.out.println(agenda.getContatos());
            System.out.println("Selcione qual contato gostaria de editar:");
            Integer id = input.nextInt();
            System.out.println("Digite o nome:");
            String nomeedt = input.next();
            System.out.println("Digite o sobrenome:");
            String sobrenomeedt = input.next();
            System.out.println("Digite o número:");
            String numeroedt = input.next();
            agenda.editarContato(id, nomeedt, sobrenomeedt, numeroedt);
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
            System.out.println("Sua lista de contatos: ");
            System.out.println(agenda.getContatos());
            input.close();

        }
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


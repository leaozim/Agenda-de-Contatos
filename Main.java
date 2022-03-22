import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exibirMenu();
        Scanner input = new Scanner(System.in);
        input.close();
        String entrada = input.next();
        if (entrada.equals("1")) System.out.println("faz uma coisa");
        else System.out.println("faz outra");
    }
    private static void exibirMenu() {
        String menu = "------- Menu -------\n"
        + "1. Registrar contato \n"
        + "2. Excluir Contato\n"
        + "3. Sair"
        + "Digite sua opção";
        System.out.println(menu);
    }
   
}
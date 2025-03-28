import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaTarefas lista = new ListaTarefas();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Retirar tarefa");
            System.out.println("4 - Buscar tarefa específica");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID da tarefa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha após o número
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    lista.adicionarTarefa(id, descricao);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    lista.Listartarefas();
                    break;

                case 3:
                    lista.retirarTarefa();
                    System.out.println("Primeira tarefa retirada!");
                    break;

                case 4:
                    System.out.print("Digite o ID da tarefa a ser buscada: ");
                    int idBusca = scanner.nextInt();
                    Tarefa tarefa = lista.tarefaEspecifica(idBusca);
                    if (tarefa != null) {
                        System.out.println("Tarefa encontrada: ID: " + tarefa.id + " - " + tarefa.descricao);
                    } else {
                        System.out.println("Tarefa não encontrada!");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}

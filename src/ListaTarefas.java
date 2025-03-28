public class ListaTarefas {

    private Tarefa primeira;
    private Tarefa ultima;
    private int totalElementos;

    public ListaTarefas() {

        this.primeira = null;
        this.ultima = null;
        this.totalElementos = 0;

    }

    public void adicionarTarefa(int id, String descricao) {
        Tarefa nova = new Tarefa(id, descricao);

        if (primeira == null) {
            primeira = nova;
            ultima = nova;
        } else {
            ultima.proxima = nova;
            ultima = nova;
        }
        totalElementos++;

    }

    public void exibirTarefas() {

        Tarefa atual = primeira;
        while (atual != null) {
            System.out.println("ID: " + atual.id + " - " + atual.descricao);
            atual = atual.proxima;

        }
    }
    public void retirarTarefa() {

        if (primeira == null) {
            System.out.println("Lista vazia!");
            return;
        }

        primeira = primeira.proxima;
        totalElementos--;

        if (primeira == null) {
            ultima = null;
        }
    }

    public Tarefa tarefaEspecifica (int id){

        Tarefa atual = primeira;

        while (atual != null) {
            if (atual.id == id) {
                return atual;
            }
            atual = atual.proxima;
        }
        return null;
    }

    public void Listartarefas() {
        Tarefa atual = primeira;

        if(atual == null) {
            System.out.println("Não tem nada na lista de tarefas");
            return;
        }
        System.out.println("Lista de tarefas: ");

        while (atual != null) {
            System.out.println("ID: " + atual.id + " - " + atual.descricao);
            atual = atual.proxima;
        }
    }
}

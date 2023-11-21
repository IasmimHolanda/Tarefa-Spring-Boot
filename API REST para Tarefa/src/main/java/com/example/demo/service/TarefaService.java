import java.util.List;

public interface TarefaService {

    List<Tarefa> listarTarefas();

    Tarefa obterTarefa(int id);

    Tarefa adicionarTarefa(Tarefa tarefa);

    Tarefa atualizarTarefa(int id, Tarefa novaTarefa);

    void deletarTarefa(int id);
}

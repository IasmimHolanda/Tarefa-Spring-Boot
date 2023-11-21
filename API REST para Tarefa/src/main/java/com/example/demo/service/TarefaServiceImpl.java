import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaServiceImpl implements TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    @Override
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    @Override
    public Tarefa obterTarefa(int id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    @Override
    public Tarefa adicionarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa atualizarTarefa(int id, Tarefa novaTarefa) {
        return tarefaRepository.findById(id)
                .map(tarefa -> {
                    tarefa.setDescricao(novaTarefa.getDescricao());
                    tarefa.setFeita(novaTarefa.isFeita());
                    return tarefaRepository.save(tarefa);
                })
                .orElse(null);
    }

    @Override
    public void deletarTarefa(int id) {
        tarefaRepository.deleteById(id);
    }
}

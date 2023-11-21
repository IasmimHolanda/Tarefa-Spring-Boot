import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaService.listarTarefas();
    }

    @GetMapping("/{id}")
    public Tarefa obterTarefa(@PathVariable int id) {
        return tarefaService.obterTarefa(id);
    }

    @PostMapping
    public Tarefa adicionarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.adicionarTarefa(tarefa);
    }

    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable int id, @RequestBody Tarefa novaTarefa) {
        return tarefaService.atualizarTarefa(id, novaTarefa);
    }

    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable int id) {
        tarefaService.deletarTarefa(id);
    }
}

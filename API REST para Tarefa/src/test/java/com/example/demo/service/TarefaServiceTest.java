import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TarefaServiceTest {

    @Mock
    private TarefaRepository tarefaRepository;

    @InjectMocks
    private TarefaServiceImpl tarefaService;

    @Test
    public void testListarTarefas() {

        Tarefa tarefa1 = new Tarefa("Descrição 1", false);
        Tarefa tarefa2 = new Tarefa("Descrição 2", true);
        List<Tarefa> tarefasMock = Arrays.asList(tarefa1, tarefa2);
        when(tarefaRepository.findAll()).thenReturn(tarefasMock);


        List<Tarefa> tarefas = tarefaService.listarTarefas();

        assertEquals(2, tarefas.size());
        assertEquals("Descrição 1", tarefas.get(0).getDescricao());
        assertEquals(true, tarefas.get(1).isFeita());
    }

}

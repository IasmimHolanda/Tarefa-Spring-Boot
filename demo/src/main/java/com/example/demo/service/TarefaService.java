package com.seupacote.service;

import java.util.List;

public interface TarefaService {
    List<Tarefa> listarTarefas();
    Tarefa obterTarefaPorId(int id);
    Tarefa criarTarefa(Tarefa tarefa);
    Tarefa atualizarTarefa(Tarefa tarefa);
    void excluirTarefa(int id);
}

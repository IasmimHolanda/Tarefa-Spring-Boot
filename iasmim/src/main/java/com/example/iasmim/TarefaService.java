package com.example.iasmim;

import com.example.iasmim.Tarefa;
import com.example.iasmim.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TarefaService  {

    @Autowired
    private TarefaRepository repository;

    public List<Tarefa> findAll() {
        return repository.findAll();
    }

    public Optional<Tarefa> findById(int id) {
        return repository.findById(id);
    }

    public Tarefa save(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}

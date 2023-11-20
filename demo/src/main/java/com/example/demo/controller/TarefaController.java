package com.seupacote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.seupacote.model.Tarefa;
import com.seupacote.service.TarefaService;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    // (GET, POST, PUT, DELETE)
    
}

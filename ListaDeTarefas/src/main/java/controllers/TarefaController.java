package controllers;

import Service.TaferaService;
import repository.ITarefa;
import model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping
public class TarefaController {
    @Autowired
    private ITarefa dao;

    private TaferaService tarefaService;

    public TarefaController(TaferaService tarefaService){
        this.tarefaService= tarefaService;
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> listaTarefas() {
        return ResponseEntity.status(200).body(tarefaService.listarTarefas());
    }

    @PostMapping
    public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa tarefa){
        return ResponseEntity.status(201).body(tarefaService.adicionarTarefa(tarefa));
    }

    @PutMapping
    public ResponseEntity<Tarefa> editarPokemon(@RequestBody Tarefa tarefa) {
        return  ResponseEntity.status(200).body(tarefaService.editarTarefa(tarefa));
    }





}

package com.example.ListaDeTarefas.controllers;

import com.example.ListaDeTarefas.Service.TaferaService;
import com.example.ListaDeTarefas.repository.ITarefa;
import com.example.ListaDeTarefas.model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/tarefas")
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

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarTarefaPorId(@PathVariable Long id) {
        Tarefa tarefa = tarefaService.buscarTarefaPorId(id);
        if (tarefa != null) {
            return ResponseEntity.ok(tarefa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa tarefa){
        return ResponseEntity.status(201).body(tarefaService.adicionarTarefa(tarefa));
    }

    @PutMapping
    public ResponseEntity<Tarefa> editarPokemon(@RequestBody Tarefa tarefa) {
        return  ResponseEntity.status(200).body(tarefaService.editarTarefa(tarefa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirTarefa(@PathVariable Long id){
        tarefaService.excluirTarefa(id);
        return ResponseEntity.status(204).build();
    }




}

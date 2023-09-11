package com.example.ListaDeTarefas.Service;

import com.example.ListaDeTarefas.model.Tarefa;
import org.springframework.stereotype.Service;
import com.example.ListaDeTarefas.repository.ITarefa;

import java.util.List;

@Service
public class TaferaService {
    private ITarefa repository;

    public TaferaService(ITarefa repository){
        this.repository = repository;
    }
    //metodo Get
    public List<Tarefa> listarTarefas(){
        List<Tarefa> lista = repository.findAll();
        return lista;
    }

    //tarefa Especifica
    public Tarefa buscarTarefaPorId(long id) {
        return repository.findById(id).orElse(null);
    }


    //metodo post
    public Tarefa adicionarTarefa(Tarefa tarefa){
        Tarefa novaTarefa = repository.save(tarefa);
        return novaTarefa;
    }

    //metodo update
    public Tarefa editarTarefa(Tarefa tarefa){
        Tarefa novaTarefa = repository.save(tarefa);
        return novaTarefa;
    }

    //metodo delete
    public Boolean excluirTarefa(Long id){
        repository.deleteById(id);
        return true;
    }


}

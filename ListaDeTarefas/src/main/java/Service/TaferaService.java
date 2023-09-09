package Service;

import model.Tarefa;
import org.springframework.stereotype.Service;
import repository.ITarefa;

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


}

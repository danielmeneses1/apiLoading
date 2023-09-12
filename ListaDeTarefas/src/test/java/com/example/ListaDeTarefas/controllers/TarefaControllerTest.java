package com.example.ListaDeTarefas.controllers;

import com.example.ListaDeTarefas.model.Tarefa;
import com.example.ListaDeTarefas.repository.ITarefa;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalManagementPort;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TarefaControllerTest {
    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate testRestTemplate;
    @Autowired
    private ITarefa tarefaRepository;

    @Test
    void listarTarefas() {
        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo("Tarefa");
        tarefaRepository.save(tarefa);
        ResponseEntity<String>  forEntity = testRestTemplate.getForEntity("http://localhost:" + port + "/tarefas",String.class);
        assertEquals(HttpStatus.OK,forEntity.getStatusCode());
        assertTrue(forEntity.getBody().contains("Tarefa"));

        System.out.print("RESULTADO: "+ forEntity.getBody());
    }

    @Test
    void buscarTarefaPorId() {
    }

    @Test
    void criarTarefa() {
    }

    @Test
    void editarPokemon() {
    }

    @Test
    void excluirTarefa() {
    }
}
package com.example.johnmendes.listadetarefas.helper;

import com.example.johnmendes.listadetarefas.model.Tarefa;

import java.util.List;


public interface ITarefaDAO {

    boolean salvar(Tarefa tarefa);
    boolean atualizar(Tarefa tarefa);
    boolean deletar(Tarefa tarefa);
     List<Tarefa> listar();

}

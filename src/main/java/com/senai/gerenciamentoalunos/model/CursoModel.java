package com.senai.gerenciamentoalunos.model;

import lombok.AccessLevel;
import lombok.Setter;

import java.time.LocalDate;

public class CursoModel {
    private static Integer proximoId = 1;

    @Setter(AccessLevel.NONE)
    private Integer id;
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private LocalDate dataNascimento;

    private Integer getProximoId(){
        return proximoId++;
    }
}

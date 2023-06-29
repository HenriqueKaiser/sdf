package com.example.corridanaselva.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Maratonista {
    @Id
    private Long   id;
    private String nome;
    private String sobrenome;
    private int    idade;
    private String numeroCelular;
    private String numeroEmergencia;
    private String grupoSanguineo;
    private String rg;

    @JsonIgnore

    @ManyToOne
    private Inscricao inscricao;

}

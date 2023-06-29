package com.example.corridanaselva.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Circuito {
    @Id
    public long id;
    public String categoria;
    public String distancia;

    @JsonIgnore

    @ManyToOne
    private Inscricao inscricao;

    @OneToMany(mappedBy = "circuito")
    private List<Maratona> maratonas;

}

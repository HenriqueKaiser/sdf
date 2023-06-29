package com.example.corridanaselva.service;

import com.example.corridanaselva.entity.Circuito;
import com.example.corridanaselva.entity.Maratona;
import com.example.corridanaselva.repository.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircuitoService {
    @Autowired
    private CircuitoRepository circuitoRepository;

    public Circuito salvarCircuito (Circuito circuito){
        circuitoRepository.save(circuito);
        return circuitoRepository.save(circuito);

    }
    public Circuito buscarCircuitoPorId (Long id){
        return circuitoRepository.findById(id).get();
    }

    public List<Circuito> listarCircuitos (){
        return  circuitoRepository.findAll();
    }

}

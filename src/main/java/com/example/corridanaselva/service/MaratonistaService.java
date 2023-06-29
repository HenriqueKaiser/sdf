package com.example.corridanaselva.service;

import com.example.corridanaselva.entity.Maratona;
import com.example.corridanaselva.entity.Maratonista;
import com.example.corridanaselva.repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonistaService {
    @Autowired
    private MaratonistaRepository maratonistaRepository;

    public Maratonista salvarMaratonista(Maratonista maratonista) {
        return maratonistaRepository.save(maratonista);
    }
    public Maratonista buscarMaratonista(Long id) {
        return maratonistaRepository.findById(id).get();
    }
    public List<Maratonista> listarMaratonistas (){
        return  maratonistaRepository.findAll();
    }


}

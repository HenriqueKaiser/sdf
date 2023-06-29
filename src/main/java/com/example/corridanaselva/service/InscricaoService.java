package com.example.corridanaselva.service;

import com.example.corridanaselva.entity.Inscricao;
import com.example.corridanaselva.entity.Maratona;
import com.example.corridanaselva.entity.Maratonista;
import com.example.corridanaselva.repository.InscricaoRepository;
import com.example.corridanaselva.repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {
    @Autowired
    private InscricaoRepository inscricaoRepository;
    public Inscricao salvarInscricao (Inscricao inscricao){
        inscricaoRepository.save(inscricao);
        return inscricaoRepository.save(inscricao);

    }
    public Inscricao buscarInscricaoPorId (Long id){
        return inscricaoRepository.findById(id).get();
    }

    public List<Inscricao> listarInscricoes (){
        return  inscricaoRepository.findAll();
    }

}

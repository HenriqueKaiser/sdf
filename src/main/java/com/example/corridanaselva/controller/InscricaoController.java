package com.example.corridanaselva.controller;

import com.example.corridanaselva.entity.Inscricao;
import com.example.corridanaselva.entity.Maratonista;
import com.example.corridanaselva.service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/v4")
public class InscricaoController {
    @Autowired
    private InscricaoService  inscricaoService;

    @PostMapping("inscricao")
    public ResponseEntity<Inscricao> salvarInscricao(@RequestBody Inscricao inscricao) {
        return ResponseEntity.status(HttpStatus.CREATED).body(inscricaoService.salvarInscricao(inscricao));
    }

    @GetMapping("inscricao/{id}")
    public ResponseEntity<Inscricao> buscarInscricaoPorId(@PathVariable Long id) {
        Inscricao inscricao = inscricaoService.buscarInscricaoPorId(id);
        if (inscricao == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Inscrição não encontrada");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(inscricao);
        }
    }

    @GetMapping("Inscrições")
    public List<Inscricao> listarInscricoes() {
        return inscricaoService.listarInscricoes();
    }

}

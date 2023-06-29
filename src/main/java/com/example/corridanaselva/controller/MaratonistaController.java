package com.example.corridanaselva.controller;

import com.example.corridanaselva.entity.Maratona;
import com.example.corridanaselva.entity.Maratonista;
import com.example.corridanaselva.service.MaratonistaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MaratonistaController {
    private MaratonistaService maratonistaService;

    @PostMapping("maratonista")
    public ResponseEntity<Maratonista> salvarMaratonista(@RequestBody Maratonista maratonista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(maratonistaService.salvarMaratonista(maratonista));
    }

    @GetMapping("maratonista/{id}")
    public ResponseEntity<Maratonista> buscarMaratonista(@PathVariable Long id) {
        Maratonista maratonista = maratonistaService.buscarMaratonista(id);
        if (maratonista == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Maratonísta não encontrado");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(maratonista);
        }
    }

    @GetMapping("maratonistas")
    public List<Maratonista> listarMaratonistas() {
        return maratonistaService.listarMaratonistas();
    }
}
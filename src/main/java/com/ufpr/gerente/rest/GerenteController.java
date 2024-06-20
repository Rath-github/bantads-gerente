package com.ufpr.gerente.rest;

import com.ufpr.gerente.model.Gerente;
import com.ufpr.gerente.service.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gerentes")
public class GerenteController {
    @Autowired
    private GerenteService gerenteService;

    @GetMapping
    public List<Gerente> listarTodos() {
        return gerenteService.listarTodos();
    }

    @PostMapping
    public Gerente inserirGerente(@RequestBody Gerente gerente) {
        return gerenteService.inserirGerente(gerente);
    }

    @DeleteMapping("/{id}")
    public void removerGerente(@PathVariable Long id) {
        gerenteService.removerGerente(id);
    }

    @PutMapping("/{id}")
    public Gerente alterarGerente(@PathVariable Long id, @RequestBody Gerente gerente) {
        return gerenteService.alterarGerente(id, gerente);
    }
}
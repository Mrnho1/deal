package me.dio.deal.controller;


import me.dio.deal.model.JornadaTrabalho;
import me.dio.deal.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornadas")
public class JornadaTrabalhoController {

    @Autowired
    private JornadaTrabalhoService jornadaTrabalhoService;

    @GetMapping
    public List<JornadaTrabalho> listarTodas() {
        return jornadaTrabalhoService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> buscarPorId(@PathVariable Long id) {
        return jornadaTrabalhoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public JornadaTrabalho salvar(@RequestBody JornadaTrabalho jornada) {
        return jornadaTrabalhoService.salvar(jornada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> atualizar(@PathVariable Long id, @RequestBody JornadaTrabalho jornada) {
        return jornadaTrabalhoService.buscarPorId(id)
                .map(existing -> {
                    jornada.setId(id);
                    return ResponseEntity.ok(jornadaTrabalhoService.salvar(jornada));
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletar(@PathVariable Long id) {
        return jornadaTrabalhoService.buscarPorId(id)
                .map(existing -> {
                    jornadaTrabalhoService.deletar(id);
                    return ResponseEntity.noContent().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
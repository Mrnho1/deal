package me.dio.deal.controller;

import me.dio.deal.model.RegistroPonto;
import me.dio.deal.service.RegistroPontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registros")
public class RegistroPontoController {

    @Autowired
    private RegistroPontoService registroPontoService;

    @GetMapping
    public List<RegistroPonto> listarTodos() {
        return registroPontoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistroPonto> buscarPorId(@PathVariable Long id) {
        return registroPontoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RegistroPonto salvar(@RequestBody RegistroPonto registro) {
        return registroPontoService.salvar(registro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RegistroPonto> atualizar(@PathVariable Long id, @RequestBody RegistroPonto registro) {
        return registroPontoService.buscarPorId(id)
                .map(existing -> {
                    registro.setId(id);
                    return ResponseEntity.ok(registroPontoService.salvar(registro));
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletar(@PathVariable Long id) {
        return registroPontoService.buscarPorId(id)
                .map(existing -> {
                    registroPontoService.deletar(id);
                    return ResponseEntity.noContent().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
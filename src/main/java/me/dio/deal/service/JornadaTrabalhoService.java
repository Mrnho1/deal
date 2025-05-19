package me.dio.deal.service;


import me.dio.deal.model.JornadaTrabalho;
import me.dio.deal.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    @Autowired
    private JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public List<JornadaTrabalho> listarTodas() {
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> buscarPorId(Long id) {
        return jornadaTrabalhoRepository.findById(id);
    }

    public JornadaTrabalho salvar(JornadaTrabalho jornada) {
        return jornadaTrabalhoRepository.save(jornada);
    }

    public void deletar(Long id) {
        jornadaTrabalhoRepository.deleteById(id);
    }
}
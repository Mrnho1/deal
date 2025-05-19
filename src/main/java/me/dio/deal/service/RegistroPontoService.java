package me.dio.deal.service;


import me.dio.deal.model.RegistroPonto;
import me.dio.deal.repository.RegistroPontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroPontoService {

    @Autowired
    private RegistroPontoRepository registroPontoRepository;

    public List<RegistroPonto> listarTodos() {
        return registroPontoRepository.findAll();
    }

    public Optional<RegistroPonto> buscarPorId(Long id) {
        return registroPontoRepository.findById(id);
    }

    public RegistroPonto salvar(RegistroPonto registro) {
        return registroPontoRepository.save(registro);
    }

    public void deletar(Long id) {
        registroPontoRepository.deleteById(id);
    }
}
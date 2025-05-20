package me.dio.deal.dto;

import me.dio.deal.model.RegistroPonto;

import java.time.LocalDateTime;

public class RegistroPontoDTO {
    private Long id;
    private LocalDateTime dataHora;
    private String tipo;

    public RegistroPontoDTO(RegistroPonto registro) {
        this.id = registro.getId();
        this.dataHora = registro.getDataHora();
        this.tipo = registro.getTipo().name(); // <- Corrigido aqui
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getTipo() {
        return tipo;
    }
}


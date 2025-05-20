package me.dio.deal.dto;

import me.dio.deal.dto.FuncionarioResumoDTO;
import me.dio.deal.model.RegistroPonto;

import java.time.LocalDateTime;

public class RegistroPontoOutputDTO {
    private Long id;
    private LocalDateTime dataHora;
    private String tipo;
    private FuncionarioResumoDTO funcionario;

    public RegistroPontoOutputDTO(RegistroPonto registro) {
        this.id = registro.getId();
        this.dataHora = registro.getDataHora();
        this.tipo = registro.getTipo().name(); // Convertendo enum para String
        this.funcionario = new FuncionarioResumoDTO(registro.getFuncionario());
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

    public FuncionarioResumoDTO getFuncionario() {
        return funcionario;
    }
}

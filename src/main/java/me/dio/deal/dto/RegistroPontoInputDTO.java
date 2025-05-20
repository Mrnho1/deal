package me.dio.deal.dto;

import java.time.LocalDateTime;
import me.dio.deal.model.PunchType;

public class RegistroPontoInputDTO {
    private LocalDateTime dataHora;
    private PunchType tipo;
    private Long funcionarioId;

    // Getters e Setters

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public PunchType getTipo() {
        return tipo;
    }

    public void setTipo(PunchType tipo) {
        this.tipo = tipo;
    }

    public Long getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Long funcionarioId) {
        this.funcionarioId = funcionarioId;
    }
}
package me.dio.deal.dto;

import me.dio.deal.model.RegistroPonto;

import java.time.LocalDateTime;

public class RegistroPontoDetalhadoDTO {
    private Long id;
    private LocalDateTime dataHora;
    private String tipo;
    private Long funcionarioId;
    private String funcionarioNome;
    private String funcionarioCpf;
    private String funcionarioCargo;

    public RegistroPontoDetalhadoDTO(RegistroPonto registro) {
        this.id = registro.getId();
        this.dataHora = registro.getDataHora();
        this.tipo = registro.getTipo().name(); // converte enum para string
        this.funcionarioId = registro.getFuncionario().getId();
        this.funcionarioNome = registro.getFuncionario().getNome();
        this.funcionarioCpf = registro.getFuncionario().getCpf();
        this.funcionarioCargo = registro.getFuncionario().getCargo();
    }

    // Getters

    public Long getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getTipo() {
        return tipo;
    }

    public Long getFuncionarioId() {
        return funcionarioId;
    }

    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    public String getFuncionarioCpf() {
        return funcionarioCpf;
    }

    public String getFuncionarioCargo() {
        return funcionarioCargo;
    }
}

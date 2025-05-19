package me.dio.deal.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "registros_ponto")
public class RegistroPonto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PunchType tipo;

    private LocalDateTime dataHora;

    private Boolean ajustadoManualmente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jornada_trabalho_id")
    private JornadaTrabalho jornadaTrabalho;

    // Getters e setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public PunchType getTipo() { return tipo; }
    public void setTipo(PunchType tipo) { this.tipo = tipo; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public Boolean getAjustadoManualmente() { return ajustadoManualmente; }
    public void setAjustadoManualmente(Boolean ajustadoManualmente) { this.ajustadoManualmente = ajustadoManualmente; }

    public JornadaTrabalho getJornadaTrabalho() { return jornadaTrabalho; }
    public void setJornadaTrabalho(JornadaTrabalho jornadaTrabalho) { this.jornadaTrabalho = jornadaTrabalho; }
}
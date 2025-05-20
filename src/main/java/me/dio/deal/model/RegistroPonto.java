package me.dio.deal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @ManyToOne
    @JoinColumn(name = "jornada_trabalho_id")
    @JsonBackReference
    private JornadaTrabalho jornadaTrabalho;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    @JsonBackReference(value = "funcionario-registros")
    private Funcionario funcionario;

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

    public Funcionario getFuncionario() { return funcionario; }
    public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }
}

package me.dio.deal.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "jornadas_trabalho")
public class JornadaTrabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;

    private LocalTime almocoInicio;
    private LocalTime almocoFim;

    private String totalHorasTrabalhadas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    @OneToMany(mappedBy = "jornadaTrabalho", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RegistroPonto> registros;

    // Getters e setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public LocalTime getAlmocoInicio() { return almocoInicio; }
    public void setAlmocoInicio(LocalTime almocoInicio) { this.almocoInicio = almocoInicio; }

    public LocalTime getAlmocoFim() { return almocoFim; }
    public void setAlmocoFim(LocalTime almocoFim) { this.almocoFim = almocoFim; }

    public String getTotalHorasTrabalhadas() { return totalHorasTrabalhadas; }
    public void setTotalHorasTrabalhadas(String totalHorasTrabalhadas) { this.totalHorasTrabalhadas = totalHorasTrabalhadas; }

    public Funcionario getFuncionario() { return funcionario; }
    public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }

    public List<RegistroPonto> getRegistros() { return registros; }
    public void setRegistros(List<RegistroPonto> registros) { this.registros = registros; }
}

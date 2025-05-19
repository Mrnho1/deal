package me.dio.deal.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "banco_horas")
public class BancoHoras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate periodoInicio;
    private LocalDate periodoFim;

    private String totalHorasTrabalhadas;
    private String totalHorasEsperadas;
    private String saldoHoras;

    @OneToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    @OneToMany(mappedBy = "bancoHoras", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AjusteManual> ajustesManuais;

    // Getters e setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getPeriodoInicio() { return periodoInicio; }
    public void setPeriodoInicio(LocalDate periodoInicio) { this.periodoInicio = periodoInicio; }

    public LocalDate getPeriodoFim() { return periodoFim; }
    public void setPeriodoFim(LocalDate periodoFim) { this.periodoFim = periodoFim; }

    public String getTotalHorasTrabalhadas() { return totalHorasTrabalhadas; }
    public void setTotalHorasTrabalhadas(String totalHorasTrabalhadas) { this.totalHorasTrabalhadas = totalHorasTrabalhadas; }

    public String getTotalHorasEsperadas() { return totalHorasEsperadas; }
    public void setTotalHorasEsperadas(String totalHorasEsperadas) { this.totalHorasEsperadas = totalHorasEsperadas; }

    public String getSaldoHoras() { return saldoHoras; }
    public void setSaldoHoras(String saldoHoras) { this.saldoHoras = saldoHoras; }

    public Funcionario getFuncionario() { return funcionario; }
    public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }

    public List<AjusteManual> getAjustesManuais() { return ajustesManuais; }
    public void setAjustesManuais(List<AjusteManual> ajustesManuais) { this.ajustesManuais = ajustesManuais; }
}
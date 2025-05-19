package me.dio.deal.model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ajustes_manuais")
public class AjusteManual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private String valorAjustado;
    private String justificativa;
    private String responsavel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "banco_horas_id")
    private BancoHoras bancoHoras;

    // Getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getValorAjustado() {
        return valorAjustado;
    }

    public void setValorAjustado(String valorAjustado) {
        this.valorAjustado = valorAjustado;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public BancoHoras getBancoHoras() {
        return bancoHoras;
    }

    public void setBancoHoras(BancoHoras bancoHoras) {
        this.bancoHoras = bancoHoras;
    }

}
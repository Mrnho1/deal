package me.dio.deal.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "funcionarios")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String cargo;
    private String matricula;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<JornadaTrabalho> jornadas;

    @OneToOne(mappedBy = "funcionario", cascade = CascadeType.ALL, orphanRemoval = true)
    private BancoHoras bancoHoras;

    // Getters e setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public List<JornadaTrabalho> getJornadas() { return jornadas; }
    public void setJornadas(List<JornadaTrabalho> jornadas) { this.jornadas = jornadas; }

    public BancoHoras getBancoHoras() { return bancoHoras; }
    public void setBancoHoras(BancoHoras bancoHoras) { this.bancoHoras = bancoHoras; }
}
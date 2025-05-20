package me.dio.deal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "jornadas_trabalho")
public class JornadaTrabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    @JsonBackReference(value = "funcionario-jornadas")
    private Funcionario funcionario;

    @OneToMany(mappedBy = "jornadaTrabalho", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<RegistroPonto> registrosPonto;

    // Getters e setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Funcionario getFuncionario() { return funcionario; }
    public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }

    public List<RegistroPonto> getRegistrosPonto() { return registrosPonto; }
    public void setRegistrosPonto(List<RegistroPonto> registrosPonto) { this.registrosPonto = registrosPonto; }
}

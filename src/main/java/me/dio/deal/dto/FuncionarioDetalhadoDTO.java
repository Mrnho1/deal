package me.dio.deal.dto;

import me.dio.deal.model.Funcionario;

import java.util.List;
import java.util.stream.Collectors;

public class FuncionarioDetalhadoDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String cargo;
    private List<RegistroPontoDTO> registros;

    public FuncionarioDetalhadoDTO(Funcionario funcionario) {
        this.id = funcionario.getId();
        this.nome = funcionario.getNome();
        this.cpf = funcionario.getCpf();
        this.cargo = funcionario.getCargo();
        this.registros = funcionario.getRegistrosPonto().stream()
                .map(RegistroPontoDTO::new)
                .collect(Collectors.toList());
    }

    // Getters

    public List<RegistroPontoDTO> getRegistros() {
        return registros;
    }

    public void setRegistros(List<RegistroPontoDTO> registros) {
        this.registros = registros;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package me.dio.deal.repository;

import me.dio.deal.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    // métodos customizados podem ser adicionados aqui se precisar
}
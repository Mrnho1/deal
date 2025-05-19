package me.dio.deal.repository;

import me.dio.deal.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {
    // métodos customizados podem ser adicionados aqui se precisar
}

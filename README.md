# 🕒 Sistema de Ponto Eletrônico — Diagrama de Classes

Este projeto implementa um **sistema de controle de ponto eletrônico** para trabalhadores de um canteiro de obras. A estrutura foi modelada para oferecer rastreabilidade sobre entradas e saídas diárias, bem como controle do banco de horas e ajustes manuais.

---

## 📐 Diagrama de Classes (Mermaid)

```mermaid
classDiagram
    class Funcionario {
        +Long id
        +String nome
        +String cpf
        +String cargo
        +String matricula
    }

    class JornadaTrabalho {
        +Long id
        +LocalDate data
        +LocalTime almocoInicio
        +LocalTime almocoFim
        +String totalHorasTrabalhadas
    }

    class RegistroPonto {
        +PunchType tipo
        +LocalDateTime dataHora
        +Boolean ajustadoManualmente
    }

    class BancoHoras {
        +LocalDate periodoInicio
        +LocalDate periodoFim
        +String totalHorasTrabalhadas
        +String totalHorasEsperadas
        +String saldoHoras
    }

    class AjusteManual {
        +LocalDate data
        +String valorAjustado
        +String justificativa
        +String responsavel
    }

    Funcionario "1" --> "*" JornadaTrabalho : possui
    JornadaTrabalho "1" --> "*" RegistroPonto : contém
    Funcionario "1" --> "1" BancoHoras : possui
    BancoHoras "1" --> "*" AjusteManual : inclui


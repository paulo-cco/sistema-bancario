# Sistema Bancário em Java

## Visão Geral

Sistema bancário desenvolvido em Java com foco em Programação Orientada a Objetos (POO), aplicando regras de negócio reais como validação de saldo, status de conta e operações financeiras básicas.

O projeto simula o funcionamento de contas bancárias com operações como depósitos, saques, transferências e encerramento de conta.

---

## Funcionalidades

- Abertura de conta
- Depósito em conta
- Saque com validação de saldo
- Transferência entre contas
- Encerramento de conta
- Validação de conta ativa antes de operações

---

## Regras de Negócio

- Operações só podem ser realizadas com conta ativa
- Saques e transferências não podem exceder o saldo disponível
- Valores monetários são tratados com `BigDecimal` para maior precisão
- Conta inativa não permite movimentações financeiras

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- BigDecimal (precisão monetária)

---

## Estrutura do Projeto

- `Conta` → Classe principal com regras financeiras
- `Cliente` → Representa o titular da conta (nome e CPF)
- `ContaCorrente` / `ContaPoupanca` → Tipos de conta (se aplicável)
- `Main` → Classe de execução do sistema

---

## Como Executar

```bash
javac Main.java
java Main
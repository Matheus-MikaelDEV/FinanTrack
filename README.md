# 💸 Sistema de Controle de Despesas em Java

Este é um sistema simples de **controle de despesas pessoais**, desenvolvido em Java utilizando os conceitos de **POO (Programação Orientada a Objetos)**, **Enums**, **Datas**, e **Coleções**.

## 🧾 Funcionalidades

- Cadastro de usuário com nome, email e CPF formatado
- Registro de despesas com:
  - Descrição
  - Valor
  - Data (dd/MM/yyyy)
  - Categoria (alimentação, lazer, transporte, saúde, educação, outros)
- Cálculo do saldo atual
- Filtro de despesas por categoria
- Resumo de despesas por mês e ano
- Listagem completa das despesas

## 📦 Estrutura do Projeto

```bash
src/
├── application/
│   └── Program.java          # Classe principal (main)
├── entities/
│   ├── User.java             # Classe que representa o usuário
│   ├── Expense.java          # Classe que representa uma despesa
│   └── Portfolio.java        # Classe que gerencia despesas e saldo
└── entities/enums/
    └── Category.java         # Enum com as categorias de despesas
```

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/controle-despesas-java.git
   cd controle-despesas-java
   ```

2. Compile os arquivos Java:
   ```bash
   javac application/Program.java
   ```

3. Execute o programa:
   ```bash
   java application.Program
   ```

> Certifique-se de estar usando o **JDK 8 ou superior**.

## 🧠 Conceitos Utilizados

- Encapsulamento e separação de responsabilidades
- Enumeração (`enum`) para categorias
- Manipulação de datas com `SimpleDateFormat`
- Uso de listas dinâmicas (`ArrayList`)
- Estrutura de menu interativo no terminal

## 📌 Exemplo de Uso

```
Bem-vindo ao sistema de controle de despesas!
Digite o seu nome: João
Digite o seu email: joao@email.com
Digite o seu CPF (apenas números): 12345678900
Usuário cadastrado com sucesso!
Digite o saldo inicial: 1000.00

Menu:
1 - Adicionar despesa
2 - Calcular saldo
3 - Filtrar despesas por categoria
4 - Resumo por mês e ano
5 - Mostrar Todas as Despesas
6 - Sair
Escolha uma opção: 1

Adicionar despesa:
Descrição: Mercado
Valor: 150.00
Data (dd/MM/yyyy): 20/06/2025
Categoria (ALIMENTACAO, LAZER, TRANSPORTE, SAUDE, EDUCACAO, OUTROS): ALIMENTACAO
Despesa adicionada com sucesso!

Escolha uma opção: 5

Todas as despesas:
Dados do usuário: João
CPF: 123.456.789-00
Email: joao@email.com
Dados das despesas:
Descrição: Mercado, Valor: 150.0, Data: Fri Jun 20 00:00:00 BRT 2025, Categoria: ALIMENTACAO
Saldo atual: 850.0
```

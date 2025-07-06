# SistemaClientes

# 📋 Sistema de Cadastro de Clientes

Este projeto é um sistema simples de **cadastro de clientes** desenvolvido em **Java**, utilizando **JDBC** para conexão com banco de dados relacional (ex: MySQL). Ele permite as operações básicas de um CRUD: **Criar, Listar, Atualizar e Remover** clientes via terminal.

## ✅ Funcionalidades

- 📌 Cadastrar novo cliente
- 📄 Listar todos os clientes cadastrados
- ✏️ Atualizar dados de um cliente
- 🗑️ Remover cliente por ID
- 🎯 Interface de linha de comando (CLI) interativa com `Scanner`

## 🛠️ Tecnologias Utilizadas

- Java (JDK 8+)
- JDBC (Java Database Connectivity)
- Banco de Dados Relacional (MySQL, PostgreSQL ou outro)
- Maven (opcional, caso queira gerenciar dependências)
- IDE recomendada: IntelliJ IDEA, NetBeans ou VS Code

## 📂 Estrutura do Projeto

📦src
┣ 📂dao
┃ ┗ 📄ClienteDAO.java
┣ 📂model
┃ ┗ 📄Cliente.java
┣ 📂util
┃ ┗ 📄Conexao.java
┗ 📄Main.java


## ⚙️ Como Executar

1. **Clone o repositório:**

```bash
https://github.com/Simycity/SistemaClientes.git
cd SistemaClientes

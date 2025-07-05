CREATE DATABASE sistemaClientes; -- Criando o Banco

USE sistemaClientes; -- Acessando o Banco

-- Criando a tabela Cliente
CREATE TABLE Clientes(
	id_Clientes INT PRIMARY KEY AUTO_INCREMENT,
    Nome_Completo VARCHAR(255) NOT NULL,
    CPF VARCHAR(14) NOT NULL,
    Email VARCHAR(255),
    Telefone VARCHAR(15),
    Endereco VARCHAR(255)
);

-- Exibindo dados da tabela
SELECT * FROM Clientes;

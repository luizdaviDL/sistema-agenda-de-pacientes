CREATE TABLE tb_paciente(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50),
    sobrenome VARCHAR(50),
    cpf VARCHAR(40),
    email VARCHAR(100)
);
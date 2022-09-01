CREATE TABLE tb_egenda(
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(50),
    data_hora timestamp,
    data_criacao timestamp,
    paciente_id integer,
    CONSTRAINT agenda_pacinete FOREIGN KEY(tb_paciente) REFERENCES tb_paciente(id)
);
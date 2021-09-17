CREATE database db_imobiliaria;

CREATE table predios(
    codigo INTEGER NOT NULL,
    descricao varchar(50) NOT NULL,
    rua varchar(50) NOT NULL,
    numero integer,
    cep char(8) NOT NULL,
    PRIMARY KEY (codigo),
    check(codigo>0)
);

CREATE table apartamentos(
    numero INTEGER NOT NULL,
    area DOUBLE PRECISION NOT NULL default 0,
    predio INTEGER NOT NULL,
    PRIMARY KEY (numero),
    check(numero>0),
    FOREIGN KEY (predio) REFERENCES predios(codigo),
    UNIQUE (predio)
);

CREATE table pessoas(
    codigo INTEGER NOT NULL,
    nome varchar(50) NOT NULL,
    cpf char(11),
    PRIMARY KEY (codigo),
    check(codigo>0)
);

CREATE table proprietarios(
    pessoa INTEGER NOT NULL,
    apartamento_numero INTEGER NOT NULL,
    apartamento_predio INTEGER NOT NULL,
    porcentagem double precision NOT NULL,
    PRIMARY KEY (pessoa, apartamento_numero, apartamento_predio),
    FOREIGN KEY (pessoa) REFERENCES pessoas(codigo),
    check(pessoa>=0 AND pessoa<=100),
    FOREIGN KEY (apartamento_numero) REFERENCES apartamentos(numero),
    FOREIGN KEY (apartamento_predio) REFERENCES apartamentos(predio)
);

CREATE table alugueis(
    codigo BIGINT NOT NULL,
    valor NUMERIC(10,2) NOT NULL,
    inicio DATE NOT NULL,
    adm DOUBLE PRECISION NOT NULL,
    duracao INTEGER NOT NULL,
    juros DOUBLE PRECISION NOT NULL,
    multa DOUBLE PRECISION NOT NULL,
    dia_vencimento SMALLINT NOT NULL,
    pessoa INTEGER NOT NULL,
    apartamento_numero INTEGER NOT NULL,
    apartamento_predio INTEGER NOT NULL,
    PRIMARY KEY (codigo),
    FOREIGN KEY (pessoa) REFERENCES pessoas(codigo),
    FOREIGN KEY (apartamento_numero) REFERENCES apartamentos(numero),
    FOREIGN KEY (apartamento_predio) REFERENCES apartamentos(predio),
    check(codigo>0),
    check(valor>=0),
    check(adm>=0 AND  adm <= 100),
    check(juros>=0 AND  juros <= 100),
    check(multa>=0 AND  multa <= 100)
);

CREATE table mensalidades(
    codigo BIGINT NOT NULL,
    pagamento DATE,
    valor NUMERIC(10,2) NOT NULL,
    vencimento DATE NOT NULL,
    valor_pago NUMERIC(10,2) NOT NULL,
    aluguel BIGINT NOT NULL,
    PRIMARY KEY (codigo),
    FOREIGN KEY (aluguel) REFERENCES alugueis(codigo),
    check(codigo>=1),
    check(valor>=0),
    check(valor_pago>=0)
);
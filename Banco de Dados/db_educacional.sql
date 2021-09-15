CREATE database db_educacional;

CREATE table cursos(
    codigo INTEGER NOT NULL,
    nome varchar(100) NOT NULL,
    PRIMARY KEY (codigo),
    check(codigo>0)
);

CREATE table prerequesitos(
    curso INTEGER NOT NULL,
    prerequesito INTEGER NOT NULL,
    FOREIGN KEY (curso) REFERENCES cursos(codigo),
    FOREIGN KEY (prerequesito) REFERENCES cursos(codigo)
);

CREATE table locais(
    codigo INTEGER NOT NULL,
    descricao varchar(100) NOT NULL,
    capacidade INTEGER NOT NULL,
    PRIMARY KEY (codigo),
    check(codigo>0)
);

CREATE table professores(
    codigo INTEGER NOT NULL,
    nome varchar(100) NOT NULL,
    PRIMARY KEY (codigo),
    check(codigo>0)
);

CREATE table cursos_oferecidos(
    codigo INTEGER NOT NULL,
    inicio DATE NOT NULL,
    termino DATE NOT NULL,
    vagas INTEGER NOT NULL,
    curso INTEGER NOT NULL,
    professor INTEGER NOT NULL,
    local INTEGER NOT NULL,
    primary key (codigo),
    check(codigo>0),
    FOREIGN KEY (curso) REFERENCES cursos(codigo),
    FOREIGN KEY (professor) REFERENCES professores(codigo),
    FOREIGN KEY (local) REFERENCES locais(codigo)
);

CREATE table alunos(
    codigo INTEGER NOT NULL,
    nome varchar(100) NOT NULL,
    PRIMARY KEY (codigo),
    check(codigo>0) 
);

CREATE table bolsas(
    codigo INTEGER NOT NULL,
    descricao varchar(100) NOT NULL,
    tipo char(1),
    valor numeric(10,2) NOT NULL,
    PRIMARY KEY (codigo),
    check(codigo>0)
);

CREATE table matriculas(
    codigo BIGINT NOT NULL,
    cursos_oferecido BIGINT NOT NULL,
    aluno INTEGER NOT NULL,
    bolsa INTEGER NULL,
    PRIMARY KEY(codigo),
    FOREIGN KEY (cursos_oferecido) REFERENCES cursos_oferecidos(codigo),
    FOREIGN KEY (aluno) REFERENCES alunos(codigo),
    FOREIGN KEY (bolsa) REFERENCES bolsas(codigo)
);
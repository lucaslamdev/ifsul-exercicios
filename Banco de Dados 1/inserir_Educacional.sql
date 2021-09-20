insert into cursos (codigo, nome) values (1, 'BANCO DE DADOS');
insert into cursos (codigo, nome) values (2, 'JAVA');
insert into cursos (codigo, nome) values (3, 'PYTHON');
insert into cursos (codigo, nome) values (4, 'CSHARP');
insert into cursos (codigo, nome) values (5, 'C++');
insert into cursos (codigo, nome) values (6, 'C');
insert into cursos (codigo, nome) values (7, 'ARDUINO');
insert into cursos (codigo, nome) values (8, 'JAVASCRIPT');
insert into cursos (codigo, nome) values (9, 'PASCAL');
insert into cursos (codigo, nome) values (10, 'PHP');

insert into prerequesitos (curso, prerequesito) values (1, 1);
insert into prerequesitos (curso, prerequesito) values (2, 1);
insert into prerequesitos (curso, prerequesito) values (3, 2);
insert into prerequesitos (curso, prerequesito) values (4, 3);
insert into prerequesitos (curso, prerequesito) values (5, 4);
insert into prerequesitos (curso, prerequesito) values (6, 5);
insert into prerequesitos (curso, prerequesito) values (7, 6);
insert into prerequesitos (curso, prerequesito) values (8, 7);
insert into prerequesitos (curso, prerequesito) values (9, 8);
insert into prerequesitos (curso, prerequesito) values (10, 9);


insert into locais (codigo, descricao, capacidade) values (1, 'CENTRO DE AULAS', 10);
insert into locais (codigo, descricao, capacidade) values (2, 'CENTRO DE INFORMATICA', 15);
insert into locais (codigo, descricao, capacidade) values (3, 'CENTRO DE SLIDES', 10);
insert into locais (codigo, descricao, capacidade) values (4, 'ALMOXARIFADO', 13);
insert into locais (codigo, descricao, capacidade) values (5, 'CAVERNA DO BATMAN', 20);
insert into locais (codigo, descricao, capacidade) values (6, 'CAVERNA DO ROBIN', 14);
insert into locais (codigo, descricao, capacidade) values (7, 'SALA DE COMPUTADORES', 12);
insert into locais (codigo, descricao, capacidade) values (8, 'SALA DE REUNIÕES', 13);
insert into locais (codigo, descricao, capacidade) values (9, 'SALA DE CONFERENCIA', 17);
insert into locais (codigo, descricao, capacidade) values (10, 'AUDITORIO', 18);

insert into professores (codigo, nome) values (1, 'Mario');
insert into professores (codigo, nome) values (2, 'Luigi');
insert into professores (codigo, nome) values (3, 'Sonic');
insert into professores (codigo, nome) values (4, 'Kurby');
insert into professores (codigo, nome) values (5, 'Steve');
insert into professores (codigo, nome) values (6, 'Alex');
insert into professores (codigo, nome) values (7, 'McLovin');
insert into professores (codigo, nome) values (8, 'Kurosaki Ichigo');
insert into professores (codigo, nome) values (9, 'Luffy');
insert into professores (codigo, nome) values (10, 'Naruto Uzumaki');

insert into cursos_oferecidos (codigo, inicio, termino, vagas , curso, professor, local) values (1, '01-01-2000', '01-02-2000', 10, 1, 1, 1);
insert into cursos_oferecidos (codigo, inicio, termino, vagas , curso, professor, local) values (2, '02-01-2000', '10-03-2000', 11, 2, 2, 2);
insert into cursos_oferecidos (codigo, inicio, termino, vagas , curso, professor, local) values (3, '03-01-2000', '09-04-2000', 12, 3, 3, 3);
insert into cursos_oferecidos (codigo, inicio, termino, vagas , curso, professor, local) values (4, '04-01-2000', '08-05-2000', 13, 4, 4, 4);
insert into cursos_oferecidos (codigo, inicio, termino, vagas , curso, professor, local) values (5, '05-01-2000', '07-06-2000', 14, 5, 5, 5);
insert into cursos_oferecidos (codigo, inicio, termino, vagas , curso, professor, local) values (6, '06-01-2000', '06-07-2000', 15, 6, 6, 6);
insert into cursos_oferecidos (codigo, inicio, termino, vagas , curso, professor, local) values (7, '07-01-2000', '05-08-2000', 18, 8, 8, 8);
insert into cursos_oferecidos (codigo, inicio, termino, vagas , curso, professor, local) values (8, '08-01-2000', '04-09-2000', 16, 7, 7, 7);
insert into cursos_oferecidos (codigo, inicio, termino, vagas , curso, professor, local) values (9, '09-01-2000', '03-10-2000', 17, 9, 9, 9);
insert into cursos_oferecidos (codigo, inicio, termino, vagas , curso, professor, local) values (10, '10-01-2000', '02-11-2000', 19, 10, 10, 10);

insert into alunos (codigo, nome) values (1, 'Shaolin Matador');
insert into alunos (codigo, nome) values (2, 'Sonim Bleinem');
insert into alunos (codigo, nome) values (3, 'Flavin do Pneu');
insert into alunos (codigo, nome) values (4, 'Irineu Vc Não sabe nem');
insert into alunos (codigo, nome) values (5, 'Rukia');
insert into alunos (codigo, nome) values (6, 'Zoro');
insert into alunos (codigo, nome) values (7, 'Koro-Sensei');
insert into alunos (codigo, nome) values (8, 'Kami-Sama');
insert into alunos (codigo, nome) values (9, 'Little Big Planet');
insert into alunos (codigo, nome) values (10, 'Vish KK');

insert into bolsas (codigo, descricao, tipo, valor) values (1, 'Bolsinhazinhanininha', 2, 1.99 );
insert into bolsas (codigo, descricao, tipo, valor) values (2, 'Bolsinhazinhaninha', 2, 2.99 );
insert into bolsas (codigo, descricao, tipo, valor) values (3, 'Bolsinhazinha', 2, 5.99 );
insert into bolsas (codigo, descricao, tipo, valor) values (4, 'Bolsinha', 2, 10.99 );
insert into bolsas (codigo, descricao, tipo, valor) values (5, 'Bolsa', 2, 99.99 );
insert into bolsas (codigo, descricao, tipo, valor) values (6, 'Bolsão', 1, 499.99 );
insert into bolsas (codigo, descricao, tipo, valor) values (7, 'Mais de 500 reais', 1, 599.99 );
insert into bolsas (codigo, descricao, tipo, valor) values (8, 'Bolsona', 1, 1000.99 );
insert into bolsas (codigo, descricao, tipo, valor) values (9, 'Bolsoazona', 1, 2000.99 );
insert into bolsas (codigo, descricao, tipo, valor) values (10, 'Bolsão', 1, 1999.99 );

insert into matriculas (cursos_oferecido, aluno, bolsa, codigo) values (10, 1, 1, 10);
insert into matriculas (cursos_oferecido, aluno, bolsa, codigo) values (9, 2, 2, 9);
insert into matriculas (cursos_oferecido, aluno, bolsa, codigo) values (8, 3, 3, 8);
insert into matriculas (cursos_oferecido, aluno, bolsa, codigo) values (7, 4, 4, 7);
insert into matriculas (cursos_oferecido, aluno, bolsa, codigo) values (6, 5, 5, 6);
insert into matriculas (cursos_oferecido, aluno, bolsa, codigo) values (5, 6, 6, 5);
insert into matriculas (cursos_oferecido, aluno, bolsa, codigo) values (4, 7, 7, 4);
insert into matriculas (cursos_oferecido, aluno, bolsa, codigo) values (3, 8, 8, 3);
insert into matriculas (cursos_oferecido, aluno, bolsa, codigo) values (2, 9, 9, 2);
insert into matriculas (cursos_oferecido, aluno, bolsa, codigo) values (1, 10, 10, 1);

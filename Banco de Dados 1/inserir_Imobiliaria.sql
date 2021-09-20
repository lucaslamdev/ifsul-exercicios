insert into predios (codigo, descricao, rua, numero, cep)
    values (1, 'UMA RUA AZUL', 'RUA AZUL',  123, '12345678'),
           (2, 'UMA RUA VERMELHA', 'RUA VERMELHA',  321, '10002000'),
           (3, 'UMA RUA AMARELO', 'RUA AMARELO',  124, '99000000'),
           (4, 'UMA RUA VERDE', 'RUA VERDE',  125, '99000001'),
           (5, 'TEM UMA CASA SEM TETO NEM NADA', 'RUA DOS BOBOS',  0, '99000002'),
           (6, 'UMA RUA QUE ERA PRA SER IMPOSSIVEL', 'RUA 30 DE FEVEREIRO',  1234, '99000003'),
           (7, 'ESSE CEP N�O ME � ESTRANHO', 'RUA 1 DE ABRIL',  1, '01010010'),
           (8, 'N�O SERIA 01 DE JANEIRO?', 'RUA 32 DE DEZEMBRO ',  31, '00100100'),
           (9, 'SE ESCONDE PRA N LEVAR TIRO', 'RUA CORONEL ATIROU PRA CIMA',  24, '24242424'),
           (10,  '!)O(ADNIL � �COV', 'LISARB AUR',  25, '66633999');

insert into apartamentos (numero, area, predio)
    values (111, 111.111 , 1),
           (222, 222.222, 2),
           (333, 333.333, 3),
           (444, 444.444, 4),
           (555, 555.555, 5),
           (666, 666.666, 6),
           (777, 777.777, 7),
           (888, 888.888, 8),
           (999, 999.999, 9),
           (101, 101.99, 10);

insert into pessoas (codigo, nome, cpf)
    values (1, 'Lucas', '43434343430'),
           (2, 'Jo�o', '98765432101'),
           (3, 'Maria', '40028922000'),
           (4, 'Notch', '02500000000'),
           (5, 'Herobrine', 'FOI ADI....'),
           (6, 'Ender Dragon', '43310433100'),
           (7, 'Terraria', '12345678901'),
           (8, 'Mestre Miyagi', '19322005000'),
           (9, 'Venoninho Etstueme',  '30035300350'),
           (10, 'Danon�o Gostoso',  '13371337123');

insert into proprietarios (pessoa, apartamento_numero, apartamento_predio, porcentagem)
    values (1, 111, 1, 100.0),
           (2, 222, 2, 99.9),
           (3, 333, 3, 98.8),
           (4, 444, 4, 97.7),
           (5, 555, 5, 96.6),
           (6, 666, 6, 99.5),
           (7, 777, 7, 95.4),
           (8, 888, 8, 94.3),
           (9, 999, 9, 93.2),
           (10, 101, 10, 92.1);

insert into alugueis (codigo, valor, inicio, adm, duracao, juros, multa, dia_vencimento, pessoa, apartamento_numero, apartamento_predio)
    values (1, 500.99, '01-01-1999', 10.99, 55, 25.12, 1.99, 3, 1, 111, 1),
           (2, 500.99, '01-01-1999', 10.99, 55, 25.12, 1.99, 3, 2, 222, 2),
           (3, 500.99, '01-01-1999', 10.99, 55, 25.12, 1.99, 3, 3, 333, 3),
           (4, 500.99, '01-01-1999', 10.99, 55, 25.12, 1.99, 3, 4, 444, 4),
           (5, 500.99, '01-01-1999', 10.99, 55, 25.12, 1.99, 3, 5, 555, 5),
           (6, 500.99, '01-01-1999', 10.99, 55, 25.12, 1.99, 3, 6, 666, 6),
           (7, 500.99, '01-01-1999', 10.99, 55, 25.12, 1.99, 3, 7, 777, 7),
           (8, 500.99, '01-01-1999', 10.99, 55, 25.12, 1.99, 3, 8, 888, 8),
           (9, 500.99, '01-01-1999', 10.99, 55, 25.12, 1.99, 3, 10, 999, 9),
           (10, 500.99, '01-01-1999', 10.99, 55, 25.12, 1.99, 3, 9, 101, 10);
            

insert into mensalidades (codigo, pagamento, valor, vencimento, valor_pago, aluguel)
    values (1, '01-01-1999', 500.99, '01-01-2077', 500.99, 1),
           (2, '01-01-1999', 500.99, '02-01-2077', 500.99, 2),
           (3, '01-01-1999', 500.99, '03-01-2077', 500.99, 3),
           (4, '01-01-1999', 500.99, '04-01-2077', 500.99, 4),
           (5, '01-01-1999', 500.99, '05-01-2077', 500.99, 5),
           (6, '01-01-1999', 500.99, '06-01-2077', 500.99, 6),
           (7, '01-01-1999', 500.99, '07-01-2077', 500.99, 7),
           (8, '01-01-1999', 500.99, '08-01-2077', 500.99, 8),
           (9, '01-01-1999', 500.99, '09-01-2077', 500.99, 9),
           (10, '01-01-1999', 500.99, '10-01-2077', 500.99, 10);
insert into dia_semana (id_dia_semana, dia_semana) values (1, 'Segunda');
insert into dia_semana (id_dia_semana, dia_semana) values (2, 'Terça');
insert into dia_semana (id_dia_semana, dia_semana) values (3, 'Quarta');
insert into dia_semana (id_dia_semana, dia_semana) values (4, 'Quinta');
insert into dia_semana (id_dia_semana, dia_semana) values (5, 'Sexta');
insert into dia_semana (id_dia_semana, dia_semana) values (6, 'Sábado');

insert into previsao (id, id_dia_semana, data_hora, longitude, latitude, minima, maxima, umidade, descricao) values (1, 1, '25/03/2019 - 20:00', '-23,5344', '-46,4515', 19.7 , 23.9, 24, 'Chuva moderada');
insert into previsao (id, id_dia_semana, data_hora, longitude, latitude, minima, maxima, umidade, descricao) values (2, 2, '26/03/2019 - 20:00', '-23,5344', '-46,4515',19.4, 24.2 , 55, 'Chuva moderada');
insert into previsao (id, id_dia_semana, data_hora, longitude, latitude, minima, maxima, umidade, descricao) values (3, 3, '27/03/2019 - 20:00', '-23,5344', '-46,4515',19.2, 26, 36, 'Chuva fraca');
insert into previsao (id, id_dia_semana, data_hora, longitude, latitude, minima, maxima, umidade, descricao) values (4, 4, '28/03/2019 - 20:00', '-23,5344', '-46,4515',16.4, 19.1, 100, 'Chuva intensa');
insert into previsao (id, id_dia_semana, data_hora, longitude, latitude, minima, maxima, umidade, descricao) values (5, 5, '29/03/2019 - 20:00', '-23,5344', '-46,4515',26.2, 21, 56, 'Chuva intensa');
insert into previsao (id, id_dia_semana, data_hora, longitude, latitude, minima, maxima, umidade, descricao) values (6, 6, '30/03/2019 - 20:00', '-23,5344', '-46,4515',20.8, 30.6, 32, 'Chuva moderada');



insert into usuario (id, login, senha) values (1, 'admin', 'admin')
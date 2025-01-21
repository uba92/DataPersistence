CREATE TABLE evento (
	id SERIAL PRIMARY KEY,
	titolo VARCHAR(50) NOT NULL,
	data_evento DATE,
	tipo_evento VARCHAR(10),
	CHECK (tipo_evento IN ('PUBBLICO', 'PRIVATO')),
	numero_massimo_partecipanti INTEGER
);
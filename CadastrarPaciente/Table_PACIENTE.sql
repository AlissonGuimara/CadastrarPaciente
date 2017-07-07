CREATE	TABLE				CIDADES
	(
	cidade				varchar(50)
					NOT NULL
					,
	estado				varchar(2)
					NOT NULL
					,
	pais				varchar(20)
					NOT NULL
					,
					CONSTRAINT cidades_pk
						PRIMARY KEY(cidade, estado, pais)
	)
;

CREATE	TABLE				PESSOA
	(
	codigo				varchar(10)
					NOT NULL
					,
	nome				varchar(100)
					NOT NULL
					,
	cpf				varchar(20)
					NOT NULL
					,
	idade				varchar(3)
					NOT NULL
					,
	nomeMae				varchar(100)
					,
	nomePai				varchar(100)
					,
	sexo				varchar(20)
					,
					CONSTRAINT pessoa_pk
						PRIMARY KEY (codigo)
					
	)
;

CREATE	TABLE				LOCALIZACAO
	(
	codigo				varchar(10)
					NOT NULL
					,
	bairro				varchar(50)
					NOT NULL
					,
	cidade				varchar(50)
					NOT NULL
					,
	estado				varchar(3)
					NOT NULL
					,
	pais				varchar(20)
					NOT NULL
					,
	email				varchar(20)
					,
	telefone			varchar(20)
					,
					CONSTRAINT localizacao_f1
						FOREIGN KEY(codigo)
							REFERENCES PESSOA(codigo)
					
	)
;

CREATE	TABLE				FICHA
	(
	codigo				varchar(10)
					NOT NULL
					,
	regSus				varchar(20)
					NOT NULL
					,
	nomeDoenca			varchar(50)
					NOT NULL
					,
	tipoSangue			varchar(10)
					NOT NULL
					,
	altura				varchar(20)
					NOT NULL
					,
	peso				varchar(20)
					NOT NULL
					,
					CONSTRAINT ficha_f1
						FOREIGN KEY(codigo)
							REFERENCES PESSOA(codigo)
	)
;
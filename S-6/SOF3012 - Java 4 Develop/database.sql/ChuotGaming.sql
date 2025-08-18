USE SD20205

GO
CREATE TABLE chuot_gaming (
	id INT IDENTITY(1,1) PRIMARY KEY,
	ten NVARCHAR(50),
	mat_doc NVARCHAR(50),
	gia FLOAT
)
GO

INSERT INTO chuot_gaming
VALUES
	('fuhlen', 'fuhlen md', 123.4),
	('fuhlen1', 'fuhlen asd', 323.3),
	('fuhlen2', 'fuhlen ubx', 923.9);
GO
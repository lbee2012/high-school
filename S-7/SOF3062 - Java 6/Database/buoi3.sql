CREATE DATABASE SOF3062;
GO
USE SOF3062;
GO

CREATE TABLE Users(
	Username VARCHAR(50) NOT NULL,
	Password VARCHAR(50) NOT NULL,
	Enabled BIT NOT NULL,
	PRIMARY KEY (Username)
)

CREATE TABLE Authorities(
	Id BIGINT NOT NULL identity(1,1),
	Username VARCHAR(50) NOT NULL,
	Authority VARCHAR(50) NOT NULL,
	PRIMARY KEY (Id),
	UNIQUE(Username, Authority),
	FOREIGN KEY (Username) REFERENCES Users(Username)
	ON DELETE CASCADE ON UPDATE CASCADE
)

INSERT INTO Users(Username,Password,Enabled) VALUES('user@gmail.com','{noop}123',1)
INSERT INTO Users(Username,Password,Enabled) VALUES('admin@gmail.com','{noop}123',1)
INSERT INTO Users(Username,Password,Enabled) VALUES('both@gmail.com','{noop}123',1)

INSERT INTO Authorities(Username,Authority) VALUES('user@gmail.com','ROLE_USER')
INSERT INTO Authorities(Username,Authority) VALUES('admin@gmail.com','ROLE_ADMIN')
INSERT INTO Authorities(Username,Authority) VALUES('both@gmail.com','ROLE_USER')
INSERT INTO Authorities(Username,Authority) VALUES('both@gmail.com','ROLE_ADMIN')

GO
SELECT * FROM Users
SELECT * FROM Authorities
USE bbatmzfqkyi5r7qydwon;

CREATE TABLE Ninja(
	id_ninja INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    rango VARCHAR(255),
    aldea VARCHAR(255)
);

CREATE TABLE Mision(
	id_mision INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(255),
    rango VARCHAR(255),
    recompensa VARCHAR(255)
);
CREATE TABLE Mision_Ninja(
	id_mision_ninja INT AUTO_INCREMENT PRIMARY KEY,
    id_ninja INT,
    id_mision INT,
    fecha_inicio VARCHAR(255),
    fecha_fin VARCHAR(255),
	FOREIGN KEY(id_ninja) REFERENCES Ninja(id_ninja),
    FOREIGN KEY(id_mision) REFERENCES Mision(id_mision)
);

CREATE TABLE Asignacion_mision(
	id_asignacion INT AUTO_INCREMENT PRIMARY KEY,
    id_ninja INT,
    id_mision INT,
    fecha_inicio VARCHAR(255),
    FOREIGN KEY(id_ninja) REFERENCES Ninja(id_ninja),
    FOREIGN KEY(id_mision) REFERENCES Mision(id_mision)
);

CREATE TABLE Habilidad(
	id_habilidad INT AUTO_INCREMENT PRIMARY KEY,
    id_ninja INT,
    nombre VARCHAR(255),
    descripcion VARCHAR(255),
    FOREIGN KEY(id_ninja) REFERENCES Ninja(id_ninja)
);
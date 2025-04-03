
INSERT INTO Ninja(nombre, rango, aldea) VALUES 
('Calamardo', 'alto', 'Aldea Oro'),
('Rick', 'medio', 'Aldea Plata'),
('Arenita', 'bajo', 'Aldea Bronce');

INSERT INTO Mision(descripcion, rango, recompensa) VALUES
('Rescatar al gatito','Medio','Dia libre'),
('Apagar incendio', 'alto', 'Bono');

INSERT INTO Mision_Ninja (id_ninja, id_mision, fecha_inicio, fecha_fin ) VALUES
(1,2,'2025-04.01','2025-04-03');

INSERT INTO Habilidad ( id_ninja, nombre,descripcion ) VALUES
(1, 'volar', 'Su capacidad de llegar a los lugares de forma rapida y eficaz'),
(2, 'Agua', 'Su capacidad de generar agua en un instante'),
(3, 'Super fuerza', 'Su capacidad de alzar cosas muy pesada con facilidad');

SELECT n.nombre as nombre_Ninja, h.nombre as Habilidad from Ninja n 
        join Habilidad h on h.id_habilidad = n.id_ninja;
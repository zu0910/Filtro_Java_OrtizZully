# Filtro_Java_OrtizZully

## Sistema de Gestión de la Aldea de Konoha

Este proyecto implementa un sistema de gestión para la aldea ninja de Konoha, utilizando el patrón **MVC (Modelo-Vista-Controlador)**. Permite gestionar ninjas, misiones, habilidades, y asignaciones de misiones a través de una interfaz de consola. La aplicación se conecta a una base de datos MySQL para almacenar y recuperar datos. 

## Descripción 

El sistema permire realizar las siguiente operaciones: 
  - Listar todos los ninjas junto con sus habilidades.
  - Mostrar las misiones disponibles para un ninja.
  - Mostrar las misiones completadas para un ninja.
  - Asignar una misión a un ninja.
  - Mostrar todas la misiones completadas.
  - Mostrar todas las misiones completadas.

La aplicacion está diseñada con el patrón MVC:

  - **Modelo**: Maneja los datos y la logica.
  - **Vista**: Gestions la interfaz del usuario.
  - **Controlador**: Coordina la interaccion entre el modelo y la vista.

## Uso:

Al ejecutar el programa, se mostrara un menu en consola con las siguientes opciones:

        ------------ ALDEA KANOHA -----------------------
        1). Listar todos los  Ninjas con su habilidad
        2). Mostrar las misiones diponibles de un ninja.
        3). Mostrar misiones completadas para un ninja.
        4). Asignar mision a un ninja.
        5). Marcar una mision completada.
        6). Mostrar todas la misiones completadas
        7). Salir
        Seleccione una de las opciones del menu: 

  - opcion1: Muestra todos los ninjas con sus habilidades.
  - Opcion 2: Pide el ID de un ninja y muestra las misiones disponibles.
  - Opcion 3: Pide el ID de un ninja y muestra las misiones completas con la fecha fin.
  - Opcion 4: Permite asignar una mision a un ninja, solicitadondo el ID del ninja, el ID de la mision y la fecha de inicio
  - Opcion 5: Marca una mision completada, solicitando el ID del ninja y el  ID de la mision.
  - Opcion 6: Muestra todas las misiones completadas en el sistema
  - Opcion 7: Sale del programa.

## Estructura del proyecto:
![image](https://github.com/user-attachments/assets/db2e92f5-5838-4d9e-85ba-17843efb17ed)

## Diagrama de clase:

![image](https://github.com/user-attachments/assets/abfb9067-0a5e-4b84-8dc5-bd74a6aa72fe)

## Tecnologías Utilizadas

<image src="https://img.shields.io/badge/MySQL-1572B6?style=for-the-badge&logo=mysql&logoColor=white">
<image src="https://img.shields.io/badge/Java-323330?style=for-the-badge&logo=java&logoColor=F7DF1E">


## Creditos

Elaborado por Zully Fernanda Ortiz Avendaño Cc. 1092528097

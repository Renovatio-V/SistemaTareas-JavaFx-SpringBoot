# Sistema de Empleados con JSPs y Spring Boot

## Arquitectura del Sistema

El sistema de empleados está diseñado utilizando una arquitectura en capas que incluye las siguientes componentes:

1. **Entidad**: Define las entidades del sistema.
2. **Repositorio**: Interactúa con la base de datos.
3. **Capa de Servicio**: Contiene la lógica del negocio.
4. **Capa de Presentación**: Interfaz de usuario implementada con JavaFX.

## Presentación

- **Tecnología**: JavaFX
- **Versión**: javafx-sdk-22.0.1

## Servicio

- **Framework**: Spring

## Repositorio

- **Tecnología**: Spring Data

## Base de Datos

- **Sistema de Gestión**: MySQL
- **Nombre de la Base de Datos**: tareas_db

## Detalles del Proyecto

- **Tipo de Proyecto con Spring**: Maven
- **Lenguaje**: Java, versión 22
- **Spring Boot versión**: 3.3.1
- **Packaging**: jar

## Dependencias

- **Spring Data JPA**
- **MySQL**
- **Lombok**

## Configuración de Conexión a MySQL

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tareas_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=admin
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.main.web-application-type=none

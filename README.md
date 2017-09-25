# Tutorial-Desarrollo-web-con-Spring-4.3
### Tutorial comprado en Udemy - Desarrollo web con Spring 4.3 (2017) de Cero a Ninja.
### En este turorial se aprenden las bases de la arquitectura de Spring MVC, consultar la documentación oficial y a utilizar algunos de sus modulos entre otros.

  ******************************************************************************************************************************
- Crear proyecto Maven.

- Arquitectura Spring MVC:
```
- Cliente (Bootstrap 4.0 + thymeleaf)

- Servidor(Spring MVC : Controller - Service - Repository) 

    a) Controller: 
              - Comunicación con el cliente mediante peticiones http(get y/o post).
              - Transformación de Datos a Modelos.
              - LLamado a Servicios.
    b) Service:         
              - Manejo de la lógica de la aplicación.
              - Transformación de Entities a Modelos o Modelos a Entities mediante Class llamadas Converters.
              - Llamado a Repositorios JPA.
    c) Repositorios:
              - Uso de JPA en Repository para hacer concultas a la BD.
              - Utilización de Entities para el funcionamiento de JPA.
  ```        
  - Hibernate:
  ```
    - Creación de @Entities , @Tables, @Column, relaciones @ManyToOne, @OneToMany, etc.
    - Uso de BD Mysql + Hibernate.
  ```
  - Utilización de Spring Boots para configuración de la aplicación (uso de formato application.yml).
  - Utilización de Spring security para mejorar la autentificación y navegación con restricciones de la aplicación.
  - Utilización de Spring Rest para manejar datos en la parte Front mediante Json.
  ******************************************************************************************************************************
  
### Funcionalidades creadas:
  - Login con validación de usuario.
  - Login y Logout.
  - Formularios con CRUD agregar, Listar, Modificar, Eliminar.
  - Mostrar mensaje en formato Json para comprobar funcionalidad de Spring Rest.
              
### BY MATIAS SOTOMAYOR R.

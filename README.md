# Lab4_Reflexion
En este repositorio se muestra la ejecucion y comportamiento de un framework IoC creado para la ejecucion de aplicacion apartir de POJOS
## Para correr el proyecto
Para correr el proyecto nos ubicamos en el directorio SparkD y ponemos la siguiente linea
  ```
  java -cp target/classes co.edu.escuelaing.sparkd.httpserver.MicroSpringBoot co.edu.escuelaing.sparkd.httpserver.HelloController
  ```
 ## Ejecucion
 Las siguientes imagenes muestran el comportamiento de diferentes peticiones al servidor
 * Para cosultar la pagina que contiene el valor de PI realizamos la siguiente peticion http://localhost:36000/Apps/pi
 ![PI](/imagenes/PI.png)
 * Para cosultar la pagina que contiene el valor de E realizamos la siguiente peticion http://localhost:36000/Apps/E
 ![Euler](/imagenes/Euler.png)
 * Para cosultar la pagina que devuelve un saludo sacado de uno de los tutoriales de Sprong realizamos la siguiente peticion http://localhost:36000/Apps/hello
 ![hello](/imagenes/hello.png)
 
 ## Construido con
* [Maven](https://maven.apache.org/) : Herramienta encargada de la construcción del proyecto y el manejo de dependencias
* [Git](https://git-scm.com/) : Sistema de control de versiones.

# Supra Software Engineering

## Herramientas utilizadas

- **Github:** Utilizado para compartir código entre los empleados para trabajar en paralelo en elementos del product backlog. Fue necesario la creación de varias ramas para poder dividir bien la implementación.
- **GitHub Desktop:** Utilizada conjuntamente con GitHUb la hemos usado para poder facilitar tanto la creación y unión de ramas como la realización de *commits*
- **Hibernate:** Utilizado en persistencia para guardar objetos en la base de datos utilizando la clase *AbstractEntityDAO*.
- **Maven:** Utilizado para controlar la configuración del proyecto y no tener problemas de versiones de software o de librerías entre los empleados.
- **Eclipse:** El entorno de desarrollo elegido para la implementación del código, principalmente para facilitar la implementación de la capa de presentación gracias a la extensión *WindowBuilder* y el tratado de datos de   la base de datos con la extensión *DBeaver*.
- **DerbyDB:** La base de datos elegida para este proyecto es la proporcionada por Apache ya que esta tiene una versión embebida que es perfecta para los requisitos del tratado de datos del proyecto.
- **Sonar:** Sonar se trata de una herramienta de análisis estático de código que hemos utilizado para poder observar varias características de nuestro código tales como los bugs, vulnerabilidades, *code Smells*, covertura y código duplicado.
- **JUnit:** Herramienta utilizada para poder realizar los distintintos test del código para asegurar la consistencia y la funcionalidad del código implementado.
- **Jacoco:** Jacoco se tratra de un plugin utilizado en Java para poder evaluar la covertura de los test realizados por la herramienta JUnit.
- **Miro:** Miro se trata de una aplicación web que hemos utilizado para la representación gráfica de los distintos sprints.

## Problemas

 - **Sonar:** Cuando comenzamos a utilizar esta herramienta, nos encontramos con la problemática de que únicamente nos analizaba la rama *main* la cual solo recibe actualizaciones cuando el código ya ha sido terminado y analizado, por lo que cambiamos esa configuración para que nos funcionase correctamente y así poder analizar nuestro código correctamente antes de poder sacarlo a producción.
 - **JUnit:** En el momento de realizar los test a uno de nuestros compañeros se le realizaban test de métodos no existentes y que portanto daban errores.
 - **Jacoco:** Uno de los problemas que mas quebraderos de cabeza nos han ocasionado ha sido con respecto a Jacoco ya que en el momento de realizar el análisis no era generado el .exec necesario para poder ver nuestra covertura en SonarCloud.
- **Maven:** Hemos tenido problemas de compatibilidad con maven dado que entre distintos compañeros nos encontrabamos con versiones distintas y por tanto alguno de ellos no podía realizar MavenBuild


 ## Mantenimiento
 
 Para la gestión del mantenimiento de nuestro programa hemos utilizado esencialmente SonarCloud donde observábamos un análisis detallado de lo que contenía nuestro código.  
 El primer análisis realizado el día  nos muestra lo siguiente:     
 
![](Memoria/Imagenes/PrimerAnalisis.png)


 Uno de los mayores  problemas que pudimos observar era la gran cantidad de código duplicado que ascendía hasta el 39.8% y que supone un problema con respecto a la calidad de nuestro código, según SonarCloud el código duplicado idóneo no debería superar el 3% de todo el código.

Tras una exhaustiva investigación encontramos el origen de todo este código duplicado se encontraba en la capa de presentación, dado que todas las pantallas que utilizabamos eran prácticamente iguales. Para reducir el código duplicado  principalmente en declaraciones de variables comunes en todas las pantallas implementamos la clase *PantallaPadre* en la que englobamos muchas de estas variables para que el resto de clases pudiesen heredar de esta y así reducir el problema del código duplicado.

-------------Insertar Gráfica Código Duplicado----------------------------

Otro de los problemas encontrados es la gran cantidad de *CodeSemlls* encontrados que al inicio ascendían hasta la cantidad de: 648.  

----------------Decir cantidad final de code smells-------------------

También teníamos 2 Vulnerabilidades y 23 bugs que finalmente pudimos solucionar y tener 0 vulnerabilidades y 0 bugs y además para mejorar el análisis de sonar en nuestro programa editamos algunas de las reglas establecidas.

Para mejorar la covertura de nuestro programa comenzamos a realizar distintos test en los gestores como GestorLogin en el que conseguimos una covertura del 90% tras implementar test en los métodos utilizados en estos gestores.

**Definición de los test realizados:**

- **Tablas de GestorLoginTest**


    ------Inserta tabla GestorLoginTest--

- **Tabla de GestorPropuestaCurso**
    - **Tabla realizarPropuesta**

    - **Tabla de ObtenerCurso**

    - **Tabla de ObtenerCursosDenegados**

    - **Tabla de ObtenerCentros**

    - **Tabla de ObtenerSecretarios**

    - **Tabla de ObtenerProfesor**

    - **Tabla de ObtenerCentro**

    - **Tabla de EvaluarPropuesta**




## **BACKLOG DEL SPRINT 3**

- **Características del sprint:**

Duración: 2 semanas (10/11/22 - 24/11/22). Estimación de tiempo de trabajo: 16 horas.

Usaremos este sprint para acabar el código restante de la funcionalidad mínima y comenzar con el uso de SonarCloud para analizar el proyecto.  

Al acabarlo, será planteada una corta reunión retrospectiva sobre el sprint para analizar nuestro desempeño y efectividad a la hora de cumplir los objetivos en el plazo acordado. Con esto podremos preparar mejor el backlog del sprint 4.

- **Objetivos del Sprint:**
  - Seguir y llevar al día las clases de laboratorio.
  - Configurar Sonar.
  - Primeros análisis del proyecto con Sonar.
  - Observar y analizar los resultados del análisis de Sonar.
  - Revisión de los CdU de los Sprints 1 y 2.
  - CdU8: Login.
  - CdU9: Informes para evaluar propuesta.
  - Buscar soluciones alternativas a los problemas encontrados en Sonar.

**Notas:**

Este sprint comienza con el trabajo de una nueva herramienta, por lo que puede que parte del trabajo (como la búsqueda de alternativas a los problemas encontrados en Sonar) se arrastre hacia próximos Sprints.


## **BACKLOG DEL SPRINT 4**

- **Características del sprint:**

Duración: 2 semanas (24/11/22 - 8/12/22). Estimación de tiempo de trabajo: 15 horas.

Usaremos este sprint para instalar el entorno de desarrollo de pruebas y comenzar con los tests. También nos encargaremos de reducir los CodeSmells, bugs y código duplicado.  

Al acabarlo, será planteada una corta reunión retrospectiva sobre el sprint para analizar nuestro desempeño y efectividad a la hora de cumplir los objetivos en el plazo acordado. Con esto podremos preparar mejor el backlog del sprint 5.

- **Objetivos del Sprint:**
  - Instalación del entorno de pruebas.
  - Solucionar problemas relacionados con Sonar y POM.
  - Reducir código duplicado.
  - Reducción CodeSmells y bugs de controladores.
  - Reducción CodeSmells y bugs de entidades.
  - Reducción CodeSmells y bugs de persistencia.
  - Reducción CodeSmells y bugs de presentación.
  - Unión de pantallas ConsultarCurso.
**Notas:**

En este sprint, nos dedicaremos a corregir los problemas detectados con SonarCloud e instalaremos el enterno de pruebas para comenzar con los test en el proyecto.


## **BACKLOG DEL SPRINT 5**

- **Características del sprint:**

Duración: 2 semanas (8/12/22 - 22/12/22). Estimación de tiempo de trabajo: 17 horas.

En este sprint acabaremos los test del código junto con sus tablas. Tras acabar el periodo de reducción de CodeSmells, bugs y código reducido, haremos una revisión final de los informes de SonarCloud y terminaremos con un resumen del estado del sistema tras la ejecución del plan basado en el análisis de Sonar. Por último terminaremos con un análisis de la mejora de calidad del proyecto.

Para finalizar el sprint, redactaremos la memoria de la entrega final y haremos las comprobaciones finales del proyecto a entregar.

Siendo este el último Sprint, cualquier problema que haya sido arrastrado de otros sprints o encontremos en el sprint actual terdrá que ser resuelto sin excepción. Esto podría significar un aumento de la carga de trabajo.

- **Objetivos del Sprint:**
  - Definición del plan de mantenimiento.
  - Tests del código y tablas de los tests.
  - Reducción final de CodeSmells y bugs.
  - Revisión final de los informes generados por las herramientas (SonarCloud).
  - Revisión y resumen final del estado del sistema, tras la ejecución del plan basado en el  análisis de SonarCloud.
  - Análisis de la mejora de calidad.
  - Memoria de la entrega final.
  - Comprobaciones finales del proyecto a entregar.
**Notas:**

En este sprint nos centraremos en mantenimiento y analizar los informes de Sonar y el resumen final del estado del sistema.









Supra Software Engineering

**HERRAMIENTAS UTILIZADAS:**

- **Github:** Utilizado para compartir código entre los empleados para trabajar en paralelo en elementos del product backlog. Fue necesario la creación de varias ramas para poder dividir bien la implementación.
- **Hibernate:** Utilizado en persistencia para guardar objetos en la base de datos utilizando la clase *AbstractEntityDAO*.
- **Maven:** Utilizado para controlar la configuración del proyecto y no tener problemas de versiones de software o de librerías entre los empleados.
- **Eclipse:** El entorno de desarrollo elegido para la implementación del código, principalmente para facilitar la implementación de la capa de presentación gracias a la extensión *WindowBuilder* y el tratado de datos de la base de datos con la extensión *DBeaver*.
- **DerbyDB:** La base de datos elegida para este proyecto es la proporcionada por Apache ya que esta tiene una versión embebida que es perfecta para los requisitos del tratado de datos del proyecto.

**PROBLEMAS:**

- **GitHub:** El primer problema que hemos encontrado utilizando esta herramienta fue al momento de realizar los commits dado que únicamente se subían los archivos .class y no los .java. El siguiente de los problemas fue en relación a la utilización de las ramas dado que desde Eclipse no se conseguía hacer el Checkout entre las distintas ramas y además al unir ramas nos aparecían diferentes conflictos que tuvimos que solucionar.
- **Hibernate:** Errores con la configuración de la herramienta y creación de la relación de herencia entre las clases de *Profesor*, *ProfesorUCLM* y *ProfesorExterno*.
- **Eclipse:** Errores de compatibilidad entre versiones, por lo que hubo que reinstalar la herramienta y descargar la última versión de la misma, notificando a todos los integrantes para que todos posean la misma versión.
- **DerbyDB:** Problemas al crear la base de datos dado que no permite editar las tablas ya creadas en la base de datos, además los errores que te indica la base de datos no son errores concluyentes.

![](Aspose.Words.24f99581-abfd-432a-b779-25c7fd131716.001.jpeg)

**BACKLOG DEL SPRINT 2****

- **Características del sprint:**

Duración: 2 semanas (28/09/22 - 17/10/22). Estimación de tiempo de trabajo: 12 horas.

Tomaremos este sprint como una prueba para los próximos sprints, así aprenderemos a estimar mejor la carga de trabajo por objetivo y la cantidad de objetivos que somos capaces de cumplir.

Al acabarlo, será planteada una corta reunión retrospectiva sobre el sprint para analizar nuestro desempeño y efectividad a la hora de cumplir los objetivos en el plazo acordado. Con esto podremos preparar mejor el backlog del sprint 2.

- **Objetivos del Sprint:**
  - Seguir y llevar al día las clases de laboratorio.
  - Crear proyecto Maven.
  - Configurar y crear repositorio git.
  - Generar el esqueleto del código.
  - Crear y configurar la base de datos.
  - Comenzar con los casos de uso (realizar propuestas de curso, editar propuestas de curso, visualizar propuesta de curso). El número de casos que realicemos en este sprint podrá cambiar si vemos imposible realizarlos todos en este periodo de tiempo.
  - Plantear si es necesaria una revisión del sprint con el cliente.

**Notas:**

Este sprint puede que tenga estimaciones de tiempo y carga de trabajo por sprint incorrecto o inapropiado, en los próximos sprints backlogs, deberemos tener en cuenta lo aprendido en este sprint para mejorar la planificación.

![](Aspose.Words.24f99581-abfd-432a-b779-25c7fd131716.002.jpeg)

- **Características del sprint:**

Duración: 2 semanas (19/10/22- 1/11/22). Estimación de tiempo de trabajo: 13 horas.

En este sprint revisaremos y finalizaremos casos de uso comenzados en el sprint 1 además de finalizar nuevos casos de uso.

Al acabarlo, plantearemos una corta reunión retrospectiva sobre el sprint para analizar nuestro desempeño y efectividad a la hora de cumplir los objetivos en el plazo acordado. Con esto podremos preparar mejor futuros backlogs de los próximos sprints.

- **Objetivos del Sprint:**
  - Revisar y finalizar el CdU1.
  - Revisar y finalizar el CdU2.
  - Revisar y finalizar el CdU3.
  - CdU4: Realizar Consulta de Cursos.
  - CdU5: Consultar Ingresos.
  - CdU6: Consultar Cursos Aprobados/Rechazados y el resto de estados.
  - CdU7: Consultar Ingresos.
  - CdU8: Consultar listado de ediciones.
  - Revisión de los CdU realizados en busca de errores.
  - Comprobaciones finales para la entrega intermedia.

**Notas:**

Este sprint está centrado en generar código y realizar los casos de uso necesario para él proyecto. Con esta entrega estamos proporcionando un prototipo, en busca de feedback del cliente para realizar cambios y mejoras.

![](Aspose.Words.24f99581-abfd-432a-b779-25c7fd131716.003.jpeg)


**PLAN DE GESTIÓN DE CONFIGURACIÓN: Propósito del plan:**

Para cumplir con los requisitos del cliente, seguiremos la metodología Scrum (una metodología de desarrollo ágil), lo que implica que estimaremos y planificaremos de forma predecible las tareas necesarias para crear el sistema. Adaptaremos esta metodología a nuestro proyecto y nuestra organización.

Celebraremos una serie de reuniones de coordinación a lo largo del proyecto para mantener el trabajo actualizado y al día. En esas reuniones identificaremos tareas, revisaremos el trabajo ya realizado en busca de posibles mejoras, ya sea al producto o a la organización del equipo y prepararemos una serie de sprints.

Usaremos los sprints para que nuestro equipo de desarrollo trabaje y se auto organice sobre ellos. Para completar el proceso, el equipo usará herramientas como Github, Eclipse, Maven y DerbyDB (se añadirán más herramientas a lo largo de la práctica).

El equipo deberá preparar una entrega para antes del 3/11/2022, en esa fecha se le mostrará al cliente un prototipo del sistema al cliente. Dado el feedback del cliente, el equipo tendrá hasta el 22/12/2022 para finalizar el producto y corregir o cambiar aspectos que el cliente señale sobre el prototipo.

**Alcance:**

Crearemos un sistema informático para la gestión de las enseñanzas propias de la UCLM.

Este sistema deberá tener funcionalidades para que los distintos usuarios y roles puedan iniciar sesión. Dependiendo de cada rol, los usuarios tendrán acceso a distintas funcionalidades.

El director de curso podrá realizar, editar y consultar propuestas de curso.

El personal de vicerrectorado podrá evaluar propuestas de curso y completar informes de subsanaciones sobre estas.

El jefe de gabinete de vicerrectorado podrá realizar consultas sobre los cursos, entre ellas: consultar los ingresos de los distintos tipos de cursos, consultar los cursos aprobados, rechazados y el resto de los estados posibles y consultar un listado de ediciones de los cursos.

**Relación con la organización y otros proyectos:**

La organización será basada en los principios de Scrum, realizando reuniones y creando sprints para facilitar el trabajo del equipo.

Durante el proyecto el equipo de desarrollo se encargará de seguir ciertos aspectos de los ciclos de vida, como la definición (análisis de requisitos del sistema y planificación del proyecto software), el desarrollo (diseño del software, generación del código y pruebas sobre este) y despliegue y mantenimiento del software (donde el equipo se encargará de la corrección, adaptación y mejor del producto).

**Limitaciones y suposiciones que afectan al plan:**

Puede haber problemas de tiempo debido a que el equipo de desarrollo se encuentra realizando otros proyectos al mismo tiempo que este. También puede que haya cambios en el calendario debido a posibles errores menores que deban ser corregidos en hotfixes. Todo esto puede suponer que haya cambios en el plan y se deban realizar alteraciones para cumplir con los objetivos propuestos a tiempo.

**Responsabilidades y autoridades del Plan:**

- SCRUM MASTER:
- Mario Rodrliguez Serrano
- Representa la gestión del proyecto
- Responsable de mantener y asegurar los valores de Scrum y sus prácticas
- Es un facilitador
- Asegura que el equipo permanece totalmente funcional y productivo
- Habilita la cooperación y comunicación entre los roles y las funcionalidades
- Blinda al equipo de influencias externas
- EQUIPO DE DESARROLLO:
- Jonathan Jerónimo Parro
- Fernando Lorente Calvo
- Gonzalo Moreno Bielsa
- Mario Rodrliguez Serrano

**Organización del proyecto:**

Tendremos un equipo de desarrollo que se encargará de completar las funcionalidades y solucionar posibles errores. Este equipo será autogestionado y multifuncional.

El Gestor del proyecto deberá asegurar que se siga la estructura y planificación acordada, además de encargarse de que los equipos permanezcan totalmente funcionales y productivos.

Todos estos roles deberán cooperar y comunicarse entre sí, para asegurar el correcto desarrollo del proyecto. El Gestor del proyecto deberá asegurar que se cumplan estos valores.

**Responsabilidades del CM:**

Implementar, monitorizar, controlar y mejorar los servicios del CM. Determinar el estado de las actividades del CM para que estas y las tareas realizadas se lleven a cabo de acuerdo a los planes y que satisfagan objetivos técnicos.

Recopilar información sobre la configuración para identificar la desviación y variación de otros proyectos del CM. Redireccionar el proyecto para corregir estas variaciones puede incluir una re-planificación

**Políticas aplicables, directivas y procedimientos**

Seguiremos las políticas establecidas por Supra Software Engineering, que garantizarán el correcto trabajo sobre el proyecto, y que esto se realice de forma segura y sin correr riesgos innecesarios sobre la inversión del cliente o que afecte a la planificación o calendario del proyecto.

**Actividades planificadas, agenda y recursos**

- Agenda del CM: se describe en el tiempo las actividades que deberían ser realizadas.
- Recursos del CM: herramientas, técnicas, personal... Con los que cuenta el CM para la implementación de las actividades de configuración

**Mantenimiento del Plan de CM:**

Realizaremos una revisión del plan en cada fase del proyecto y en ciertos puntos del calendario que veamos apropiado o necesario, para realizar los cambios que veamos necesario. Estos cambios deben ser aprobados y distribuidos al equipo de trabajo. Además, el plan debe incluir un historial de los cambios realizados sobre el plan inicial.

El gestor de proyecto se encargará de monitorizar el plan, acordar la frecuencia en la que se deben dar las actualizaciones, evaluar y aprobar los cambios y comunicar estos cambios tanto al equipo de desarrollo como al cliente.

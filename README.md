# 01-Protección de aplicaciones con Spring Security

Creado: 14 de octubre de 2025 10:06
ítem principal: 01-INTRODUCCIÓN (https://www.notion.so/01-INTRODUCCI-N-28cf5b42f77080a7827ad8e792773abc?pvs=21)

## **¿Por qué es importante la seguridad en aplicaciones web modernas?**

La seguridad en aplicaciones web no solo es crucial, es esencial. Independientemente de lo sencilla que pueda parecer una aplicación, garantizar que solo los usuarios autorizados pueden acceder y modificar los recursos es vital. La seguridad no negociable asegura que la información personal y corporativa permanezca protegida, evitando potenciales vulnerabilidades y accesos no autorizados. Un ejemplo común es cuando un usuario quiere consultar sus propios datos, como en el caso de Alejandro queriendo revisar sus propios movimientos financieros. La aplicación debe validar tanto su identidad como sus privilegios. Sin estas medidas, los datos estarían en riesgo ante usuarios inadecuados que podrían intentar acceder a información a la que no tienen derecho.

## **¿Qué es el control de acceso roto (Broken Access Control)?**

El control de acceso roto es una de las principales vulnerabilidades que enfrentan las aplicaciones web modernas según el Top 10 elaborado por OWASP (Open Web Application Security Project). Esta vulnerabilidad ocurre cuando los sistemas fallan al restringir adecuadamente qué usuarios pueden acceder o interactuar con recursos restringidos. Imagina el escenario en el que Pedro, nuestro usuario de ejemplo, intenta acceder a los movimientos de Alejandro. A pesar de estar autenticado, Pedro carece de los privilegios necesarios. Por lo tanto, debería recibir un error 403, que indica que no tiene autorización, protegiendo así la información de Alejandro.

### **Detalles sobre el Top 10 de OWASP**

OWASP es una organización centrada en mejorar la seguridad del software. Su Top 10 es una lista de las vulnerabilidades más críticas que los desarrolladores deben tener en cuenta. La iteración más reciente, desde 2021, incluye una diversa gama de riesgos, como la falla en el control de acceso. Esta lista es una referencia indispensable para cualquier equipo de desarrollo preocupado por la seguridad. La página de OWASP ofrece detalles invaluables sobre cada vulnerabilidad, guías para su prevención y ejemplos de escenarios de ataques.

https://owasp.org/www-project-top-ten/#

## **¿Cómo nos ayuda Spring Security a prevenir vulnerabilidades?**

Spring Security es una herramienta poderosa que proporciona un enfoque intuitivo para integrar medidas de seguridad en aplicaciones construidas con este popular framework. A lo largo del curso, aprenderás a aplicar Spring Security para reforzar la protección contra vulnerabilidades comunes, como el control de acceso roto. Esta tecnología no solo simplifica el proceso, sino que también te orienta con pasos concretos y prácticos para hacer tus aplicaciones más robustas y menos propensas a ataques maliciosos.

Este curso está diseñado para desarrolladores que ya tienen experiencia previa en Spring y desean expandir sus habilidades en el ámbito de la seguridad. Alejandro Ramírez, líder técnico con una vasta experiencia, te guiará paso a paso, asegurándose de que domines cada aspecto crítico que protegerá tu aplicación. Prepárate para sumergirte en una experiencia educativa que no solo enriquecerá tus conocimientos técnicos, sino que también asegurará las bases de seguridad de tus futuras aplicaciones.



# 02-Configuración de Spring Security: Autorización y Autenticación

Creado: 14 de octubre de 2025 13:01
ítem principal: 01-INTRODUCCIÓN (https://www.notion.so/01-INTRODUCCI-N-28cf5b42f77080a7827ad8e792773abc?pvs=21)

## **¿Qué es Spring Security y cómo gestiona la seguridad en aplicaciones?**

Spring Security es un framework robusto y altamente configurable, **diseñado para manejar la autorización y autenticación** en aplicaciones basadas en Spring. Fundamentalmente, opera mediante una serie de ZBred Filters que cumplen funciones específicas dentro de la cadena de seguridad de una aplicación. El funcionamiento de Spring Security pivota alrededor de la cadena de filtros de seguridad, conocida como Spring Security Filter Chain, que administra toda la seguridad de la aplicación.

https://spring.io/projects/spring-security

https://docs.spring.io/spring-security/site/docs/3.0.x/reference/security-filter-chain.html

https://docs.spring.io/spring-security/reference/servlet/architecture.html#servlet-security-filters

## **¿Cómo funciona la Spring Security Filter Chain?**

Cuando se habilita la seguridad con Spring Security, este crea automáticamente un *bean* denominado Spring Security Filter Chain, el cual es esencial para gestionar la seguridad de la aplicación. Esta cadena de filtros intercepta y evalúa cada petición entrante para determinar si debe ser aceptada o rechazada por motivos de seguridad.

### **¿Cómo se procesan las peticiones?**

1. **Interceptación de la petición**: Toda solicitud que llega a la aplicación es interceptada inicialmente por la Spring Security Filter Chain.
2. **Proceso encadenado**: La cadena pasa la petición a través de sus filtros de forma secuencial, evaluando cada una con criterios de seguridad especificados.
3. **Decisión final**: Al final del proceso, la cadena de filtros decide si la solicitud se rechaza o se aprueba.
4. **Continuación del proceso normal**: Si se aprueba, la petición progresa hasta el *Dispatched Servlet*, que identifica el endpoint solicitado y decide qué controlador debe manejar la solicitud.

## **¿Qué papel juegan los filtros en la seguridad?**

Dentro de la Spring Security Filter Chain existen numerosos filtros, cada uno encargado de una tarea específica de seguridad. El orden en el que están dispuestos es crucial, ya que determina el flujo y las decisiones de seguridad tomadas.

### **Algunos filtros comunes**

Aunque no se profundiza en cada uno en este material, algunos de los más utilizados incluyen:

- **Filtro de autenticación**: Verifica las credenciales de los usuarios.
- **Filtro de autorización**: Maneja los permisos y roles de acceso.
- **Filtros de sesiones**: Controlan la gestión de sesiones y el tiempo de expiración.

La configuración determinará si un filtro está habilitado o no, y a lo largo del curso, se explorará cada uno de ellos con mayor detalle.

## **Consejos prácticos y recomendados**

- **Explora la documentación oficial**: Para comprender mejor cada filtro, consultar la documentación oficial de Spring Security es fundamental.
- **Configura los filtros según las necesidades**: No todos los filtros deben estar habilitados, ajusta la configuración para optimizar el rendimiento.
- **Prueba y valida tu configuración**: Siempre realiza pruebas exhaustivas de seguridad para garantizar que las configuraciones aplicadas realmente protegen tu aplicación.

Prepárate para adentrarte más en Spring Security y ver su aplicación práctica en configuraciones futuras. La exploración y el aprendizaje continuo son claves para dominar la seguridad en aplicaciones Spring.




# 03-Configuración de Spring Security en Proyectos Java con Gradle

Creado: 14 de octubre de 2025 22:53
ítem principal: 01-INTRODUCCIÓN (https://www.notion.so/01-INTRODUCCI-N-28cf5b42f77080a7827ad8e792773abc?pvs=21)

## **¿Cómo iniciar el proyecto de Spring Security?**

Spring Security es una herramienta poderosa para proteger tus aplicaciones basadas en Spring Framework, y antes de integrarla en tu proyecto, es esencial estar bien preparado. Primero, es importante trabajar en una aplicación existente, idealmente una construida en un curso previo de Spring Data JPA. Si no has tomado ese curso, se recomienda revisarlo o acceder al código fuente en un repositorio de GitHub vinculado en los recursos del curso.

### **¿Cómo configurar el entorno de desarrollo?**

1. **Clonar el proyecto existente**: Llámalo "Pizzeria app" y ábrelo con tu entorno de desarrollo integrado (IDE), como IntelliJ IDEA.
2. **Asegúrate de tener Java 17**: Verifica que el entorno de ejecución JDK esté configurado a Java 17 desde el menú de configuración de IntelliJ IDEA.

```
File > Settings > Build, Execution, and Deployment > Build Tools > Gradle

```

Posteriormente, cambia la versión a 17 y actualiza las configuraciones del módulo si es necesario.

1. **Verificar la arquitectura del proyecto**: El proyecto debe tener tres capas principales:
    - **Capa de persistencia**
    - **Capa de servicios**
    - **Capa web** (con controladores como `PizzaController` y `CustomerController`)

### **¿Cómo configurar Spring Security?**

**Agregar la dependencia de Spring Security**:

1. **Visita `start.spring.io`** y añade la dependencia de Spring Security.
2. **Copiar la implementación en Gradle**: En el archivo `build.gradle`, inserta la dependencia justo debajo de la del starter web.

```groovy
implementation 'org.springframework.boot:spring-boot-starter-security'

```

1. **Refrescar Gradle para instalar la dependencia**

### **¿Cómo verifica los cambios en la aplicación con Spring Security?**

Una vez que la aplicación se reinicie, utiliza Postman para enviar peticiones a la API. Al integrar Spring Security, todas las solicitudes serán automáticamente interceptadas por el `Spring Security Filter Chain`. Este cambio se reflejará en el resultado devuelto, el cual mostrará un error 401 si la petición no está autenticada correctamente.

### **Consejos y recomendaciones prácticas**

- **Revisar las configuraciones de base de datos**: Asegúrate de que las credenciales y el nombre de la base de datos en el archivo `application.properties` cumplan con tu configuración actual de MySQL.
- **Explorar la colección de Postman**: Utiliza la colección proporcionada en los recursos para hacer pruebas completas de todas las funcionalidades.
- **Entender los valores por defecto de Spring Security**: La implementación por defecto crea un usuario y contraseña, lo cual es fundamental considerar al manejar la autenticación.

Con esta preparación, estás listo para profundizar en la integración de Spring Security en tu aplicación. Sigue explorando y nunca dejes de aprender para mejorar tus proyectos.




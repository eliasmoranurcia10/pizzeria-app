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

Una vez que la aplicación se reinicie, utiliza Postman para enviar peticiones a la API. Al integrar Spring Security, todas las solicitudes serán automáticamente interceptadas por el  `Spring Security Filter Chain`. Este cambio se reflejará en el resultado devuelto, el cual mostrará un error 401 si la petición no está autenticada correctamente.

### **Consejos y recomendaciones prácticas**

- **Revisar las configuraciones de base de datos**: Asegúrate de que las credenciales y el nombre de la base de datos en el archivo `application.properties` cumplan con tu configuración actual de MySQL.
- **Explorar la colección de Postman**: Utiliza la colección proporcionada en los recursos para hacer pruebas completas de todas las funcionalidades.
- **Entender los valores por defecto de Spring Security**: La implementación por defecto crea un usuario y contraseña, lo cual es fundamental considerar al manejar la autenticación.

Con esta preparación, estás listo para profundizar en la integración de Spring Security en tu aplicación. Sigue explorando y nunca dejes de aprender para mejorar tus proyectos.



# 04-Autenticación Básica con Spring Security por Defecto

Creado: 15 de octubre de 2025 12:11
ítem principal: 01-INTRODUCCIÓN (https://www.notion.so/01-INTRODUCCI-N-28cf5b42f77080a7827ad8e792773abc?pvs=21)

## **¿Qué es Spring Security y cómo funciona su autenticación básica?**

Spring Security es una poderosa herramienta que agrega una capa de seguridad a nuestras aplicaciones, protegiéndolas contra accesos no autorizados. Al agregar la dependencia de Spring Security a tu proyecto, se habilita una configuración de seguridad por defecto. Esta configuración genera automáticamente un usuario y una contraseña genérica que puedes utilizar para acceder a los servicios de tu aplicación de forma segura durante el desarrollo.

### **¿Cómo se utiliza la autenticación básica con Spring Security?**

Por defecto, Spring Security utiliza Basic Authentication. Este tipo de autenticación requiere incluir en el encabezado de cada petición HTTP el término `BASIC`, seguido de un texto codificado en Base64 que combina el usuario y la contraseña separados por dos puntos. Te presentamos el paso a paso para entender el flujo de autenticación con Spring Security:

1. **Realización de una petición GET sin autorización**: Si realizas una petición GET a un recurso que requiere autenticación sin el encabezado adecuado, obtendrás una respuesta con estado 401, indicando falta de autorización.
2. **Incorporación del encabezado Authorization**: Si añades el encabezado Authorization con el formato `BASIC` y las credenciales correctas, recibirás una respuesta positiva con estado 200, proporcionando acceso al recurso deseado, como por ejemplo una lista de pizzas en este caso de estudio.

### **¿Cómo gestionar credenciales y debugging en Spring Security?**

Cada vez que inicias tu aplicación, Spring Security genera una nueva contraseña por defecto, facilitando el proceso de desarrollo gracias a su seguridad dinámica. Verás esta contraseña en tu consola; puedes copiarla para realizar tus pruebas de autenticación en herramientas como Postman:

```
Por defecto, el usuario es `USER` y la contraseña es la generada aleatoriamente que aparece en la consola.

```

Además, puedes mejorar el debugging de tu aplicación ajustando los niveles de logging para obtener información detallada sobre cómo maneja Spring Security las peticiones. Puedes hacerlo agregando la siguiente línea a tu configuración:

```
logging.level.org.springframework.security.web.*=DEBUG

```

### **¿Cómo protege tu aplicación el Spring Security filter chain?**

Spring Security incluye una cadena de filtros, conocida como `Spring Security filter chain`, que procesa cada petición de forma escalonada y en cascada. Estos filtros son los responsables de:

- Autenticar cada solicitud
- Autorizar el acceso a los recursos
- Proteger tu aplicación contra diferentes tipos de ataques y vulnerabilidades

Es esencial comprender cómo se configuran y funcionan estos filtros, ya que son la base de la seguridad en Spring.

Invierte tiempo explorando y experimentando con estas configuraciones. Esto te proporcionará una sólida base en seguridad para el desarrollo de aplicaciones con Spring. Y no olvides, conocer a fondo el funcionamiento de los sistemas de seguridad te otorgará confianza y competencia en tus proyectos futuros. ¡Sigue aprendiendo y mejorando tus habilidades!



# 05-Configuración de Seguridad con Spring Security y Basic Authentication

Creado: 15 de octubre de 2025 17:16
ítem principal: 01-INTRODUCCIÓN (https://www.notion.so/01-INTRODUCCI-N-28cf5b42f77080a7827ad8e792773abc?pvs=21)

## **¿Cómo podemos configurar un Security Filter Chain en Spring?**

Crear un Security Filter Chain en Spring nos permite manejar la seguridad de nuestras aplicaciones, definiendo cómo se autenticará y autorizará cada petición HTTP. Primero, debemos crear un paquete específico para la configuración de seguridad y una clase donde implementaremos los filtros necesarios.

### **¿Cómo creamos la configuración inicial de seguridad?**

1. **Crear un paquete nuevo**: Dentro de la capa web del proyecto, crea un paquete llamado `Config`.
2. **Anotar la clase con @Configuration**: Esto permite que Spring gestione e inyecte automáticamente este bean dentro de la aplicación.
3. **Definir el método Security Filter Chain**: Crea un método público que retorne un `SecurityFilterChain` y reciba un `HttpSecurity` como parámetro.

```java
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
			// ...
    }
}

```

### **¿Cómo permitimos o restringimos peticiones HTTP?**

Definir las reglas para autorizar peticiones es crucial para proteger una aplicación. Inicialmente, podemos permitir todas las peticiones, y posteriormente, aplicar seguridad ajustando estas configuraciones.

- **Permitir todas las peticiones**: Esto esencialmente elimina las capas de autenticación.

    ```java
    @Configuration
    public class SecurityConfig {
    
        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                    .authorizeHttpRequests( auth -> auth
                            .anyRequest().permitAll()
                    );
            return http.build();
        }
    }
    
    ```

- **Requerir autenticación básica para todas las peticiones**: Prioriza la seguridad solicitando autenticación en cada acceso.

    ```java
    @Configuration
    public class SecurityConfig {
    
        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                    .authorizeHttpRequests( auth -> auth
                            .anyRequest().authenticated()
                    )
                    .httpBasic(Customizer.withDefaults());
            return http.build();
        }
    }
    
    ```


### **¿Cómo validamos la configuración con Postman?**

Con la configuración inicial realizada, verifica el comportamiento utilizando herramientas como Postman:

1. **Probar sin autorización**: Elimina el encabezado de autorización y envía la petición. Si logras recibir una respuesta, significa que la seguridad está desactivada.
2. **Activar Basic Authentication**: Configura la autenticación básica con el usuario y contraseña generados por Spring. Observa que las peticiones ahora requieren credenciales válidas.

En el código, aseguramos que las peticiones usen autenticación básica y verificamos el funcionamiento del filtro correspondiente:

```java
@Configuration
    public class SecurityConfig {
    
        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                    .authorizeHttpRequests( auth -> auth
                            .anyRequest().authenticated()
                    )
                    .httpBasic(Customizer.withDefaults());
            return http.build();
        }
    }

```

Al lanzar la aplicación, el filtro `BasicAuthenticationFilter` gestionará las autenticaciones. Si el header de la autorización no está presente o es incorrecto, la petición será denegada.

### **¿Qué debemos tener en cuenta al implementar seguridad en Spring?**

- **Gestión de usuarios y contraseñas**: Usar `User` como el usuario por defecto puede ser seguro para desarrollo, pero en producción es crucial personalizar estas credenciales.
- **Desactivar filtros innecesarios**: Spring incluye múltiples filtros por defecto. Solo mantén los relevantes para tu caso y desactiva el resto explícitamente.
- **Revisar la documentación de Spring Security**: Spring es una herramienta poderosa, y conocer sus capacidades nos ayudará a adaptar más funcionalidades.

Este enfoque fortalece tu aplicación contra accesos no autorizados e intenta hacerlo accesible a usuarios válidos. Continúa explorando y ampliando tus habilidades en seguridad con Spring para dominar estos conceptos.



# 06-Funcionamiento del Basic Authentication Filter en Spring Security

Creado: 15 de octubre de 2025 23:34
ítem principal: 02-CONFIGURACIÓN DE  SEGURIDAD (https://www.notion.so/02-CONFIGURACI-N-DE-SEGURIDAD-28cf5b42f770805d83e6d201c527381a?pvs=21)

## **¿Cómo funciona el Basic Authentication Filter en Spring Security?**

El proceso de autenticación en Spring Security es una pieza fundamental para garantizar la seguridad de nuestras aplicaciones. Al delegar este proceso a un filtro en el Security Filter Chain, específicamente el Basic Authentication Filter, se asegura de que las credenciales del usuario sean correctas antes de otorgar acceso a recursos protegidos. Pero, ¿cómo funciona realmente este filtro?

### **¿Qué sucede cuando se recibiere una petición?**

- **Interceptación de la petición:** La cadena de filtros de Spring Security captura la petición y la pasa por todos los filtros de seguridad configurados.
- **Verificación de credenciales:** Al llegar al Basic Authentication Filter, se verifica si el usuario y la contraseña enviados son correctos.

```plain text
Authentication Request
➜ [ Security Filter A ] ➜ [ Basic Authentication Filter ] ➜ [ ... ] ➜ [ Security Filter N ]
➜ [ Authentication Manager ]
➜ [ Authentication Provider (Default: DaoAuthenticationProvider) ]
➜ [ User Details Service (Default: InMemoryUserDetailsManager) ]
➜ Authentication Response
```

### **¿Qué rol tiene el Authentication Manager?**

El Authentication Manager actúa como un coordinador en el proceso de autenticación, decidiendo cómo debe autenticar al usuario:

- **Selecciona el método de autenticación:** Determina si la autenticación será mediante usuario y contraseña, Auth0, LDAP, etc.
- **Interacción con Authentication Provider:** En el caso del Basic Authentication Filter, usa el DAO Authentication Provider para verificar las credenciales de usuario y contraseña.

### **¿Cómo es el flujo con el DAO Authentication Provider?**

El flujo continúa con el DAO Authentication Provider, el cual:

- **Consulta al User Detail Service:** Como se utilizan usuarios y contraseñas en memoria por Spring, emplea el In-Memory User Detail Service.
- **Verificación de contraseña:** Compara la contraseña proporcionada con la almacenada para el usuario solicitado.

### **¿Cómo realizar un debug en el Basic Authentication Filter?**

Para comprender mejor este proceso, se puede hacer un debug en el código de Spring. La clave está en el método `doFilterInternal` del Basic Authentication Filter, donde:

1. **Establecer puntos de interés:** Colocar puntos de control en líneas clave para seguir el flujo de autenticación.
2. **Lanzar la aplicación en modo debug:** Permitir que la aplicación se detenga en estos puntos para examinar el estado del proceso.
3. **Observar el paso a través de las líneas:** Verificar cómo se gestiona el `UserPasswordAuthenticationToken` y cómo interactúa con el `AuthenticationManager`.

### **¿Cuál es el papel del Abstract User Details Authentication Provider?**

El Abstract User Details Authentication Provider establece algunas validaciones preliminares importantes:

- **Carga del usuario:** A través del método `retrieveUser`, se recupera el usuario desde un In-MemoryUserDetailsService.
- **Validación del usuario y la contraseña:** Desde la línea 147, se asegura de que la contraseña proporcionada coincida con la almacenada.

### **¿Qué resultados se obtienen tras la verificación?**

- **Autenticación exitosa:** Si las credenciales son correctas, el usuario se carga en el contexto de seguridad.
- **Respuesta a la petición:** Finalmente, el sistema responde con un status 200 confirmando que el proceso ha sido exitoso.

Como desarrolladores, es esencial ir más allá del uso superficial de frameworks como Spring Security. Comprender cómo funciona internamente, especialmente la autenticación básica, proporciona una visión más clara y nos capacita para gestionar mejor la seguridad en nuestras aplicaciones. Aunque no es necesario aprender todo sobre el funcionamiento interno de Spring Security, esta es una oportunidad para apreciar el valor de entender qué sucede detrás de escena, ayudándonos a ser desarrolladores más informados y competentes. ¡Continúa aprendiendo y explorando! Te espero en la próxima clase para hablar sobre la protección CSRF en Spring.


# 07-Deshabilitar protección CSRF en APIs REST con Spring Security

Creado: 16 de octubre de 2025 9:21
ítem principal: 02-CONFIGURACIÓN DE  SEGURIDAD (https://www.notion.so/02-CONFIGURACI-N-DE-SEGURIDAD-28cf5b42f770805d83e6d201c527381a?pvs=21)

## **¿Qué es un ataque CSRF y por qué es peligroso?**

Los ataques CSRF, o Cross-Site Request Forgery, son una vulnerabilidad web donde **un atacante envia solicitudes hábilmente disfrazadas de un usuario autorizado**. Estos ataques aprovechan el hecho de que los navegadores web envían automáticamente información de sesión guardada, como cookies, en cada solicitud a un dominio específico.

### **Ejemplo de ataque CSRF en acción**

Un escenario común de un ataque CSRF podría ser el de una sesión bancaria en línea. Supongamos que iniciaste sesión en tu banco y tienes un formulario de transferencia bancaria que usa un método POST para enviar datos cuando decides transferir dinero. Mientras tienes esa sesión abierta, visitas otro sitio malintencionado que, al hacer clic en un botón que aparentemente reproduce videos, realiza una solicitud de transferencia con tus credenciales al banco, redirigiendo fondos de tu cuenta a la cuenta del atacante.

¿Cómo sucede esto? Básicamente, el botón en el sitio malintencionado ejecuta un formulario similar en segundo plano hacia la URL del banco, enviando los datos de la transferencia fraudulenta, que el banco procesa como legítimos debido a que las cookies válidas de sesión se enviaron automáticamente con la solicitud.

## **¿Cómo prevenir ataques CSRF?**

Para evitar la explotación de CSRF, se utiliza comúnmente un token de seguridad único y aleatorio. Este token se envía junto con los datos del formulario y el servidor lo valida, permitiendo solo las solicitudes con un token válido, asegurando su origen legítimo. De esta manera, se previene que un sitio no autorizado realice solicitudes en tu nombre, ya que no puede suministrar un token válido.

### **Solución utilizando tokens CSRF**

La implementación de tokens CSRF generalmente implica:

- **Generación de Tokens**: El servidor genera un token único para cada sesión o solicitud.
- **Validación del Token**: Cuando el usuario envía una solicitud, el token debe ser incorporado como un campo oculto en el formulario. El servidor valida si el token coincide antes de procesar la solicitud.

## **Deshabilitando CSRF en APIs RESTful**

Dicho esto, puedes estar preguntándote por qué se describe cómo deshabilitar esta protección en una clase. La razón se debe a la naturaleza sin estado (stateless) de las APIs RESTful modernas, generalmente orientadas a mejorar el rendimiento y escalabilidad utilizando tokens de seguridad en headers HTTP, como los JSON Web Tokens (JWT).

### **Configuración para una API sin estado**

En un contexto de API Stateless, las cookies no se utilizan para mantener el estado de autenticación del usuario. En su lugar, cada solicitud incluye un token de autenticación en el cabezal HTTP. Así, podrías prescindir de la protección CSRF si cumples los siguientes principios:

- **Autenticación basada en tokens**: Empleando sistemas de seguridad JWT, los tokens se agregan al header HTTP `Authorization` para autenticar cada solicitud.
- **Request Headers en lugar de Cookies**: Las solicitudes se autentican mediante headers en lugar de cookies, eliminando uno de los vectores comunes de ataque CSRF.

### **Deshabilitando la protección CSRF en Spring Security**

En el contexto en que se realiza el estudio de la clase, se muestra cómo deshabilitar el CSRF en una aplicación Spring Security. A menudo, no es recomendable a menos que se utilice un enfoque basado en tokens robusto. A continuación, un ejemplo del código relevante en Java:

```java
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
					      // Deshabilitación de la protección CSRF
					      // Debido a que se utilizará (Api Stateless + JWT)*
                .csrf(AbstractHttpConfigurer::disable)
                // 
                .authorizeHttpRequests( auth -> auth
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}

```

Esto implica que suficientemente seguro si se asegura que todas las peticiones se autentican a través de un Token JWT en los headers, fortaleciendo así el esquema general de seguridad.

## **Implementación Post-CSRF y Seguridad**

Al concluir la configuración adecuada de tu API REST, el siguiente paso común es implementar la configuración de CORS para permitir que la API sea consumida desde diferentes fuentes, admitiendo solicitudes cross-origin de manera segura. Recordemos que la seguridad en una aplicación es un conjunto de buenas prácticas y herramientas que deben complementarse entre sí para formar una barrera sólida contra posibles amenazas.


# 08-Configuración de CORS en Spring Security para APIs y Frontend

Creado: 17 de octubre de 2025 11:25
ítem principal: 02-CONFIGURACIÓN DE  SEGURIDAD (https://www.notion.so/02-CONFIGURACI-N-DE-SEGURIDAD-28cf5b42f770805d83e6d201c527381a?pvs=21)

## **¿Qué es CORS y cómo afecta a tu aplicación?**

Cuando trabajamos en proyectos web divididos en frontend y backend, a menudo tratamos con el intercambio de recursos entre diferentes orígenes. Esto es especialmente común cuando la aplicación frontend se ejecuta desde un dominio y el backend desde otro. Aquí es donde entra CORS (Cross-Origin Resource Sharing), un sistema crucial para permitir o restringir tales interacciones por razones de seguridad.

Por defecto, los frameworks como Spring bloquean estas peticiones cruzadas. Esto puede ser un obstáculo si, por ejemplo, nuestro frontend se ejecuta en `localhost:4200` usando Angular, y nuestro API backend corre en `localhost:8080`. Afortunadamente, Spring Security ofrece mecanismos para configurar y habilitar CORS, permitiendo así que aplicaciones de frontend puedan comunicarse con APIs alojadas en diferentes dominios.

### **¿Cómo se implementa CORS en Spring Security?**

Para gestionar CORS en una aplicación Spring, es necesario modificar algunas configuraciones del backend. Esto asegura que tu aplicación pueda reconocer y permitir peticiones legítimas desde otros orígenes.

1. **Deshabilitar CSRF y habilitar CORS**:
    - Desde el backend, después de deshabilitar CSRF (Cross-Site Request Forgery), habilitamos CORS usando `.cors(*Customizer*.*withDefaults*())` Esto asegura que las configuraciones de CORS y las peticiones autorizadas se consideren.
2. **Anotación a métodos específicos**:
    - Utiliza la anotación `@CrossOrigin` en los métodos de tus controladores para permitir accesos desde orígenes específicos. Por ejemplo:

        ```java
        @CrossOrigin(origins = "http://localhost:4200")
        public ResponseEntity<Pizza> getPizzas() {
            // Tu lógica aquí
        }
        
        ```

3. **Implementación de una configuración global**:
    - Para evitar anotar cada método individualmente, puedes definir una configuración global. Esto se realiza creando una nueva clase configuradora:

        ```java
        @Configuration
        public class CorsConfig {
        
            @Bean
            CorsConfigurationSource corsConfigurationSource() {
                CorsConfiguration corsConfiguration = new CorsConfiguration();
        
                corsConfiguration.setAllowedOrigins(List.of("http://localhost:4200"));
                corsConfiguration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE"));
                corsConfiguration.setAllowedHeaders(List.of("*"));
        
                UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
                source.registerCorsConfiguration("/**", corsConfiguration);
                return source;
            }
        }
        
        ```


### **¿Qué beneficios trae la configuración global de CORS?**

Optar por una configuración global de CORS en un proyecto tiene varias ventajas:

- **Simplicidad y Mantenimiento**: Centralizar las configuraciones hace que el mantenimiento del código sea más sencillo. Cualquier cambio en las políticas de origen solo requiere una modificación en el archivo de configuración.
- **Consistencia**: Proporciona una manera uniforme de gestionar el acceso a todos los controladores y métodos, asegurando una protección constante y sin omisiones.
- **Escalabilidad**: Facilita la ampliación de las políticas de acceso conforme el proyecto crece, simplificando la adición de nuevos métodos y controladores que necesitan el mismo manejo de políticas de acceso.

### **¿Cómo asegurar un despliegue exitoso?**

Después de implementar la configuración de CORS, es vital verificar el funcionamiento de la aplicación:

1. **Inicializa la aplicación**: Lanza la aplicación backend y revisa que la configuración de CORS se carga correctamente. Esto se puede verificar revisando las trazas del servidor.
2. **Validación de Seguridad**: Siempre asegúrate de que las políticas de seguridad no han sido alteradas inadvertidamente. Uso de herramientas como Postman para comprobar la autenticación de peticiones asegura que todo funciona como esperabas.
3. **Prueba desde el frontend**: Finalmente, accede al frontend y realiza pruebas desde diferentes entornos (navegadores, dispositivos) para confirmar que las peticiones cross-origin funcionan y se manejan correctamente.

Con esta configuración, Spring Security te permite gestionar las políticas de acceso entre orígenes de manera eficiente. ¡Sigue aprendiendo y explorando las funcionalidades que estos marcos pueden ofrecer a tus proyectos!



# 09-Configuración de Reglas de Acceso en Spring Security

Creado: 17 de octubre de 2025 14:38
ítem principal: 02-CONFIGURACIÓN DE  SEGURIDAD (https://www.notion.so/02-CONFIGURACI-N-DE-SEGURIDAD-28cf5b42f770805d83e6d201c527381a?pvs=21)

## **¿Cómo se configuran las reglas de seguridad en Spring Security?**

Spring Security nos permite definir reglas de seguridad para denegar o permitir el acceso a diferentes endpoints o métodos HTTP. Al configurar estas reglas, podemos proteger rutas específicas en nuestra aplicación según las necesidades del proyecto. Utilizaremos `request matchers` para establecer estas reglas, una manera flexible de aplicar criterios de seguridad personalizados.

### **¿Qué son los request matchers?**

Los **request matchers** son criterios que utilizamos para definir las reglas de acceso a nuestros endpoints. Esto se puede hacer especificando:

- **El path o patrón**: Una ruta específica o patrón sobre el cual aplicar la regla.
- **El método HTTP**: Combinado con un path, permite definir reglas para métodos específicos como GET, POST, etc.

Por ejemplo, podemos crear una regla que permita todos los métodos GET en rutas que sigan el patrón `/api/*`.

### **¿Cómo configurar y lanzar una aplicación con reglas de acceso específicas?**

Al establecer reglas, es importante definir claramente las acciones sobre ellas. Podemos permitir, denegar o requerir roles específicos. Por simplicidad, mencionaremos cómo permitir acceso a ciertos métodos.

### **Ejemplo básico**

A continuación, presentamos un ejemplo de configuración básica permitiendo todos los métodos GET en cualquier ruta que comience con `/api/` seguido de cualquier subruta:

```java
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll()
                        // Permite los métodos GET de api
                        .requestMatchers(HttpMethod.GET,"/api/*").permitAll()
                        // Denegar los métodos PUT
                        .requestMatchers(HttpMethod.PUT).denyAll()
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}

```

Este fragmento de código indica que todas las peticiones GET a rutas bajo `/api/` están permitidas. Si lanzamos la aplicación y probamos estas rutas usando herramientas como Postman, podemos ver una diferencia clara en el acceso permitido.

### **¿Qué diferencia existe entre un asterisco y dos en los patrones?**

El uso de **un solo asterisco (*)** en las rutas permite el acceso solo al siguiente nivel del path. Por ejemplo, `/api/*` permite acceso al primer nivel después de `/api/`. Así, una ruta `/api/pizzas` funcionará, pero `/api/pizzas/available` requerirá una configuración adicional.

Por otro lado, **utilizar dos asteriscos (****) expande la autorización a cualquier subruta en todo el árbol después del sufijo indicado. Modifiquemos nuestro ejemplo previo:

```java
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll()
                        .requestMatchers(HttpMethod.GET,"/api/**").permitAll()
                        .requestMatchers(HttpMethod.PUT).denyAll()
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}

```

Esto permite acceder a cualquier ruta bajo `/api/` sin restricciones adicionales.

### **¿Cómo aplicamos reglas más específicas?**

Podemos designar reglas para rutas específicas restringiendo el acceso a otras. Por ejemplo, si queremos que solo esté permitido el acceso a `/api/pizzas`:

```java
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll()
                        // Ejemplo
                        .requestMatchers(HttpMethod.GET,"/api/pizzas/**").permitAll()
                        .requestMatchers(HttpMethod.PUT).denyAll()
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}

```

Con esto, cualquier otra petición, por ejemplo, `/api/orders`, requerirá autenticación.

### **¿Cómo podemos denegar acceso a ciertos métodos?**

Es posible bloquear completamente un método HTTP en toda la aplicación. Supongamos que las reglas de negocio prohíben el uso del método PUT en todo el proyecto:

```java
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll()
                        .requestMatchers(HttpMethod.GET,"/api/pizzas/**").permitAll()
                        // Ejemplo
                        .requestMatchers(HttpMethod.PUT).denyAll()
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}

```

Esto denegará cualquier intento de uso del método PUT, sin importar la autenticación del usuario.

## **Consejos prácticos para implementar reglas en Spring Security**

- **Planifica tus reglas**: Asegúrate de que las rutas críticas y sensibles estén protegidas antes de lanzar tu aplicación.
- **Prueba exhaustivamente**: Usa herramientas como Postman para verificar que la configuración de seguridad funcione como esperabas.
- **Considera roles de usuario**: Aunque este ejemplo no cubre roles, piénsalo para una mayor granularidad en accesos.

Seguir estos consejos te ayudará a mantener una aplicación segura, y te animamos a seguir profundizando en la seguridad de Spring Security. ¡No te detengas aquí! El futuro del desarrollo seguro depende de seguir aprendiendo y aplicando estas prácticas.




# 10-Creación de usuarios personalizados en Spring Security

Creado: 18 de octubre de 2025 13:38
ítem principal: 02-CONFIGURACIÓN DE  SEGURIDAD (https://www.notion.so/02-CONFIGURACI-N-DE-SEGURIDAD-28cf5b42f770805d83e6d201c527381a?pvs=21)

## **¿Cómo crear usuarios personalizados en Spring Security?**

Crear usuarios personalizados en Spring Security es una práctica esencial para adaptarse a los requisitos de seguridad específicos de una aplicación. En lugar de utilizar usuarios generados automáticamente por el framework, se pueden definir usuarios en memoria que se personalicen según sea necesario. A continuación, exploraremos cómo implementar esto paso a paso.

### **¿Cómo implementar UserDetailService?**

Para empezar, debemos crear nuestra propia implementación de `UserDetailsService`. Este servicio es fundamental para gestionar la autenticación de usuarios en Spring Security.

1. **Declarar el método**: Primero, se crea un método público que retorne un `UserDetailsService`.
2. **Crear usuarios en memoria**: Utilizando el builder proporcionado por Spring, se construye un usuario, por ejemplo:

    ```java
    @Bean
    public UserDetailsService memoryUsers() {
        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();
    
        return new InMemoryUserDetailsManager(admin);
    }
    
    ```


En el ejemplo, hemos creado un usuario administrador llamado "admin" con contraseña "admin".

### **¿Cómo configurar y codificar contraseñas?**

### **Uso de Password Encoder**

Para mantener la seguridad de las contraseñas, es crucial utilizar un `PasswordEncoder`. Spring recomienda usar algoritmos como `bcrypt` que ofrecen mayor protección.

1. **Implementar un Password Encoder**: Se crea un `PasswordEncoder` y se lo anota como un `@Bean` para que Spring lo administre.

    ```java
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    ```

2. **Codificar la contraseña**: Se utiliza el `PasswordEncoder` para codificar y almacenar la contraseña.

    ```java
    String encodedPassword = passwordEncoder().encode("admin");
    
    ```


### **¿Cómo probar la autenticación personalizada con Postman?**

Una vez configurados los usuarios y el encoder, se puede proceder a verificar la autenticación a través de herramientas como Postman.

- **Configurar autenticación básica**: En Postman, establece la autenticación básica usando el usuario "admin" y contraseña "admin".
- **Ejecutar pruebas**: Al iniciar la aplicación y realizar peticiones autenticadas a servicios protegidos, se debe recibir un código 200 si todos los detalles coinciden.

### **¿Qué errores comunes pueden surgir?**

1. **PasswordEncoder no definido**: Si surge un error de falta de `PasswordEncoder`, asegúrate de que esté configurado adecuadamente y anotado en Spring.
2. **Contraseña incorrecta**: Un código 401 indica un error en la autenticación. Revisa que tanto usuario como contraseña sean precisos y estén codificados correctamente.

Al implementar estos pasos, has creado exitosamente usuarios personalizados en Spring y asegurado que las contraseñas se manejen con cifrado seguro. ¡Continúa explorando y personalizando más funciones de Spring Security! En la próxima lección, aprenderás a gestionar permisos para distintos roles de usuario. ¡No te lo pierdas!




# 11-Creación y Gestión de Roles y Permisos en Aplicaciones Web

Creado: 18 de octubre de 2025 14:20
ítem principal: 02-CONFIGURACIÓN DE  SEGURIDAD (https://www.notion.so/02-CONFIGURACI-N-DE-SEGURIDAD-28cf5b42f770805d83e6d201c527381a?pvs=21)

## **¿Cómo gestionar roles de usuario en aplicaciones web modernas?**

Las aplicaciones web modernas gestionan de manera eficaz los roles y permisos de los usuarios para garantizar la seguridad y funcionalidad del sistema. Este enfoque permite controlar y delimitar las acciones que pueden o no realizar los usuarios según sus roles. A continuación, exploramos cómo implementar diferentes roles y gestionar permisos a través de ejemplos prácticos, como los de un administrador y un cliente dentro de una API.

### **¿Cómo crear usuarios con roles personalizados?**

Cuando se desarrolla una aplicación, es crucial definir y crear diferentes tipos de usuarios, cada uno con roles específicos que determinen sus capacidades dentro del sistema. Aquí te presentamos un ejemplo de cómo crear un segundo usuario con un rol distinto:

```java
@Bean
public UserDetailsService memoryUsers() {
    UserDetails admin = User.builder()
            .username("admin")
            .password(passwordEncoder().encode("admin"))
            .roles("ADMIN")
            .build();

    UserDetails customer = User.builder()
            .username("customer")
            .password(passwordEncoder().encode("customer123"))
            .roles("CUSTOMER")
            .build();

    return new InMemoryUserDetailsManager(admin, customer);
}

```

En este ejemplo, además de un usuario **admin**, se añade un usuario **Customer**, con su respectiva contraseña y el rol **CUSTOMER**. Esto permite tener disponibles dos tipos de usuarios con capacidades diferenciadas dentro del sistema.

### **¿Cómo aplicar permisos específicos a cada rol?**

Para especificar qué acciones puede realizar cada rol, es necesario definir reglas dentro del **Filter Chain**. Este enfoque nos ayuda a asegurar que cada rol de usuario tiene acceso a las operaciones adecuadas.

1. **GET para múltiples roles**:
    - Se permite que tanto un administrador como un cliente puedan acceder al método GET en un determinado endpoint.

    ```java
    @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                    .csrf(AbstractHttpConfigurer::disable)
                    .cors(Customizer.withDefaults())
                    .authorizeHttpRequests( auth -> auth
                            .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").hasRole("ADMIN")
                            //Ejemplo
                            .requestMatchers(HttpMethod.GET,"/api/pizzas/**").hasAnyRole("ADMIN","CUSTOMER")
                            //----------------
                            .requestMatchers(HttpMethod.POST,"/api/pizzas/**").hasRole("ADMIN")
                            .requestMatchers(HttpMethod.PUT).hasRole("ADMIN")
                            .requestMatchers("/api/orders/**").hasRole("ADMIN")
                            .anyRequest().authenticated()
                    )
                    .httpBasic(Customizer.withDefaults());
            return http.build();
        }
    
    ```

2. **POST exclusivo para administradores**:
    - Restringe el método POST solo a usuarios con rol de administrador, protegiendo operaciones críticas de modificación de datos.

    ```java
    @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                    .csrf(AbstractHttpConfigurer::disable)
                    .cors(Customizer.withDefaults())
                    .authorizeHttpRequests( auth -> auth
                            .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").hasRole("ADMIN")
                            .requestMatchers(HttpMethod.GET,"/api/pizzas/**").hasAnyRole("ADMIN","CUSTOMER")
                            // Ejemplo
                            .requestMatchers(HttpMethod.POST,"/api/pizzas/**").hasRole("ADMIN")
                            //------------------------------------
                            .requestMatchers(HttpMethod.PUT).hasRole("ADMIN")
                            .requestMatchers("/api/orders/**").hasRole("ADMIN")
                            .anyRequest().authenticated()
                    )
                    .httpBasic(Customizer.withDefaults());
            return http.build();
        }
    
    ```

3. **Protección total para endpoints críticos**:
    - Gareth sich implementando una cláusula para las órdenes, asegurándose que únicamente los administradores puedan gestionarlas.

    ```java
    @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                    .csrf(AbstractHttpConfigurer::disable)
                    .cors(Customizer.withDefaults())
                    .authorizeHttpRequests( auth -> auth
                            .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").hasRole("ADMIN")
                            .requestMatchers(HttpMethod.GET,"/api/pizzas/**").hasAnyRole("ADMIN","CUSTOMER")
                            .requestMatchers(HttpMethod.POST,"/api/pizzas/**").hasRole("ADMIN")
                            .requestMatchers(HttpMethod.PUT).hasRole("ADMIN")
                            // Ejemplo---
                            .requestMatchers("/api/orders/**").hasRole("ADMIN")
                            // -----------------
                            .anyRequest().authenticated()
                    )
                    .httpBasic(Customizer.withDefaults());
            return http.build();
        }
    
    ```


### **¿Cómo probar los permisos de acceso?**

Para verificar que las configuraciones de permiso y roles funcionen adecuadamente, es recomendable realizar pruebas usando herramientas como Postman. Por ejemplo:

- **Usuario Cliente**: Intentar realizar un GET en `/api/pizzas` devuelve un éxito al estar permitido.
- **Consultar órdenes**: Intentar un GET en `/api/orders` mostrará un error 403, porque el rol `CUSTOMER` no tiene permisos de acceso.

Si utilizamos las credenciales de un administrador, estas restricciones no se aplicarán en el acceso a las órdenes.

### **¿Qué pasos seguir para una autenticación robusta?**

Ahora que se tienen roles y permisos básicos implementados, el siguiente paso es integrar un sistema de gestión de usuarios basado en una base de datos como MySQL. Este enfoque mejorará la autenticación y facilitará la gestión de usuarios en entornos más complejos y dinámicos.

Es momento de seguir aprendiendo y explorar cómo integrar el uso de bases de datos para manejar usuarios y autenticaciones. ¡No te detengas aquí, sigue adelante para construir una aplicación segura y eficiente!



# 12-Creación y Gestión de Usuarios en Base de Datos con Spring Security

Creado: 19 de octubre de 2025 16:16
ítem principal: 03-AUTENTICACIÓN CON BD (https://www.notion.so/03-AUTENTICACI-N-CON-BD-28cf5b42f77080a5bf2ef130303dbf79?pvs=21)

## **¿Cómo iniciar con la autenticación de usuarios en nuestra base de datos?**

Para implementar la autenticación de usuarios desde nuestra propia base de datos, el primer paso crucial es preparar una tabla que contenga toda la información pertinente de los usuarios. La estructura de esta tabla debe incluir:

- **Clave primaria**: El mismo identificador de usuario.
- **Contraseña**: Debe estar almacenada de forma segura, nunca en texto plano.
- **Correo electrónico**: Un campo esencial para la verificación de identidad.
- **Indicadores booleanos**:
    - Un indicador para saber si la cuenta está bloqueada.
    - Otro para saber si la cuenta está deshabilitada.

### **¿Cómo crear la tabla de usuarios en JPA?**

La clave para comenzar a trabajar con esta tabla es crear un Entity en tu capa de persistencia. En este caso, se ha creado una clase llamada `UserEntity`, que simula la tabla de usuarios:

```java
@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntity {
    @Id
    @Column(nullable = false, length = 20)
    private String username;

    @Column(nullable = false, length = 200)
    private String password;

    @Column(length = 50)
    private String email;

    @Column(nullable = false, columnDefinition = "TINYINT")
    private Boolean locked;

    @Column(nullable = false, columnDefinition = "TINYINT")
    private Boolean disabled;
}
```

Gracias a Spring Data JPA, podemos integrar de manera automática la creación de esta tabla. Para ello, configura tu archivo `application.properties` para que la aplicación verifique y construya las entidades faltantes al lanzarse.

### **¿Cómo verificar la creación de la tabla en MySQL Workbench?**

Una vez lanzada la aplicación, es imprescindible confirmar que la base de datos ha integrado la tabla de usuarios correctamente. Puedes realizar esta verificación en MySQL Workbench. La herramienta te permitirá refrescar y visualizar que la tabla de usuarios se ha creado, aunque inicialmente se encontrará vacía.

### **¿Cómo crear usuarios y almacenar contraseñas encriptadas?**

A la hora de añadir usuarios, debemos almacenar sus contraseñas de manera segura. Esto se logra mediante técnicas de encriptación automáticas que ofrece Spring Security, como `bcrypt`.

1. **Generar hash de la contraseña**: Usaremos un servicio online como bcrypt.online para convertir la contraseña en texto plano en un hash encriptado. Por ejemplo, si nuestro texto plano es `admin123`, generamos el hash correspondiente y lo guardamos en la base de datos.
2. **Agregar usuarios**: Una vez generados los hashes, podemos proceder a insertar los datos en la tabla de usuarios en MySQL Workbench. Por ejemplo, al crear un usuario "admin", asignamos su email, estado de la cuenta, y la contraseña encriptada.

### **¿Cuáles son los pasos siguientes en la seguridad de Spring?**

Aunque nuestros usuarios están creados en la base de datos, Spring Security aún está configurado para emplear usuarios almacenados en memoria. El siguiente paso será desarrollar una implementación personalizada de `UserDetailsService` para que consulte estos usuarios directamente desde nuestra base de datos. Esto permitirá que la autenticación de usuarios sea más sólida y adaptable a modificaciones futuras.

Con el interés y las herramientas adecuadas, te encuentras en el camino óptimo para desarrollar sistemas de autenticación más seguros y eficientes. ¡Continúa aprendiendo y avanzando en el dominio de la seguridad en aplicaciones!



# 13-Implementación de User Detail Service en Spring Security con MySQL

Creado: 20 de octubre de 2025 13:51
ítem principal: 03-AUTENTICACIÓN CON BD (https://www.notion.so/03-AUTENTICACI-N-CON-BD-28cf5b42f77080a5bf2ef130303dbf79?pvs=21)

## **¿Cómo implementar un User Detail Service en Spring para MySQL?**

Para utilizar MySQL como repositorio de usuarios para autenticación en una aplicación Spring, es crucial implementar un servicio conocido como `UserDetailService`. Este servicio le indica al `Authentication Provider` en dónde buscar los usuarios y cómo verificar sus credenciales. Aquí exploraremos los pasos necesarios para configurar adecuadamente este servicio.

### **¿Crear nuestra propia implementación del UserDetailService?**

Lo primero que necesitamos es una clase que implemente el `UserDetailService`. En el contexto de Spring, esto se logra de la siguiente manera:

1. Crea una nueva clase en la capa de servicio llamada `UserSecurityService`.
2. Anota esta clase con `@Service` para asegurar que entre en el ciclo de vida de Spring.
3. Implementa la interfaz `UserDetailService`.

Implementar esta interfaz nos impone la obligación de definir el método `loadUserByUsername`, que tiene la lógica para ubicar un usuario en nuestra base de datos MySQL.

```java
@Service
@AllArgsConstructor
public class UserSecurityService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = this.userRepository.findById(username).orElseThrow(
                () -> new UsernameNotFoundException("User " + username + " not found")
        );
        return User.builder()
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .roles("ADMIN")
                .accountLocked(userEntity.getLocked())
                .disabled(userEntity.getDisabled())
                .build();
    }
}

```

### **¿Cómo se configura el repositorio para buscar en MySQL?**

Para buscar usuarios en nuestra base de datos MySQL, debemos crear un repositorio. Esto se hace extendiendo de `CrudRepository`, que nos proporciona funcionalidades básicas de base de datos.

- Define una interfaz `UserRepository` en el paquete de persistencia.
- Haz que esta interfaz extienda `CrudRepository` usando la entidad de usuario adecuada (`UserEntity`) y el tipo de su clave primaria (por ejemplo, `String`).

```java
public interface UserRepository extends CrudRepository<UserEntity, String> {
}

```

Al emplear `CrudRepository`, no es necesario definir métodos adicionales de consulta, ya que permite buscar un elemento a través de su clave primaria con métodos predeterminados.

### **¿Cómo lanzar la aplicación y verificar la configuración?**

Una vez configurado el servicio y el repositorio, es esencial lanzar la aplicación y verificar su correcto funcionamiento:

1. Asigna roles a los usuarios en la base de datos (por ahora, todos serán 'admin').
2. Verifica que los usuarios puedan autenticarse correctamente contra la base de datos utilizando nombres de usuario y contraseñas válidos.

Para probar la autenticación:

- Utiliza credenciales como `customer` y `customer123` para asegurarte de que el sistema retorna un `status 200`.
- Introduce contraseñas incorrectas para verificar que retorna mensajes de error como `401 Unauthorized`.

### **¿Qué sigue después de la implementación?**

La implementación de `UserDetailService` es solo un paso en el robustecimiento de la seguridad de una aplicación. El siguiente paso es crear una tabla de roles separada y asignar permisos más específicos a cada usuario. Esto permitirá una gestión de permisos más flexible y escalable. ¡Te invitamos a seguir aprendiendo y mejorando tus aplicaciones!


# 14-Asignación de Roles y Permisos en Spring Security

Creado: 20 de octubre de 2025 15:28
ítem principal: 03-AUTENTICACIÓN CON BD (https://www.notion.so/03-AUTENTICACI-N-CON-BD-28cf5b42f77080a5bf2ef130303dbf79?pvs=21)

## **¿Cómo gestionar roles de usuario en Spring con Hibernate?**

En el desarrollo de aplicaciones web seguras, la gestión de usuarios y roles es una pieza fundamental. Esta guía te proporciona una base sólida para implementar y administrar roles de usuario en tus aplicaciones usando Spring y Hibernate. Exploraremos cómo crear y asignar roles a usuarios dentro de una base de datos MySQL y cómo conectar este sistema a un User Detail Service en Spring.

### **¿Cómo crear la tabla de roles de usuario?**

Para comenzar, vamos a crear una tabla en MySQL que gestione los roles. Esta tabla se llamará `user_role` y estará relacionada con la tabla `User`. Aquí tienes una idea de cómo debería ser su estructura:

- **Username**: Viene de la tabla `User`.
- **Role**: Será uno de los roles asignados.
- **Granted Date**: Indica desde cuándo el rol ha sido asignado.

Puedes crear esta tabla usando Hibernate o directamente con un script SQL en tu base de datos MySQL. Este enfoque asegura que cada usuario pueda tener distintos roles, reflejando una relación de uno a muchos (one-to-many).

### **¿Cómo implementar las entidades en tu proyecto?**

Dentro de tu proyecto de Spring, deberás implementar la entidad `UserRoleEntity`. Aquí es donde definiremos cómo se relacionan los usuarios con los roles:

```java
@Entity
@Table(name = "user_role")
@IdClass(UserRoleId.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleEntity {
    @Id
    @Column(nullable = false, length = 20)
    private String username;

    @Id
    @Column(nullable = false, length = 20)
    private String role;

    @Column(name = "granted_date", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime grantedDate;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
    private UserEntity user;
}

```

La entidad `UserRoleEntity` implementa una **clave primaria compuesta** por `username` y `role`, reflejando su naturaleza de relación en la base de datos.

```java
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleId implements Serializable {
    private String username;
    private String role;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserRoleId that = (UserRoleId) o;
        return Objects.equals(username, that.username) && Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }
}
```

En `UserEntity`, incorpora una lista de `UserRoleEntity` anotada con `@OneToMany`. Asegúrate de configurar la carga `FetchType.EAGER` para que los roles se carguen automáticamente al recuperar un usuario.

```java
@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntity {
    //...//
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<UserRoleEntity> roles;
}

```

### **¿Cómo asignar roles y verificar el acceso?**

Una vez que la aplicación está configurada y la tabla creada, es hora de asignar roles a usuarios. Puedes realizar esta operación directamente en MySQL Workbench:

1. Asigna el rol `Admin` al usuario `admin` y un rol `Customer` al usuario correspondiente.
2. Asegúrate de utilizar la función `now()` de MySQL para registrar correctamente la fecha actual en `Granted Date`.

```sql
INSERT INTO `pizzeria`.`user_role` (`role`, `username`, `granted_date`) VALUES ('ADMIN', 'admin', NOW());
INSERT INTO `pizzeria`.`user_role` (`role`, `username`, `granted_date`) VALUES ('CUSTOMER', 'customer',NOW());
```

Finalmente, en tu implementación del `UserDetailService`, reemplaza la lista de roles inicial con los roles obtenidos de la base de datos. Convierte los roles a un arreglo de cadenas de caracteres, utilizándolos para autenticar y autorizar a los usuarios.

```java
@Service
@AllArgsConstructor
public class UserSecurityService implements UserDetailsService {

        // Obtener la lista de roles de un usuario
        String[] roles = userEntity.getRoles().stream().map(UserRoleEntity::getRole).toArray(String[]::new);

}

```

De esta manera, puedes controlar el acceso a los diferentes endpoints de tu API, asegurándote de que solo aquellos usuarios con los permisos necesarios puedan realizar ciertas acciones.

### **¿Qué hacer en caso de bloqueos de cuenta?**

Además de asignar roles, tienes la capacidad de bloquear usuarios temporalmente si fuera necesario. Esto se gestiona mediante una propiedad `locked`, la cual, al activarse, impide que el usuario acceda al sistema aunque sus credenciales sean correctas:

```sql
UPDATE user SET locked = 1 WHERE username = 'admin';

```

Esta funcionalidad es crucial para asegurar tu aplicación contra accesos indebidos o para manejar situaciones de seguridad específicas.

Con esta estructura, aseguras que tu aplicación no solo sea segura, sino también flexible, permitiendo una administración detallada de los recursos y accesos según los roles de usuario establecidos.



# 15-Permisos Específicos con Authorities en Spring Security

Creado: 20 de octubre de 2025 18:42
ítem principal: 03-AUTENTICACIÓN CON BD (https://www.notion.so/03-AUTENTICACI-N-CON-BD-28cf5b42f77080a5bf2ef130303dbf79?pvs=21)

## **¿Cómo gestionar permisos en Spring para que los usuarios realicen ciertas acciones?**

La gestión de permisos en una aplicación es fundamental para garantizar la seguridad y correcta operación de los servicios, especialmente en aplicaciones web donde diferentes usuarios pueden requerir distintos niveles de acceso. En el contexto de aplicaciones Spring, el uso de `Authorities` y `Roles` es clave para la implementación de esta funcionalidad. Exploremos cómo se utiliza Spring Security para definir permisos específicos que permiten a los usuarios ejecutar determinado tipo de acciones de acuerdo a su rol.

### **¿Cuál es la diferencia entre Authorities y Roles?**

En Spring Security, las `Authorities` y `Roles` aunque a primera vista podrían parecer similares, poseen diferencias cruciales:

- **Roles**: Son grupos de permisos que un usuario puede tener. Un rol puede agrupar varios permisos, facilitando la gestión de permisos de usuarios que realizan funciones similares.
- **Authorities**: Son permisos específicos que un usuario puede tener para ejecutar acciones concretas dentro de la aplicación. A diferencia de los roles, son más granulares y permiten asignar permisos muy específicos.

Spring asigna automáticamente el prefijo "ROLE" para diferenciar un rol de una autoridad.

### **¿Cómo implementar Roles y Authorities en Spring?**

La implementación de roles y autoridades se realiza mediante el uso de clases de seguridad que articulan la creación y asignación de estos permisos. El proceso es el siguiente:

1. **Creación de una Lista de Authorities**: Se crea un método privado que retorna una lista de `GrantedAuthority`. Este método recibirá roles que tiene el usuario previamente.

    ```java
    @Service
    @AllArgsConstructor
    public class UserSecurityService implements UserDetailsService {
    
        //...//
    
        private List<GrantedAuthority> grantedAuthorities(String[] roles) {
            List<GrantedAuthority> authorities = new ArrayList<>(roles.length);
    
            for (String role: roles){
                authorities.add(new SimpleGrantedAuthority("ROLE_"+role));
    
                for (String authority: this.getAuthorities(role)) {
                    authorities.add(new SimpleGrantedAuthority(authority));
                }
            }
            return authorities;
        }
    }
    
    ```

2. **Asignación de Permisos Individuales**: Además de roles, se pueden asignar permisos individuales a través de un método que retorne un arreglo de strings con los permisos específicos.

    ```java
    @Service
    @AllArgsConstructor
    public class UserSecurityService implements UserDetailsService {
    
        //....//
    
        private String[] getAuthorities(String role) {
            if("ADMIN".equals(role) || "CUSTOMER".equals(role)) {
                return new String[] {"random_order"};
            }
            return new String[] {};
        }
    
        //...//
    }
    
    ```

3. **Configuración de Seguridad**: Se deben definir las reglas de seguridad indicando qué roles o autoridades son necesarias para acceder a ciertas rutas.

    ```java
    @Configuration
    public class SecurityConfig {
    
        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                    .csrf(AbstractHttpConfigurer::disable)
                    .cors(Customizer.withDefaults())
                    .authorizeHttpRequests( auth -> auth
                            .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").hasRole("ADMIN")
                            .requestMatchers(HttpMethod.GET,"/api/pizzas/**").hasAnyRole("ADMIN","CUSTOMER")
                            .requestMatchers(HttpMethod.POST,"/api/pizzas/**").hasRole("ADMIN")
                            .requestMatchers(HttpMethod.PUT).hasRole("ADMIN")
                            //Ejemplo
                            .requestMatchers("/api/orders/random").hasAuthority("random_order")
                            .requestMatchers("/api/orders/**").hasRole("ADMIN")
                            .anyRequest().authenticated()
                    )
                    .httpBasic(Customizer.withDefaults());
            return http.build();
        }
    
        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
    }
    
    ```


### **¿Por qué es crucial el orden de las reglas de seguridad?**

Es vital tener en cuenta el orden en que se evalúan las reglas de seguridad, ya que se ejecutan de forma escalonada. Si una regla general en la lista impide el acceso a un recurso basado en el rol, ninguna otra regla específica de permiso será evaluada después:

- La regla que permita permisos específicos debe estar posicionada antes de reglas más generales. Por ejemplo, permitir a un `authority` específico acceder a un endpoint antes de denegar acceso a roles que no cumplan otros criterios.

### **¿Qué sucede si se comete un error en el orden?**

Al ejecutarse las reglas de seguridad de arriba hacia abajo, un error en el orden puede impedir que un usuario, que debiera tener acceso a una función específica, lo tenga.

Intentar realizar una acción con un usuario con un rol incorrecto resultará en un error del tipo 403 Forbidden, indicando que las credenciales no son suficientes para completar la acción.

Al aplicar estos conceptos, puedes crear usuarios con permisos adaptados a sus necesidades específicas. Usar roles para permiso generales y authorities para quienes necesitan funcionalidades más expresas es una manera eficaz de mejorar la seguridad en tus aplicaciones Spring.



# 16-Seguridad de Métodos en Spring Security: Control de Accesos por Roles

Creado: 21 de octubre de 2025 12:49
ítem principal: 03-AUTENTICACIÓN CON BD (https://www.notion.so/03-AUTENTICACI-N-CON-BD-28cf5b42f77080a5bf2ef130303dbf79?pvs=21)

## **¿Cómo añadir seguridad a métodos específicos con Spring Security?**

Spring Security es una herramienta esencial al momento de proteger nuestras aplicaciones, brindándonos una capa adicional de seguridad más allá del acceso básico a nuestros endpoints. Con ella, podemos emplear el llamado Method Security, una poderosa forma de definir qué usuarios pueden ejecutar acciones específicas a nivel de método. Veamos cómo podemos implementar esto y limitar el acceso a funcionalidades más sensibles solo a usuarios autorizados.

### **¿Cómo funciona Method Security?**

El concepto de Method Security permite restringir a nivel de método qué roles de usuario pueden acceder a ciertas funcionalidades. En nuestra aplicación, por ejemplo, se ha diseñado para permitir que solo los usuarios con el rol Admin puedan ejecutar métodos específicos en el servicio `OrderService`, como obtener las órdenes de un cliente.

Al añadir la anotación `@Secured` en los métodos, podemos especificar un arreglo de roles permitidos para acceder al mismo. A continuación, se presenta un ejemplo de cómo implementar esta anotación:

```java
@Secured("ROLE_ADMIN")
public List<OrderEntity> getCustomerOrders(String idCustomer) {
		// lógica para obtener órdenes del cliente
    return this.orderRepository.findCustomerOrders(idCustomer);
}

```

### **¿Cómo configurar la seguridad a nivel de método?**

Para poder utilizar esta funcionalidad, es necesario hacer algunas configuraciones adicionales en nuestra clase de configuración de seguridad. Allí, debemos habilitar la seguridad a nivel de método con la anotación `@EnableMethodSecurity`, como se muestra:

```java
@Configuration
@EnableMethodSecurity(securedEnabled = true)
public class SecurityConfig {
    // configuración de seguridad
}

```

Estas configuraciones permiten a Spring Security gestionar las anotaciones de seguridad que no se encuentran directamente en un controlador, sino a nivel de servicio, otorgando así una capa adicional de control sobre las acciones que los usuarios pueden ejecutar.

### **¿Cómo probar la seguridad de los métodos?**

Una vez configuradas estas opciones, es crucial validar que la seguridad funciona adecuadamente. Esto lo podemos hacer mediante una herramienta como Postman:

1. **Prueba con usuario sin permisos suficientes**: Realizar una petición con credenciales de un usuario que no tiene el rol adecuado producirá una respuesta HTTP 403, indicando que la solicitud está prohibida debido a las restricciones de seguridad implementadas.
2. **Prueba con usuario con permisos adecuados**: Por el contrario, un usuario con el rol Admin al realizar la misma petición obtendrá una respuesta exitosa, confirmando que tiene los permisos necesarios para ejecutar el método protegido.

Esta metodología no solo protege nuestros controladores, sino que asegura que las reglas de negocio definidas dentro de nuestros servicios están salvaguardadas, brindándonos la tranquilidad de saber que solo los usuarios con permisos adecuados podrán ejecutar ciertas acciones.

El uso eficaz de Spring Security y Method Security reafirma un compromiso con la seguridad, asegurando que solo los usuarios autorizados pueden interactuar con características críticas de la aplicación. ¡Sigue explorando y aprendiendo a implementar técnicas que salvaguarden tus proyectos!




# 17-Creación y Uso de JSON Web Tokens en Java con Auth0

Creado: 21 de octubre de 2025 18:43
ítem principal: 04-SEGURIDAD CON JWT (https://www.notion.so/04-SEGURIDAD-CON-JWT-28cf5b42f77080d19cd3d98955c662a8?pvs=21)

## **¿Qué es un JSON Web Token y cómo funciona?**

Los JSON Web Tokens (JWT) son un estándar de código abierto diseñado para el intercambio seguro de información entre partes. Este tipo de tokens utiliza el formato JSON y es especialmente útil para autenticación y autorización. La estructura de un JWT consta de tres partes: Header, Payload y Signature, que aseguran la validez y seguridad del token.

- **Header**: Incluye el algoritmo de encriptación (como HMAC, RSA) y el tipo de token, que generalmente es JWT.
- **Payload**: Contiene la información que se desea transmitir (claims). Algunos parameters estándar son:
    - `iss` (issuer): Quién emitió el token.
    - `iat` (issued at): Cuándo fue emitido.
    - `exp` (expiration): Cuándo expira.
    - Claims personalizados: Puede agregar datos específicos según sus necesidades.
- **Signature**: Se usa para verificar que el mensaje no haya sido alterado. Combina el Header, Payload y una clave secreta utilizando el algoritmo especificado.

### **¿Cómo se implementa un JWT en Java con Auth0?**

Para implementar JWT en Java, se utiliza una librería de Auth0, que facilita la generación y manipulación de estos tokens. Aquí se detalla cómo incluir la dependencia necesaria en tu proyecto Java mediante Gradle y cómo implementar un método para crear un JWT.

1. **Agregar la dependencia a tu proyecto**:
    - Visita `jwt.io`, filtra por librerías para Java y selecciona la de Auth0.
    - Copia la dependencia de Maven Central:

    ```groovy
    dependencies {
        implementation 'com.auth0:java-jwt:4.3.0'
    }
    
    ```

    - Actualiza tu configuración de Gradle para instalar la dependencia.
2. **Crear un archivo de utilidades para manejar JWT**:

   Crea una clase para generar y manejar tokens:

    ```java
    import com.auth0.jwt.JWT;
    import com.auth0.jwt.algorithms.Algorithm;
    import org.springframework.stereotype.Component;
    
    import java.util.Date;
    import java.util.concurrent.TimeUnit;
    
    @Component
    public class JwtUtil {
    
        private static String SECRET_KEY = "p1zz3r14_4pp";
        private static Algorithm ALGORITHM = Algorithm.HMAC256(SECRET_KEY);
    
        public String create(String username) {
            return JWT.create()
                    .withSubject(username)
                    .withIssuer("pizzeria-app") // quien emitió el token
                    .withIssuedAt(new Date())   // Cuando fue emitido
                    .withExpiresAt(new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(15))) // Cuando expira
                    .sign(ALGORITHM);
        }
    }
    
    ```


### **¿Cómo crear y gestionar JSON Web Tokens?**

El siguiente paso es entender cómo generar un JWT a partir de un usuario y las especificaciones necesarias:

- **Creación del token**:
    - **Determine el sujeto**: Generalmente es el nombre de usuario.
    - **Determine el emisor**: El nombre de su aplicación, por ejemplo, "PlatziPizza".
    - **Datos temporales**: Fecha de creación y fecha de expiración. En este caso, 15 días a partir de la emisión.
    - **Algoritmo de firma**: Utiliza HMAC con un `secretKey`.

La autenticación con JWT es robusta y adecuada para aplicaciones sin estado (stateless), donde el token es enviado en cada solicitud, específico usando el encabezado HTTP `Authorization`. En este contexto, cambias el prefijo de "Basic" a "Bearer" junto con el token.

Este método asegura que solo los usuarios autenticados tengan acceso autorizado. Al firmar el token, se garantiza que cualquier alteración anule su validez, manteniendo la seguridad de la aplicación. Recuerda, una buena práctica es siempre probar y validar la implementación de seguridad antes de integrar completamente en producción. ¡Sigue aprendiendo y mejorando tus habilidades de programación!




# 18-Implementación de Autenticación con JSON Web Tokens en Spring Boot

Creado: 21 de octubre de 2025 23:58
ítem principal: 04-SEGURIDAD CON JWT (https://www.notion.so/04-SEGURIDAD-CON-JWT-28cf5b42f77080d19cd3d98955c662a8?pvs=21)

## **¿Cómo iniciar sesión con un controlador adecuado?**

Para permitir a un usuario iniciar sesión de manera segura y recibir un JSON Web Token para autenticación, primero es necesario entender el flujo de autenticación. Este flujo es crucial para asegurar que solo usuarios con credenciales válidas puedan obtener acceso a las funcionalidades protegidas de la aplicación.

1. **Recepción de la petición de autenticación**: La aplicación recibirá una petición a través del `AuthController` en el método `login`.
2. **Llamada al flujo de autenticación**: Este flujo se inicia al llamar al `AuthenticationManager`, que a su vez interactúa con el `AuthenticationProvider`. Este gestor es responsable de autenticar al usuario mediante su `username` y `password`.
3. **Verificación del usuario**: El `AuthenticationProvider` utiliza el `UserDetailService` (en este caso `UserSecurityService`) para recuperar los detalles del usuario desde la base de datos. Si las credenciales son correctas, se devuelve un código de estado 200, junto con un JSON Web Token.

Este es un ejemplo de cómo crear el controlador y el flujo en código:

```java
@Data
public class LoginDto {
    private String username;
    private String password;
}

@Configuration
@EnableMethodSecurity(securedEnabled = true)
public class SecurityConfig {

    //...//

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    //....//
}
```

```java
@Configuration
@EnableMethodSecurity(securedEnabled = true)
public class SecurityConfig {

    //...//

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    //....//
}
```

```java
@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @PostMapping("/login")
    private ResponseEntity<Void> login(@RequestBody LoginDto loginDto) {
        UsernamePasswordAuthenticationToken login = new UsernamePasswordAuthenticationToken(
                loginDto.getUsername(), loginDto.getPassword()
        );
        Authentication authentication = this.authenticationManager.authenticate(login);

        System.out.println(authentication.isAuthenticated());
        System.out.println(authentication.getPrincipal());

        String jwt = this.jwtUtil.create(loginDto.getUsername());

        return ResponseEntity.ok().header(HttpHeaders.AUTHORIZATION, jwt).build();
    }
}
```

## **¿Cómo configurar el SecurityConfig para permitir inicios de sesión?**

Es importante estipular qué rutas de la API requieren autenticación y cuáles se deben dejar sin protección para permitir los inicios de sesión. Aquí se debe ajustar la configuración de seguridad para habilitar el acceso a los end-points necesarios, asegurando que las peticiones de `login` no necesiten autenticación previa.

- **Añadir excepciones para el endpoint de autenticación**: Debemos configurar el `SecurityConfig` para permitir acceso al endpoint `/api/auth/**`.

```java
@Configuration
@EnableMethodSecurity(securedEnabled = true)
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests( auth -> auth
				                // Ejemplo //
                        .requestMatchers("/api/auth/**").permitAll()
                        // Fin Ejemplo
                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"/api/pizzas/**").hasAnyRole("ADMIN","CUSTOMER")
                        .requestMatchers(HttpMethod.POST,"/api/pizzas/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT).hasRole("ADMIN")
                        .requestMatchers("/api/orders/random").hasAuthority("random_order")
                        .requestMatchers("/api/orders/**").hasRole("ADMIN")
                        .requestMatchers("/api/customers/**").hasAnyRole("ADMIN","CUSTOMER")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }

    //...//
}

```

Así, el endpoint de autenticación estará accesible públicamente, lo cual es esencial para que un usuario pueda iniciar sesión y obtener su token de autorización.

## **¿Cómo manejar errores de autenticación?**

Durante el proceso de autenticación, es vital manejar adecuadamente los posibles errores. Por ejemplo, un rechazo de credenciales debe retornar un código de estado 401 con un mensaje claro para el usuario, indicando que las credenciales proporcionadas no son correctas.

- **Retorno de un 401 en caso de error**: Si las credenciales no son válidas, el sistema debe lanzar un error `Unauthorized`.

```java
/*
if (!authentication.isAuthenticated()) {
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
}
*/

```

Este enfoque asegura que la aplicación proporcione retroalimentación adecuada sobre el estado de la autenticación, mejorando así la experiencia del usuario y la seguridad de la aplicación. Además, instar a los desarrolladores a confiar en esta infraestructura proporciona un camino claro y seguro para gestionar la autenticación en sus aplicaciones.

Continúa explorando, entendiendo más sobre la autenticación y su implementación en aplicaciones modernas basadas en Spring Security. ¡Tu esfuerzo en la mejora continua es la clave del éxito en este mundo tecnológico en constante cambio!



# 19-Validación de JSON Web Tokens con Auth0 en Java

Creado: 23 de octubre de 2025 14:28
ítem principal: 04-SEGURIDAD CON JWT (https://www.notion.so/04-SEGURIDAD-CON-JWT-28cf5b42f77080d19cd3d98955c662a8?pvs=21)

## **¿Cómo validar un JSON Web Token en Java?**

En este artículo, exploraremos cómo validar un JSON Web Token (JWT) en Java utilizando la biblioteca Auth0. Esta práctica es crucial para garantizar que los tokens sean auténticos y no hayan sido manipulados. Además, aprenderemos a obtener al usuario al que pertenece el token. ¡Vamos allá!

### **¿Cómo crear el método `isValid`?**

Comencemos por crear un método que nos permita verificar la validez de un JSON Web Token dentro de nuestra clase `JWTUtils`. Este método es esencial para mejorar la seguridad de nuestras aplicaciones.

```java
@Component
public class JwtUtil {

		//...//

    public boolean isValid(String jwt) {
        try {
            JWT.require(ALGORITHM)
                    .build()
                    .verify(jwt);
            return true;
        } catch (JWTVerificationException e) {
            return false;
        }
    }
    
    //...//
}

```

### **Detalles del método `isValid`**

- **Parámetro:** El método `isValid` recibe un `String` que representa el JSON Web Token que se necesita validar.
- **Uso de Auth0:** Se utiliza la clase JWT y se especifica el algoritmo de encriptación utilizado anteriormente para la creación del token.
- **Verificación:** Si el token es válido, la función `verify` no producirá errores y regresará `true`.
- **Captura de excepciones:** La excepción `JWTVerificationException` indica que el token no es válido, y el método retornará `false`.

### **¿Cómo obtener el usuario del token con `getUserName`?**

Otro aspecto importante de la gestión de JWT es poder determinar a quién pertenece un token. Para esto, creamos el método `getUserName`.

```java
@Component
public class JwtUtil {

    //...//

    public String getUsername(String jwt) {
        return JWT.require(ALGORITHM)
                .build()
                .verify(jwt)
                .getSubject();
    }
}

```

### **¿Qué hace el método `getUserName`?**

- **Objeto DecodedJWT:** Si el token es verificado correctamente, la función obtiene un `DecodedJWT` que proporciona una representación legible del token.
- **Obtención del sujeto:** Utilizamos `getSubject()` para extraer el "subject", que es el usuario dentro del payload del token.
- **Captura de excepciones:** Devolverá `null` si el token no es válido o si ocurre algún error durante la verificación.

### **Explorando el JSON Web Token con JWT.io**

Para comprender cómo un JWT almacena información, es útil examinarlo visualmente en [**JWT.io**](https://jwt.io/). Al inicio de sesión, puedes reemplazar un token existente con uno válido y ver:

- **Encabezado:** Contiene el algoritmo y tipo de token.
- **Payload:** Incluye la información como el usuario (subject).
- **Firma:** Está generada con secret y garantiza la integridad del token.

Esta herramienta permite verificar rápidamente si los datos se están codificando y decodificando correctamente.

### **Conclusiones prácticas**

Con estos métodos, disponemos de un mecanismo robusto para asegurar que nuestros tokens JWT son válidos y para determinar a quién pertenecen. Esto es vital en cualquier aplicación que use autenticación basada en tokens, ya que asegura que las solicitudes de los usuarios sean válidas y autenticadas. ¡Sigue aprendiendo y mejorando tus habilidades para construir aplicaciones seguras!



# 20-Creación de Filtro de Seguridad JWT en Spring Security

Creado: 23 de octubre de 2025 16:14
ítem principal: 04-SEGURIDAD CON JWT (https://www.notion.so/04-SEGURIDAD-CON-JWT-28cf5b42f77080d19cd3d98955c662a8?pvs=21)

## **¿Cómo validar un JSON Web Token (JWT) con Spring Security?**

La seguridad es un aspecto crítico en aplicaciones que manejan datos sensibles y operaciones críticas. Una de las tecnologías de seguridad más utilizadas en microservicios es el JSON Web Token (JWT). En este artículo, exploraremos cómo implementar un filtro de seguridad que valide estos tokens utilizando Spring Security. Nuestro enfoque estará en la implementación de un filtro personalizado que evaluará las peticiones y autenticará las solicitudes de manera segura.

### **¿Cómo crear un filtro personalizado en Spring Security?**

La creación de un filtro personalizado que valide JWTs requiere una serie de pasos metódicos. Dentro de nuestro proyecto, se debe seguir un plan estratégico para que el filtro se integre correctamente:

1. **Creación de la clase JWTFilter:**
    - La clase `JWTFilter` se debe alojar dentro del paquete `config` y debe estar anotada con `@Component`. Esta anotación es esencial para que Spring pueda descubrir e inyectar esta clase durante su ciclo de vida de dependencia.

    ```java
    @Component
    @AllArgsConstructor
    public class JwtFilter{
    		//...//
    }
    ```

2. **Extender la clase para captar las solicitudes:**
    - Se debe extender de una clase específica de Spring, la `OncePerRequestFilter`. Esto asegura que el método `doFilterInternal` se ejecute con cada solicitud HTTP entrante, permitiendo la captura y evaluación de dichas solicitudes.

    ```java
    @Component
    @AllArgsConstructor
    public class JwtFilter extends OncePerRequestFilter {
    
        //...//
    }
    ```

3. **Sobrescribir el método `doFilterInternal`:**
    - Este método es el núcleo donde se gestionará la autenticación. Recibe parámetros como `HttpServletRequest`, `HttpServletResponse` y `FilterChain`.

    ```java
    @Component
    @AllArgsConstructor
    public class JwtFilter extends OncePerRequestFilter {
    
        @Override
        protected void doFilterInternal(
                HttpServletRequest request, HttpServletResponse response, FilterChain filterChain
        ) throws ServletException, IOException {
            //...//
        }
    }
    ```


### **¿Cuáles son los pasos para validar un JWT?**

La validación de un JWT implica seguir un conjunto estructurado de pasos para asegurar su autenticidad y su relación con un usuario válido.

1. **Validar el encabezado de autorización:**
    - Recuperar el encabezado con `request.getHeader(HttpHeaders.AUTHORIZATION)`.
    - Comprobar si está presente, no es nulo ni vacío, y si comienza con la cadena "Bearer".
    - Si alguna de estas verificaciones falla, la peticion debe dejarse procesar por el resto de la cadena de filtros sin más acciones.

    ```java
    @Component
    @AllArgsConstructor
    public class JwtFilter extends OncePerRequestFilter {
    
        private final JwtUtil jwtUtil;
        private UserDetailsService userDetailsService;
    
        @Override
        protected void doFilterInternal(
                HttpServletRequest request, HttpServletResponse response, FilterChain filterChain
        ) throws ServletException, IOException {
            // 1. Validar que sea un Header Authorization válido.
            String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
            if(authHeader==null || authHeader.isEmpty() || authHeader.startsWith("Bearer")) {
                filterChain.doFilter(request, response);
                return;
            }
    
            //...//
        }
    }
    ```

2. **Validar el JWT:**
    - Extraer el JWT del encabezado.
    - Usar el método `isValid` de la clase `JWTUtil` para comprobar su validez. Si el token es inválido, el filtro continuará sin marcar el usuario como autenticado.

    ```java
    @Component
    @AllArgsConstructor
    public class JwtFilter extends OncePerRequestFilter {
    
        private final JwtUtil jwtUtil;
    
        @Override
        protected void doFilterInternal(
                HttpServletRequest request, HttpServletResponse response, FilterChain filterChain
        ) throws ServletException, IOException {
            // 1. Validar que sea un Header Authorization válido.
            String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
            if(authHeader==null || authHeader.isEmpty() || authHeader.startsWith("Bearer")) {
                filterChain.doFilter(request, response);
                return;
            }
    
            // 2. Validar que el JWT sea válido.
            String jwt = authHeader.split(" ")[1].trim();
            if(!this.jwtUtil.isValid(jwt)) {
                filterChain.doFilter(request, response);
                return;
            }
    
            //...//
        }
    }
    ```

3. **Cargar el usuario del UserDetailService:**
    - Obtener el nombre de usuario a partir del token válido.
    - Buscar este nombre de usuario en el servicio `UserDetailService`, que recupera los detalles del usuario desde una base de datos.

    ```java
    @Component
    @AllArgsConstructor
    public class JwtFilter extends OncePerRequestFilter {
    
        private final JwtUtil jwtUtil;
        private UserDetailsService userDetailsService;
    
        @Override
        protected void doFilterInternal(
                HttpServletRequest request, HttpServletResponse response, FilterChain filterChain
        ) throws ServletException, IOException {
            // 1. Validar que sea un Header Authorization válido.
            String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
            if(authHeader==null || authHeader.isEmpty() || authHeader.startsWith("Bearer")) {
                filterChain.doFilter(request, response);
                return;
            }
    
            // 2. Validar que el JWT sea válido.
            String jwt = authHeader.split(" ")[1].trim();
            if(!this.jwtUtil.isValid(jwt)) {
                filterChain.doFilter(request, response);
                return;
            }
    
            // 3. Cargar el usuario del UserDetailService.
            String username = this.jwtUtil.getUsername(jwt);
            User user = (User) this.userDetailsService.loadUserByUsername(username);
    
            //...//
        }
    }
    ```

4. **Autenticar y cargar al contexto de seguridad:**
    - Crear un `UsernamePasswordAuthenticationToken` con el nombre de usuario, la contraseña y las autoridades.
    - Usar el `SecurityContextHolder` para configurar este token como la autenticación actual.

    ```java
    @Component
    @AllArgsConstructor
    public class JwtFilter extends OncePerRequestFilter {
    
        private final JwtUtil jwtUtil;
        private UserDetailsService userDetailsService;
    
        @Override
        protected void doFilterInternal(
                HttpServletRequest request, HttpServletResponse response, FilterChain filterChain
        ) throws ServletException, IOException {
            // 1. Validar que sea un Header Authorization válido.
            String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
            if(authHeader==null || authHeader.isEmpty() || authHeader.startsWith("Bearer")) {
                filterChain.doFilter(request, response);
                return;
            }
    
            // 2. Validar que el JWT sea válido.
            String jwt = authHeader.split(" ")[1].trim();
            if(!this.jwtUtil.isValid(jwt)) {
                filterChain.doFilter(request, response);
                return;
            }
    
            // 3. Cargar el usuario del UserDetailService.
            String username = this.jwtUtil.getUsername(jwt);
            User user = (User) this.userDetailsService.loadUserByUsername(username);
    
            // 4. Cargar el usuario en el contexto de seguridad.
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                    user.getUsername(),
                    user.getPassword(),
                    user.getAuthorities()
            );
    
            // 5. Enviar al contexto de seguridad
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            filterChain.doFilter(request, response);
        }
    }
    ```


### **¿Cómo implementar el usuario y contexto de seguridad?**

La correcta implementación del usuario y el contexto de seguridad es esencial para permitir que otras partes de la aplicación manejen la autenticación de manera uniforme. Aquí unos pasos críticos:

- **Inyección de dependencias:** Inyectar instancias necesarias como `JWTUtil` y `UserDetailService` con `@Autowired` para gestionarlas a través de Spring.

```java
@Component
@AllArgsConstructor
public class JwtFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;
    private UserDetailsService userDetailsService;
    
    //...//
}

```

- **Carga del contexto:** Utilizar `SecurityContextHolder.getContext().setAuthentication(authenticationToken)` para actualizar el contexto de seguridad una vez que el usuario haya pasado todas las validaciones.

```java
@Component
@AllArgsConstructor
public class JwtFilter extends OncePerRequestFilter {

			@Override
    protected void doFilterInternal(
            HttpServletRequest request, HttpServletResponse response, FilterChain filterChain
    ) throws ServletException, IOException {
    
				//...//
				
        // 5. Enviar al contexto de seguridad
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        filterChain.doFilter(request, response);
    }
}
```

### **¿Qué sigue después de implementar este filtro?**

Una vez implementado este filtro de seguridad, el paso siguiente es incluirlo en la cadena de filtros de Spring Security, garantizando que todas las peticiones a recursos seguros pasen por este filtro. Esto asegura que solamente los JWTs válidos y los usuarios autenticados puedan acceder a las operaciones protegidas de la aplicación. Siempre es clave revisar la documentación oficial de Spring Security para mantener las mejores prácticas y actualizaciones en seguridad.

El adentrarse en detalles, manejar excepciones, y una comprensión clara de la configuración de Spring Security son fundamentales para una implementación exitosa. No pierdas la oportunidad de seguir explorando nuevas funcionalidades y mantente siempre al tanto de las mejores prácticas en seguridad.



# 21-Implementación de JSON Web Token en Spring Security

Creado: 24 de octubre de 2025 1:13
ítem principal: 04-SEGURIDAD CON JWT (https://www.notion.so/04-SEGURIDAD-CON-JWT-28cf5b42f77080d19cd3d98955c662a8?pvs=21)

## **¿Cómo se integra un filtro JWT en Spring Security?**

La integración de un filtro JWT dentro de Spring Security es una tarea fundamental para asegurar que nuestras aplicaciones manejen la autenticación de manera segura y libre de sesiones de estado. El fin es que las peticiones sean validadas usando un JSON Web Token, lo cual se logra extendiendo la configuración de seguridad estándar.

### **¿Cómo se configura SecurityConfig para usar JWT?**

En primer lugar, es esencial ajustar la clase `SecurityConfig` para dejar de utilizar la autenticación básica HTTP y comenzar a usar la basada en JWT. Esto implica varias etapas:

- **Inyección del filtro JWT**: Se debe inyectar el filtro, `JwtFilter`, dentro del constructor de la clase `SecurityConfig` utilizando `@Autowired`.
- **Reemplazo de HTTP Basic**: En el método de configuración de seguridad, se reemplaza la última línea de autenticación básica por la adición del nuevo filtro JWT con `addFilter`.

```java
@Configuration
@EnableMethodSecurity(securedEnabled = true)
@AllArgsConstructor
public class SecurityConfig {

    private final JwtFilter jwtFilter;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(Customizer.withDefaults())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/api/auth/**").permitAll()
                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"/api/pizzas/**").hasAnyRole("ADMIN","CUSTOMER")
                        .requestMatchers(HttpMethod.POST,"/api/pizzas/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT).hasRole("ADMIN")
                        .requestMatchers("/api/orders/random").hasAuthority("random_order")
                        .requestMatchers("/api/orders/**").hasRole("ADMIN")
                        .requestMatchers("/api/customers/**").hasAnyRole("ADMIN","CUSTOMER")
                        .anyRequest().authenticated()
                )
                //Ejemplo
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
                //....
        return http.build();
    }

    //...//
}
```

### **¿Por qué es importante incluir el filtro antes de otros filtros?**

Cuando se decide agregar un filtro personal dentro de una aplicación Spring Security, es crucial determinar su lugar en la cadena de filtros. Para el caso de un filtro JWT:

- **Posicionamiento del filtro**: El filtro JWT debe incluirse antes de `BasicAuthenticationFilter` o incluso `UsernamePasswordAuthenticationFilter`, ya que es considerado un perfil estándar para asegurar la autenticación inicial en Spring.

### **¿Qué significa tener una aplicación stateless?**

Una aplicación stateless no almacena ninguna información sobre las sesiones del usuario entre las peticiones. Este enfoque, ideal para JWT, se consigue de la siguiente manera:

- **Configuración de la política de sesiones**: Dentro de `SecurityConfig`, establecer `SessionCreationPolicy.STATELESS` indica que la aplicación no mantendrá estado de sesión y que cada petición deberá ser autenticada de forma independiente.

```java

/*
.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
*/

```

## **¿Cómo se realiza la verificación de los detalles del usuario con JWT?**

La correcta implementación de JWT no solo garantiza el paso seguro de peticiones, sino que también permite verificación detallada de las mismas:

### **¿Cómo carga el contexto de seguridad?**

La carga adecuada del contexto de seguridad es primordial:

- **Incluir detalles de autenticación**: Antes de añadir la autenticación al contexto de seguridad, se añaden detalles relevantes usando `setDetails()` en el `AuthenticationToken`.
- **Uso de WebAuthenticationDetailsSource**: Se emplea para construir detalles extra, como la dirección IP remota y evitar el uso de una sesión debido al enfoque stateless.

```java
@Component
@AllArgsConstructor
public class JwtFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;
    private UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request, HttpServletResponse response, FilterChain filterChain
    ) throws ServletException, IOException {
        // 1. Validar que sea un Header Authorization válido.
        // 2. Validar que el JWT sea válido
        // 3. Cargar el usuario del UserDetailService.
        // 4. Cargar el usuario en el contexto de seguridad.
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                user.getUsername(),
                user.getPassword(),
                user.getAuthorities()
        );
        authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        // 5. Enviar al contexto de seguridad
    }
}
```

### **¿Cómo se evalúan las peticiones en consola?**

Una vez configurada la seguridad:

- **Validación de peticiones JWT**: Usando Postman, primero se inicia sesión para obtener un JWT. Al realizar una petición con el token, se verifica su validez, garantizando un flujo seguro excluyendo el uso de credenciales básicas.
- **Manejo de peticiones con token manipulado**: En caso de alterar el contenido del token (como el `sub` cambiando de `admin` a `customer`), el servidor responde con un `403`, demostrando que el token fue manipulado y su firma no es válida.

Mediante una gestión adecuada de la configuración de Spring Security con JWT, se asegura que la aplicación no solo sea segura, sino también eficiente y libre de extensos manejos de sesión. Este proceso fortalece la capacidad de autenticación y autorización, indispensable para aplicaciones modernas y seguras.




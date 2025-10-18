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




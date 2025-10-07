# 01-Curso de Spring Data JPA con MySQL y Restful API

Creado: 3 de octubre de 2025 14:13
ítem principal: 01-INTRODUCCION A SPRING DATA JPA (https://www.notion.so/01-INTRODUCCION-A-SPRING-DATA-JPA-281f5b42f77080708a77e8a4fc7817c6?pvs=21)

## **¿Qué es Spring Data?**

Spring Data es una parte esencial del ecosistema Spring. Es un conjunto de proyectos que facilita el acceso y manejo de datos en diversas bases de datos utilizando el modelo de Spring. El propósito de Spring Data es simplificar el desarrollo de aplicaciones al proporcionar una abstracción sobre las bases de datos, permitiendo a los desarrolladores concentrarse en los problemas de negocio.

### **¿Cuáles son los subproyectos de Spring Data?**

Dentro de Spring Data, existen varios subproyectos que están diseñados para trabajar con diferentes tecnologías de bases de datos:

- **Spring Data JPA**: Se enfoca en la implementación del proveedor JPA para ORM, lo cual es crucial para manejar bases de datos relacionales.
- **Spring Data JDBC**: Proporciona un acceso más directo y ligero a las bases de datos relacionales.
- **Spring Data MongoDB**: Ofrece soporte para las operaciones CRUD sobre bases de datos basadas en documentos como MongoDB.
- **Spring Data Cassandra**: Diseñado para mapas de columnas distribuidas, típico en bases de datos NoSQL como Cassandra.

Cada subproyecto está dirigido a un tipo específico de base de datos, ofreciendo herramientas especializadas para operar de manera efectiva con ellas.

## **¿Qué necesitas para seguir este curso?**

Antes de embarcarte en este curso de Spring Data JPA, es crucial asegurarte de tener todas las herramientas y conocimientos necesarios para una experiencia de aprendizaje fluida.

### **Conocimientos previos**

- **Spring y Spring Boot**: Debes tener una base sólida en estos temas. Si no has tomado cursos previos, te recomendaría revisar recursos adicionales o cursos introductorios.

### **Herramientas requeridas**

1. **JDK de Java**: Será necesario instalar la versión 17 del JDK. Se recomiendan versiones open-source como Eclipse Temurin o Amazon Corretto.
2. **IntelliJ IDEA**: Es el IDE recomendado debido a su prevalencia en la industria y sus robustas funcionalidades. Sin embargo, puedes usar cualquier IDE con el que te sientas cómodo.
3. **Base de datos MySQL**: Este curso se centrará en integraciones con MySQL. Es ampliamente utilizada y te permitirá experimentar con procedimientos almacenados al final del curso. Si optas por otra base de datos, estarás adaptando la sintaxis correspondiente.
4. **Postman**: Utilizaremos Postman para probar nuestras API REST. Asegúrate de tenerlo instalado para facilitar el testing de tus implementaciones.

## **¿Cómo aplicaremos el conocimiento en este curso?**

El curso se centra en la aplicación práctica del conocimiento mediante el desarrollo de una aplicación para la gestión de una pizzería. Aquí tienes una visión general de lo que haremos:

1. **Gestión de pizzas**: Administrar la información relacionada con las pizzas, como ingredientes, precios y tamaños.
2. **Trabajo con clientes**: Implementarás funcionalidades para la gestión de datos de los clientes.
3. **Órdenes de servicio**: Se llevará a cabo la creación y gestión de órdenes de servicio, proporcionando una visión completa y funcional del negocio.

Este enfoque práctico no solo enriquecerá tus habilidades técnicas, sino que también te dará una perspectiva empresarial que te ayudará a entender y resolver problemas más allá de la codificación. Te veo en la siguiente clase, ¡vamos a disfrutar y aprender juntos en este viaje!



# 02-Creacion de Proyectos con Spring Initializer y Gadle

Creado: 3 de octubre de 2025 14:40
ítem principal: 01-INTRODUCCION A SPRING DATA JPA (https://www.notion.so/01-INTRODUCCION-A-SPRING-DATA-JPA-281f5b42f77080708a77e8a4fc7817c6?pvs=21)

## **¿Cómo crear un proyecto con Spring Initializer?**

Crear un proyecto con Spring Initializer es una experiencia sencilla e intuitiva que te ahorrará tiempo y esfuerzo. En este tutorial, vamos a ver cómo crear un proyecto de Spring utilizando Gradle y Java en su última versión disponible. Aquí te guiaré por los pasos necesarios para configurar correctamente tu proyecto y sus dependencias.

### **¿Qué es Spring Initializer?**

Spring Initializer es un sitio web oficial proporcionado por Spring que simplifica el proceso de crear proyectos basados en Spring. Al utilizar este sitio, puedes configurar tu proyecto con las dependencias necesarias de forma rápida y eficiente. Todo empieza visitando [**start.spring.io**](https://start.spring.io/), donde podrás personalizar tu aplicación desde su interfaz amigable.

### **¿Cómo configurar un proyecto con Spring Initializer?**

1. **Seleccionar Tipo de Proyecto y Lenguaje:**
    - En primer lugar, selecciona "Gradle" como tu tipo de proyecto y "Java" como el lenguaje.
2. **Configurar Detalles del Proyecto:**
    - Define la versión de Spring Boot; en este caso, usaremos la versión 3.04.
    - Establece el grupo como `com.platzi` y asigna al artefacto y al nombre del proyecto `platzi-pixeria`.
    - Ajusta el nombre del paquete a `com.platzi.pizza` para evitar repeticiones innecesarias.
    - Elige YAR para el empaquetamiento, indicando que es una aplicación autocontenida.
    - Usa Java 17 como el SDK del proyecto.
3. **Incluir Dependencias:**
    - Agrega la dependencia **Spring Web** para crear una API REST.
    - Incluye **Spring Data JPA** para manejar persistencia de datos con JPA e Hibernate.
    - Añade **Lombok** para simplificar el código mediante anotaciones.
    - Si vas a utilizar MySQL, incorpora el driver correspondiente.

### **¿Cómo abrir un proyecto en IntelliJ IDEA?**

Una vez que descargues el proyecto en formato ZIP desde Spring Initializer, deberás descomprimirlo y abrirlo en tu entorno de desarrollo integrado (IDE). Aquí te explico cómo hacerlo paso a paso en IntelliJ IDEA:

1. **Descomprimir el Proyecto:**
    - Extrae el archivo ZIP descargado para acceder a su contenido.
2. **Abrir en IntelliJ:**
    - Selecciona la opción "Open" en IntelliJ IDEA.
    - Navega hasta la carpeta descomprimida y selecciona `build.gradle`.
    - Asegúrate de abrirlo como un proyecto: "Open as a Project".
3. **Verificar Configuración de la JVM:**
    - Comprueba que estás utilizando la versión de Java 17; ve a **File > Settings**, selecciona **Build Execution and Deployment > Build Tools > Gradle**, y ajusta la JVM si es necesario.
    - En **Module Settings**, también asegúrate de aplicar SDK 17.

### **¿Cómo estructurar el proyecto?**

1. **Configura la Estructura del Proyecto:**
    - Dentro de `src/main/java/com/platzi/pizza`, crea los paquetes: `persistence`, `service`, y `web.controller`.
2. **Configura los Paquetes de Persistencia:**
    - Dentro de `persistence`, crea dos paquetes adicionales: `entity` y `repository`.

Esta estructura te permitirá organizar tu código de forma clara y eficiente, estableciendo una base sólida para el desarrollo de tu aplicación.

### **Consejos Prácticos**

- Al trabajar con **Lombok**, asegúrate de tener el plugin relevante instalado en IntelliJ para aprovechar al máximo sus características.
- Siempre verifica que tu entorno de desarrollo esté correctamente configurado para evitar errores de compilación relacionados con la versión de Java.
- Aunque estos pasos se centran en un entorno de desarrollo específico, los principios son aplicables a otras IDEs populares.

Con esta guía, estás listo para comenzar a desarrollar tu aplicación Spring de manera eficiente. Mantente atento en las próximas secciones para aprender cómo conectar tu aplicación y darle vida a tus servicios web.



# 03-Conexión de Proyecto Java a Base de Datos MySQL en IntelliJ IDEA

Creado: 6 de octubre de 2025 14:02
ítem principal: 02-PRIMEROS PASOS (https://www.notion.so/02-PRIMEROS-PASOS-281f5b42f770809ba8def15039bfc3d1?pvs=21)

## **¿Cuál es el modelo de entidad-relación de la pizzería?**

Nuestro modelo de entidad-relación para la base de datos del proyecto de pizzería está compuesto por cuatro tablas fundamentales: `pizza`, `pizza_order`, `order_item` y `customer`. Aquí desglosamos brevemente cada una de estas tablas y sus funciones:

- **Tabla `pizza`:**
    - **ID de pizza:** Identificador único de cada pizza.
    - **Nombre y descripción:** Información detallada de la pizza.
    - **Precio:** Tipo decimal 5,2 (cinco dígitos en total, dos después del punto).
    - **Atributos booleanos:** Identificación de si la pizza es vegetariana, vegana o está disponible mediante el uso de columnas `tinyint`.
- **Tabla `pizza_order`:**
    - **ID de orden:** Identificador único de cada orden.
    - **Relación con `customer`:** Usando `ID customer` como clave foránea.
    - **Fecha de la orden:** Registro temporal de la creación de la orden.
    - **Valor total:** Suma del costo de todas las pizzas en la orden.
    - **Método de entrega:** Almacena en un carácter si la orden es para llevar, recoger o para comer en el lugar.
    - **Notas adicionales:** Registro para observaciones específicas del cliente sobre la orden.
- **Tabla `customer`:**
    - **ID de cliente:** Identificación única de cada cliente.
    - **Datos del cliente:** Incluye nombre, dirección, email y número de teléfono.
- **Tabla `order_item`:**
    - **Relación uno a uno con `pizza`:** Cada ítem de la orden tiene un enlace a una pizza específica.
    - **Relación uno a muchos con `pizza_order`:** Una orden puede tener múltiples ítems.
    - **Claves primarias:** Compuestas por `ID item` y `ID order`.
    - **Cantidad y precio:** Manejo de cantidades y ajustes de precios según la cantidad de pizzas pedidas.

## **¿Cómo conectar el proyecto a la base de datos?**

Para conectar nuestro proyecto a una base de datos MySQL desde `IntelliJ IDEA`, debemos editar el archivo `application.properties` dentro del directorio `resources`. Aquí se deben poner cuatro instrucciones esenciales para establecer la conexión:

```
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/fixeria?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=admin

```

### **¿Qué parámetros son esenciales en `application.properties`?**

- **`spring.datasource.driver-class-name`:** Especifica el tipo de base de datos.
- **`spring.datasource.url`:** Dirección y nombre de la base de datos junto con la instrucción `createDatabaseIfNotExist=true` para MySQL.
- **`spring.datasource.username` y `password`:** Credenciales de acceso a la base de datos.

## **Configuración avanzada: ¿Cómo utilizar `Hikari CP` y `Spring JPA`?**

### **¿Para qué sirve `Hikari CP`?**

`Hikari CP` es un gestor automático de conexiones a base de datos, optimizando la cantidad de conexiones según la concurrencia de usuarios en la aplicación. Ofrece un mejor rendimiento y es fundamental para la eficiencia y escalabilidad del sistema.

### **¿Cómo configurar `Spring JPA`?**

Para gestionar dinámicamente el esquema de base de datos, podemos añadir y configurar `Spring JPA`:

```
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```

- **`spring.jpa.hibernate.ddl-auto`:**
    - **`update`:** Se adapta al esquema al sincronizar cambios sin perder datos.
- **`spring.jpa.show-sql`:** Permite visualizar en la consola las acciones SQL realizadas por nuestra aplicación.

Estas configuraciones permiten que la estructura de las bases de datos se actualice automáticamente a partir de las entidades definidas en nuestro proyecto. Además, habilitar `show-sql` nos ayuda a verificar y analizar cómo nuestras acciones afectan a la base de datos en tiempo real.

## **¿Cómo adaptar la nueva interfaz de `IntelliJ IDEA`?**

Finalmente, para aprovechar las actualizaciones de `IntelliJ IDEA` en su interfaz, podemos activar la "New UI" en `Appearance & Behavior`. Esto nos permitirá familiarizarnos con una interfaz más moderna y eficiente. Simplemente habilita la interfaz, aplica los cambios y reinicia `IntelliJ IDEA`.

Utilizar estas opciones no solo mejora la experiencia de desarrollo, sino que también optimiza la gestión del proyecto en entorno de bases de datos. Al seguir aprendiendo y explorando nuevas herramientas y configuraciones, potencias tu capacidad para crear aplicaciones robustas y eficientes. ¡Sigue adelante y explora más en este emocionante viaje de aprendizaje!



# 04-Creación de Entidades con Hibernate en Java

Creado: 7 de octubre de 2025 12:59
ítem principal: 02-PRIMEROS PASOS (https://www.notion.so/02-PRIMEROS-PASOS-281f5b42f770809ba8def15039bfc3d1?pvs=21)

## **¿Cómo crear entidades con Hibernate y JPA?**

La creación de entidades en un proyecto usando Hibernate y JPA es un proceso esencial para traducir tu modelo lógico al físico, generando automáticamente tablas en la base de datos. En este artículo, exploraremos cómo configurar y crear entidades básicas, comenzando con `PizzaEntity` y `OrderEntity`.

### **¿Cómo se configura la clase PizzaEntity?**

Para comenzar a definir nuestra entidad `PizzaEntity`, lo primero es entender que cada clase se debe anotar con `@Entity` y `@Table`, lo que indica que se traducirá a una tabla:

```java
import jakarta.persistence.*;

@Entity
@Table(name = "pizza")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pizza", nullable = false)
    private Integer idPizza;

    @Column(unique = true, nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 150)
    private String description;

    @Column(nullable = false, columnDefinition = "DECIMAL(5,2)")
    private Double price;

    @Column(columnDefinition = "TINYINT")
    private Boolean vegetarian;

    @Column(columnDefinition = "TINYINT")
    private Boolean vegan;

    @Column(columnDefinition = "TINYINT", nullable = false)
    private Boolean available;
}

```

- **Paso clave**: Usar la anotación `@Id` junto con `@GeneratedValue` especifica que este campo es la clave primaria y se autoincrementará.
- **Detalles adicionales**: `@Column` permite definir características adicionales de las columnas, como `unique`, `nullable`, `length` y `columnDefinition`.

### **¿Cómo se crea la entidad OrderEntity?**

La entidad `OrderEntity` es similar, pero incluye atributos adeguados a su propósito:

```java
@Entity
@Table(name = "pizza_order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order", nullable = false)
    private Integer idOrder;

    @Column(name = "id_customer", nullable = false, length = 15)
    private String idCustomer;

    @Column(nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime date;

    @Column(nullable = false, columnDefinition = "DECIMAL(6,2)")
    private Double total;

    @Column(nullable = false, columnDefinition = "CHAR(1)")
    private String method;

    @Column(name = "additional_notes", length = 200)
    private String additionalNotes;
}

```

- **Importante**: En caso de atributos que representen fechas o precios, es crucial definir correctamente los tipos de datos con `columnDefinition`.
- **Aclaración**: Atributos como `additionalNotes` permiten `null`, lo que implica que no es necesario anotar con `nullable` si no afecta el diseño.

### **¿Qué librerías se utilizan?**

Se hace uso de las librerías proveídas por **Jakarta** para la gestión de persistencia y entidades. Esto es esencial al migrar desde JavaX. Herramientas como **Lombok** pueden facilitar la creación de getters y setters sin complicar el código con `@Data` cuando no es necesario, especialmente para prácticas más refinadas en ORM.

```java
@Getter
@Setter
@NoArgsConstructor
public class PizzaEntity {
    // Atributos y configuración
}

```

### **¿Por qué es importante definir estrategias y validaciones?**

Definir estrategias para la generación de valores, como con `strategy = GenerationType.IDENTITY`, es vital para garantizar que la base de datos maneje eficientemente los IDs. La validación de datos a nivel de base de datos mediante constraints como `nullable = false` y `unique = true` protege la integridad del modelo.

### **¿Cómo probar la creación automática de tablas?**

Después de definir las entidades y configurarlas con Hibernate, al ejecutar la aplicación, las tablas deberían generarse automáticamente. Esto se puede confirmar si en el log de la consola Hibernate muestra mensajes de `create table` indicando la creación de `pizza` y `pizza_order`.

### **¿Puedes implementar otras entidades?**

Te invito a que crees las entidades restantes, `Customer` y `OrderItem`, aplicando los conceptos discutidos aquí. Un desafío adicional es implementar las claves primarias compuestas para `OrderItem`. ¡No te desanimes si encuentras dificultades! Aprender y explorar nuevas técnicas es parte del viaje del desarrollo de software.





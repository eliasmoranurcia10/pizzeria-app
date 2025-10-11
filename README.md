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
- Aunque estos pasos se centran en un entorno de desarrollo específico, los principios son aplicables a otras Ides populares.

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
    - **Atributos booleanos:** Identificación de la pizza es vegetariana, vegana o está disponible mediante el uso de columnas `tinyint`.
- **Tabla `pizza_order`:**
    - **Id de orden:** Identificador único de cada orden.
    - **Relación con `customer`:** Usando `ID customer` como clave foránea.
    - **Fecha de la orden:** Registro temporal de la creación de la orden.
    - **Valor total:** Suma del costo de todas las pizzas en la orden.
    - **Método de entrega:** Almacena en un carácter si la orden es para llevar, recoger o para comer en el lugar.
    - **Notas adicionales:** Registro para observaciones específicas del cliente sobre la orden.
- **Tabla `customer`:**
    - **Id de cliente:** Identificación única de cada cliente.
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

Finalmente, para aprovechar las actualizaciones de `IntelliJ IDEA` en su interfaz, podemos activar la "New UI" en `Appearance & Behavior`. Esto nos permitirá familiarizarnos con una interfaz más moderna y eficiente. Simplemente, habilita la interfaz, aplica los cambios y reinicia `IntelliJ IDEA`.

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

- **Paso clave**: Usar la anotación `@Id` junto con `@GeneratedValue`  específica que este campo es la clave primaria y se autoincrementará.
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



# 05-Relaciones entre Entidades en JPA: OneToOne, ManyToOne, OneToMany

Creado: 7 de octubre de 2025 18:19
ítem principal: 02-PRIMEROS PASOS (https://www.notion.so/02-PRIMEROS-PASOS-281f5b42f770809ba8def15039bfc3d1?pvs=21)

## **¿Cómo se traducen las relaciones a entidades con anotaciones en JPA?**

El mapeo de relaciones en JPA (Java Persistence API) es una pieza esencial para trabajar con bases de datos relacionales. En esta guía, exploraremos cómo implementar diferentes tipos de relaciones entre entidades usando anotaciones como `@OneToOne`, `@ManyToOne` y `@OneToMany`.

El objetivo es que puedas entender cómo estas relaciones se representan en el código para que puedan interactuar eficazmente durante las operaciones de manipulación de datos.

### **¿Cuáles son los tipos de relaciones más comunes?**

Antes de adentrarnos en el código, recordemos los cuatro tipos de tablas que discutimos:

1. **Uno a Uno**: Se representa mediante `@OneToOne`. En nuestro caso, la relación es entre `OrderItem` y `Pixsa`, lo que significa que cada `OrderItem` está asociado con un solo `Pixsa`.
2. **Uno a Muchos**: Se logra con `@OneToMany`. `PixsaOrder` puede contener muchos `OrderItems`.
3. **Muchos a Uno**: Utiliza `@ManyToOne`. Este tipo de relación también se observa entre `OrderItem` y `PixsaOrder`, donde múltiples `OrderItems` pueden asociarse a una sola orden.

Un ejemplo práctico de los códigos de anotaciones es fundamental para visualizar mejor estas relaciones:

```java
// Relación Uno a Uno
@OneToOne
@JoinColumn(name = "id_pizza", referencedColumnName = "id_pizza", insertable = false, updatable = false)
private PizzaEntity pizza;

```

```java
// Relación Muchos a Uno
@ManyToOne
@JoinColumn(name = "idOrder", referencedColumnName = "idOrder", insertable = false, updatable = false)
private OrderEntity order;

```

### **¿Cómo se trabaja con claves primarias compuestas?**

Creación de claves compuestas es otra parte vital del trabajo con JPA, donde dos o más atributos forman una clave primaria:

- Utilizar la anotación `@IdClass` es esencial para gestionar estas claves compuestas.

Ejemplo de cómo definimos varias claves:

```java
@IdClass(OrderItemId.class) // Define la clase de clave compuesta
public class OrderItemEntity {

    @Id
    private Integer idOrder;

    @Id
    private Integer idItem;

    // Métodos adicionales (equals, hashCode) para asegurar consistencia
}

```

### **¿Cómo se implementan las anotaciones para asegurar integridad referencial?**

En la integración de estas relaciones, la integridad y el rendimiento son cruciales. Utilizar `@JoinColumn` es importante. Se usa para especificar la columna a través de la cual están vinculadas dos tablas.

Por ejemplo, se puede definir la relación `OneToMany` como sigue:

```java
@OneToMany(mappedBy = "order")
private List<OrderItemEntity> items;

```

Aquí, `mappedBy` se utiliza para definir la relación en el lado no propietario. En nuestra aplicación,  `OrderEntity` es el lado no propietario, y `OrderItemEntity` la tabla hija donde se originan muchas instancias desde una sola orden.

### **¿Cuáles son las recomendaciones para el uso de estas relaciones?**

Al crear relaciones, es clave tener en cuenta el impacto en el desempeño de la aplicación. No siempre es necesario crear relaciones bidireccionales o añadir todas las posibles relaciones que se puedan modelar.

1. **Simplificar consultas**: Mediante consultas `{query}` o repositorios de Spring, se pueden derivar datos sin necesidad de establecer relaciones directas en todos los contextos.
2. **Evitar sobrecarga**: Solo se deben crear las relaciones que sean necesarias estrictamente para garantizar el rendimiento óptimo y la reducción de carga.

Crear relaciones en JPA es esencial para lograr una interacción efectiva entre entidades y bases de datos. Los conceptos discutidos, como el uso de anotaciones y claves compuestas, te posicionan mejor para desarrollar aplicaciones robustas que gestionan eficientemente los datos.

Sigue explorando y aplicando estos principios para afianzarte en el desarrollo backend utilizando JPA. ¡Tu maestría en estos conceptos solo puede mejorar y refinándose!



# 06-Consultas SQL con JDBC Template en Spring Boot

Creado: 7 de octubre de 2025 19:57
ítem principal: 02-PRIMEROS PASOS (https://www.notion.so/02-PRIMEROS-PASOS-281f5b42f770809ba8def15039bfc3d1?pvs=21)

```sql
-- TRUNCATE TABLES
SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE `pizzeria`.`order_item`;
TRUNCATE `pizzeria`.`pizza_order`;
TRUNCATE `pizzeria`.`customer`;
TRUNCATE `pizzeria`.`pizza`;
SET FOREIGN_KEY_CHECKS = 1;

-- INSERT CUSTOMERS
INSERT INTO `pizzeria`.`customer` (`id_customer`, `name`, `address`, `email`, `phone_number`)
VALUES
("863264988","Drake Theory","P.O. Box 136, 4534 Lacinia St.","draketheory@hotmail.com","(826) 607-2278"),
("617684636","Alexa Morgan","Ap #732-8087 Dui. Road","aleximorgan@hotmail.com","(830) 212-2247"),
("474771564","Johanna Reigns","925-3988 Purus. St.","johareigns@outlook.com","(801) 370-4041"),
("394022487","Becky Alford","P.O. Box 341, 7572 Odio Rd.","beckytwobelts@icloud.com","(559) 398-7689"),
("885583622","Brock Alford","9063 Aliquam, Road","brockalford595@platzi.com","(732) 218-4844"),
("531254932","Clarke Wyatt","461-4278 Dignissim Av.","wyattplay@google.co","(443) 263-8555"),
("762085429","Cody Rollins","177-1125 Consequat Ave","codyforchamp@google.com","(740) 271-3631"),
("363677933","Bianca Neal","Ap #937-4424 Vestibulum. Street","bianca0402@platzi.com","(792) 406-8858"),
("192758012","Drew Watson","705-6031 Aliquam Street","wangwatson@icloud.com","(362) 881-5943"),
("110410415","Mercedes Balor","Ap #720-1833 Curabitur Av.","mercedesbalorclub@hotmail.com","(688) 944-6619"),
("262132898","Karl Austin","241-9121 Fames St.","stonecold@icloud.com","(559) 596-3381"),
("644337170","Sami Rollins","Ap #308-4700 Mollis Av.","elgenerico@outlook.com","(508) 518-2967"),
("782668115","Charlotte Riddle","Ap #696-6846 Ullamcorper Avenue","amityrogers@outlook.com","(744) 344-7768"),
("182120056","Matthew Heyman","Ap #268-1749 Id St.","heymanboss@hotmail.com","(185) 738-9267"),
("303265780","Shelton Owens","Ap #206-5413 Vivamus St.","figthowens@platzi.com","(821) 880-6661");

-- INSERT PIZZAS
INSERT INTO `pizzeria`.`pizza` (`id_pizza`, `name`, `description`, `price`, `vegetarian`, `vegan`, `available`)
VALUES
(1,"Pepperoni", "Pepperoni, Homemade Tomato Sauce & Mozzarella.", 23.0, 0, 0, 1),
(2,"Margherita", "Fior de Latte, Homemade Tomato Sauce, Extra Virgin Olive Oil & Basil.", 18.5, 1, 0, 1),
(3,"Vegan Margherita", "Fior de Latte, Homemade Tomato Sauce, Extra Virgin Olive Oil & Basil.", 22.0, 1, 1, 1),
(4,"Avocado Festival", "Hass Avocado, House Red Sauce, Sundried Tomatoes, Basil & Lemon Zest.", 19.95, 1, 0, 1),
(5,"Hawaiian", "Homemade Tomato Sauce, Mozzarella, Pineapple & Ham.", 20.5, 0, 0, 0),
(6,"Goat Chesse", "Portobello Mushrooms, Mozzarella, Parmesan & Goat Cheeses with Alfredo Sauce.", 24.0, 0, 0, 1),
(7,"Mother Earth", "Artichokes, Roasted Peppers, Rapini, Sundried Tomatoes, Onion, Shaved Green Bell Peppers & Sunny Seasoning.", 19.5, 1, 0, 1),
(8,"Meat Lovers", "Mild Italian Sausage, Pepperoni, Bacon, Homemade Tomato Sauce & Mozzarella.", 21.0, 0, 0, 1),
(9,"Marinated BBQ Chicken", "Marinated Chicken with Cilantro, Red Onions, Gouda, Parmesan & Mozzarella Cheeses.", 20.95, 0, 0, 0),
(10,"Truffle Cashew Cream", "Wild mushrooms, Baby Kale, Shiitake Bacon & Lemon Vinaigrette. Soy free.", 22.0, 1, 1, 1),
(11,"Rico Mor", "Beef Chorizo, Sundried Tomatoes, Salsa Verde, Pepper, Jalapeno & pistachios", 23.0, 0, 0, 1),
(12,"Spinach Artichoke", "Fresh Spinach, Marinated Artichoke Hearts, Garlic, Fior de Latte, Mozzarella & Parmesan.", 18.95, 1, 0, 1);

-- INSERT ORDERS
INSERT INTO `pizzeria`.`pizza_order` (`id_order`, `id_customer`, `date`, `total`, `method`, `additional_notes`)
VALUES
(1, "192758012", DATE_SUB(NOW(), INTERVAL 5 DAY), 42.95, "D", "Don't be late pls."),
(2, "474771564", DATE_SUB(NOW(), INTERVAL 4 DAY), 62.0, "S", null),
(3, "182120056", DATE_SUB(NOW(), INTERVAL 3 DAY), 22.0, "C", null),
(4, "617684636", DATE_SUB(NOW(), INTERVAL 2 DAY), 42.0, "S", null),
(5, "192758012", DATE_SUB(NOW(), INTERVAL 1 DAY), 20.5, "D", "Please bring the jalapeños separately."),
(6, "782668115", NOW(), 23, "D", null);

-- INSERT ORDER ITEMS
INSERT INTO `pizzeria`.`order_item` (`id_order`, `id_item`, `id_pizza`, `quantity`, `price`)
VALUES
(1, 1, 1, 1, 23.0),
(1, 2, 4, 1, 19.95),
(2, 1, 2, 1, 18.5),
(2, 2, 6, 1, 24.0),
(2, 3, 7, 1, 19.5),
(3, 1, 3, 1, 22.0),
(4, 1, 8, 2, 42.0),
(5, 1, 10, 0.5, 11.0),
(5, 2, 12, 0.5, 9.5),
(6, 1, 11, 1, 23);
```

## **¿Cómo empezar a trabajar con la información de la base de datos?**

Para comenzar a gestionar la información almacenada en una base de datos, es fundamental tener una comprensión clara de cómo los datos están estructurados y cómo se pueden consultar eficientemente. El uso de herramientas adecuadas facilita la carga y consulta de datos de manera ordenada. En esta sesión, trabajaremos con consultas SQL a través de `JDBC Template` en un entorno Java, lo que nos permitirá explorar y manipular nuestra base de datos de manera efectiva.

### **¿Cómo realizar consultas con JDBC Template?**

Él  `JDBC Template` es una poderosa herramienta que permite realizar consultas SQL y mapear los resultados a clases Java. Este enfoque nos brinda flexibilidad y control sobre las interacciones con la base de datos. A continuación, mostramos cómo crear un método para consultar todas las pizzas en nuestra pizzería.

```java
@Service
public class PizzaService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PizzaService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<PizzaEntity> getAll() {
        return this.jdbcTemplate.query(
            "SELECT * FROM pizza",
            new BeanPropertyRowMapper<>(PizzaEntity.class)
        );
    }
}

```

1. **Definición del Servicio**: Utilizamos la anotación `@Service` para marcar nuestra clase como un servicio dentro del ciclo de vida de Spring.
2. **Uso de JdbcTemplate**: Declaramos e inyectamos `JdbcTemplate` para manejar las consultas SQL.
3. **Método de Consulta**: Creamos un método `getAll` que usa una consulta SQL para recuperar todas las entradas de la tabla `pizza` y mapearlas a objetos `PizzaEntity`.

### **¿Cómo exponer consultas a través de un controlador REST?**

Para hacer las consultas accesibles a través del API RESTful, necesitamos un controlador que gestione las solicitudes HTTP. Aquí explicamos cómo exponer las pizzas a través de un endpoint REST.

```java
@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {

    private final PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping
    public ResponseEntity<List<PizzaEntity>> getAll() {
        return ResponseEntity.ok(this.pizzaService.getAll());
    }
}

```

1. **Definición del Controlador**: Utilizamos `@RestController` para definir un controlador REST que maneja solicitudes HTTP.
2. **Configuración del Ruteo**: Con `@RequestMapping` establecemos `/api/pizzas` como el path para API.
3. **Método Get**: Usamos `@GetMapping` para especificar que este método responderá a solicitudes GET, devolviendo una lista de pizzas.

Ahora, al enviar una petición GET a `http://localhost:8080/api/pizzas`, podremos obtener un listado de todas las pizzas disponibles en la base de datos.

### **¿Cómo realizar consultas filtradas?**

Si queremos obtener un subconjunto específico de datos, podemos modificar nuestra consulta SQL añadiendo condiciones `WHERE`. Por ejemplo, para recuperar solo las pizzas que no están disponibles:

```java
public List<PizzaEntity> getUnavailablePizzas() {
    return this.jdbcTemplate.query(
        "SELECT * FROM pizza WHERE available = 0",
        new BeanPropertyRowMapper<>(PizzaEntity.class)
    );
}

```

1. **Consulta Condicional**: Filtramos las pizzas añadiendo la condición `WHERE available = 0`.
2. **Modificación del Método**: Creamos un nuevo método `getUnavailablePizzas` para encapsular esta lógica y facilitar su reutilización.

### **Pruebas con herramientas como Postman**

Una vez configurado el servicio y el controlador, es esencial probar nuestras consultas y API RESTful. Utilizamos herramientas como Postman para enviar solicitudes y verificar respuestas. También se pueden realizar cambios dinámicos en las consultas y probar los resultados inmediatamente después.

Este enfoque nos permite mantener un flujo efectivo de desarrollo y pruebas, asegurando que las consultas funcionen según lo esperado en un entorno real.

Con estas técnicas y herramientas, ahora estás listo para realizar consultas básicas y avanzadas a tu base de datos usando Java y Spring. Continúa explorando y experimentando con consultas para mejorar tu conocimiento y habilidades en el desarrollo de aplicaciones.



# 07-Uso de Spring Data Repositories para Gestión de Datos

Creado: 7 de octubre de 2025 20:15
ítem principal: 03-SPRING DATA REPOSITORIES (https://www.notion.so/03-SPRING-DATA-REPOSITORIES-281f5b42f770806c884ce10c3f0d7fd3?pvs=21)

## **¿Cómo facilitan los Spring Data Repositories la interacción con bases de datos?**

Los Spring Data Repositories son elementos fundamentales para desarrollar aplicaciones en Spring, pues simplifican notablemente el manejo de bases de datos al proporcionar operaciones comunes necesarias. Esta eficiencia se logra a través de tres tipos principales de repositorios: CRUD Repository, Paging and Sorting Repository y JPA Repository. Estos repositorios no solo reducen la escritura de código repetitivo, sino que también optimizan tiempos de desarrollo y depuración.

### **¿Cuáles son los tipos de Spring Repositories y sus funciones?**

1. **CRUD Repository**: Este es el repositorio más utilizado por su capacidad para realizar operaciones de creación, lectura, actualización y eliminación (CRUD) sobre cualquier entidad.
2. **Paging and Sorting Repository**: Tal como su nombre lo indica, este repositorio permite la paginación y la ordenación de resultados al interactuar con una entidad.
3. **JPA Repository**: Extiende los dos repositorios anteriores, incluyendo además operaciones específicas de JPA (Java Persistence API) como `flush`, lo que facilita tareas más complejas en la base de datos.

### **¿Cómo iniciar con los Spring Repositories?**

Para comenzar a usar los Spring Repositories, es necesario seguir unos pasos clave:

- Anotar la clase principal, o aquella que tenga la anotación `Spring Boot Application`, con `@EnableJpaRepositories`. Esto indica que se utilizarán repositorios de Spring en la aplicación.
- Crear una nueva interfaz de repositorio que extienda uno de los repositorios de Spring mencionados. En este caso particular, se utiliza `ListCrudRepository` para que los métodos de obtención de datos devuelvan listas en lugar de iterables, lo que resulta más intuitivo al trabajar con colecciones de datos.

```java
public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
    // Métodos específicos adicionales pueden ser añadidos aquí
}

```

### **¿Cómo realizar consultas con Spring Repositories?**

1. **Consultar todos los elementos**:
    - Usar el método `findAll()` permite obtener todos los registros de una entidad sin necesidad de escribir sentencias SQL manualmente.

```java
public List<PizzaEntity> getAll(){
    return this.pizzaRepository.findAll();
}

```

1. **Consultar por ID**:
    - Utilizar el método `findById()` permite recuperar un solo registro dado su clave primaria, devolviendo un `Optional` que puede manejarse para verificar la existencia del registro.

```java
public PizzaEntity get(Integer idPizza) {
    return this.pizzaRepository.findById(idPizza).orElse(null);
}

```

### **¿Cómo configurar controladores para manejar solicitudes?**

Para exponer estas funcionalidades a través de una API REST, podemos configurar controladores que gestionen las peticiones HTTP y proporcionen los datos adecuados desde la base de datos.

- Definir rutas que respondan a métodos HTTP como GET para obtener listas o elementos individuales según un `ID`.

```java
@RestController
@RequestMapping("/api/pizzas")
@AllArgsConstructor
public class PizzaController {
    private final PizzaService pizzaService;

    @GetMapping
    public ResponseEntity<List<PizzaEntity>> getAll() {
        return ResponseEntity.ok(this.pizzaService.getAll());
    }

    @GetMapping("/{idPizza}")
    public ResponseEntity<PizzaEntity> get(@PathVariable Integer idPizza) {
        return ResponseEntity.ok(this.pizzaService.get(idPizza));
    }
}

```

### **¿Cuáles son las ventajas de usar Spring Repositories?**

- **Reducción de Código**: Elimina la necesidad de escribir la lógica detallada del acceso a datos, permitiendo centrarse en la lógica de negocios.
- **Consistencia y Simplicidad**: Provee una interfaz común y métodos estándar para todas las operaciones básicas sobre los datos.
- **Escalabilidad y Flexibilidad**: Facilitan el manejo y la ampliación de la funcionalidad para incluir paginación, ordenación y más, ajustándose a las necesidades del proyecto.

El enfoque robusto y flexible de los Spring Data Repositories tiene un impacto significativo en la eficiencia y eficacia del desarrollo de aplicaciones con bases de datos, motivándote a seguir explorando y aplicando estas herramientas en tus proyectos futuros.



# 08-Guardar y Actualizar Registros con Spring Data Repositories

Creado: 8 de octubre de 2025 0:50
ítem principal: 03-SPRING DATA REPOSITORIES (https://www.notion.so/03-SPRING-DATA-REPOSITORIES-281f5b42f770806c884ce10c3f0d7fd3?pvs=21)

## **¿Cómo guardar una nueva pizza en la base de datos?**

El mundo del desarrollo de software con Spring Data Repositories tiene un objetivo claro: simplificar los procesos. Imagina lo fácil que es ahora trabajar con bases de datos gracias a las funcionalidades CRUD que estas herramientas nos ofrecen. En esta ocasión, te guiaré en cómo crear un nuevo registro de pizza en la base de datos usando Spring Repositories. Vamos al grano con ejemplos prácticos.

Para comenzar, necesitamos crear un método en `PizzaService`. Este método será público, retornará un objeto de tipo `PizzaEntity` y lo llamaremos `save`. Aquí está el fragmento de código para hacer esto:

```java
public PizzaEntity save(PizzaEntity pizza) {
    return this.pizzaRepository.save(pizza);
}

```

Con una simple línea, logramos insertar un elemento en la base de datos. ¿No es increíble?

## **¿Cómo gestionar peticiones POST en el controlador?**

Ahora, en  `PizzaController`, necesitamos un método similar al anterior pero enfocado en manejar las peticiones POST. Aquí es donde el concepto de manejo de solicitudes HTTP cobra vida. Renombraremos este método a `add` y lo anotaremos con `@PostMapping` para que reciba peticiones del tipo POST. Además, usaremos `@RequestBody` para capturar el cuerpo de la solicitud que incluirá la entidad `PizzaEntity`.

```java
@PostMapping("/add")
public PizzaEntity add(@RequestBody PizzaEntity pizza) {
    return this.pizzaService.save(pizza);
}

```

Cuando hacemos una petición POST a nuestro endpoint, estaremos enviando un JSON con los detalles de la pizza. Por ejemplo: nombre, descripción, precio, si es vegana o vegetariana, y su disponibilidad.

Al lanzar la aplicación y enviar esta solicitud, podrás ver que la respuesta te devuelve la pizza creada, con un campo `ID` que no teníamos antes. Esto es porque el ID se genera automáticamente al guardar el registro.

## **¿Cómo manejar actualizaciones de registros existentes?**

Sin embargo, no siempre queremos agregar una nueva pizza; a veces, solo necesitamos actualizar una existente. Aquí es donde Spring Data brilla al verificar si la información en la base de datos cambió. De no ser así, evita actualizar para ahorrar recursos.

Para diferenciar entre crear y actualizar, proponemos crear un método en `PizzaController` llamado `update`. Adornado con `@PutMapping`, este método decidirá entre requerir un `POST` para guardar datos nuevos y un `PUT` para actualizaciones. Incluiremos aquí también la verificación de existencia de pizzas con una llamada a `existsById`.

```java
@PutMapping("/update")
public ResponseEntity<?> update(@RequestBody PizzaEntity pizza) {
    if (pizza.getIdPizza() != null && this.pizzaService.exists(pizza.getIdPizza())) {
        return new ResponseEntity<>(this.pizzaService.save(pizza), HttpStatus.OK);
    }
    return new ResponseEntity<>("Pizza not found or invalid request", HttpStatus.BAD_REQUEST);
}

```

Este ejemplo muestra cómo validar si la pizza ya existe antes de proceder. En caso contrario, retorna un error `400 Bad Request`.

Spring, gracias al `save`, internamente decide entre un `INSERT` para registros nuevos o un `UPDATE` para actualizaciones.

## **¿Qué ventajas nos otorgan los Spring Data Repositories?**

Lo maravilloso de Spring Data es que automatiza muchas operaciones cruciales, como detectar cambios en la información almacenada. Además, si una pizza ya existe, no ejecutará una acción innecesaria.

Dentro del servicio, hemos creado un método `exists` que retorna un booleano:

```java
public boolean exists(Long idPizza) {
    return this.pizzaRepository.existsById(idPizza);
}

```

Este método hace una consulta `COUNT` y determina si un registro con el ID proporcionado existe. Esta es la magia de Spring Data: facilita las tareas más tediosas y permite que los desarrolladores se concentren más en la lógica de negocios.

Sigue explorando las capacidades de Spring y aprovéchalas en tus proyectos. ¡El aprendizaje es continuo y las oportunidades para mejorar siempre están al alcance!



# 09-Eliminar elementos con Spring Data JPA: método deleteById

Creado: 8 de octubre de 2025 2:14
ítem principal: 03-SPRING DATA REPOSITORIES (https://www.notion.so/03-SPRING-DATA-REPOSITORIES-281f5b42f770806c884ce10c3f0d7fd3?pvs=21)

## **¿Cómo eliminar un elemento de la base de datos utilizando Crude Repository en Spring?**

Eliminar un elemento de la base de datos es una operación básica, pero fundamental en cualquier aplicación. Spring Framework facilita este proceso a través de su Crude Repository, ofreciendo métodos intuitivos y directos para gestionar datos con eficacia. Vamos a explorar cómo puedes eliminar un elemento, en este caso una "pixa", utilizando Spring y su Crude Repository.

### **¿Qué es Crude Repository y cómo ayuda en la eliminación?**

Crude Repository es una interfaz que define operaciones básicas para crear, leer, actualizar y eliminar datos en la base de datos, conocidas como operaciones CRUD (por sus siglas en inglés: Created, Read, Update, Delete). Ya hemos explorado cómo leer y guardar datos con el método `save`, pero ahora nos enfocaremos en la operación de eliminación.

### **¿Cómo se implementa un método de eliminación?**

Para eliminar una "pixa" por su identificador único, implementaremos un método que no retorna nada. Este método utilizará `deleteById`, un método proporcionado por Crude Repository específicamente para borrar elementos a partir de su clave primaria.

```java
public void delete(int idPixa) {
    this.pixaRepository.deleteById(idPixa);
}

```

Este método toma como parámetro el ID de la "pixa" y llama al `deleteById`, el cual se encarga de toda la lógica de eliminación.

### **¿Cómo se crea un endpoint para eliminar una entrada?**

En el controlador de la aplicación, debemos definir el endpoint que permita recibir peticiones de eliminación. Utilizaremos `DeleteMapping` para asociar el endpoint HTTP DELETE.

```java
@DeleteMapping("/{idPizza}")
public ResponseEntity<Void> delete(@PathVariable int idPizza) throws BadRequestException {
    this.pizzaService.delete(idPizza);
    return ResponseEntity.noContent().build();
}
```

```java
public void delete(int idPizza) throws BadRequestException {
    if (!exists(idPizza)) throw new BadRequestException("Error al eliminar, la pizza no se encuentra");
    this.pizzaRepository.deleteById(idPizza);
}

```

1. **Verificación de existencia:** Utilizamos un método `exist` antes de intentar eliminar la pixa, asegurándonos de que efectivamente existe.
2. **Manejo de respuestas:** Retornamos un `ResponseEntity` vacío con un estado 200 si la eliminación fue exitosa, o un estado 400 si no se pudo realizar.

### **¿Qué sucede detrás de escena al eliminar un elemento?**

Cuando envías una petición para eliminar una "pixa", se piensa comúnmente que es eliminado de manera directa. Sin embargo, bajo el capó, ocurre más:

- **Verificación inicial con `select count`:** Se ejecuta primero este comando para confirmar la existencia del elemento.
- **Ejecución de eliminación:** Solo después de verificar la existencia, se procede a ejecutar la operación de eliminación con el método `deleteById` transformado en un comando SQL por Hibernate.

### **¿Cómo verificar que una "pixa" ha sido eliminada?**

Después de realizar la operación DELETE, puedes verificar que el elemento ha sido eliminado mediante una consulta GET al servicio:

```java
// Método en el servicio para obtener una pixa
public Pixa getById(int idPixa) {
    return this.pixaRepository.findById(idPixa).orElse(null);
}

```

Al realizar una petición GET y no obtener respuesta, puedes confirmar que el elemento ya no está en la base de datos.

El poder de Spring Data Repositories radica en su capacidad para simplificar la interacción con la base de datos, relegando al desarrollador a simplemente implementar los métodos necesarios y dejar que Framework maneje el resto. ¡Sigue explorando y aprendiendo! En la próxima lección, veremos cómo gestionar las relaciones en la base de datos con Lazy y Eager.




# 10-Gestión de Relaciones en JPA: Lazy vs Eager Fetching

Creado: 8 de octubre de 2025 14:35
ítem principal: 03-SPRING DATA REPOSITORIES (https://www.notion.so/03-SPRING-DATA-REPOSITORIES-281f5b42f770806c884ce10c3f0d7fd3?pvs=21)

## **¿Cómo gestionar las relaciones entre entidades en una base de datos?**

Al crear aplicaciones complejas, frecuentemente las entidades en una base de datos comparten relaciones. Estas pueden ser de uno a uno (1:1), muchos a uno (M:1) o uno a muchos (1:M), entre otras. Es vital entender cómo recuperar dichas relaciones, dado que un mal manejo puede afectar severamente el rendimiento de una aplicación. Un manejo eficiente permite evitar accesos innecesarios o sobrecarga de datos.

### **¿Cómo crear y configurar un repositorio para las órdenes?**

Primero, deberemos crear un nuevo repositorio para manejar las órdenes. Para esto, seguiremos los pasos a continuación:

1. **Crear la interfaz OrderRepository**:
    - Extender de `JpaRepository`.
    - Usar `OrderEntity` como la entidad y `Integer` como tipo de clave primaria.
2. **Agregar anotaciones necesarias**:
    - Incluir `@Getter`, `@Setter` y `@NoArgsConstructor` en nuestras entidades Java para evitar problemas de serialización JSON.

Esta configuración inicial nos proporcionará acceso a métodos predeterminados para gestionar las órdenes sin tener que escribir código adicional.

### **¿Cómo usar los servicios REST para exponer datos?**

A continuación, implementaremos el servicio y el controlador:

1. **Crear el servicio OrderService**:
    - Anotarlo con `@Service`.
    - Inyectar el repositorio en el constructor (uso de `final` para asegurar la inyección por constructor).
    - Crear un método para recuperar todas las órdenes usando `findAll()`.
2. **Crear el controlador OrderController**:
    - Utilizar `@RestController`.
    - Atender peticiones en `API/orders` con `@GetMapping`.
    - Retornar una respuesta `OK` con la lista de órdenes.

### **¿Cómo solucionar problemas de serialización con JSON?**

Un problema común al serializar entidades es el ciclo infinito causado por relaciones bidireccionales entre entidades, como ocurrió con `OrderEntity` y `OrderItemEntity`. Esto sucede cuando cada entidad intenta cargar los datos de la otra recursivamente. Para resolverlo, podemos:

- Anotar las propiedades de las entidades con `@JsonIgnore` para evitar que ciertas relaciones sean serializadas.

### **¿Cuándo usar Lazy y Eager en las relaciones?**

Las propiedades de `FetchType` determinan cómo se recuperan las relaciones:

- **Lazy**: Retrasa la carga de datos hasta que sean específicamente solicitados. Es útil cuando no necesitamos la relación inmediatamente.
- **Eager**: Carga la relación al mismo tiempo que la entidad principal. Usada cuando la relación es vital para el funcionamiento de la operación actual.

Ejemplo de configuración:

- Usar `@ManyToOne(fetch = FetchType.LAZY)` para relaciones como cliente en una orden, donde no siempre es necesario cargar la información del cliente.
- Usar `@OneToMany(fetch = FetchType.EAGER)` para ítems de una orden, si estos son cruciales para procesar cada orden.

### **¿Cómo optimizar la recuperación de relaciones?**

De manera predeterminada, JPA e Hibernate gestionan las siguientes configuraciones por tipo de relación:

- **OneToMany** y **ManyToMany**: Por defecto son Lazy.
- **ManyToOne** y **OneToOne**: Por defecto son Eager.

Recomendaciones generales:

- Limitar la carga de relaciones a solo las necesarias.
- Configurar relaciones cómo Lazy siempre que sea posible para mejorar el rendimiento.
- Si una relación es ampliamente usada, considerar marcarla como Eager.

Con una comprensión clara sobre cómo y cuándo aplicar Lazy o Eager, así como gestionar adecuadamente las relaciones entre entidades, estarás equipado para optimizar el rendimiento y funcionamiento de tu aplicación. ¡Sigue aprendiendo y perfeccionando estos conceptos en tus proyectos!



# 11-Query Methods en Spring para Consultas Personalizadas

Creado: 9 de octubre de 2025 12:34
ítem principal: 03-SPRING DATA REPOSITORIES (https://www.notion.so/03-SPRING-DATA-REPOSITORIES-281f5b42f770806c884ce10c3f0d7fd3?pvs=21)

Consultas personalizadas con Query Methods:
And, Or, True, IgnoreCase & OrderBy

```java
public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
		// Consultar todas las pizzas disponibles ordenados por percio
    List<PizzaEntity> findAllByAvailableTrueOrderByPrice();
		// Consultar todas las pizzas disponibles y por nombre ignorando el case.
    PizzaEntity findAllByAvailableTrueAndNameIgnoreCase(String name);
}

```


# 12-Filtrado de Pizzas por Ingredientes usando Query Methods

Creado: 9 de octubre de 2025 13:21
ítem principal: 03-SPRING DATA REPOSITORIES (https://www.notion.so/03-SPRING-DATA-REPOSITORIES-281f5b42f770806c884ce10c3f0d7fd3?pvs=21)

## **¿Cómo utilizar los keywords contains y not en query methods?**

La búsqueda de datos precisa y la manipulación efectiva son habilidades esenciales para cualquier desarrollo de software. En este caso, aprenderemos a usar los keywords `contains` y `not` para construir query methods que nos permiten extraer información específica de nuestros datos. Analizaremos cómo aplicarlos en una base de datos de pizzas identificando ingredientes específicos y controlando sensibilidades de mayúsculas y minúsculas en las consultas.

### **¿Cómo recuperar pizzas disponibles con ciertos ingredientes?**

Para recuperar pizzas que están disponibles y contienen ciertos ingredientes, podemos utilizar el método 

`*List*<PizzaEntity> findAllByAvailableTrueAndDescriptionContainingIgnoreCase(String description);`

Aquí los detalles:

- **Método del servicio:** Se define un método público que retorna una lista de entidades de Pizza y recibe como parámetro un ingrediente.
- **Implementación:** Se invoca el método del repositorio `findAllByAvailableTrueAndDescriptionContainingIgnoreCase`, pasándole el ingrediente. Este método ignora la diferencia entre mayúsculas y minúsculas gracias a `IgnoreCase`.
- **Consulta API:** Exponer esta funcionalidad a través de un endpoint en el API REST, permitiendo obtener pizzas por ingrediente solicitando vía HTTP.

```java
// Service
public List<PizzaEntity> getWith(String ingredient) {
    return this.pizzaRepository.findAllByAvailableTrueAndDescriptionContainingIgnoreCase(ingredient);
}

// Controller
@GetMapping("/with/{ingredient}")
public ResponseEntity<List<PizzaEntity>> getWith(@PathVariable String ingredient) {
    return ResponseEntity.ok(this.pizzaService.getWith(ingredient));
}

```

### **¿Cómo obtener pizzas que no contienen un ingrediente específico?**

Si necesitamos exactamente el resultado opuesto, pizzas que no contengan un ingrediente en particular, podemos modificar ligeramente el query method utilizando `not`.

- **Ajustar Query Method:** Inserta `not` después de `description` y antes de `containing` para indicar que buscamos pizzas que no tienen el ingrediente proporcionado.
- **Consulta API:** Similar al anterior, se expone esta funcionalidad a través de otro endpoint.

```java
@GetMapping("/without/{ingredient}")
public ResponseEntity<List<PizzaEntity>> getWithOut(@PathVariable String ingredient) {
    return ResponseEntity.ok(this.pizzaService.getWithOut(ingredient));
}

```

### **¿Cómo traducir query methods a SQL?**

Los query methods se traducen de manera automática al dialecto específico de SQL de la base de datos que estés utilizando. Por ejemplo, para obtener pizzas disponibles cuya descripción no contiene un ingrediente, el query traducido sería:

```sql
SELECT * FROM pizza WHERE available = 1 AND UPPER(description) NOT LIKE UPPER(?)

```

En este caso, el `ignoreCase` se refleja en el uso de `UPPER` para ignorar mayúsculas y minúsculas en la búsqueda.

### **Recomendaciones prácticas para implementar query methods**

- **Uso de `ignoreCase`:** Siempre que sea posible, utiliza parámetros como `ignoreCase` para hacer tus consultas más flexibles y evitar problemas por diferencias de capitalización.
- **Nombres convencionales:** Adopta convenciones de nombres como `finalBy` para mejorar la legibilidad y mantenibilidad del código.
- **Probar resultados:** Usa herramientas como Postman para testear tus endpoints y verificar la funcionalidad en diferentes escenarios y bases de datos.

Con estas prácticas y ejemplos podrás manipular y consultar datos de manera más precisa y eficiente, abriendo el camino para desarrollos más robustos y adaptables. ¡Continúa explorando y ampliando tus conocimientos sobre bases de datos y query methods!



# 13-Consultas Avanzadas con Query Methods en Java Spring

Creado: 9 de octubre de 2025 20:45
ítem principal: 03-SPRING DATA REPOSITORIES (https://www.notion.so/03-SPRING-DATA-REPOSITORIES-281f5b42f770806c884ce10c3f0d7fd3?pvs=21)

## **¿Qué son y cómo utilizar los Query Methods para listas y fechas?**

Los Query Methods son una herramienta poderosa que nos facilitan la recuperación de información de una base de datos mediante el uso de convenciones de nomenclatura específica. A través de ellos, podemos realizar consultas basadas en condiciones como listas o fechas. En este artículo, exploraremos cómo crear un método de consulta que permita recuperar órdenes de una pizzería según una fecha específica.

### **¿Cómo se crean consultas basadas en fechas?**

Para recuperar las órdenes que nuestra pizzería ha tenido hoy, inicialmente, es esencial crear un método en nuestro `OrderRepository`. Este método utilizará la convención `findAllByDateAfter` para obtener órdenes con fecha posterior a una específica:

```java
public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
    List<OrderEntity> findAllByDateAfter(LocalDateTime date);
}

```

Luego, se desarrollará un servicio que utiliza este método para devolver las órdenes del día. Se crea un objeto `LocalDateTime` para obtener la fecha actual:

```java
@Service
public class OrderService {
    public List<OrderEntity> getTodayOrders() {
        LocalDateTime today = LocalDate.now().atStartOfDay();
        return orderRepository.findAllByDateAfter(today);
    }
}

```

Posteriormente, se crea un `endpoint` en el controlador que utiliza este nuevo servicio para responder a las peticiones:

```java
@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/today")
    public ResponseEntity<List<OrderEntity>> getTodayOrders() {
        return ResponseEntity.ok(orderService.getTodayOrders());
    }
}

```

### **¿Cómo se gestionan las consultas en listas?**

Además de fechas, los Query Methods también permiten gestionar listas. Supongamos que queremos listar todas las órdenes externas (domicilio o para llevar). Para esto, creamos un `QueryMethod` que use el keyword `IN`.

En el `OrderRepository`, usamos el método `findAllByMethodIn`, recibiendo una lista de métodos de entrega:

```java
public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
    List<OrderEntity> findAllByMethodIn(List<String> methods);
}

```

En esta consulta, se trabaja con una lista de strings que representan los métodos de entrega deseados:

```java
@Service
public class OrderService {
    public List<OrderEntity> getOutsideOrders() {
        List<String> methods = Arrays.asList("D", "C");
        return orderRepository.findAllByMethodIn(methods);
    }
}

```

Y finalmente, se implementa un `endpoint` para procesar estas consultas:

```java
@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/outside")
    public ResponseEntity<List<OrderEntity>> getOutsideOrders() {
        return ResponseEntity.ok(orderService.getOutsideOrders());
    }
}

```

### **¿Cómo contar elementos con Query Methods?**

Además de obtener datos específicos, los Query Methods permiten realizar operaciones como contar elementos. Aquí se muestra un ejemplo de cómo contar cuántas pizzas veganas ofrece una pizzería.

En el `PizzaRepository`, se puede usar el método `countBy` para determinar cuántas pizzas tienen una propiedad específica, en este caso, si son veganas:

```java
public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
    int countByVeganTrue();
}

```

Podemos aplicar esta lógica en un servicio para imprimir el resultado en la consola:

```java
@Service
public class PizzaService {
    public void countVeganPizzas() {
        int veganPizzas = pizzaRepository.countByVeganTrue();
        System.out.println("Número de pizzas veganas: " + veganPizzas);
    }
}

```

Al ejecutar esta funcionalidad, el sistema consulta cuántas entradas en la tabla cumplen la condición indicada y nos devuelve el total.

### **¿Qué consideraciones adicionales hay en el uso de query methods?**

- **Facilidad de lectura:** Los Query Methods son intuitivos y permiten entender la lógica de la consulta directamente desde su nombre.
- **Evitar consultas complejas:** Aunque son poderosos, se recomienda no abusar de su uso para consultas extremadamente complejas, ya que podrían afectar el rendimiento.
- **Gestión de métodos IN:** Para consultas con el keyword IN, asegúrate de manejar listas de manera adecuada, evitando duplicados y verificando los valores disponibles en la base de datos.

¡Con estos ejemplos de uso de Query Methods para manejar fechas, listas y contar elementos, estarás equipado con las habilidades necesarias para manejar diferentes escenarios en tus aplicaciones! Continúa explorando y aplicando estas técnicas para convertirte en un experto en manejo de bases de datos.



# 14-Uso de Query Methods para Filtrar y Ordenar Datos en Spring

Creado: 10 de octubre de 2025 0:06
ítem principal: 03-SPRING DATA REPOSITORIES (https://www.notion.so/03-SPRING-DATA-REPOSITORIES-281f5b42f770806c884ce10c3f0d7fd3?pvs=21)

## **¿Cómo limitar registros con Query Methods en Spring?**

Limitar registros al consultar bases de datos es una tarea fundamental para optimizar la performance de nuestras aplicaciones. En Spring, podemos lograrlo a través de los Query Methods. Estos métodos no solo nos permiten recuperar una cantidad específica de registros, sino también usar elementos de programación funcional como `Optional` para manejar respuestas.

Veamos cómo podemos implementar estas funcionalidades en un ejemplo práctico usando un proyecto de pizzería.

### **¿Cómo asegurarse de que solo un registro se recupere con Query Methods?**

Para limitar la recuperación a un solo registro, no usaremos `findAll`, sino `findFirst`. Este método devuelve el primer registro que coincide con las condiciones definidas. En caso de necesitar más de un registro, `findTop` es la alternativa. Ambos métodos sirven para garantizar el manejo preciso de los datos.

Ejemplo de implementación:

```java
public interface PizzaRepository extends JpaRepository<PizzaEntity, Long> {
    Optional<PizzaEntity> findFirstByAvailableTrue();
}

```

Esto permite obtener la primera pizza disponible. Recuerda ajustar la lógica en el servicio que llame a este método modificado.

### **¿Cómo integrar `Optional` en las consultas?**

`Optional` es un potente aliado para manejar respuestas nulas o excepcionales en Java. Puede emplearse cuando llamamos a un Query Method que podría retornar un valor nulo. Si no se encuentra ningún resultado, podemos lanzar una excepción o devolver un valor por defecto.

Ejemplo de manejo de `Optional`:

```java
Optional<PizzaEntity> optionalPizza = pizzaRepository.findFirstByAvailableTrue();
PizzaEntity pizza = optionalPizza.orElseThrow(() -> new RuntimeException("La pizza no existe"));

```

O, alternativamente:

```java
PizzaEntity pizza = optionalPizza.orElseGet(() -> {
    // Lógica alternativa si la pizza no existe
    return new DefaultPizza();
});

```

### **¿Cómo encontrar las pizzas más baratas?**

Podemos crear métodos para encontrar, por ejemplo, las tres pizzas más baratas. Utilizamos `findTop3By` para restringir la cantidad de registros. Asimismo, `OrderBy` permite ordenar estos registros según una propiedad, como el precio.

Ejemplo de búsqueda de pizzas económicas:

```java
List<PizzaEntity> findTop3ByAvailableTrueAndPriceLessThanEqualOrderByPriceAsc(Double price);

```

Este método recupera las tres pizzas más baratas disponibles que cuestan menos de un valor dado, ordenándolas de manera ascendente.

### **¿Cómo invocar estos métodos desde el servicio?**

Una vez definidos en el repositorio, invocamos estos métodos desde un servicio. Creamos un método que pase el precio como parámetro a nuestro Query Method.

```java
public List<PizzaEntity> getCheapestPizzas(Double price) {
    return pizzaRepository.findTop3ByAvailableTrueAndPriceLessThanEqualOrderByPriceAsc(price);
}

```

### **¿Cómo verificar consultas en el controlador?**

Finalmente, modificamos el controlador para permitir que los clientes consulten las pizzas más baratas al proporcionar un cierto precio:

```java
@GetMapping("/pizzas/cheapest/{price}")
public List<PizzaEntity> getCheapestPizzas(@PathVariable Double price) {
    return pizzaService.getCheapestPizzas(price);
}

```

Esta consulta se ejecuta y devuelve las tres pizzas más económicas cumpliendo las condiciones mencionadas. Además, es importante revisar la consulta SQL que se genera y asegurarse de que los resultados se limiten adecuadamente.

Estos son algunos ejemplos de cómo se pueden utilizar los Query Methods para lograr búsquedas eficientes y personalizadas. Estimula explorar más sobre esta funcionalidad. Para profundizar, consulta los recursos adicionales que ofrecen documentación detallada. Continuar aprendiendo y explorando te permitirá sacar el máximo provecho de las poderosas herramientas de Spring.



# 15-Paginación y Ordenación con Spring Data Repositories

Creado: 10 de octubre de 2025 1:54
ítem principal: 03-SPRING DATA REPOSITORIES (https://www.notion.so/03-SPRING-DATA-REPOSITORIES-281f5b42f770806c884ce10c3f0d7fd3?pvs=21)

## **¿Qué es el Paging and Sorting Repository en Spring Data?**

El Paging and Sorting Repository es una herramienta poderosa dentro de Spring Data que permite gestionar y estructurar grandes volúmenes de datos, haciendo posible paginar y organizar consultas de manera eficiente. Es especialmente útil cuando se trabaja con grandes cantidades de información o simplemente cuando se quiere presentar datos de forma más manejable y accesible.

### **¿Cómo crear un repositorio de Paging and Sorting?**

Para crear un repositorio de Paging and Sorting en un proyecto de Spring, es necesario extender directamente de `PagingAndSortingRepository`. Aquí te muestro un ejemplo:

```java
public interface PizzaPagSortRepository extends ListPagingAndSortingRepository<PizzaEntity, Integer> {
}
```

- `PizzaEntity` es la clase que representa la entidad o modelo que estamos gestionando.
- `Integer` es el tipo de dato para la clave primaria.

### **¿Cómo implementar el repositorio en un servicio?**

El siguiente paso es inyectar este repositorio en el servicio para poder llevar a cabo las operaciones deseadas. A continuación te muestro cómo hacerlo:

1. Inyecta el repositorio usando la anotación `@Autowired`.

```java
@Autowired
private final PizzaPagSortRepository pizzaPagSortRepository;

```

1. Modifica el método `GetAll` para hacerlo paginado:

```java
public Page<PizzaEntity> getAll(int page, int elements){
    Pageable pageRequest = PageRequest.of(page, elements);
    return this.pizzaPagSortRepository.findAll(pageRequest);
}

```

- Aquí `PageRequest.of(int page, int elements)` crea un objeto `Pageable` que define el número de la página y el tamaño de la página, es decir, cuántos elementos tendrá cada una.

### **¿Cómo gestionar la paginación en el controlador?**

Dentro del controlador, es fundamental recibir los parámetros que indican el número de página y el tamaño de los elementos por página. Estos se manejan como parámetros de petición:

```java
@GetMapping
public ResponseEntity<Page<PizzaEntity>> getAll(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "8") int elements
) {
    return ResponseEntity.ok(this.pizzaService.getAll(page, elements));
}

```

- `@RequestParam` se utiliza para capturar los parámetros de la URL de manera sencilla. También se pueden definir valores por defecto, como `0` para page y `8` para elements.

### **¿Qué ventajas ofrece el Paging and Sorting Repository?**

El uso del Paging and Sorting Repository trae consigo varias ventajas significativas:

- **Eficiencia**: Permite manejar y consultar grandes cantidades de datos de manera efectiva, evitando sobrecargar el sistema.
- **Flexibilidad**: Comodidad de configurar el tamaño de página y el número de página según las necesidades del usuario.
- **Simplicidad**: Es fácil de implementar y no requiere código complejo, lo que facilita su integración en aplicaciones existentes.

La implementación de un Paging and Sorting Repository optimiza la forma en que presentamos y manejamos la información, garantizando que se pueda acceder a los datos de manera rápida y efectiva. ¡Sigue explorando sus capacidades y verás cómo facilita tu gestión de datos en aplicaciones Spring!



# 16-Ordenamiento Dinámico con Paging and Sorting Repository

Creado: 10 de octubre de 2025 2:52
ítem principal: 03-SPRING DATA REPOSITORIES (https://www.notion.so/03-SPRING-DATA-REPOSITORIES-281f5b42f770806c884ce10c3f0d7fd3?pvs=21)

## **¿Cómo implementar un ordenamiento dinámico en un repositorio en Spring?**

Imagina que puedes controlar la manera en que los datos se presentan, no solo la cantidad de información como con la paginación, sino también el orden en que estos aparecen. Eso es precisamente lo que lograremos con el Paging and Sorting Repository en Spring. Este tutorial te guiará en la implementación de un sistema que facilita tanto la paginación como el ordenamiento dinámico de datos en tus aplicaciones.

### **¿Cómo crear un nuevo método de consulta con paginación y ordenamiento?**

Para comenzar, es crucial entender que nuestro nuevo método de consulta no retornará una lista, sino que regresará una página de nuestra entidad. En este ejemplo, la entidad se llama `PizzaEntity`. Crearemos un método llamado `FindByAvailableTrue` que, usando el Paging and Sorting Repository, nos permitirá consultar todas las entidades disponibles.

```java
public interface PizzaPagSortRepository extends ListPagingAndSortingRepository<PizzaEntity, Integer> {
    Page<PizzaEntity> findByAvailableTrue(Pageable pageable);
}

```

Este método recibe un objeto `Pageable`, el cual es esencial para gestionar tanto la paginación como el ordenamiento de manera efectiva.

### **¿Cómo manejar los parámetros de paginación y ordenamiento?**

Para realizar consultas paginadas y ordenadas, debemos considerar ciertos parámetros: la página que queremos consultar, cuántos elementos incluir en cada página, y la columna por la cual deseamos ordenar los resultados. Esto lo controlamos a través de un `PageRequest`, que envía un tercer elemento, el `Sort`, junto con el string `sortBy`.

Modificaré el servicio para ajustar el tipo de retorno y enviar los parámetros necesarios al repositorio:

```java
public Page<PizzaEntity> getAvailable(int page, int elements, String sortBy, String sortDirection) {
    Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
    Pageable pageRequest = PageRequest.of(page, elements, sort);
    return this.pizzaPagSortRepository.findByAvailableTrue(pageRequest);
}

```

En este caso, el resultado será una página que podemos pasar posteriormente al controlador.

### **¿Cómo se actualiza el controlador para recibir parámetros?**

El siguiente paso es actualizar el controlador de nuestra aplicación para que pueda manejar nuevos parámetros de entrada. Utilizaremos `RequestParam` para recibir el `sortBy` y asignar un valor por defecto como "price":

```java
@GetMapping("/available")
public ResponseEntity<Page<PizzaEntity>> getAvailable(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "8") int elements,
        @RequestParam(defaultValue = "price") String sortBy,
        @RequestParam(defaultValue = "ASC") String sortDirection
) {
    return ResponseEntity.ok(this.pizzaService.getAvailable(page, elements, sortBy, sortDirection));
}
```

Esto nos permitirá, por defecto, ordenar los resultados por el precio de las pizzas.

### **¿Cómo configurar el ordenamiento ascendente o descendente?**

Agregar la capacidad de ordenar ascendentemente o descendentemente brinda flexibilidad adicional a nuestros métodos de consulta. Para ello, introducimos un nuevo parámetro llamado `sortDirection`, el cual predeterminamos como ascendente:

```java
@RequestParam(defaultValue = "ASC") String sortDirection

```

Con este cambio, podemos construir un objeto `Sort` que reaccione a este parámetro:

```java
Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
PageRequest pageRequest = PageRequest.of(page, size, sort);

```

Implementar este ajuste en el controlador nos da la opción de manejar consultas que ordenen datos en ambas direcciones sin esfuerzo adicional.

### **¿Qué beneficios proporciona el uso de Page Unsorting Repository?**

Integrar paginación y ordenamiento dinámico en tu aplicación mejora significativamente la experiencia del usuario final. No solo le permite acceder a grandes volúmenes de datos de manera más efectiva, sino que también le da control sobre la manera en que se presenta la información. Esto es un gran paso hacia el desarrollo de aplicaciones web potentes y adaptables. ¡Utiliza estas técnicas en tus proyectos y observa la diferencia!





# 17-Consultas de Base de Datos con JPQL en Spring Boot

Creado: 10 de octubre de 2025 12:39
ítem principal: 03-SPRING DATA REPOSITORIES (https://www.notion.so/03-SPRING-DATA-REPOSITORIES-281f5b42f770806c884ce10c3f0d7fd3?pvs=21)

## **¿Qué es JPQL y cómo utilizarlo?**

JPQL, o Java Persistent Query Language, es un lenguaje que se utiliza para realizar consultas sobre una base de datos desde las Entities en vez de las tablas tradicionales. Esto permite trabajar de manera más intuitiva para los desarrolladores en Java, ya que se utilizan atributos de objetos en lugar de columnas y tablas.

### **¿Cómo crear un `CustomerRepository`?**

Para manejar la información de los clientes almacenada en la base de datos, primero necesitamos crear un repositorio. Vamos a seguir estos pasos:

1. Crear un `CustomerRepository` que extiende de `ListCloudRepository`.
2. Utilizar la `CustomerEntity` para definir el tipo de la clave primaria, que en este caso es un `String`.
3. Implementar un método para realizar consultas usando JPQL.

```java
public interface CustomerRepository extends ListCrudRepository<CustomerEntity, String> {

    @Query(value = "SELECT c FROM CustomerEntity c WHERE c.phoneNumber = :phone")
    CustomerEntity findByPhone(@Param("phone") String phone);
}
```

### **¿Cómo configurar el servicio de clientes?**

Una vez definido el repository, es fundamental crear un servicio que lo integre y lo use para gestionar la lógica de negocio relacionada con la consulta de clientes:

1. Inyectar `CustomerRepository` en `CustomerService`.
2. Habilitar la inyección de dependencias con la anotación `@Service`.
3. Implementar el método `findByPhone` que va a recibir un `teléfono` y utilizar el repository para la consulta.

```java
@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerEntity findByPhone(String phone) {
        return this.customerRepository.findByPhone(phone);
    }
}

```

### **¿Cómo construir el controlador de clientes?**

El siguiente paso es crear un controlador que exponga endpoints HTTP para manejar las solicitudes relativas a los clientes:

1. Anotar el controlador con `@RestController` y `@RequestMapping("/api/customers")`.
2. Inyectar el `CustomerService` en el controlador usando `@Autowired` (aunque no es obligatorio).
3. Implementar el método `getByPhone` que atenderá las peticiones GET y devolverá la información de un cliente en base a su número de teléfono.

```java
@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/phone/{phone}")
    public ResponseEntity<CustomerEntity> getByPhone(@PathVariable String phone) {
        return ResponseEntity.ok(this.customerService.findByPhone(phone));
    }
}

```

### **Ejecución y verificación de la aplicación**

Ya listo el controlador, es el momento de poner la aplicación en ejecución y probar el endpoint creado. Al realizar una solicitud GET a `/api/customers/fund/{phone}`, se espera recibir toda la información del cliente asociado al número de teléfono proporcionado. Si todo se ha hecho de manera correcta, la API responderá con estado 200 y los detalles del usuario.

JPQL muestra su fortaleza en su facilidad de uso al trabajar con OOP y su similitud en sintaxis con SQL estándar. Sin embargo, es importante considerar que SQL nativo ofrece características avanzadas no disponibles en JPQL, lo que podría ser un aspecto a explorar en clases futuras para ampliar nuestras habilidades de consulta. ¡Sigue explorando y potenciando tus habilidades en desarrollo con Java y consulta de bases de datos!




# 18-Consultas SQL nativas y ordenación con Hibernate en Spring Data

Creado: 10 de octubre de 2025 14:30
ítem principal: 04-PERSONALIZACION DE QUERIES (https://www.notion.so/04-PERSONALIZACION-DE-QUERIES-281f5b42f77080119c8ee39f9d5d158d?pvs=21)

## **¿Cuál es la utilidad de trabajar con queries nativos en Spring Data?**

Trabajar con queries nativos en Spring Data nos proporciona una flexibilidad impresionante, ya que nos permite operar directamente con SQL y aprovechar todas las características que una base de datos particular soporta. A diferencia de los Query Methods o JPQL, que pueden tener limitaciones en algunos escenarios específicos, los queries nativos nos liberan de estas restricciones e incrementan nuestras opciones de implementación.

### **¿Cómo se crea un método para consultas específicas en la base de datos?**

Para ilustrar el uso de queries nativos, vamos a crear un método que permita consultar las órdenes de un cliente específico dentro del sistema de una pizzería. Este ejemplo te proporcionará una comprensión sólida sobre cómo organizar y ejecutar una consulta directa en SQL desde Spring Data.

1. **Identificar el Repositorio**: Comienza creando el método en el repositorio que necesites, en este caso, el `OrderRepository`.
2. **Definir el Método**: Crea un método que retorne una lista de órdenes, llamémosle `findCustomerOrders`.
3. **Anotación @Query**: Usa la anotación `@Query` para definir el SQL nativo que se desea ejecutar. En este caso:

    ```java
    public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
    
        @Query(value = "SELECT * FROM pizza_order WHERE id_customer = :id", nativeQuery = true)
        List<OrderEntity> findCustomerOrders(@Param("id") String idCustomer);
    }
    
    ```

4. **Marcado de Parámetros**: Con `@Param`, asocia parámetros que se recibirán en el método.

### **¿Cómo integrar el método en el servicio adecuado?**

Una vez definido el método en el repositorio, necesitas incorporarlo en el servicio donde se consumirá:

1. **Implementar método en el Service**: Crea un método que devuelva una lista de órdenes, llamémosle `getCustomerOrders`, donde se recibirá el `idCustomer`.

    ```java
    public List<OrderEntity> getCustomerOrders(String idCustomer) {
        return this.orderRepository.findCustomerOrders(idCustomer);
    }
    
    ```


### **¿Cómo especificar el método en un punto de acceso API?**

Para exponer este método a través de una API, añade un endpoint GET en el controlador:

1. **Definición en el controlador**: Emplea la anotación `@GetMapping` para definir el endpoint, asegurando que se recibe el `idCustomer` como variable de ruta.

    ```java
    @GetMapping("/customer/{id}")
    public ResponseEntity<List<OrderEntity>> getCustomerOrders(@PathVariable String id) {
        return ResponseEntity.ok(this.orderService.getCustomerOrders(id));
    }
    ```


### **¿Cómo gestionar ordenación de elementos en las respuestas?**

Es frecuente que quieras ordenar los resultados de tus consultas. Puedes utilizar la anotación `@OrderBy` para ordenar los elementos antes de devolverlos.

1. **Implementación de @OrderBy**: Si deseas ordenar por precio, agrega la anotación en la entidad:

    ```java
    @OrderBy("price ASC")
    private List<OrderItemEntity> orderItems;
    
    ```


### **¿Cómo solucionar problemas y errores comunes?**

Al ejecutar la aplicación, es posible que encuentres errores como el 500 debido a conflictos al llamar métodos. Asegúrate de:

- No llamar de manera recursiva el mismo servicio.
- Corregir cualquier referencia incorrecta a métodos, por ejemplo, usar `orderRepository.findCustomerOrders` en lugar de una llamada recursiva incorrecta.

Este proceso de implementar queries nativos y refinar el rendimiento del sistema nos ofrece considerables beneficios. Recuerda que la precisión y el detalle en las configuraciones son clave para el éxito de las aplicaciones basadas en consultas SQL directas en Spring Data. ¡Sigue explorando y perfeccionando tus habilidades!



# 19-Uso de Proyecciones en Queries Personalizados con Java y SQL

Creado: 11 de octubre de 2025 12:50
ítem principal: 04-PERSONALIZACION DE QUERIES (https://www.notion.so/04-PERSONALIZACION-DE-QUERIES-281f5b42f77080119c8ee39f9d5d158d?pvs=21)

## **¿Qué son las projections y cómo funcionan en Java?**

Las **projections** son DTOs (Data Transfer Objects) que nos permiten definir una estructura personalizada para recuperar datos específicos de una base de datos. Son especialmente útiles cuando requerimos construir consultas complejas que no se ajustan completamente a los campos de una sola tabla. Imagina que en un proyecto de una Pixería, necesitas detalles de una orden que involucran varias tablas: el identificador de la orden, la fecha, y el total están en "PixaOrder," pero para el nombre del cliente consultarías la tabla "Customer," y para los nombres de las pizzas usarías la tabla "Pixa." Las projections ofrecen una forma eficiente de manejar estos casos.

### **¿Cómo crear una proyección?**

Para crear una proyección en tu aplicación, debes seguir estos pasos:

1. **Crear una interfaz**: Define una interfaz, por ejemplo, `OrderSummary`, que contenga los métodos con los atributos que deseas recuperar en tu consulta.

```java
public interface OrderSummary {
    Integer getIdOrder();
    String getCustomerName();
    LocalDateTime getOrderDate();
    Double getOrderTotal();
    String getPizzaNames();
}

```

1. **Escribir la consulta SQL**: Redacta un query SQL que recupere los datos necesarios de la base de datos. Usa `JOIN` para unir las tablas relevantes.

```sql
SELECT 
	po.id_order AS idOrder, cu.name AS customerName, po.date AS orderDate, 
    po.total AS orderTotal, group_concat(pi.name) AS pizzaNames
FROM pizza_order po
INNER JOIN customer cu ON po.id_customer=cu.id_customer
INNER JOIN order_item oi ON po.id_order=oi.id_order
INNER JOIN pizza pi ON oi.id_pizza=pi.id_pizza
WHERE po.id_order = 1
GROUP BY po.id_order, cu.name, po.date, po.total;

```

### **¿Cómo usamos la proyección en el código?**

Después de crear la interfaz y la consulta, el siguiente paso es integrarla con el código de la aplicación:

1. **Definir el repositorio**: Crea un método en tu repositorio que retorne el tipo de interfaz `OrderSummary` y anota este método con `@Query`.

```java
public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {

    @Query(
      value = """
              SELECT\s
              	po.id_order AS idOrder, cu.name AS customerName, po.date AS orderDate,\s
                  po.total AS orderTotal, group_concat(pi.name) AS pizzaNames
              FROM pizza_order po
              INNER JOIN customer cu ON po.id_customer=cu.id_customer
              INNER JOIN order_item oi ON po.id_order=oi.id_order
              INNER JOIN pizza pi ON oi.id_pizza=pi.id_pizza
              WHERE po.id_order = :orderId
              GROUP BY po.id_order, cu.name, po.date, po.total;
              """,
      nativeQuery = true
    )
    OrderSummary findSummary(@Param("orderId") int orderId);
}

```

1. **Implementar el servicio**: Añade un método en tu servicio que use el repositorio para obtener el resumen de la orden.

```java
public OrderSummary getSummary(int orderId) {
    return this.orderRepository.findSummary(orderId);
}

```

1. **Exponer en el controlador**: Finalmente, crea un endpoint en el controlador para responder con esta proyección.

```java
    @GetMapping("/summary/{id}")
    public ResponseEntity<OrderSummary> getOrderSummary(@PathVariable int id) {
        return ResponseEntity.ok(this.orderService.getSummary(id));
    }

```

### **¿Cuál es el beneficio de usar projections?**

Las projections ofrecen varias ventajas:

- **Eficiencia**: Se evita cargar entidades enteras con todas sus relaciones, mejorando la performance.
- **Claridad**: Hacen que el código sea más legible y facilitan la comprensión de lo que se está recuperando.
- **Flexibilidad**: Proveen una forma simple de definir y alterar estructuras de datos retornadas sin cambiar la lógica del query.

Así que, ¿a qué esperas para implementar esta técnica? Aprovecha las proyecciones para optimizar tus consultas y hacer tu aplicación más eficiente. ¿Quieres más? Continúa perfeccionando tus habilidades en Java y base de datos, existen demasiadas herramientas y tácticas por descubrir.









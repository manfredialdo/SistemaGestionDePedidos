# trabajo practico 6 progrAmaacion 3
## TP-LOMBOK-DTO 



## CONSIGNAS

1. Para el desarrollo de este trabajo práctico se deberá tomar como base el modelo de clases desarrollado en la Unidad 5. A diferencia del trabajo anterior, en esta instancia el proyecto deberá configurarse y desarrollarse utilizando Gradle como herramienta de gestión de dependencias y construcción. Asimismo, se deberá incorporar la librería Lombok, la cual será utilizada para reemplazar código repetitivo mediante anotaciones.
2. Insertar anotaciones Lombok, se deberán utilizar al menos las siguientes anotaciones:
a. Getter/Setter
b. ToString
c. EqualsAndHashCode
d. Builder / SuperBuilder
e. AllArgsConstructor
f. NoArgsConstructor

3. En el método main se deberán instanciar utilizando patron builder
a. 2 Usuarios
b. 3 Pedidos (al menos 2 detalles pedido por cada uno)
c. 3 Categorías
d. 10 productos
4. En la clase Main se deberán tener las instancias solicitadas en el punto anterior y se deberá utilizar el método toString para mostrar por consola un producto, el listado de productos cargados y los pedidos del usuario que posea la mayor cantidad de pedidos.
5. Instanciar un nuevo producto donde el/los campos utilizados en el método equals sean iguales a los de otro producto existente. Luego, comparar dicha instancia con todos los elementos de la colección de productos y mostrar los resultados por pantalla.
6. Crear un nuevo paquete llamado DTOs y, dentro de él, una clase record llamada UsuarioDTO, que contendrá la misma información que la clase Usuario, evitando mostrar información sensible. Se deberán ocultar los siguientes atributos:
a. Rol
b. Contraseña


### estructura del tp

```text
TP-LOMBOK-DTO
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── utn
│       │           ├── dtos
│       │           │   └── UsuarioDTO.java
│       │           ├── entities
│       │           │   ├── Base.java
│       │           │   ├── Categoria.java
│       │           │   ├── DetallePedido.java
│       │           │   ├── Pedido.java
│       │           │   ├── Producto.java
│       │           │   ├── Usuario.java
│       │           │   └── Calculable.java
│       │           ├── enums
│       │           │   ├── Estado.java
│       │           │   ├── FormaPago.java
│       │           │   └── Rol.java
│       │           └── Main.java
│       └── resources
├── build.gradle
└── settings.gradle




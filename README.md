# trabajo practico 7 progrAmaacion 3
## tp - programacion funcional: 

## CONSIGNAS Utilizando programación funcional.
1. Desarrolle un método en clase Pedido que se encargue de calcular el total.
2. Mostrar por consola productos disponibles
3. Mostrar por consola la cantidad de ítems que tiene un pedido ( ejemplo 2 panchos, 2
bebidas, deberá de decir que hay 4 items)
4. Detectar productos que tengan menos de 5 como valor en stock


### estructura del tp

```text
TP_SistemaGestionDePedidos
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





para probar!

        f1 + Java: Clean Java Language Server Workspace

        gradle clean build --refresh-dependencies

        gradle build && java -cp build/classes/java/main com.tup.programacion3.Main
        
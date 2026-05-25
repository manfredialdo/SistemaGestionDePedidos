package com.tup.programacion3;

import com.tup.programacion3.entities.*;
import com.tup.programacion3.enums.*;
import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== SIMULACIÓN CON REGLAS UML Y SETS ======\n");

        // 1. INSTANCIAR CATEGORÍAS
        Categoria catPizzas = Categoria.builder().id(1L).nombre("Pizzas").descripcion("Pizzas artesanales con masa fresca").build();
        Categoria catHamburguesas = Categoria.builder().id(2L).nombre("Hamburguesas").descripcion("Hamburguesas gourmet con ingredientes frescos").build();
        Categoria catBebidas = Categoria.builder().id(3L).nombre("Bebidas").descripcion("Gaseosas, jugos y bebidas frías").build();
        Categoria catPostres = Categoria.builder().id(4L).nombre("Postres").descripcion("Tortas, helados y dulces artesanales").build();
        Categoria catEmpanadas = Categoria.builder().id(5L).nombre("Empanadas").descripcion("Empanadas horneadas y fritas de distintos sabores").build();
        Categoria catEnsaladas = Categoria.builder().id(6L).nombre("Ensaladas").descripcion("Ensaladas frescas y saludables").build();

        // 2. INSTANCIAR PRODUCTOS
        Producto p1 = Producto.builder().id(1L).nombre("Pizza Muzzarella").precio(4500.0).descripcion("Pizza clásica con salsa de tomate y muzzarella derretida").stock(20).imagen("pizza.jpg").disponible(true).build();
        Producto p2 = Producto.builder().id(2L).nombre("Pizza Napolitana").precio(5200.0).descripcion("Pizza con rodajas de tomate fresco, ajo y albahaca").stock(15).imagen("pizza.jpg").disponible(true).build();
        Producto p3 = Producto.builder().id(3L).nombre("Pizza Especial 4 Quesos").precio(6800.0).descripcion("Muzzarella, provolone, roquefort y parmesano").stock(10).imagen("pizza.jpg").disponible(true).build();
        Producto p4 = Producto.builder().id(4L).nombre("Hamburguesa Clásica").precio(3800.0).descripcion("Medallón de carne, lechuga, tomate, cebolla y mayo").stock(30).imagen("pizza.jpg").disponible(true).build();
        Producto p5 = Producto.builder().id(5L).nombre("Hamburguesa BBQ Bacon").precio(5100.0).descripcion("Doble medallón, bacon crocante y salsa barbacoa ahumada").stock(25).imagen("pizza.jpg").disponible(true).build();
        Producto p7 = Producto.builder().id(7L).nombre("Coca-Cola 500ml").precio(1200.0).descripcion("Gaseosa Coca-Cola fría, botella personal").stock(100).imagen("pizza.jpg").disponible(true).build();
        Producto p8 = Producto.builder().id(8L).nombre("Jugo de Naranja Natural").precio(1800.0).descripcion("Jugo exprimido en el momento, vaso 400ml").stock(40).imagen("pizza.jpg").disponible(true).build();
        Producto p9 = Producto.builder().id(9L).nombre("Agua Mineral 500ml").precio(800.0).descripcion("Agua mineral sin gas, botella personal").stock(150).imagen("pizza.jpg").disponible(true).build();
        Producto p10 = Producto.builder().id(10L).nombre("Torta Rogel").precio(3500.0).descripcion("Torta rogel tradicional con dulce de leche y merengue").stock(12).imagen("pizza.jpg").disponible(true).build();
        Producto p11 = Producto.builder().id(11L).nombre("Helado Artesanal 2 gustos").precio(2800.0).descripcion("Pote de 250g, elegí 2 gustos entre 12 opciones").stock(30).imagen("pizza.jpg").disponible(true).build();
        Producto p13 = Producto.builder().id(13L).nombre("Empanadas de Carne x6").precio(3000.0).descripcion("Empanadas criollas de carne cortada a cuchillo, horneadas").stock(50).imagen("pizza.jpg").disponible(true).build();
        Producto p14 = Producto.builder().id(14L).nombre("Empanadas de Pollo x6").precio(2800.0).descripcion("Empanadas de pollo con morrón y verdeo, horneadas").stock(45).imagen("pizza.jpg").disponible(true).build();
        Producto p15 = Producto.builder().id(15L).nombre("Empanadas de Jamón y Queso x6").precio(2500.0).descripcion("Empanadas fritas con jamón cocido y queso fundido").stock(60).imagen("pizza.jpg").disponible(true).build();
        Producto p16 = Producto.builder().id(16L).nombre("Ensalada César").precio(3200.0).descripcion("Lechuga romana, crutones, parmesano y aderezo césar").stock(20).imagen("pizza.jpg").disponible(true).build();
        Producto p17 = Producto.builder().id(17L).nombre("Ensalada Caprese").precio(2900.0).descripcion("Tomate, muzzarella fresca, albahaca y aceite de oliva").stock(18).imagen("pizza.jpg").disponible(true).build();
        Producto p18 = Producto.builder().id(18L).nombre("Pizza Fugazzeta").precio(5500.0).descripcion("Pizza rellena de muzzarella con cebolla caramelizada").stock(10).imagen("pizza.jpg").disponible(true).build();
        Producto p20 = Producto.builder().id(20L).nombre("Ensalada Mixta").precio(2400.0).descripcion("Lechuga, tomate, zanahoria rallada y aceitunas").stock(25).imagen("pizza.jpg").disponible(true).build();

        // Agregación (◊→)
        catPizzas.agregarProducto(p1);
        catPizzas.agregarProducto(p2);
        catPizzas.agregarProducto(p3);
        catHamburguesas.agregarProducto(p4);
        catHamburguesas.agregarProducto(p5);
        catBebidas.agregarProducto(p7);
        catBebidas.agregarProducto(p8);
        catBebidas.agregarProducto(p9);
        catPostres.agregarProducto(p10);
        catPostres.agregarProducto(p11);
        catEmpanadas.agregarProducto(p13);
        catEmpanadas.agregarProducto(p14);
        catEmpanadas.agregarProducto(p15);
        catEnsaladas.agregarProducto(p16);
        catEnsaladas.agregarProducto(p17);
        catPizzas.agregarProducto(p18);
        catEnsaladas.agregarProducto(p20);

        // 3. INSTANCIAR USUARIOS
        Usuario user1 = Usuario.builder().id(1L).nombre("Aldo").apellido("Manfredi").mail("aldo@mail.com").celular("11223344").contraseña("pass123").rol(Rol.USUARIO).build();
        Usuario user2 = Usuario.builder().id(2L).nombre("María").apellido("Gómez").mail("maria@mail.com").celular("55667788").contraseña("admin456").rol(Rol.ADMIN).build();

        // 4. INSTANCIAR 3 PEDIDOS
        Pedido ped1 = Pedido.builder().id(501L).fecha(LocalDate.now()).estado(Estado.PENDIENTE).formaPago(FormaPago.TARJETA).total(0.0).build();
        ped1.addDetallePedido(1, p1); 
        ped1.addDetallePedido(2, p3);

        Pedido ped2 = Pedido.builder().id(502L).fecha(LocalDate.now()).estado(Estado.CONFIRMADO).formaPago(FormaPago.TRANSFERENCIA).total(0.0).build();
        ped2.addDetallePedido(1, p2);
        ped2.addDetallePedido(3, p7);

        Pedido ped3 = Pedido.builder().id(503L).fecha(LocalDate.now()).estado(Estado.TERMINADO).formaPago(FormaPago.EFECTIVO).total(0.0).build();
        ped3.addDetallePedido(1, p4);
        ped3.addDetallePedido(1, p10);
        
        user1.agregarPedido(ped1);
        user1.agregarPedido(ped2);
        user2.agregarPedido(ped3);

        // ================= PRESENTACIÓN DE RESULTADOS POR CONSOLA =================
        System.out.println("[A] VERIFICACIÓN DE UN PRODUCTO INDIVIDUAL (toString):");
        System.out.println("   " + p1.toString() + "\n");

        System.out.println("[B] LISTADO COMPLETO DE PRODUCTOS CARGADOS (toString por Categoría):");
        Set<Categoria> conjuntoCategorias = Set.of(catPizzas, catHamburguesas, catBebidas, catPostres, catEmpanadas, catEnsaladas);
        for (Categoria cat : conjuntoCategorias) {
            System.out.println("   *** " + cat.getNombre());
            for (Producto prod : cat.getProductos()) {
                // Ajustado para cumplir estrictamente con el requerimiento de usar toString()
                System.out.println("      -> " + prod.toString());
            }
        }
        System.out.println();

        System.out.println("[C] HISTORIAL COMPLETO DEL USUARIO MAS ACTIVO (toString):");
        Set<Usuario> conjuntoUsuarios = Set.of(user1, user2);
        Usuario clienteMasActivo = user1;
        for (Usuario u : conjuntoUsuarios) {
            if (u.getPedidos().size() > clienteMasActivo.getPedidos().size()) {
                clienteMasActivo = u;
            }
        }
        System.out.println("   Cliente: " + clienteMasActivo.getNombre() + " " + clienteMasActivo.getApellido());
        for (Pedido p : clienteMasActivo.getPedidos()) {
            System.out.println("      " + p.toString());
            for (DetallePedido dp : p.getDetalles()) {
                System.out.println("         " + dp.toString());
            }
        }
        System.out.println();

        System.out.println("[D] PRUEBA DE IDENTIDAD DE OBJETOS Y UNICIDAD EN SETS:");
        Producto clonP1 = Producto.builder().id(1L).nombre("Pizza Muzzarella clonada").precio(4500.0).build();
        System.out.println("   ¿p1.equals(clonP1) basado en ID?: " + p1.equals(clonP1));
        
        int tamañoAntes = catPizzas.getProductos().size();
        catPizzas.agregarProducto(clonP1); 
        int tamañoDespues = catPizzas.getProductos().size();
        
        System.out.println("   Elementos en Set iniciales (Pizzas): " + tamañoAntes + " | Elementos tras intentar duplicar: " + tamañoDespues);
        System.out.println("   El Set bloqueó el clon utilizando el contrato equals/hashCode.");
    }
}
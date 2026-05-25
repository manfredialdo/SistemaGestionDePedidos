package com.tup.programacion3.entities;

import java.util.HashSet;
import java.util.Set;

// 1. Importamos las herramientas de Lombok que pide el TP
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

// 2. Colocamos las anotaciones
@Getter 
@Setter
@NoArgsConstructor 
@SuperBuilder      
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true) 
@ToString(callSuper = true)
public class Categoria extends Base {
    private String nombre;
    private String descripcion;
    
    // Usamos @Builder.Default para que al usar el Builder, el HashSet no se cree como null
    @lombok.Builder.Default
    private Set<Producto> productos = new HashSet<>();

    // 3. Mantenemos tus métodos manuales de lógica de negocio
    public void agregarProducto(Producto producto) {
        if (producto != null) {
            this.productos.add(producto);
        }
    }

    public boolean eliminarProducto(Producto producto) {
        return this.productos.remove(producto);
    }
}
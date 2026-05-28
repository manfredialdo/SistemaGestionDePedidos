// /home/user/SistemaGestionDePedidos/src/main/java/com/tup/programacion3/entities/DetallePedido.java
package com.tup.programacion3.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Getter
@NoArgsConstructor 
@SuperBuilder 
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class DetallePedido extends Base {
    
    private int cantidad;
    
    @Setter 
    private Double subtotal;
    
    private Producto producto;

    // === CONSTRUCTOR TRADICIONAL 
    public DetallePedido(int cantidad, Producto producto) {
        super();
        this.cantidad = cantidad;
        this.producto = producto;
        calcularSubtotal(); // Mantiene el cálculo inicial vivo
    }

    // === LÓGICA DE NEGOCIO ===
    public void calcularSubtotal() {
        if (this.producto != null) {
            this.subtotal = this.cantidad * this.producto.getPrecio();
        } else {
            this.subtotal = 0.0;
        }
    }

    // === SETTERS PERSONALIZADOS
    public void setCantidad(int cantidad) { 
        this.cantidad = cantidad; 
        calcularSubtotal(); 
    }
    
    public void setProducto(Producto producto) { 
        this.producto = producto; 
        calcularSubtotal(); 
    }

    @Override
    public String toString() {
        return "DetallePedido[Producto='" + (producto != null ? producto.getNombre() : "N/A") + "', Cantidad=" + cantidad + ", Subtotal=$" + subtotal + "]";
    }
}
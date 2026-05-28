package com.tup.programacion3.entities;

import com.tup.programacion3.enums.Estado;
import com.tup.programacion3.enums.FormaPago;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.Builder;

//  anotaciones Lombok
@Getter 
@Setter
@NoArgsConstructor 
@SuperBuilder      
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true) 
@ToString(callSuper = true)
public class Pedido extends Base implements Calculable {
    
    private LocalDate fecha;
    private Estado estado;
    private Double total;
    private FormaPago formaPago;
    
    // Con @Builder.Default aseguramos que el Set no sea null al usar el Builder
    @Builder.Default
    private Set<DetallePedido> detalles = new HashSet<>();

    
    // Composición: El objeto se fabrica acá adentro
    public void addDetallePedido(int cantidad, Producto producto) {
        if (producto != null && cantidad > 0) {
            DetallePedido nuevoDetalle = new DetallePedido(cantidad, producto);
            this.detalles.add(nuevoDetalle);
            calcularTotal();
        }
    }

    public DetallePedido findDetallePedidoByProducto(Producto producto) {
        for (DetallePedido dp : detalles) {
            if (Objects.equals(dp.getProducto(), producto)) {
                return dp;
            }
        }
        return null;
    }

    public void deleteDetallePedidoByProducto(Producto producto) {
        DetallePedido objetivo = findDetallePedidoByProducto(producto);
        if (objetivo != null) {
            this.detalles.remove(objetivo);
            calcularTotal();
        }
    }
    @EqualsAndHashCode.Include
    public Long getId() {
        return super.getId();
    }
    
    @Override
    public void calcularTotal() {
        this.total = detalles.stream()
                             .mapToDouble(DetallePedido::getSubtotal)
                             .sum();
    }

}
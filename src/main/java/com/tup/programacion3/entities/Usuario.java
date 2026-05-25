package com.tup.programacion3.entities;

import com.tup.programacion3.enums.Rol;
import java.util.HashSet;
import java.util.Set;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter 
@Setter
@NoArgsConstructor 
@SuperBuilder      
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true) 
@ToString(callSuper = true)
public class Usuario extends Base {
    private String nombre;
    private String apellido;
    private String mail;
    private String celular;
    private String contraseña;
    private Rol rol;
    
    @lombok.Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();

    public void agregarPedido(Pedido pedido) {
        if (pedido != null) {
            this.pedidos.add(pedido);
        }
    }
}
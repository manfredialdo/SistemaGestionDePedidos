package com.tup.programacion3.entities;

// 1. Importamos Lombok
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.Builder;

// 2. anotaciones Lombok
@Getter 
@Setter
@NoArgsConstructor 
@SuperBuilder      
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true) 
@ToString(callSuper = true)
public class Producto extends Base {
    
    // Lombok para que el código incluya explícitamente el id heredado de Base
    @EqualsAndHashCode.Include
    public Long getId() {
        return super.getId();
    }

    private String nombre;
    private Double precio;
        
    @Builder.Default
    private String descripcion = "Sin descripción";
    
    @Builder.Default
    private int stock = 10;
    
    @Builder.Default
    private String imagen = "pizza.png";
    
    @Builder.Default
    private Boolean disponible = true;
}
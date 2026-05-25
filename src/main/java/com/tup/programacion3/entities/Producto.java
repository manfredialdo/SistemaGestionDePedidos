package com.tup.programacion3.entities;

// 1. Importamos las herramientas de Lombok
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.Builder;

// 2. Añadimos las anotaciones de Lombok
@Getter 
@Setter
@NoArgsConstructor 
@SuperBuilder      
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true) 
@ToString(callSuper = true)
public class Producto extends Base {
    private String nombre;
    private Double precio;
    
    @Builder.Default
    private String descripcion = "Sin descripción";
    
    @Builder.Default
    private int stock = 10;
    
    @Builder.Default
    private String imagen = "default.png";
    
    @Builder.Default
    private Boolean disponible = true;
}
package com.tup.programacion3.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode; 
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder 
@EqualsAndHashCode(onlyExplicitlyIncluded = true) 
public abstract class Base implements Serializable {
    
    @EqualsAndHashCode.Include 
    protected Long id;
    
    @lombok.Builder.Default
    protected boolean eliminado = false;
    
    @lombok.Builder.Default
    protected LocalDateTime createdAt = LocalDateTime.now();

    // Constructor vacío obligatorio para que Lombok ensamble las clases hijas
    public Base() {
        this.eliminado = false;
        this.createdAt = LocalDateTime.now();
    }
}
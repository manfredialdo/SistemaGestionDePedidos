package com.tup.programacion3.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder // Clave: permite que los Builders de las clases hijas (como Usuario) hereden el id, eliminado, etc.
public abstract class Base implements Serializable {
    protected Long id;
    
    // Con Builder.Default hacemos que por defecto al crear un objeto sea false y tenga la fecha de ahora
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
package com.poo.entidadbancomartin.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class ClientesIndividuales extends Cliente {
    private String nombre;
    private String apellido;
    private String dni;

    public ClientesIndividuales(int nroCliente, String nombre, String apellido, String dni) {
        super(nroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

    }

}
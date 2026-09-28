package com.poo.entidadbancomartin.entidades; // paquete que contiene las clases que representan a los clientes de la entidad bancaria, // y que pueden tener una o varias cuentas asociadas a su nombre, y que pueden realizar operaciones

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

// clase abtracta para representar a un cliente de la entidad bancaria,
// que puede tener una o varias cuentas asociadas a su nombre,
// y que puede realizar operaciones de depósito y extracción de dinero en
// efectivo.
// La clase Cliente es abstracta, lo que significa que no se puede instanciar
// directamente,
// ( no se puede crear un objeto de la clase Cliente) no permmite new cliente(),
// sino que debe ser extendida por otras clases que representen tipos
// específicos de clientes(por ejemplo, Cliente Empresa ).

public abstract class Cliente {
    private final int nroCliente;

    public Cliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }
    // metodos que se pueden implementar en las clases hijas, para poder depositar y
    // extraer dinero en efectivo
    // las clases hijas deben implementar estos métodos para poder realizar
    // operaciones de depósito y extracción de dinero en efectivo. es decir darle el
    // comportamiento.

    public void depositareft() {

    }

    public void extraereft(double montoPesos) {

    }
}

package com.poo.entidadbancomartin.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class ClientesEmpresa extends Cliente {
    private String razonsocial;
    private String cuit;

    public ClientesEmpresa(int nroCliente, String razonsocial, String cuit) {
        super(nroCliente);
        this.razonsocial = razonsocial;
        this.cuit = cuit;
    }

}
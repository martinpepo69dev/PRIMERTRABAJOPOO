package com.poo.entidadbancomartin.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter // usamos getter por que necesitamos obtener el saldo de la cuenta corriente y
        // el monto autorizado
@Setter // usamos setter por que necesitamos modificar el saldo de la cuenta corriente y
        // el monto autorizado
@ToString // usamos toString por que necesitamos imprimir el saldo de la cuenta corriente
          // y el monto autorizado

public abstract class Cuentas {

    private final int nrocuenta;
    private final String clienteasociado;
    private double saldo;
    private Cliente cliente;

    // creamos un constructor para la clase Cuentas
    // que recibe como parámetros el número de cuenta, el cliente asociado, el saldo
    // y el cliente
    public Cuentas(int nrocuenta, String clienteasociado, double saldo, Cliente cliente) {
        this.nrocuenta = nrocuenta;
        this.clienteasociado = clienteasociado;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    // creamos el metodo abstracto depositareft
    // este metodo sera implementado en las clases hijas CuentaCorriente y
    // CuentaConvertibilidad
    // al igual que el metodo extraereft, que sera implementado en las clases hijas
    // CuentaCorriente y CuentaConvertibilidad
    public void depositareft(double monto) {
        if (monto > 0)
            this.saldo += monto;
        else
            System.out.println("no se pueden depositar montos negativos");
    }

    public void extraereft(double monto) {
        if (monto > 0 && monto <= saldo)
            this.saldo -= monto;
        else
            System.out.println("el monto es invalido o supera la cantidad del saldo");
    }

}
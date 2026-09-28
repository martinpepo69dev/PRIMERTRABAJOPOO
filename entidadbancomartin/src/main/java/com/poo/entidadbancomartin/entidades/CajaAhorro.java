package com.poo.entidadbancomartin.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class CajaAhorro extends Cuentas {
    private double saldocaja;
    private float tasainteres;

    // aca creamos un metodo para cobrar el interes de la caja de ahorro
    public void cobrarInteres() {
        double interes = this.saldocaja * (this.tasainteres / 100.0);
        depositareft(interes);
    }

    public CajaAhorro(int nrocuenta, String clienteasociado, double saldo, Cliente cliente, double saldocaja,
            float tasainteres) { // saldocaja y tasainteres son atributos de la clase CajaAhorro ( hija)
        super(nrocuenta, clienteasociado, saldo, cliente);
        this.saldocaja = saldocaja;
        this.tasainteres = tasainteres; // atributo de la clase CajaAhorro ( hija)
    }

    @Override // sobreescribimos el metodo de la clase padre
    // para poder extraer dinero de la caja de ahorro

    public void depositareft(double monto) {
        if (monto > 0)
            this.saldocaja += monto;
        else
            System.out.println("no se pueden depositar montos negativos");

    }

    @Override
    public void extraereft(double monto) {
        if (monto > 0 && monto <= saldocaja)
            this.saldocaja -= monto;
        else
            System.out.println("el monto es invalido o supera la cantidad del saldo");

    }

}
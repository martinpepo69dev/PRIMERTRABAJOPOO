package com.poo.entidadbancomartin.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CuentaCorriente extends Cuentas {

    private double saldocc;
    private double montoautorizado;

    public CuentaCorriente(int nrocuenta, String clienteasociado, double saldo, Cliente cliente, double saldocc, double montoautorizado) {
        super(nrocuenta, clienteasociado, saldo, cliente);
        this.saldocc = saldocc;
        this.montoautorizado = montoautorizado;
    }

    @Override
    public void depositareft(double monto) {
        if (monto > 0)
            this.saldocc += monto;
        else
            System.out.println("No se pueden depositar montos negativos");
    }

    @Override
    public void extraereft(double monto) {
        // La cuenta corriente permite usar el saldo + el descubierto (montoautorizado)
        if (monto > 0 && monto <= (this.saldocc + this.montoautorizado)) {
            this.saldocc -= monto;
        } else {
            System.out.println("El monto es inválido o supera la cantidad del saldo y descubierto permitidos.");
        }
    }

    public double getMontoautorizado() {
        return montoautorizado;
    } 

    // ----------------------------------------------------------------------------------------------------
    // METODO DEPOSITAR CHEQUE (Sin listas)

    public void depositarCheques(Cheques cheque) {
        // Validamos que el cheque no sea nulo y que su monto sea mayor a 0
        if (cheque != null && cheque.getMonto() > 0) { 
            
            // Aumentamos el saldo extrayendo el monto del cheque
            this.saldocc += cheque.getMonto();   
            
            System.out.println("Depósito de cheque exitoso. Se sumaron $" + cheque.getMonto() + " a la cuenta.");
        } else {
            System.out.println("Error: Cheque inválido o el monto del cheque debe ser mayor a cero.");
        }
    }
}
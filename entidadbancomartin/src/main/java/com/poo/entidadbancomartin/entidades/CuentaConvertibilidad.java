package com.poo.entidadbancomartin.entidades;

public class CuentaConvertibilidad extends ClientesEmpresa {
    private double saldoDolares;
    private double saldoPesos;

    public CuentaConvertibilidad(int nroCliente, String razonsocial, String cuit) {
        super(nroCliente, razonsocial, cuit);
        // Inicializamos los saldos en 0 al crear la cuenta
        this.saldoDolares = 0.0;
        this.saldoPesos = 0.0;
    }

    // Agregamos la tasaConversion como parámetro
    public void convertirPesosADolares(double monto, double tasaConversion) {
        // Verificamos que el monto sea válido y que tengamos suficientes pesos
        if (monto > 0 && this.saldoPesos >= monto) {
            // Calculamos cuántos dólares nos dan por esos pesos
            double dolaresComprados = monto / tasaConversion;

            // Restamos los pesos de la cuenta y sumamos los dólares
            this.saldoPesos -= monto;
            this.saldoDolares += dolaresComprados;

            System.out.println("Conversión exitosa: -$ " + monto + " ARS -> +U$S " + dolaresComprados);
        } else {
            System.out.println("Error: Saldo en pesos insuficiente o monto inválido.");
        }
    }

    // Agregamos la tasaConversion como parámetro
    public void convertirDolaresAPesos(double monto, double tasaConversion) {
        // Verificamos que el monto sea válido y que tengamos suficientes dólares
        if (monto > 0 && this.saldoDolares >= monto) {
            // Calculamos cuántos pesos nos dan por esos dólares
            double pesosComprados = monto * tasaConversion;

            // Restamos los dólares de la cuenta y sumamos los pesos
            this.saldoDolares -= monto;
            this.saldoPesos += pesosComprados;

            System.out.println("Conversión exitosa: -U$S " + monto + " -> +$ " + pesosComprados + " ARS");
        } else {
            System.out.println("Error: Saldo en dólares insuficiente o monto inválido.");
        }
    }

    public boolean extraerDolares(double monto) {
        // Para los dólares NO se acepta giro en descubierto
        if (monto > 0 && this.saldoDolares >= monto) {
            this.saldoDolares -= monto;
            return true;
        }
        return false;
    }

    public void depositarDolares(double monto) {
        if (monto > 0) {
            this.saldoDolares += monto;
        } else {
            System.out.println("No se pueden depositar montos negativos");
        }
    }

    public void depositarPesos(double monto) {
        if (monto > 0) {
            this.saldoPesos += monto;
        }
    }
    
    public String getSaldoDolares() {
        System.out.println("El saldo en dolares de la cuenta de convertibilidad es: " + saldoDolares);
        return saldoDolares + " dolares";
    }

    // Getter y Setter para los Pesos (necesarios para poder fondear la cuenta)
    public double getSaldoPesos() {
        return saldoPesos;
    }
}